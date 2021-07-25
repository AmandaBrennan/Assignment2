
public class AsteriskLogger implements Logger{

public void Log(String Log) {
		
		System.out.println("*** "+ Log + " ***");
	}
	
	public void Error(String Error) {
		boxOutLine(Error);
		System.out.println("*");
		System.out.println("***ERROR: "+Error+"***");
		boxOutLine(Error);
	}

	public static void boxOutLine(String Error) {
		int lengthOfError = Error.length()+12;
		for (int i = 0; i <= lengthOfError; i++) {
			System.out.print("*");
		}
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
