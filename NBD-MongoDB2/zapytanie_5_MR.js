printjson(db.people.mapReduce(
    function () {
        for (var i = 0; i < this.credit.length; i++) {
            var key = this.credit[i].currency;
            var value = {
                balance: this.credit[i].balance,
            }
            if("Female" === this.sex && "Poland" === this.nationality)
                emit(key, value);
        }
    },
    function(key, values){
        balance = { avg: 0, total: 0}
        for (var i = 0; i < values.length; i++){
                balance.total += values[i].balance;
                balance.avg += values[i].balance;
        }
        balance.avg /= values.length;
        return balance;
    },
    {
        query: { sex: "Female" },
        out: {inline: 1},
    }
))