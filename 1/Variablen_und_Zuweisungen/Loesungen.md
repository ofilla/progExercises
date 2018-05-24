# Deklaration und Initialisierung

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

# Selber Deklarationen und Definitionen durchführen

```java
class SelbstDeklarierenUndDefinieren {
	public static void main(String[] args) {
		// deklariere eine Variable "birnen"  vom Typ int
		int birnen;
		
		// weise ihr den Wert drei zu
		birnen = 3;

		System.out.println("3 erwartet: " + birnen);
		// addiere fuenf zu dem Wert
		birnen += 5;
		// das ist eine kurze Schreibweise fuer: birnen = birnen + 5;

		System.out.println("8 erwartet: " + birnen);
		// deklariere eine Variable "aepfel" und weise ihr den Wert fuenf zu
		int aepfel = 5;

		System.out.println("5 erwartet: " + aepfel);
		// subtrahiere zwei von dem Wert
		aepfel -= 2;
		// auch moeglich: aepfel = aepfel - 2;


		System.out.println("3 erwartet: " + aepfel);

		
	}
}
```

# Formatierung und Namen

 1. Der Code ist nicht lesbar.
 2. Die Einrückung hat sich verschoben.
 3. Es gibt keine aussagekräftige Namen, sondern nur Buchstaben als Namen.
