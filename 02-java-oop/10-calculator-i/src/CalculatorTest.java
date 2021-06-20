
public class CalculatorTest {
	public static void main(String[] args){
		Calculator genius = new Calculator (10.5, 5.2, '+');
		genius.performOperation();
		System.out.println(genius.getResults());
		
	}
}
