### Fibonacci-Zahlen

Schreibt ein Programm, welches die ersten acht Folgeglieder der [[wikipedia:Fibonacci-Folge|Fibonacci-Folge]] ausgibt. Zur Erinnerung:
* fibonacci(0) = 0
* fibonacci(1) = 1
* und für n > 1 gilt: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)

### Aufgaben

  1. Es soll eine Methode mit dem Namen *fibonacci* geschrieben werden. Diese Methode soll genau eine Variable vom Typ **int** und dem Namen *n* übergeben bekommen. Als Rückgabewert soll die Methode den zu *n*-ten Wert der Fibonacci-Folge liefern.

  2. Nachdem nun die Methode mit der passenden Signatur geschrieben wurde, muss sie noch die nötige Berechnung tätigen.

  3. Testet die fibonacci-Methode, ob sie korrekt funktioniert, indem ein paar Werte berechnet werden.

  4. Der Datentyp *int* beinhaltet auch negative ganze Zahlen. Was passiert, wenn die fibonacci-Methode einen negativen Eingabewert erhält? Bitte denke erst darüber nach und probiere danach aus. Korrigiere die fibonacci-Methode, sodass sie bei Eingabe von negativen Zahlen eine Fehlermeldung ausgibt und einen Fehler-Code zurückgibt. Hier wäre etwa -1 als Ergebnis vorstellbar.

### Quelle

https://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Fibonacci

### Lösungen

#### Variante 1

```java


public class FibonacciNumbers {
	public static void main(String args[]) {
		printfibonacci(-1, 8);
	}

	/* outputs fibonacci numbers from argument one to argument two */
	public static void printfibonacci(int start, int end) {
		for (int i = start; i < end; i++) {
			System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
		}
	}

	/* calculates a fibonacci number of n */
	public static int fibonacci(int n) {
		if (0 == n) {
			return 0;
		}

		if (1 == n) {
			return 1;
		}

		if (n > 1) {
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else {
			System.out.println("Error! Fibonacci undefined for negativ values");
			return -1;
		}
	}
}
```

#### Variante 2

```java
public class Fibonacci {
	public static void main(String[] args) {
		System.out.print(fibonacci(5));
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			System.out.print("Du hast eine negative Zahl eingegeben:");
		} else {
			if (n > 1) {
				n = fibonacci(n - 1) + fibonacci(n - 2);
			}
		}
		return n;
	}
}
```