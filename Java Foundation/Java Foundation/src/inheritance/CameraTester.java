package inheritance;

public class CameraTester {
	
	public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("Nikon",150.0);
        System.out.println(camera.getBrand()+" "+camera.getCost()+" "+camera.getMemory());
    }

}
