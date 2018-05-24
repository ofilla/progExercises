class DeklarationUndInnitialisierung {
	public static void main(String [] ignored) {
		int aWholeNumber;
		double notAWholeNumber;
		String aString;

		aWholeNumber = 0;
		notAWholeNumber = 0.0;
		aString = "";
		System.out.println(aWholeNumber);
		System.out.println(notAWholeNumber);
		System.out.println(aString);

		int anotherWholeNumber = 0;
		double anotherNotSoWholeNumber = 0;
		String anotherString = "";
		System.out.println(anotherWholeNumber);
		System.out.println(anotherNotSoWholeNumber);
		System.out.println(anotherString);
	}
}