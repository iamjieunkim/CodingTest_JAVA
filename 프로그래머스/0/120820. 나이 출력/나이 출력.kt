class Solution {
    fun solution(age: Int): Int {
        var answer: Int = 0
        if(age>22){
            var newage = age - 22
            answer = 2001-newage
        }else{
            answer = 2023-age
        }
        return answer
    }
}