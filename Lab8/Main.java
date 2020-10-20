import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/sample.txt");
			int c;
			while ((c = fileReader.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (IOException err) {
			System.err.println(err.getMessage());
		}
	}
}
