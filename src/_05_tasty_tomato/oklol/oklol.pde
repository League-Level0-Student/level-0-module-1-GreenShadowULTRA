void setup () {
 size (850, 850); 
}

void draw(){

background(255, 255, 255);
noStroke();
fill (000000);
ellipse(150, 200, 150, 150);
ellipse(212, 200, 150,150);
fill (5, 255, 50);
rect(176, 103, 12, 32);

if(mouseButton==LEFT){
fill (255, 255, 255);
ellipse(120, 200, 150, 150); 
}
}
