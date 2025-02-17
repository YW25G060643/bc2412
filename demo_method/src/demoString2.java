public class demoString2 {
    public static void main(String[] args){
        String sn = "hello";
        System.out.println(sn.length());
        System.out.println(sn.charAt(1));
        System.out.println("hello".equals(sn));

        System.out.println(sn.contains("ll"));//true
        System.out.println(sn.contains("s1"));//false
        System.out.println(sn.substring(0, 2));//he
        System.out.println(sn.concat("!!!!!"));//hello!!!!!
        System.out.println(sn.startsWith("sn"));//false
        System.out.println(sn.startsWith("h"));//true
        System.out.println(sn.endsWith("lo"));//true
        System.out.println(sn.endsWith("sn"));//false
        System.out.println(sn.toUpperCase());//HELLO
        System.out.println("HEllO".toLowerCase());//hello
        
        System.out.println(sn.replace("ll", "xxx"));//hexxxo
        System.out.println(sn.replace('l', 'n'));//henno
        System.out.println(sn.equalsIgnoreCase("HELLO"));//true

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(sn.indexOf("e"));//1
        System.out.println(sn.indexOf("s"));//-1
        System.out.println(sn.indexOf("ll"));//2
        System.out.println("hellollo".lastIndexOf("ll"));//5
        System.out.println("".isEmpty());//true
        System.out.println(sn.isEmpty());//false
        System.out.println(sn.isBlank());//false
        System.out.println("".isBlank());//true
        System.out.println(" ".isBlank());//true
        
        System.out.println("hel lo       ".trim());//hel lo
        System.out.println("abc".compareTo("bbb"));//-1
        System.out.println("abc".compareTo("dbb"));//-3
        System.out.println("aac".compareTo("azh"));//25

        //chain method
        System.out.println("hello".concat("ijk").concat("def").toUpperCase());//HELLOIJKDEF

        //charAt() -> find char at index
        //indexOf() -> find index by char
    }
}
