package _02_unbirthday;

import javax.swing.JOptionPane;

public class REEE {
public static void main(String[] args) {
String AAAA = JOptionPane.showInputDialog("when Is your Birthday");

if(AAAA.equalsIgnoreCase("Dec 15")) {
	JOptionPane.showMessageDialog(null, "you win");
}
else {
JOptionPane.showMessageDialog(null, "ok please wait untill " +AAAA );
}
System.exit(0);
}
}
