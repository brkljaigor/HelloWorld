package state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas canvas = new Canvas();
		canvas.setCurrentTool(new EraserTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}

}
