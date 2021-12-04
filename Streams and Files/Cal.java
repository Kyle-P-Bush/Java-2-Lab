import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;

public class Cal{
    public static void main(String[] args) {
        Event event = new Event("Midterm","2021-19-04 17:00", "Math 212", "Exam 1");
        //System.out.println(event);

        try{
            FileOutputStream fos = new FileOutputStream("cal.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(event);

            oos.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("cal.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);



            Event event1 = (Event)ois.readObject();
            System.out.println(event1);
            ois.close();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }catch(IOException e){
            if(e instanceof EOFException){
                System.out.println("DONE");
            }else{
                e.printStackTrace();
            }
            
        }

    }
}