package gr.bootcamp.designpatterns.exercise2;

import java.util.ArrayList;
import java.util.List;

public class TestFiles {

	public static void main(String[] args) {
		// FilesUtility.readFile("./test1.java");
		List<String> myfile = new ArrayList<>();
		myfile.add("mitsos");
		myfile.add("giorgos");
		myfile.add("adwnhs");
		FilesUtility.writeFile(myfile, "./test.txt");
	}
}