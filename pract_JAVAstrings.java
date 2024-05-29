// basic strings commands

public class stringsHarry {
    public static void main(String[] args) {

        String a = "Vatsalya";

        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());
        System.out.println(a.substring(1));
        System.out.println(a.substring(0,5));
        System.out.println(a.replace('a','c'));
        System.out.println(a.startsWith("Va"));
        System.out.println(a.endsWith("ya"));
        System.out.println(a.charAt(4));
        System.out.println(a.indexOf("sa"));
        System.out.println(a.indexOf("t", 5));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.lastIndexOf("a",6));
        System.out.println(a.equals("Vatsalya"));
        System.out.println(a.equals("vatsalya"));
        System.out.println(a.equalsIgnoreCase("VatsaLYA"));

        System.out.println("Hello \n i'm \t \'vatsalya\' bhadaurya !");

    }
}

// outputs

/* 8
   vatsalya
   VATSALYA
   Vatsalya
   atsalya
   Vatsa
   Vctsclyc
   true
   true
   a
   3
  -1
   7
   4
   true
   false
   true
   Hello 
    i'm 	 'vatsalya' bhadaurya ! */

// Q1) Write a java program to convert a string to lower case 

public class stringsHarry {
    public static void main(String[] args) {

        String a = "Hello I'm Don";
        System.out.println(a.toLowerCase());
        
    }
}

// Q2) Write a java program to replace spaces with underscores.

public class stringsHarry {
    public static void main(String[] args) {

        String j = "    java    ";
        System.out.println(j.replace(" ","_"));

    }
}

// Q3) Write a java rpgram to replace name 

public class stringsHarry {
    public static void main(String[] args) {

        String letter = "Dear <|name|>, Thanks a lot !";
        System.out.println(letter.replace("<|name|>","Lara"));

    }
}

// Q4) **IMP QUES** Write a java program to detect double and tripple spaces .

public class stringsHarry {
    public static void main(String[] args) {

        String space = "  Vatsalya";
        int len = space.length();
        String len_t = space.trim();
        int spt = len_t.length();

        System.out.println(((len-spt)==2)+" Has 2 spaces");
        System.out.println(((len-spt)==3)+" Has 3 spaces");

    }
}

// Q5) Format followinf letter using escape sequence : letter = "Dear Rohan, Thanks for your kind words. VatsalyaB"

public class stringsHarry {
    public static void main(String[] args) {

        System.out.println("Dear Rohan,\n Thanks for your kind words.\n VatsalyaB");
        
    }
}
