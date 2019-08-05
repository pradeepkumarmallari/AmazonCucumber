package reusableMethods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logging log=new Logging();
		log.logInfo("-----------------------Hi-----------------------------------");
		log.logInfo("-----------------------Hello-----------------------------------");
		log.saveLogFileandClose();
	}

}
