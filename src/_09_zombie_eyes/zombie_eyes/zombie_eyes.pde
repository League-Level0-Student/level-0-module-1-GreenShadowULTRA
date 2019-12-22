
void setup() {
  size(450, 450); 
PImage blix = loadImage("blix.png");
image(blix, -10, 0);
fill (255, 255, 255);
ellipse(197, 175, 43, 43);

ellipse(268, 175, 27, 27); 
}
void draw(){
  line(mouseX, 20, mouseX, 80);
}
