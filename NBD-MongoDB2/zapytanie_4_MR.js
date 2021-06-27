printjson(db.people.mapReduce(
    function () {
        var key = this.nationality;
        var value = {
            bmi: this.weight / ((this.height / 100) * (this.height / 100))
        }
        emit(key, value);
    },
    function (key, values) {
        bmi = { minBmi: 1000, avgBmi: 0, maxBmi: 0 }
        for (var i = 0; i < values.length; i++) {
            if (values[i].bmi < bmi.minBmi)
                bmi.minBmi = values[i].bmi;
            bmi.avgBmi += values[i].bmi;
            if (values[i].bmi > bmi.maxBmi)
                bmi.maxBmi = values[i].bmi;
        }
        bmi.avgBmi /= values.length;
        return bmi;
    },
    {
        out: { inline: 1 },
    }
))