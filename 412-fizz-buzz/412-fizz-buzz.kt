class Solution {
    fun fizzBuzz(n: Int): List<String> {
    var answer = emptyList<String>()
    for (index in 1..n){
        when {
            index.rem(3) == 0 && index.rem(5) == 0 -> answer +=  "FizzBuzz"
            index.rem(3) == 0 -> answer += "Fizz"
            index.rem(5) == 0 -> answer += "Buzz"
            else -> answer += index.toString()
        }
    }
        return answer 
    }
}