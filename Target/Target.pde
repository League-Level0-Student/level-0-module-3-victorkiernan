int counter=0;
void setup() {size(500,500); noFill(); }
void draw() {
  counter=0;
for (int i = 256; i > 0; i-=20){
if (counter%2==0){
 fill(255,0,0);
 }
 else {
 fill(255);}
 ellipse(250,250,i,i);
 counter+=1;
}






}