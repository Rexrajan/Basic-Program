public class StringArray_toStringBuilder {
    public static void main(String[] args) {
        String [] array = {"Mt-15 ","NS 200 ","Duke 200 ","CBR 250 "};
        System.out.println(array[0]+array[3]);
        StringBuilder builder = new StringBuilder("");
        System.out.println("Before Appending "+builder);
        for(int i = 0; i < array.length; i = i + 1){
            builder.append(array[i]);
        }

        System.out.println("After Appending "+builder);
    }
}
