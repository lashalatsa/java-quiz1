public class Main{
    public static void main(String[] args) {
        Discriminant(6, 10, -1);

        String [] ms = {"lasha", "luka", "george", "nikolozi", "gio"};
        smallest(ms);
    }
    public static void Discriminant(int a,int b,int c){
        System.out.println("დისკრიმინანტია:" + (Math.pow(b,2)-4*a*c));
    }

    public static void smallest(String SA[]) {
        String first = SA[0];
        for (int i = 1 ; i < SA.length ; i++) {
            if (SA[i].length()<first.length()) {
                first = SA[i];
            }
        }
        System.out.println("ყველაზე პატარა სტრინგია:"+first);
    }

}
