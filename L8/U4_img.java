import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class U4_img {
	public static void main(String[] args) throws IOException {
		String seite = "<body id=\"www-wikipedia-org\">"
			+ "<div class=\"central-textlogo\">"
			+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
			+ "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
			+ "</div>"
			+ "</body>";

		String download_url = get_url(seite);
		URL url = new URL(download_url);
		BufferedImage image = ImageIO.read(url);
		ImageIO.write(image, "png", new File("bild.png"));
	}

	private static String get_url(String body) {
		int start_index = body.indexOf("img src=\"");
		// img src=" has 9 chars and we want everything after "
		String start = body.substring(start_index+9);
		String out = start.substring(0, start.indexOf('"'));
		return out;
	}
}
