public class Pass_By_Reference_2 {
    int id = 2;
    String name = "Doss";
    public void city(String newname){
        String city = newname;
        System.out.println(city);
    }
    public static void main(String[] args){
        Pass_By_Reference_2 empobject = new Pass_By_Reference_2();
        Reference(empobject);
        System.out.println(empobject.id);
        System.out.println(empobject.name);
    }
    public static void Reference(Pass_By_Reference_2 newobject) {  //Still empobject reference pointing
        newobject.id = 10;                                        //to newobject reference
        newobject.name = "Leo Doss";                       //so if any made on newobject reference, it
                                                          //will also modified on previous empobject
        newobject.city("Coimbatore");

    }


}
