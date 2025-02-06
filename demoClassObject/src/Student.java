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
     public Student(int score){
        this.score = score;
        this.candies = 0;
     }
     public int getScore(){
        return this.score;
     }
     public int getCandies(){
        return this.candies;
     }

     public void distributeCandies(){
         if (score >= 80) {
               candies += 2;
         }else if (score >= 60) {
               candies++;
         }else{
               candies = 0;
         }
     }
     public static void main(String[] args){
         Student[] students = {new Student(67), // 学生1 
            new Student(89), // 学生2 
            new Student(58), // 学生3 
            new Student(99), // 学生4 
            new Student(60), // 学生5 
            new Student(59) // 学生6
         };
         int totalCandies = 20;

         while (totalCandies > 0) {
               for()
         }
     }

}