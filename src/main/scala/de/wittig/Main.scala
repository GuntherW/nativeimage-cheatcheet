package de.wittig

@main
def app(): Unit =
    println("Hallo Welt")
    for (i <- 0 to 5)
        println((s"$i test").hashCode())
    println("Tschüss Welt")
    

