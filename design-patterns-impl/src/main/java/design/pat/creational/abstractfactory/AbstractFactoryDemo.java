package design.pat.creational.abstractfactory;

/**
 * 
 * @author younes Example in Java is DocumentBuilder from java xml API. One of
 *         the use cases of this pattern is for eg when you have different DB
 *         and you dont know which queries or DB to use, then this patter will
 *         be great to use
 *
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {

		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card.getClass());

		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card2.getClass());
	}

}
