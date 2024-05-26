public class Pass_By_Reference {
    public static void main(String[] args) {
        /*Pass By reference using array*/
        int [] arr1 = {23,41,11,99,33};
        System.out.println("Before Modification IN Static memory");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println("");
        reference(arr1);

        System.out.println("\nAfter Modification IN Static memory");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        /* Pass By reference using StringBuffer*/
        StringBuffer stringbuffer = new StringBuffer("Vex");
        System.out.println("");
        System.out.println(stringbuffer);
        printmethod(stringbuffer);
        System.out.println("after changes In Static memory "+stringbuffer);



    }
    public static void reference(int refer2 []){
        refer2[0] = 2000;
        int i = 0;
        System.out.println("Stack memory");
        while (i < refer2.length){
            System.out.print(refer2[i]+ " ");
            i = i + 1;
        }
    }
    public static void printmethod(StringBuffer newreference) {
        newreference.replace(0, 1, "R");
        System.out.println("\n"+newreference+ " Changes in stack memory");
    }

}
