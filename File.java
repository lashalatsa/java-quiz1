//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//
//class CreateFile {
//    public static void cfile(){
//        try{
//            File cfile = new File("lashalatsa.txt");
//            if(cfile.createNewFile()){
//                System.out.println("file created"+cfile.getName());
//            }else{
//                System.out.println("file already exists");
//            }
//        }catch (IOException e){
//            System.out.println("error occured");
//            e.printStackTrace();
//        }
//    }
//
//}
//
//class Writefile{
//    public static void wfile(){
//        try{
//            FileWriter wfile = new FileWriter("lashalatsa.txt");
//            wfile.write("me vswavlob javas");
//            wfile.close();
//            System.out.println("succesfully add writings");
//        }catch (IOException e){
//            System.out.println("an error occured");
//            e.printStackTrace();
//        }
//    }
//}
//
//class Readfile{
//    public static void Rfile(){
//        try{
//            File file = new File("lashalatsa.txt");
//            Scanner myreader = new Scanner(file);
//            while(myreader.hasNextLine()){
//                String data = myreader.nextLine();
//                System.out.println(data);
//            }
//            myreader.close();
//        }catch(FileNotFoundException e){
//            System.out.println("file not found");
//            e.printStackTrace();
//        }
//    }
//}
//
//class Deletefile{
//    public static void Dfile(){
//        File file = new File("lashalatsa.txt");
//        if (file.delete()) {
//            System.out.println("Deleted the file: " + file.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//        }
//    }
//}
