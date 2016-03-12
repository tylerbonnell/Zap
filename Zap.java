import java.io.*;
import java.util.Scanner;

public class Zap {
	private static final String dickbutt =
			"                                                                                        \n" +
			"                                      ..',;;,..                                         \n" +
			"                                  .:d0XWWNNNNWNKx:.                                     \n" +
			"                              .;d0NNX0d:,...';o0NWNO:.                                  \n" +
			"                      .....:d0NN0x:'.           'kWMWXd.                                \n" +
			"                   'oOKNNNWMMWx'                  lNMMMK.                               \n" +
			"                 .oNMMMMWMMW0XK;                   :XMMNc                               \n" +
			"                 :NMMMMMMWMX;cN0.                   :XMWd                               \n" +
			"                 oWWMMMMWNO; ,NNl;;    'oO0K0Oxl,.  .kWWx                               \n" +
			"                 cWMMMMMWkc:l0WMWNk. .dNMMMMMWNONKo. oNWd                               \n" +
			"                 ;NWX0XNNWMMWNKkc.  .kWMMMMMMMNclNWO'xWWo                               \n" +
			"                .OWK'  .dWMWKc;k0c  cNMMMMMMMMK,.OWKcKWNc                               \n" +
			"               '0WWk,...,dO00000Oo. dWMMMMNKOl. .xKclNMN,                               \n" +
			"              :XWWWMMWNX0Oxoc;'..   .oKNMWXOdllokO,.0MM0.                               \n" +
			"             :XMXc';:ldxOKKXNWWNX0kdc;;;:cldkkdo,  lNMWd                                \n" +
			"            ;XMNc          ..';:ldxO0KXK0Oxl'     .KMMN,                                \n" +
			"           ,KMNo                      ...',,.     dWMWk.                                \n" +
			"          '0MWx.                                 ,XMMX,                                 \n" +
			"         '0WWx.                                 .OWMWo                                  \n" +
			"        .OWWk.                                  cNMWO.                                  \n" +
			"        lNMX'                      .;l.        'KMWO.                                   \n" +
			"        oNWk                      .xWX' cxc   .kWWO.                                    \n" +
			"        oWNl                      ,XWx.;NMK.  lNM0.                         'oOO0Od;.   \n" +
			"       .dWN:                      dWK,.OWNl  'KMX;                        ;OWNl..cXWO.  \n" +
			"       .dWX,                     .KNo.lWWx. .OWWd                       ;OWWO,    lNN;  \n" +
			"       .xWX.                     :N0.'KWO.  oWMX'                     'kWWKc.    .ONx.  \n" +
			"       .dWX.                    .kX:.OWK'  .KMWx.                   .oXWXl.     .kNd.   \n" +
			"       .dWX'                    ;Xx.xWX;   'XMNxcokO0KKXKK0kd:.   .lKWKl.     .cKXc     \n" +
			"        oWN;                   .kK,dNNc    'XMMNKOdddolloxOXWMNO::KWKc.      :0WO'      \n" +
			"        lNNc                   :Xl;XNo     .KW0'   '0Kx.   .'lKWWW0:.      ;OWNd.       \n" +
			"        :NWx                  ,0O.:NO.      ...   .'oXNxcc:;';OXk;.      ;ONWX:         \n" +
			"        .KMK.               ,d0k' .xKo.         ;OXNNWWWMMMWWWW0:.     ;OWMWO'          \n" +
			"         oWWl             ,xo,.  ':.:KO.         .,,,,,,;:cdOXWMWKl.   :kXWW0c.         \n" +
			"         'KMK'            lK0KO,'KWKlOK,                     .,xNWMK;    .':ld0Ko.      \n" +
			"          oWW0.            ..oXKKNdckx,              ,O0'       'OWMXl  .'.. .dNK;      \n" +
			"          .OWW0'              'll'                   ;od'        .0WMX,  ,xKXKd;.       \n" +
			"           .kWWXc                                .;'              cNMWl    ;0Xc         \n" +
			"            .:0WWO;.                            'KNx              ,XMNc     .KN;        \n" +
			"               ;kWWXd,                          .c:.              lNMWkc;,';dNK'        \n" +
			"     .,.        ,XWWWWKd;.                       oKk.           .cXWKkOKKKKK0d'         \n" +
			"    .0XOkc.    lXNk'.oNMWNKxl;..                  ...         'oKN0c.    .              \n" +
			"    .XO.:0Ko..kWK: .lKKl;oONWWWNX0kdl;'.           'Ox.    .cONNk;                      \n" +
			"    .kX; .lKKNNd..:0Xo.    .';lx0XNWWWWXx. 'ccc:;,'':c..,lONN0o.                        \n" +
			"     ;NO.  .od'.;0Xd.         .....'xWMXl .0WXKXNWNNNXXNNXOo,                           \n" +
			"      lXd.   .c0Xx'         .xXNNX00NWK, .dN0' ..';:llc:..                              \n" +
			"       cKx',xXNx,           .OWW00NWNk'  cNK,                                           \n" +
			"        'kNWNx'              lNM0'.'.   ,KN:                                            \n" +
			"          ':.                .kWWx.    '0Nl                                             \n" +
			"                              .xWWd.  'KNl                                              \n" +
			"                               .lXW0odXXc                                               \n" +
			"                                 .xNWNk.                                                \n" +
			"                                   .'.                                                  \n" +
			"                                                                                        \n";

	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				args = getArgsFromConsole();
			} else {
				checkArgs(args);
			}
			if (args[0].equals("-u")) {	//unzap
				DataInputStream in = new DataInputStream(new FileInputStream(args[1]));
				unzap(in);
			} else {	// zap
				String fileName = args[0].substring(0, args[0].indexOf("."));
				File inputFile = new File(args[0]);
				long fileSize = inputFile.length();
				DataInputStream in = new DataInputStream(new FileInputStream(inputFile));
				DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName + ".zap"));
				writeHeader(out, args[0], fileSize);
				int multi = parseMultiplier(args);
				writeBody(in, out, fileSize, multi);
			}
		} catch (FileNotFoundException e) {
			System.err.print("File does not exist!");
			System.exit(0);
		} catch (IOException e) {
			System.err.print("Something went wrong wrong with the bytes!");
			System.exit(0);
		}
	}

	// If the user opts to use console input instead of command line args,
	// this gets the args from the console
	public static String[] getArgsFromConsole() {
		Scanner console = new Scanner(System.in);
		String[] args = new String[2];
		System.out.print("Would you like to Zap or Unzap? ");
		String which = console.nextLine();
		while (!which.equalsIgnoreCase("zap") && !which.equalsIgnoreCase("unzap")) {
			System.out.print("Please enter \"Zap\" or \"Unzap\": ");
			which = console.nextLine();
		}
		if (which.equalsIgnoreCase("zap")) {
			System.out.print("What is the name of the file you would like to Zap? ");
			args[0] = console.nextLine();
			System.out.print("How many times should the file size be multiplied? ");
			args[1] = console.nextLine();
		} else {
			args[0] = "-u";
			System.out.print("What is the name of the file you would like to Unzap? ");
			args[1] = console.nextLine();
		}
		return args;
	}

	// Verifies the correct number of args
	public static void checkArgs(String[] args) {
		if (args.length != 2) {
			System.err.print("You should pass 0 or 2 command line arguments.");
			System.exit(0);
		}
	}

	public static int parseMultiplier(String[] args) {
		if (args.length < 2) return 0;
		try {
			int multi = Integer.parseInt(args[1]);
			return multi;
		} catch (NumberFormatException e) {
			System.err.print("Second argument should be an integer.");
			System.exit(0);
		}
		return 0;
	}

	/*
	Stores a block of information at the beginning of the .zap file:
		amount of bytes in the file (long)
		length of file name (int)
		file name characters (chars, duh)
	 */
	public static void writeHeader(DataOutputStream out, String fileName, long fileSize) throws IOException {
		out.writeLong(fileSize);
		out.writeInt(fileName.length());
		out.writeChars(fileName);
	}

	// Copies the file and pads the end of the file with extra bytes to make it bigger
	public static void writeBody(DataInputStream in, DataOutputStream out, long fileSize, int multiplier) throws IOException {
		for (int i = 0; i < fileSize; i++) {
			out.writeByte(in.readByte());
		}
		long charsToWrite = (fileSize * (multiplier - 1)) / 2; // java chars are 2 bytes
		long count = 0;
		int index = 0;
		while (count < charsToWrite) {
			if (index == dickbutt.length()) index = 0;
			out.writeChar(dickbutt.charAt(index));
			count++;
			index++;
		}
	}

	// Extracts the original file from a zapped file
	public static void unzap(DataInputStream zapped) throws IOException {
		long fileSize = zapped.readLong();
		int nameLength = zapped.readInt();
		String str = "";
		for (int i = 0; i < nameLength; i++) {
			str += zapped.readChar();
		}

		DataOutputStream out = new DataOutputStream(new FileOutputStream(str));
		for (int i = 0; i < fileSize; i++) {
			out.writeByte(zapped.readByte());
		}
	}
}
