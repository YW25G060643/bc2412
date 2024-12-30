public class Student {
    private int score;

    /*expected output:
     * 20 candies -> distribute students accroding to their score
     * Rule: >= 80 score -> 2 candies
     * >= 60 -> 1 candy
     * 
     * student 1 = 67
     * 2 = 89
     * 3 = 58
     * 4 = 99
     * 5 = 60
     * 6 = 59
     * 
     * expected output:
     * Student 1 has 4 candies
     * ......
     */

     private int candies;
     public Student(int score, int candies){
        this.score = score;
        this.candies = candies;
     }
     public int getScore(){
        return this.score;
     }
     public int getCandies(){
        return this.candies;
     }


     public static int candieCount(){
        for(int i = 0; i )
     }
}
