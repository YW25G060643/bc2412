public class class1 {
    private String folderName;
    private String fileName;
    private int lines;

    public class1(String folderName, String fileName, int lines) {
        this.folderName = folderName;
        this.fileName = fileName;
        this.lines = lines;
    }
    public String getFolderName() {
        return this.folderName;
    }
    public String getFileName(){
        return this.fileName;
    }
    public int getLines(){
        return this.lines;
    }
    public static void main(String[] args){
        class1 c1 = new class1("demoClassObject", "class.java", 21);
        class1 c2 = new class1("demoClassObject", "person.java", 53);
        class1 c3 = new class1("demoClassObject", "Test.java", 19);
        class1 c4 = new class1("demo_array", "demo_array.java", 226);

        for(class1 c : new class1[]{c1, c2, c3, c4}){
            System.out.println(c.getFolderName() + ", " + c.getFileName() + ", " + c.getLines() + " lines");
        }
    }
}