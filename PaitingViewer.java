/**
 * Create a Picture object to load a paiting and display it,
 * then double the size and move it to a new location.
 * 
 * @author  Kevin Lo
 * @version 2020-08-25
 */
public class PaitingViewer
{
    public static void main(String[] args)
    {
        Picture starryNight = new Picture("starry_night.png");
        starryNight.draw();
        
        System.out.print("X-coordinate: ");
        System.out.println(starryNight.getX());
        System.out.print("Y-coordinate: ");
        System.out.println(starryNight.getY());
        System.out.print("Width: ");
        System.out.println(starryNight.getWidth());
        System.out.print("Height: ");
        System.out.println(starryNight.getHeight());
        
        starryNight.grow(starryNight.getWidth()/2, starryNight.getHeight()/2);
        System.out.print("X-coordinate: ");
        System.out.println(starryNight.getX());
        System.out.print("Y-coordinate: ");
        System.out.println(starryNight.getY());
        System.out.print("Width: ");
        System.out.println(starryNight.getWidth());
        System.out.print("Height: ");
        System.out.println(starryNight.getHeight());
        
        starryNight.translate(153,93);
        System.out.print("X-coordinate: ");
        System.out.println(starryNight.getX());
        System.out.print("Y-coordinate: ");
        System.out.println(starryNight.getY());
        System.out.print("Width: ");
        System.out.println(starryNight.getWidth());
        System.out.print("Height: ");
        System.out.println(starryNight.getHeight());
        
  
    }
}