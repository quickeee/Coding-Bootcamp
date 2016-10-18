import java.util.Arrays;

public class Arrayss {

	public static void main(String[] args) {
		Integer [] array = {1,3,1,2,5,6,6,8,9,12,1,13,3,1};
		int i;
		int min;
		StringBuilder save = new StringBuilder();
		min = array[0];
		for (i = 0;i < array.length;i++) {
			if (array[i] < min) {
				min = array[i];
				save = new StringBuilder();
				save.append(i);
				save.append(", ");
			}
			else if (array[i] == min) {
				save.append(i);
				save.append(", ");
			}
		}
		save.setLength(save.length() - 2);
		System.out.println("Min is "+min+" in positions: "+save);
	}
}