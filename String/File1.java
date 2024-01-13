package String;

public class File1 {
    public static void main(String[] args) {
        // String str = new String();
        // str = "HELLO_JAVA";
        // System.out.println("Original string: " + str);
        // String str2 = "HELLO_JAVA";
        // String str3 = str2;
        // System.out.println("String 2 is : " + str2);
        // System.out.println(str==str2);
        // System.out.println(str.equals(str2));
        // System.out.println(str3==str2);
        // System.out.println(str3.equals(str2));

        // String str4 = new String("HELLO_JAVA");

        // System.out.println(str +"   " + str2 +" " + str3+ " "+ str4);

        // System.out.println(str==str4);
        // System.out.println(str.equals(str4));

        // String is immutable in nature
        // So, we cannot change the value of a String directly using index

        String name ="Krishna";
        // System.out.println(name);
        name = "Kunal";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));

        StringBuilder str = new StringBuilder();
        str.append("Hello ");
    }
}
