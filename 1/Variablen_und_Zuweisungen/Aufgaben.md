# Deklaration und Initialisierung

 1. An welcher Stelle im Programm wird die Variable ''aWholeNumber'' deklariert?
 2. An welcher Stelle im folgenden Programm wird die Variable ''aWholeNumber'' initialisiert?
 3. Beantworte diese Fragen auch für die Variablen: ''notAWholeNumber'', ''aString'', ''anotherWholeNumber'', ''anotherNotSoWholeNumber'', ''anotherString''
 4. Wenn möglich: erkläre deine Meinung einem Tutor oder diskutiere sie mit einer anderen Person

# Selber Deklarationen und Definitionen durchführen

* Realisiere die Kommentare im folgenden Codestück. 
* Teste deinen Code.

```java
class SelbstDeklarierenUndDefinieren {
	public static void main(String[] args) {
		// deklariere eine Variable "birnen"  vom Typ int
		
		// weise ihr den Wert drei zu

		System.out.println("3 erwartet: " + birnen);
		// addiere fuenf zu dem Wert

		System.out.println("8 erwartet: " + birnen);
		// deklariere eine Variable "aepfel" und weise ihr den Wert fuenf zu

		System.out.println("5 erwartet: " + aepfel);
		// subtrahiere zwei von dem Wert

		System.out.println("3 erwartet: " + aepfel);

		
	}
}
```

# Zuweisung an Variablen

 1. Überlege dir, was für eine Ausgabe der folgende Code erzeugen würde.
 2. Compiliere den Code, führe ihn aus und vergleiche das Resultat mit deinen Erwartungen.
 3. Was sind die Unterschiede?
 4. Diskutiere die Unterschiede mit der Person am Rechner nebenan, oder einem Tutor.


```java
class ZuweisungenAnVariablen {
	public static void main(String [] ignored) {
		System.out.println(0);
		int zero = 0;
		System.out.println(zero);
		int one = 1;
		int whatsThis = zero;
		System.out.println(whatsThis);
		whatsThis = one;
		System.out.println(whatsThis);
	}
}
```

# Variablen ändern ihre Werte

 1. Überlege dir, was für eine Ausgabe der folgende Code erzeugen würde.
 2. Compiliere den Code, führe ihn aus und vergleiche das Resultat mit deinen Erwartungen.
 3. Was sind die Unterschiede?
 4. Diskutiere die Unterschiede mit der Person am Rechner nebenan, oder einem Tutor.


```java
class VariablenAendernIhreWerte {
	public static void main(String [] ignored) {
		int number = 1;
		System.out.println(number);
		number = 1;
		System.out.println(number);
		number = 2;
		System.out.println(number);
		number = 3;
		System.out.println(number);
		number = 1;
		System.out.println(number);
		number = 17;
		System.out.println(number);
	}
}
```

# Formatierung und Namen

 1. Wieso haben wir die Code-Beispiele nach den geschweiften Klammern eingerückt und die Variablen so benannt, wie wir es taten und nicht so:

```
class _{static long _
(long __,long  ___) {
return __==0 ?___+ 1:
___==0?_(__-1,1):_(__
-1,_(__, ___-1)) ;  }
static  {int _=2 ,___
= 2;System.out.print(
"a("+_+’,’+___+ ")="+
_ (_,  ___) ) ;System
.exit(1);}}//(C) Ulli
</nowiki>//nicht lesbar
```

 2. Etwas weniger Extrem: Was ist im folgenden Beispiel bei der Formatierung schief gelaufen?

```java
class Formatierung1 {public static void main
	(String [] ignored) {
	System.out.println(0); int zero = 0;
			System.out.println(zero);
		int one = 1;
		int whatsThis = zero;
			System.out.
		println(whatsThis);
	whatsThis = one;		System.out.println(whatsThis)
;}}
//Die Einrueckung hat sich verschoben
```

 3. Warum ist der folgende Code so schlecht lesbar?
 4. Woran erinnert er dich?

```java
class b {
	public static void main(String [] i) {
		System.out.println(0);
		int a = 0;
		System.out.println(a);
		int b = 1;
		int c = a;
		System.out.println(c);
		c = b;
		System.out.println(c);
	}
}// Keine Namen nur Buchstaben!
```
