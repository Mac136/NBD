printjson(db.people.find(
    {
        "birth_date": {
            $gt: "2000"
        }
    },
    {
        "first_name" : true,
		"last_name" : true,
        "location": {
            "city": true
        }
    }
).toArray())