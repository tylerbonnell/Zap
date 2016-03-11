import java.io.*;

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
		int multi = checkArgs(args);

		try {

			String fileName = args[0].substring(0, args[0].indexOf("."));
			String fileExt = args[0].substring(args[0].indexOf("."));
			File inputFile = new File(args[0]);
			long fileSize = inputFile.length();
			DataInputStream in = new DataInputStream(new FileInputStream(inputFile));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName + ".zap"));
			writeHeader(out, args[0], fileSize);
			writeBody(in, out, fileSize, multi);

		} catch (FileNotFoundException e) {
			System.err.print("File does not exist!");
			System.exit(0);
		} catch (IOException e) {
			System.err.print("Something went wrong wrong with the bytes!");
			System.exit(0);
		}
	}

	public static int checkArgs(String[] args) {
		if (args.length != 2) {
			System.err.print("Correct Usage: java Zap filename.extension size-multiplier");
			System.exit(0);
		}
		try {
			int multi = Integer.parseInt(args[1]);
			return multi;
		} catch (NumberFormatException e) {
			System.err.print("Second argument should be an integer");
			System.exit(0);
		}
		return 0;
	}

	public static void writeHeader(DataOutputStream out, String fileName, long fileSize) throws IOException {
		out.writeLong(fileSize);
		System.out.println(fileSize);
		out.writeInt(fileName.length());
		System.out.println(fileName.length());
		out.writeChars(fileName);
	}

	public static void writeBody(DataInputStream in, DataOutputStream out, long fileSize, int multiplier) throws IOException {
		for (int i = 0; i < fileSize; i++) {
			out.writeByte(in.readByte());
		}
		long charsToWrite = fileSize * (multiplier - 1);
		long count = 0;
		int index = 0;
		while (count < charsToWrite) {
			if (index == dickbutt.length()) index = 0;
			out.writeChar(dickbutt.charAt(index));
			count++;
			index++;
		}
	}
}


/*
	Store:
		amount of bytes in the file (long)
		length of file name (int)
		file name characters (chars, duh)
		actual file
 */
