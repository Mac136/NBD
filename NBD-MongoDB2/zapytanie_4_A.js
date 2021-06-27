printjson(db.people.aggregate([
    {
        $set: {
            height: {
                $divide: [
                    "$height",
                    100
                ]
            }
        }
    },
    {
        $addFields: {
            bmi: {
                $divide: [
                    "$weight",
                    {
                        $multiply: [
                            "$height",
                            "$height"
                        ]
                    }
                ]
            }

        }
    },
    {
        $group: {
            _id: "$nationality",
            minBmi: {
                $min: "$bmi"
            },
            avgBmi: {
                $avg: "$bmi"
            },
            maxBmi: {
                $max: "$bmi"
            }
        }
    }
]).toArray())