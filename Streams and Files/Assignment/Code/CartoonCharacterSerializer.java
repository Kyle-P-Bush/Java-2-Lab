//package Lab3Student;

//#TODO
//Use appropriate imports
//hint: there are a lot!
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.text.ParseException;
import java.io.Serializable;

public class CartoonCharacterSerializer {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	//private static PrintWriter writer;
	
	//Method that writes one CartoonCharacter object out to a file
	public static void serializeCharacter(CartoonCharacter character) {
		//#TODO
		
		try{
			//Initialize outputCartoon to serialize objects to a file called Cartoon.ser
            FileOutputStream fos = new FileOutputStream("Cartoon.ser");
			ObjectOutputStream outputCartoon = new ObjectOutputStream(fos);
			//Write the character object out to the file
            outputCartoon.writeObject(character);
			//Close the stream
            outputCartoon.close();
        }catch(IOException e){
            e.printStackTrace();
        }
		
		
	}
	
	public static CartoonCharacter deserializeCharacter() {
		CartoonCharacter cartoon = null;
		
		//#TODO
		//Initialize inputCartoon to read objects from a file called Cartoon.ser
		try {
            FileInputStream fis = new FileInputStream("Cartoon.ser");
			inputCartoon = new ObjectInputStream(fis);


			//Read one CartoonCharacter object and store it in variable cartoon
			cartoon = (CartoonCharacter)inputCartoon.readObject();

            inputCartoon.close();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }catch(IOException e){
            if(e instanceof EOFException){
                System.out.println("DONE");
            }else{
                e.printStackTrace();
            }
            
        }
		
		
		return cartoon;
	}
	
	// NOTE: This is optional and you don't have to do this if you choose not to
	//public static void printToFile(String stringToFile) throws FileNotFoundException {
		
		//#TODO
		//Initialize writer to print characters to a file called C-137.txt
		//Print stringToFile to that file
		//Print the string "PrintWriter makes printing 50 times easier!" followed by a newline character out to the file
		//Close the PrintWriter stream
	//}

}
