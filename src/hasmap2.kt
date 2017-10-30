fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"suk")
    map.put(2,"ron")
    map.put(3,"muhajir")
    println(map.get(3))

    map.put(3,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }

}