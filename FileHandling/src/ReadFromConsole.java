import java.io.IOException;

public class ReadFromConsole {
	public static void main(String[] args) {
		byte[] input = new byte[100];
		String str = new String(input);
		try {
			System.in.read(input);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
