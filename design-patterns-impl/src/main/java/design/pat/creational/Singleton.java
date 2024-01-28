package design.pat.creational;

/**
 * 
 * @author younes Example in java that are using Singleton DP : Runtime, Logger,
 *         Spring Beans, Graphic Managers
 *
 */
public class Singleton {

	private static volatile Singleton instance = null;

	private Singleton() {
		if (instance != null) {
			throw new RuntimeException("Use get Instance method to create");
		}

	}

	public static Singleton getInstance() {
		if (instance == null) {// lazy loading (create only when needed)
			instance = new Singleton();
		}
		return instance;
	}

}
