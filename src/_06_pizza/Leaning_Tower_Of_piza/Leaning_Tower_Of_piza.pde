
size (850, 850); 

fill (234, 230, 178); 
ellipse (425, 425, 400, 400); 

fill (255, 50, 50); 
ellipse (425, 425, 350, 350); 

fill (255, 255, 50); 
ellipse (425, 425, 250, 250); 

PImage Bottle = loadImage("Bottle.png");
image(Bottle, 345, 350);

Bottle.resize(90, 90);

PImage Tri = loadImage("baracuda.png"); 
image(Tri, 350, 360); 
Tri.resize(90, 90); 
