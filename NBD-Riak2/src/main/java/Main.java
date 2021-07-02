import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.commands.kv.DeleteValue;
import com.basho.riak.client.api.commands.kv.FetchValue;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.api.commands.kv.UpdateValue;
import com.basho.riak.client.core.RiakCluster;
import com.basho.riak.client.core.RiakNode;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;

import java.net.UnknownHostException;

public class Main {
    public static class Employee {
        public String firstName;
        public String lastName;

        @Override
        public String toString(){
            return "firstName: " + firstName + " lastName: " + lastName;
        }
    }

    public static class EmployeeUpdate extends UpdateValue.Update<Employee> {
        private final Employee update;
        public EmployeeUpdate(Employee update){
            this.update = update;
        }

        @Override
        public Employee apply(Employee t) {
            if(t == null) {
                t = new Employee();
            }

            t.firstName = update.firstName;
            t.lastName = update.lastName;

            return t;
        }
    }

    private static RiakCluster setUpCluster() throws UnknownHostException {
        RiakNode node = new RiakNode.Builder()
                .withRemoteAddress("127.0.0.1")
                .withRemotePort(8087)
                .build();

        RiakCluster cluster = new RiakCluster.Builder(node)
                .build();
        cluster.start();

        return cluster;
    }

    public static void main( String[] args ) {
        try {
            RiakCluster cluster = setUpCluster();
            RiakClient client = new RiakClient(cluster);

            Namespace bucket = new Namespace("s15602");
            Location bucketLocation = new Location(bucket, "Emploee");

            Employee employee = new Employee();
            employee.firstName = "John";
            employee.lastName = "Doe";

            System.out.println(employee);

            StoreValue storeEmployee = new StoreValue.Builder(employee)
                    .withLocation(bucketLocation)
                    .build();
            client.execute(storeEmployee);

            FetchValue fetchEmployee = new FetchValue.Builder(bucketLocation)
                    .build();
            Employee fetchedEmployee = client.execute(fetchEmployee).getValue(Employee.class);
            System.out.println(fetchedEmployee);

            employee.firstName = "Jane";
            EmployeeUpdate employeeUpdate = new EmployeeUpdate(employee);
            UpdateValue updateValue = new UpdateValue.Builder(bucketLocation)
                    .withUpdate(employeeUpdate).build();
            UpdateValue.Response response = client.execute(updateValue);

            fetchedEmployee = client.execute(fetchEmployee).getValue(Employee.class);
            System.out.println(fetchedEmployee);

            DeleteValue deleteOp = new DeleteValue.Builder(bucketLocation)
                    .build();
            client.execute(deleteOp);

            fetchedEmployee = client.execute(fetchEmployee).getValue(Employee.class);
            System.out.println(fetchedEmployee);
            cluster.shutdown();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
