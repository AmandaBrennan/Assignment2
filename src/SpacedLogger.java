
public class SpacedLogger implements Logger{

	public void Log(String Log) {
		
		System.out.println(Log.replace(""," ").trim());	
	}

	public void Error(String Error) {
		System.out.println("ERROR: "+Error.replace(""," ").trim());	
	}

	@Override
	public void boxOutline() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boxOutLine1() {
		// TODO Auto-generated method stub
		
	}

}
