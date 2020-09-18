package de.wittig

@main
def app(): Unit =
    println("Start")
    for (i <- 0 to 100)
        val m    = i * 12312
        val hash = (s"$m 123").hashCode()
        println(hash)
    println("Ende")
    

