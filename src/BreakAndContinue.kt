fun main() {
    // Break
    var i: Int = 0
    while(true){
        println("Break Me")
        i++
        if(i>1000){
            break
        }
    }

    // Continue
    for(i in 1..1000){
        if(i%2 == 0){
            continue
        }
        println("ini $i")
    }

}