
void setup() {
  size(450, 450); 
PImage blix = loadImage("blix.png");
image(blix, -10, 0);
fill (255, 255, 255);
ellipse(197, 175, 43, 43);

ellipse(268, 175, 27, 27); 

fill (0, 0, 0);
ellipse(197, 175, 25, 25);

ellipse(268, 175, 20, 20); 
}

void draw(){
  
 fill (mouseX, mouseY, mouseX); 
 
 ellipse(197, 175, 43, 43);

ellipse(268, 175, 27, 27); 
  
}
