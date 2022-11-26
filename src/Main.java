//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//       Student lasha = new Student("lasha","latsabidze",1);
//       Student luka = new Student("luka","gelashvili",2);
//       Student gocha = new Student("gocha","kandashvili",3);
//       Student niko = new Student("niko","kacita",4);
//
//        List<Student> studentebi = Arrays.asList(lasha,luka,gocha,niko);
//        Stream<Student> studentStream = studentebi.stream();



//        List<Student> resultlist = studentStream.filter(s-> s.getSaxeli().startsWith("l")).collect(Collectors.toList());
//        for (Student s:resultlist){
//            System.out.println(s);
//        }

//        List<Student> resultlist = studentStream.filter(s-> s.getSaxeli().startsWith("l")).map(s->{s.setSaxeli(("jegrito"));return s;}).collect(Collectors.toList());
//        for (Student s:resultlist){
//            System.out.println(s);
//        }

//
//        List<Student> resultlist = studentStream.filter(s-> s.getId()%2==0).collect(Collectors.toList());
//        for (Student s:resultlist){
//            System.out.println(s);
//        }





//        Stream<Student> s = Stream.of(lasha,luka,gocha);
//
//
//        Stream<Student> s2 = Stream.<Student>builder().add(lasha).add(luka).add(gocha).build();
//
//
//        Stream<String> stringStream = Stream.generate(()->"lasha").limit(10);
//    }
//}