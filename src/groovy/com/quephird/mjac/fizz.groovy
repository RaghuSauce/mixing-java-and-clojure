class Fizz {
    String fizz () {
       String fizz = "Fizz.groovy"
        println fizz
        return fizz
    }

    static void main (String ... args) {
       Fizz f = new Fizz()

        println f.fizz()
    }
}