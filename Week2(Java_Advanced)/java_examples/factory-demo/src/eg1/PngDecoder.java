package eg1;

public class PngDecoder extends ImageDecoder {

	public PngDecoder(String fileName) {
		super(fileName);
	}

	@Override
	void displayImage() {
		System.out.println("Display PNG image.");
	}

}
