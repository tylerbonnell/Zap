import java.io.*;

public class Unzap {
	public static void main(String[] args) throws FileNotFoundException {
		DataInputStream in = new DataInputStream(new FileInputStream(args[0]));
		try {
			readFile(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile(DataInputStream in) throws IOException {
		long fileSize = in.readLong();
		System.out.println(fileSize);
		int nameLength = in.readInt();
		System.out.println(nameLength);
		String str = "";
		for (int i = 0; i < nameLength; i++) {
			str += in.readChar();
		}
		System.out.println(str);

		DataOutputStream out = new DataOutputStream(new FileOutputStream(str));
		for (int i = 0; i < fileSize; i++) {
			out.writeByte(in.readByte());
		}
	}
}
