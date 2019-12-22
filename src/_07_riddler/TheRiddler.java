package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		
int score = 0; 
		
String brick = JOptionPane.showInputDialog("a plane is carying 1000 bricks and 999 fall off how many are left?");
		
if(brick.equalsIgnoreCase("1")) {
	score++;
	JOptionPane.showMessageDialog(null, "yes");
}
else {
	JOptionPane.showMessageDialog(null, "nope");
	
}
	
JOptionPane.showMessageDialog(null, "your score is " +score);

//aaaaaaaaaaaa

String fridge1 = JOptionPane.showInputDialog("what are the three steps when putting a girafe on a refrigerator?");

if(fridge1.equalsIgnoreCase("Open fridge, put girafe in, close fridge")) {
	score++;
	JOptionPane.showMessageDialog(null, "yes");
}
else {
	JOptionPane.showMessageDialog(null, "nope");
	
}
	
JOptionPane.showMessageDialog(null, "your score is " +score);


//bbbbbbbbb

String fridge2 = JOptionPane.showInputDialog("what are the 4 steps in putting an elaphant in the refridgerator?");

if(fridge2.equalsIgnoreCase("Open fridge,take out girafe, put elephant in, close fridge ")) {
	score++;
	JOptionPane.showMessageDialog(null, "yes");
}
else {
	JOptionPane.showMessageDialog(null, "nope");
	
}
	
JOptionPane.showMessageDialog(null, "your score is " +score);

//cccccccccccc

String party = JOptionPane.showInputDialog("susie is having a birthday party and all of her animal friends were there. One wasnt there wich one was it and why?");

if(party.equalsIgnoreCase("the elephant because he is stuck in the fridge")) {
	score++;
	JOptionPane.showMessageDialog(null, "yes");
}
else {
	JOptionPane.showMessageDialog(null, "nope");
	
}
	
JOptionPane.showMessageDialog(null, "your score is " +score);

//dddddddddddd

String bridge = JOptionPane.showInputDialog("On her way home Susie has to cross a bridge. The bridge colapsed suddely why?");

if(bridge.equalsIgnoreCase("the bridge was crushed by 999 bricks")) {
	score++;
	JOptionPane.showMessageDialog(null, "yes");
}
else {
	JOptionPane.showMessageDialog(null, "nope");
	
}
	
JOptionPane.showMessageDialog(null, "your final score is " +score);
System.exit(0);
	}
}

