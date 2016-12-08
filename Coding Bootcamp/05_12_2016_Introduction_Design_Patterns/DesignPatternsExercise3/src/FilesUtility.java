import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesUtility {

	public static String readFile(String filePath) {
		StringBuilder sb = new StringBuilder();
		int counterLines = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
			String s = "";
			while ((s = br.readLine()) != null) {
				counterLines++;
				sb.append(s + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Lines of code: " + counterLines);
		return sb.toString();
	}

	public static void writeFile(List<String> stringList, String filePath) {
		Path file = Paths.get(filePath);
		try {
			Files.write(file, stringList, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
