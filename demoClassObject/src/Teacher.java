public class Teacher {
    private candy2[] candies;

    public Teacher(candy2[] candies, Student[] students){
        this.candies = candies;
        this.students = students;
    }

    Student[] students = {new Student(67), // 学生1 
      new Student(89), // 学生2 
      new Student(58), // 学生3 
      new Student(99), // 学生4 
      new Student(60), // 学生5 
      new Student(59) // 学生6
   };

   public static boolean shouldDistribute(int score, char color){
      return score >= 80 && color == 'R'
          ||score >= 60 && score < 80 && color == 'B'
          ||score < 60 && color == 'Y';
   }

    public void distribute(){
        for(candy2 candy : this.candies){
          for(Student2 student : this.students){
            if (shouldDistribute(student.getScore(), candy.getColor())) {
              student.receiveCandy(candy);
              break;
            }
          }
        }
    }

    public static void main(String[] args) {
      candy2[] candies = new candy2[]{new candy2('R'),new candy2('R'),new candy2('R'),new candy2('R'),
      new candy2('Y'),new candy2('Y'),new candy2('Y'),new candy2('Y'),
      new candy2('B'),new candy2('B'),new candy2('B'),new candy2('B'),
      new candy2('G'),new candy2('G'),new candy2('G'),new candy2('G')};
    }
    Student2[] students = new s
    Teacher t1 = new Teacher(candies);
    t1.distribute()
}