printjson(db.people.mapReduce(
    function(){
        var key = this.sex;
        var value = {
            height: this.height,
            weight: this.weight,
        }
        emit(key, value);
    },
    function(key, values){
        reducedVal = {avgHeight: 0, avgWeight: 0}
        for (var i = 0; i < values.length; i++){
                reducedVal.avgHeight += values[i].height;
                reducedVal.avgWeight += values[i].weight;
        }
        reducedVal.avgHeight /= values.length;
        reducedVal.avgWeight /= values.length;
        return reducedVal
    },
    {
        out: {inline: 1},
    }
))