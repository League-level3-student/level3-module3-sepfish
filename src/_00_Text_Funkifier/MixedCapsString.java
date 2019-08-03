package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String gamzee = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				Character c = Character.toLowerCase(s.charAt(i));
				gamzee += c;
			} else {
				Character c = Character.toUpperCase(s.charAt(i));
				gamzee += c;
			}
		}
		return gamzee;
	}

}
