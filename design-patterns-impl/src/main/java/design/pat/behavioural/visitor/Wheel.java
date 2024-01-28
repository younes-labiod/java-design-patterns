package design.pat.behavioural.visitor;

public class Wheel implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
