import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(175);
    }

    public void draw() {
        stroke(255, 215, 0);
        strokeWeight(5);
        fill(135, 206, 235);
        rect(100, 100, 200, 200);
        stroke(50);
        strokeWeight(2);
        fill(75);
        triangle(130, 250, 120, 275, 140, 275);
        stroke(255, 165, 0);
        strokeWeight(4);
        fill(230, 0, 0);
        ellipse(250, 260, 20, 20);
        stroke(165, 42, 42);
        strokeWeight(5);
        line(130, 250, 250, 275);
    }
}
