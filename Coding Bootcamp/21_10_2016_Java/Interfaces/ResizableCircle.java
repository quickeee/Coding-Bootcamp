
public class ResizableCircle extends Circle implements Resizable {

	int percentage;

	@Override
	public void resize(int percentage) {
		this.radius = this.radius * percentage / 100;
	}
}
