fun main(args: Array<String>) {
    var map=HashMap<String,String>()
    map.put("nama_depan","suk")
    map.put("nama_tengah","ron")
    map.put("nama_belakang","muhajir")
    println(map.get("nama_depan"))

    map.put("nama_tengan","Unisnu Jepara")
    for (k in map.keys){
        println(k +" "+map.get(k))
    }
}