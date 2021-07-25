import java.awt.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Logger logger = new SpacedLogger();
		logger.Log("Yay it finally works!!!");
		
		Logger logger1 = new SpacedLogger();
		logger1.Error("Testing with a much longer string.");
	}
}
