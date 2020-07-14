package SE450HW3;

// Ximan Liu

public class ConcreteRoundDecorator extends Decorator {
	Converter converter;

	public ConcreteRoundDecorator(Converter converter) {
		this.converter = converter;
	}

	public String convert() {
		return converter.decorate() + " ConcreteRoundDecorator";
	}
}

