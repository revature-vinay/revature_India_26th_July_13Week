package eg1;

public abstract class ImageDecoder {
	
	private String fileName;
	
	public ImageDecoder(String fileName) {
		this.fileName = fileName;
	}
	
	abstract void displayImage();

}
