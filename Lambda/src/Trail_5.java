public interface Trail_5 {
    public int Return(int a,int b);
}
class Return{
    public static void main(String[] args) {
        Trail_5 trail_5 = (a,b) ->  a+b;
        System.out.println(trail_5.Return(6,14));
    }
}
