# Primzahlen

Als [Primzahlen](http://de.wikipedia.org/wiki/Primzahl) bezeichnet man alle natürlichen Zahlen, die nur durch sich selbst und die Zahl Eins teilbar sind. Also zum Beispiel 2, 3, 5, 7, 11, 13, usw. Die 1 ist per Definition keine Primzahl.

## Einfacher Primzahlenfinder

**Aufgabe:** 

Schreibt ein Programm, das die ersten `n` Primzahlen bestimmt und ausgibt.

**Hinweise:**

* Der einfachste Algorithmus um zu ermitteln, ob eine Zahl `x` eine Primzahl ist, besteht darin, `n` durch jede Zahl kleiner als `x` zu teilen und zu überprüfen, ob ein Rest übrig bleibt.

Für die 25 würde der Algorithmus also folgendermaßen ablaufen:

```
25 / 2 = 12 Rest 1<br>
25 / 3 = 8 Rest 1<br>
25 / 4 = 6 Rest 1<br>
25 / 5 = 5 Rest 0 -> 25 ist keine Primzahl
```

Wenn der Algorithmus durchgelaufen ist, ohne einen Teiler für `x` gefunden zu haben, so muss `x` eine Primzahl sein.

* Der Modulo-Operator `%` gibt den Rest zurück, der beim Teilen von zwei Zahlen übrig bleibt.

* Ihr braucht zwei verschachtelte Schleifen. Eine, die die Zahlen 1 bis n hochzählt und eine, die jede dieser Zahlen mit jeder kleineren Zahl auf Teilbarkeit überprüft.

## Optimierung des Algorithmus

**Vorbemerkung:**

Diese Aufgabe kann auf vielerlei Arten gelöst werden und ist weniger zum Verständnis von Schleifen, Arrays, Bedingungen und Co gedacht. Vielmehr soll die sinnvolle Anwendung dieser Konzepte vertieft werden.

Die Hinweise sind nur als Anregungen zum Lösen der Aufgabe gedacht, falls man selbst gar keine Idee hat. 
Da es viele Möglichkeiten gibt die Aufgabe zu lösen, die Hinweise jedoch nur einen Weg aufzeigen, solltet ihr erstmal probieren selbst eine Lösung zu finden.

**Aufgabe:**

Um zu ermitteln, ob eine Zahl `x` eine Primzahl ist, muss man diese nicht durch sämtliche kleineren Zahlen teilen. 
Tatsächlich reicht es, wenn man `x` nur auf Teilbarkeit durch alle Zahlen `Z<x/2` überprüft (warum dies so ist, wird weiter unten beim Punkt "Hintergrund" erklärt).

Optimiert nun den Algorithmus so, dass zum Überprüfen von Zahl `x` nur alle Zahlen kleiner `x/2` durchlaufen werden. 

**Optionale Aufgabe:**

Wie viele Primzahlen gibt es zwischen 1 und 10? Wieviele zwischen 1 und 100? 1 und 1000? ...

Schreibt euch ein Programm, das euch das Verhältnis von gefundenen Primzahlen zu der Anzahl der überprüften Zahlen ausgibt.
      
**Hinweise:**  

* Speichert euch beim Durchlaufen der Zahlen jede gefundene Primzahl in einem Array.

* Wie groß muss das Array zum Speichern der gefundenen Primzahlen, in Abhängigkeit von der Anzahl der zu überprüfenden Zahlen, maximal sein? Die optionale Aufgabe hilft, dies herauszufinden.

**Hintergrund:**

Der Algorithmus ist zwar einfach, aber nicht gerade sehr intelligent. Beispielsweise würde es auch reichen, beim Überprüfen einer Primzahl `x` nur die ersten `x/2` Zahlen zu durchlaufen, da beim Teilen durch alle größeren Zahlen nur noch ein Wert zwischen 1 und 2 rauskommen kann.

Veranschaulichung:

```
 23 / 11 = 2 rest 1<br>
 23 / 12 = 1 rest 11<br>
 23 / 13 = 1 rest 10<br>
 23 / 14 = 1 rest 9<br>
 ...
 23 / 22 = 1 rest 1<br>
```

Eine weitere Optimierungsmöglichkeit stellt die Tatsache dar, dass eine Zahl die nicht durch Zwei teilbar ist, auch nicht durch ein Vielfaches von Zwei teilbar sein wird. Praktisch heißt das, dass wir die zu überprüfende Zahl nur auf Teilbarkeit durch die ungeraden Zahlen sowie der Zwei überprüfen müssen.

* 25 / 2 = 12 rest 1 -> nicht durch zwei teilbar, also auch nicht durch 4, 6, 8, 10, usw. -> nur ungerade Zahlen überprüfen
* 25 / 3 = 8 rest 1
* 25 / 5 = 5 rest 0 -> keine Primzahl

Wie man sieht, spart man hier schon ein paar Überprüfungen.

Die Regel, dass alle Zahlen, die nicht durch 2 teilbar, sind auch nicht durch ein Vielfaches von 2 teilbar sind, lässt sich noch verallgemeinern. Das heißt:

Eine Zahl die nicht durch `t` teilbar ist, ist auch nicht durch ein Vielfaches von `t` teilbar. 

Dies bedeutet im Endeffekt, dass wir beim Überprüfen von `x` nur alle Primzahlen kleiner `x/2` überprüfen müssenx da alle anderen Zahlen Vielfache einer kleineren Zahl sind, welche wir schon überprüft haben.

# Quelle

<http://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Primzahlenaufgabe>

# Lösungen

## Einfacher Primzahlenfinder

```java
public class PrimesSimple {
	public static void main(String[] args) {
		// Grenze bis zu der Primzahlen gesucht werden
		int n = 10;
		// beginne bei der Zahl 2 da 1 keine Primzahl ist
		for (int i = 2; i <= n; i++) {
			// isPrimzahl ist ein Wahrheitswert, um zu überprüfen ob wir eine
			// Primzahl gefunden haben. falls nicht wird sie später auf false
			// gesetzt.
			boolean isPrimzahl = true;
			// i durch jede Zahl kleiner als i zu teilen und zu überprüfen, ob
			// ein Rest übrig bleibt. BSP. im wiki 25=i und j wäre die Variable
			// die hochgezählt wird
			for (int j = 2; j < i && isPrimzahl; j++) {
				// Wenn eine division als rest 0 hat dann ist die Zahl keine
				// Primzahl und somit ist isPrimzahl auf false zu setzten
				if ((i % j) == 0) {
					isPrimzahl = false;
				}
			}
			// gib eine Meldung aus falls es sich um eine Primzahl handelt.
			if (isPrimzahl) {
				System.out.println(i + " ist eine Primzahl!");
			}
		}
	}
}
```

## Optimierter Primzahlfinder

```java
/**
 * @author Theresa (theresa@freitagsrunde.org)
 * 
 */
public class PrimesAdvanced {

	public static void main(String[] args) {
		int biswieviel, von; // Obere und untere Grenze der Primzahlkandidaten
		int i, n; // Variablen fuer aktuellen Primzahlkandidaten und aktuellen
					// Teiler

		System.out.println("Bitte geben Sie den Bereich an, in dem alle Primzahlen berechnet werden sollen.");
		System.out.print("Primzahlen von? ");
		// Lies die erste eingegebene Zahl
		von = Integer.parseInt(System.console().readLine());
		System.out.print("bis? ");
		// Lies die zweite eingegebene Zahl
		biswieviel = Integer.parseInt(System.console().readLine());

		for (i = von; i <= biswieviel; i++) {
			n = 2;

			// Schleife ueber alle moeglichen Teiler n des Primzahlkandidaten i:
			while (i % n != 0 && n <= i / 2) {
				// Erhoehe n solange, wie i nicht nurch n teilbar ist und die
				// Obergrenze noch nicht erreicht ist
				n = n + 1;
			}

			// Falls die Schleife bis zur Obergrenze i/2 durchlaufen wurde:
			if (n >= i / 2 + 1 && i != 1) {
				System.out.println(i + " ist eine Primzahl.");
			}
			// andernfalls wurde die Schleife vorher abgebrochen, weil i durch n
			// teilbar war -> keine Primzahl
		}
	}
}
```

## Quelle

<http://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Primzahlenaufgabe/Musterloesung>