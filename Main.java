import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        // create new  file

        try{
            File n=new File("f1.txt");
            if(n.createNewFile()){
                System.out.println("create file  : "+ n.getName());
                System.out.println(n.getAbsolutePath());
            }
            else {
                System.out.println("already exist ");
            }
        }catch (IOException e){
            throw new RuntimeException();
        }


        // new file write contant

        try{
            FileWriter ne=new FileWriter("new.txt");
           ne.write("new file create then write notes and reding notes ");
           ne.close();
            System.out.println("succsefully colse ");
        }catch (IOException e){
            e.printStackTrace();
        }

        // file read all contant

        try{
            File my=new File("new.txt");
            Scanner redear=new Scanner(my);
            while (redear.hasNext()){
                System.out.println(redear.nextLine());
            }
            redear.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        // delete file

            File ne=new File("new.txt");
        System.out.println( ne.getAbsolutePath());
        if(ne.delete()){
            System.out.println("file deleted : "+ne.getName());
        }else {
            System.out.println("file not availabl");
        }

    }
}
