fun main() {

    var numOne = 10
    var numTwo = 23

    println(numOne mySum numTwo)
    println(numOne myDev numTwo)
    println(numOne myDef numTwo)
    println(numOne myMul numTwo)
}

infix fun Int.mySum(num: Int):Int{
    var result = this + num
    return result
}

infix fun Int.myDef(num: Int):Int{
    var result = this - num
    return result
}

infix fun Int.myDev(num: Int):Double{
    var result = this.toDouble() / num.toDouble()
    return result
}

infix fun Int.myMul(num: Int):Int{
    var result = this * num
    return result
}