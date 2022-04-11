import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(34, 188, 212);
    noLoop();
  }
  // call method
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    drawForeground(1, 1, 74, 50, 1, 22, 181, 72, 130, 148, 148);
    drawHouse(1, 1, 247, 186, 62, 153, 99, 0, 74, 50, 1, 185, 250, 249);
    drawSun(200, 25, 250, 225, 0, 50, 50);
    System.out.print(drawSun(200, 25, 250, 225, 0, 50, 50));

  }
  
  // create method 
  public void drawForeground(float groundX, float groundY, float groundRed, float groundGreen, float groundBlue, float lawnR, float lawnG, float lawnB, float pathR, float pathG, float pathB) {
    stroke(0);
    fill(groundRed, groundGreen, groundBlue);
    rect(groundX * 0, groundY * 325, groundX * 400, groundY * 100);

    stroke(0);
    fill(lawnR, lawnG, lawnB);
    rect(groundX * 75, groundY * 325, groundX * 250, groundY * 250);

    stroke(0);
    fill(pathR, pathG, pathB);
    rect(groundX * 185, groundY * 325, groundX * 40, groundY * 100);

  }

  // create method for house and its details 
  public void drawHouse(float houseX, float houseY, float houseRed, float houseGreen, float houseBlue, float roofR, float roofG, float roofB, float doorR, float doorG, float doorB, float windowR, float windowG, float windowB) {
    stroke(0);
    fill(houseRed, houseGreen, houseBlue);
    rect(houseX * 115, houseY * 150, houseX * 175, houseY * 175);

    stroke(0);
    fill(roofR, roofG, roofB);
    triangle(houseX * 50, houseY * 150, houseX * 200, houseY * 50, houseX * 350, houseY * 150);

    stroke(0);
    fill(doorR, doorG, doorB);
    rect(houseX * 185, houseY * 275, houseX * 40, houseY * 50);
    fill(houseRed, houseGreen, houseBlue);
    ellipse(houseX * 220, houseY * 300, houseX * 7, houseY * 7);

    stroke(0);
    fill(windowR, windowG, windowB);
    rect(houseX * 185, houseY * 175, houseX * 40, houseY * 40);
    line(houseX * 185, houseY * 195, houseX * 225, houseY * 195);
    line(houseX * 205, houseY * 175, houseX * 205, houseY * 215);
  }

  // create method for sun
  public int drawSun(float sunX, float sunY, float sunR, float sunG, float sunB, float sunSizeX, float sunSizeY) {

    stroke(0);
    fill(sunR, sunG, sunB);
    ellipse(sunX, sunY, sunSizeX, sunSizeY);

    return (int) sunX;
  }
}

  // define other methods down here.
