== Deklaration und Initialisierung ==

 * Deklarationen: Zeilen 3, 4 und 5
 * Initialisierungen: Zeilen 7, 8 und 9
 * Deklaration und Initialisierung gleichzeitig: Zeilen 14, 15 und 16

```java
class DeklarationUndInitialisierung {
	public static void main(String[] args) {
		int aWholeNumber; //Deklaration
		double notAWholeNumber; //Deklaration
		String aString;//Deklaration

		aWholeNumber = 0; //Initialisierung
		notAWholeNumber = 0.0; //Initialisierung
		aString = ""; //Initialisierung
		System.out.println(aWholeNumber);
		System.out.println(notAWholeNumber);
		System.out.println(aString);

		int anotherWholeNumber = 0; //Deklaration und Initialisierung
		double anotherNotSoWholeNumber = 0; //Deklaration und Initialisierung
		String anotherString = ""; //Deklaration und Initialisierrung
		System.out.println(anotherWholeNumber);
		System.out.println(anotherNotSoWholeNumber);
		System.out.println(anotherString);
	}
}
```