import processing.core.PApplet;
import processing.core.PGraphics;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER=10;

    //public static final int HEIGHT = 320;
    int x=1,y=0,z=0,q=0;

    public static void main(String args[]){
        PApplet.main("TryProcessing",args);}
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);//ctrl+shift+C to apper height width

    }
    @Override
    public void setup(){
       // System.out.println("Setup called method");
        ellipse(HEIGHT,WIDTH,100,100);
    }
    @Override
    public void draw(){
        //super.draw();
        //paintWhite();
        drawCircle();
        //noStroke();
    }


    private void drawCircle() {
        fill(255);
        ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(y,HEIGHT*2/5,DIAMETER,DIAMETER);
        ellipse(z,HEIGHT*3/5,DIAMETER,DIAMETER);
        ellipse(q,HEIGHT*4/5,DIAMETER,DIAMETER);
        x+=1;
        y+=2;
        z+=3;
        q+=4;
    }

    //private void paintWhite() {
      //  background(255);
    //}


}
