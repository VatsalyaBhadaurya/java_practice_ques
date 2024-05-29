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

// Q1) 
