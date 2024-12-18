public class demoWhileLoop {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 3; i++){
            System.out.println(i);
        }
        int j = 0;
        while(j < 3){
            System.out.println(j);
            j++;
            j++;
        }

        String s = "hello";
        char target = 'e';
        while (s.equals(s)) {
            System.out.println("true");
            break;
        }
    }
}
