public class String_Buffer_Ex {
    public static void main(String[] args) {
        StringBuffer car = new StringBuffer("Honda ");
        System.out.println(car);
        System.out.println(car.hashCode());
        car.append("Tata ");
        car.append("Hyundai ");
        car.append("Suzuki ");
        System.out.println(car);
        System.out.println(car.hashCode());
        car.replace(6,10,"Toyota");
        System.out.println(car);
        System.out.println(car.hashCode());

        String [] string_array = {"Rex","Infenta","Roseline","Doss"};

        StringBuffer stringbuffer = new StringBuffer();
        System.out.println("Hashcode of StringBuffer before modification "+stringbuffer.hashCode());
        System.out.println("");
        for( String name: string_array){
            System.out.println(name+" String hashcode changes for every modification --> "+name.hashCode());
            stringbuffer.append(name+" ");
        }
        System.out.println("");
        System.out.println(stringbuffer);
        System.out.println("Hashcode of StringBuffer after modification no changes "+stringbuffer.hashCode());
    }
}

