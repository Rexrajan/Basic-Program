public class Test {

        public static void main(String[] args) {
            String s2 = "Hello";
            StringBuilder sb1 = new StringBuilder(s2);
            sb1.append("welcome");
            StringBuilder sb = new StringBuilder(s2);
            System.out.println(sb);
            System.out.println(sb1);

            String finalStr = sb1.toString();
            System.out.println("sb is "+finalStr);
        }
}
