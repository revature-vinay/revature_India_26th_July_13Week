package eg1;

public class ImageDecoderFactory {

	public static ImageDecoder getInstance(String fileName) {
		if (fileName.endsWith(".jpg")) {
			return new JpgDecoder(fileName);
		}
		if (fileName.endsWith(".png")) {
			return new PngDecoder(fileName);
		}
		return null;
	}
}
