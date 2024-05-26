package Task;

class StrTest {
     public static void main(String[] args) {
         String str = "Hello";
         System.out.println("Orginal String : "+str);
         StringBuilder str1 = new StringBuilder(str);
         str1.append("World");
      //   System.out.println("Adding inside the string : "+str1);
         str1.insert(6,"a");
       //  System.out.println("After inserting a : "+str1);
         str1.delete(6,9);
       //  System.out.println("Delete some elements in the string : "+str1);
         str1.replace(2,4,"vin");
        // System.out.println("Replace the letters in String : "+str1);
         String string =  str1.toString();
         str1.append("Anisten");
         System.out.println("Append some words in string : "+str1);
         System.out.println(string);


     //     StringBuilder sb = new StringBuilder("HELLO");
     //    String str2 = sb.toString();
     //       System.out.println(str);

        // StringBuilder str1 = new StringBuilder();

      /*   String ref = str1.toString();
         System.out.println(ref);
         str1.append("hey");
         System.out.println(str1);
         str1.reverse();
         System.out.println(str1);*/
     }


}


