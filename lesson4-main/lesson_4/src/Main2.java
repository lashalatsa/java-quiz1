public class Main2 {
    public static void main(String[] args) {
//        System.out.println("before");                               //before  dabewda rame ara radgan shuashi gavyavi 0

//        try{
//            Circle c = null;
//            c.getArea();
//            System.out.println(5/0);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (NullPointerException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){                                        //exception yvelas iwers radgan yvelas mshobelia
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("nikoloz");
//        }
//
//        System.out.println("rame");



        try {
            Fraction f1 = new Fraction(1,0);
        }catch (FractionException e){
            System.out.println(e.getMessage());
        }
        System.out.println("gavgrdzeldi");

    }
}
