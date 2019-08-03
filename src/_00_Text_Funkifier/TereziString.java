package _00_Text_Funkifier;

public class TereziString extends SpecialString{

	public TereziString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String funkifyText(String s) {
		s = s.toUpperCase();
		s = s.replace('A', '4');
		s = s.replace('I', '1');
		s = s.replace('E', '3');
		return s;
	}

}
