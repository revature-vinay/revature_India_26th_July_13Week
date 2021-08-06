package eg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\buses.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			//Object buses = ois.readObject();
			List<Bus> buses = (ArrayList<Bus>) ois.readObject();
			buses.forEach(System.out::println);
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
