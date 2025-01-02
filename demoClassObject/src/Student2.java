public class Student2 {
    private int score;
    private candy2[] candies;
    private long id;

    public Student2(int score, candy2[] candies, long id){
        this.candies = candies;
        this.score = score;
        this.id = id;
    }
    public int getScore(){
        return this.score;
    }
    public candy2[] getCandies(){
        return this.candies;
    }
    

    Student[] students = {new Student(67), // 学生1 
      new Student(89), // 学生2 
      new Student(58), // 学生3 
      new Student(99), // 学生4 
      new Student(60), // 学生5 
      new Student(59) // 学生6
   };

    public void receiveCandy(candy2 candy){
        candy2[] candies = new candy2[this.candies.length + 1];
        for(int i = 0; i < this.candies.length; i++){
            candies[i] = this.candies[i];
        }
        candies[candies.length - 1] = candy;
        this.candies = candies;
    }
}