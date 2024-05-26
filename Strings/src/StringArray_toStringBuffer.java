public class StringArray_toStringBuffer {
    public static void main(String[] args) {
        String [] places = {"Chennai ","Madurai ","Pondicherry ","Trichy "};//Array of string
        StringBuffer stringbuffer = new StringBuffer("Cuddalore ");
        for(String allocate : places)
            stringbuffer.append(allocate);
        System.out.println("For Each Loop "+stringbuffer);


        StringBuffer stringbuffer2 = new StringBuffer("");
        for(int i = 0; i < places.length; i++ ) {
            stringbuffer2.append(places[i]);
        }
        System.out.println("For Loop "+stringbuffer2);
    }
}
