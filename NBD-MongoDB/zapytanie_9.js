printjson(db.people.updateMany(
    {
        "first_name": {
            $eq: "Antonio"
        }
    },
    {
        $set:{
            hobby: "pingpong"
        }
    }
))