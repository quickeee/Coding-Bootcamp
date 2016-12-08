import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		int counterClasses = 0;
		int counterMethods = 0;

		String testFile = FilesUtility.readFile("./TaskDAO.java");

		String regexC = "[^\"] class [^\"]";
		Pattern patternC = Pattern.compile(regexC);
		Matcher c = patternC.matcher(testFile);
		while (c.find()) {
			counterClasses++;
		}

		String regexM = "[^\"]+(public|protected|private|static)\\s+[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])[^\"]+";
		Pattern patternM = Pattern.compile(regexM);
		Matcher m = patternM.matcher(testFile);
		while (m.find()) {
			counterMethods++;
			// System.out.println(testFile);
			// System.out.println(m.group());
		}
		System.out.println(counterClasses);
		System.out.println(counterMethods);
	}
}
