printjson(db.people.insertOne(
    {
        "sex" : "Male",
		"first_name" : "Maciej",
		"last_name" : "Kanecki",
		"job" : "Consultant",
		"email" : "s15602@pjwstk.edu.pl",
		"location" : {
			"city" : "Warsaw",
			"address" : {
				"streetname" : "Test",
				"streetnumber" : "33"
			}
		},
		"description" : "ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar",
		"height" : "178",
		"weight" : "67",
		"birth_date" : "1996-08-01",
		"nationality" : "Poland",
		"credit" : [
			{
				"type" : "jcb",
				"number" : "4017957170328",
				"currency" : "PLN",
				"balance" : "4463.86"
			}
		]
    }
))