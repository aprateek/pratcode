package algo.string;

// this class will run my algos
public class AlgoRunner {
	
	

	public static void main(String[] args) {
		// call find pattern 
		String source = "ABphBBCDBE";
		String pattern = "BB";
		System.out.println(StringAlgos.findIndexOfPatern(source, pattern));
			

	}

}
