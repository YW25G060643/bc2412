public class Teacher {
    private candy2[] candies;

    public Teacher(candy2[] candies, Student2[] students){
        this.candies = candies;
        this.students = students;
    }

   public static boolean shouldDistribute(int score, char color){
      return score >= 80 && color == 'R'
          ||score >= 60 && score < 80 && color == 'B'
          ||score < 60 && color == 'Y';
   }

    public void distribute(){
      int pos = 0;
      while (pos < this.candies.length) {
          for(Student2 student : this.students){
            if (shouldDistribute(student.getScore(), this.candies[pos].getColor())) {
              student.receiveCandy(this.candies[pos]);
              this.candies[pos] = null;
              pos++;
            }
          }
      }
    }

    public static void main(String[] args) {
      candy2[] candies = new candy2[]{new candy2('R'),new candy2('R'),new candy2('R'),new candy2('R'),
      new candy2('Y'),new candy2('Y'),new candy2('Y'),new candy2('Y'),
      new candy2('B'),new candy2('B'),new candy2('B'),new candy2('B'),
      new candy2('R'),new candy2('Y'),new candy2('B'),new candy2('B')};
    }
    Student2[] students = new students(){
      Teacher t1 = new Teacher(candies, students);
      t1.distribute();
    };
}