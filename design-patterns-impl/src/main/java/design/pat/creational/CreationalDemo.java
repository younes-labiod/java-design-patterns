package design.pat.creational;

public class CreationalDemo {

	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();
		Singleton anotherInstance = Singleton.getInstance();

		System.out.println(instance);
		System.out.println(anotherInstance);

		BuilderPat.Builder builder = new BuilderPat.Builder();
		builder.msisdn("01234566").productId(432567l).trxId("12dfr-134fkfr-frelrkm-rfk4");
		BuilderPat pat = builder.build();
	}

}
