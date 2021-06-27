printjson(db.people.mapReduce(
    function(){
        for(var i = 0; i < this.credit.length; i++){
            var key = this.credit[i].currency;
            var value = {
                balance: this.credit[i].balance,
            }
            emit(key, value);
        }
    },
    function(key, values){
        sum = 0;
        for (var i = 0; i < values.length; i++){
                sum += values[i].balance;
        }
        return sum;
    },
    {
        out: {inline: 1},
    }
))