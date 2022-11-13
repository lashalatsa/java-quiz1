//import java.io.*;
//class Function {
//    public static int Average(int[] array){
//        int jami=0;
//        int len=0;
//        for(int i=0;i<array.length;i++)
//            if(array[i]>150) {
//                jami += array[i];
//                len += 1;
//            }
//        return jami/len;
//    }
//}
//
//class Function2 {
//    public static double Gaverage(int[] array) {
//        int odd_product = 1;
//        double amount = 0.0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                odd_product *= array[i];
//                amount += 1.0;
//            }
//        }
//        return Math.pow(odd_product,1/amount);
//    }
//}
//
//class Department {
//    int employee_num;
//    String name;
//    String dep_boss;
//    String dep_location;
//    double ave_salary;
//
//    Department(int employee_num, String name, String dep_boss, String dep_location, double ave_salary) {
//        this.employee_num = employee_num;
//        this.name = name;
//        this.dep_boss = dep_boss;
//        this.dep_location = dep_location;
//        this.ave_salary = ave_salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Department info {" +
//                "employee number: " + employee_num + '\'' +
//                " department name: " + name + '\'' +
//                " department boss " + dep_boss + '\'' +
//                " department location " + dep_location + '\'' +
//                " average salary " + ave_salary + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null || obj.getClass() != this.getClass())
//            return false;
//        Department dep = (Department) obj;
//        return (dep.name == this.name);
//    }
//}
//
//
//
//    public class Main {
//        public static void main(String[] args) {
//

//        int[] array = {100,200,300,150,400,20,10,200};
//        System.out.println(Function.Average(array));
//        int[] array = {22,2,12,4,4,6,2};
//        System.out.println(Function2.Gaverage(array));

//        Department obj = new Department(190,"კვლევის დეპარტამენტი","დავით ლაცაბიძე","თბილისი",1800);
//        Department obj2 = new Department(190,"კვლევის დეპარტამენტი","ლაშა ლაცაბიძე","ქუთაისი",1800);
////        System.out.println(obj.toString());
//        if(obj.equals(obj2))
//            System.out.println("Both Objects are equal. ");
//        else
//            System.out.println("Both Objects are not equal. ");
//    }
//            CreateFile.cfile();
//            Writefile.wfile();
//            CreateXmlFile.Createxml();
        }
}

