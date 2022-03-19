import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {
		BufferedReader object = new BufferedReader (InputStreamReader(System.in));
		String str = object.readLine();
		System.out.println("Entered String is:" +str);

	}

	private static Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
