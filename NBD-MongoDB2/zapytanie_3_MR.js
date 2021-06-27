printjson(db.people.mapReduce(
    function(){
            var key = this.job;
            var value = {}
            emit(key, value);
    },
    function(key, values){
        return key;
    },
    {
        out: {inline: 1}
    }
))