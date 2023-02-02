public class CarOnRailsAnisov {
	// Chose a rather fitting name for this class
	public static void main(String[] args) {
		// This whole assignment is done using println
		System.out.println("         ~                            ~        ");
		System.out.println("         ~~                           ~~       ");
		System.out.println("        ~~~                          ~~~       ");
		System.out.println("       ~~~~~                        ~~~~~      ");
		System.out.println("        / \\                         / \\      ");
		System.out.println("       /   \\                       /   \\     ");
		System.out.println("      /     \\                     /     \\    ");
		System.out.println("     /       \\                   /       \\   ");
		// Need to use the plus sign in order to show the "
		System.out.println("        |" + '"' + "|                         |" + '"' + "|        ");
		System.out.println("        |" + '"' + "|                         |" + '"' + "|        ");
		System.out.println("________|" + '"' + "|________         ________|" + '"' + "|________");
		System.out.println("|                  |        |                  |");
		System.out.println("| ---          --- |        | ---          --- |");
		System.out.println("| ---          --- |@------@| ---          --- |");
		System.out.println("|                  |@------@|                  |");
		System.out.println("|__________________|        |__________________|");
		System.out.println("    CCC//////CCC                CCC//////CCC    ");
		// the backslash is an escape literal, so in order for me to print the output of
		// 6 backslashes, I need to use the plus sign in order to combine them.
		System.out.println("    CCC" + "\\" + "\\" + "\\" + "\\" + "\\" + "\\" + "CCC" + "                " + "CCC"
				+ "\\" + "\\" + "\\" + "\\" + "\\" + "\\" + "CCC");
		System.out.println("    CCC//////CCC                CCC//////CCC    ");
	};
};