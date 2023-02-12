package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int xSpeed=1;
   	int x=400;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
   
    	fill(0, 0, 200);
    	stroke(0, 0, 200); 
        	ellipse(x, 300, 20, 20);
        	

    		x=x+xSpeed;
    	    	if(x > width){
    	    xSpeed = -xSpeed;
    	}
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}