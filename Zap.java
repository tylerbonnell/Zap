import java.io.*;

public class Zap {
	public static void main(String[] args) {
		checkArgs(args);

		try {

			String fileName = args[0].substring(0, args[0].indexOf("."));
			String fileExt = args[0].substring(args[0].indexOf("."));
			File inputFile = new File(args[0]);
			long fileSize = inputFile.length();
			DataInputStream in = new DataInputStream(new FileInputStream(inputFile));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName + ".zap"));
			writeHeader(out, args[0], fileSize);

		} catch (FileNotFoundException e) {
			System.err.print("File does not exist!");
			System.exit(0);
		} catch (IOException e) {
			System.err.print("Something went wrong wrong with the bytes!");
			System.exit(0);
		}
	}

	public static void checkArgs(String[] args) {
		if (args.length != 2) {
			System.err.print("Correct Usage: java Zap filename.extension size-multiplier");
			System.exit(0);
		}
		try {
			int multi = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.err.print("Second argument should be an integer");
			System.exit(0);
		}
	}

	public static void writeHeader(DataOutputStream out, String fileName, long fileSize) throws IOException {
		out.writeLong(fileSize);
		out.write(fileName.length());
		out.writeChars(fileName);
	}
}


/*
	Store:
		amount of bytes in the file (long)
		length of file name (int)
		file name characters (chars, duh)
		actual file
 */
