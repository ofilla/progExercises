# Deklaration und Initialisierung

 1. An welcher Stelle im Programm wird die Variable ''aWholeNumber'' deklariert?
 2. An welcher Stelle im folgenden Programm wird die Variable ''aWholeNumber'' initialisiert?
 3. Beantworte diese Fragen auch für die Variablen: ''notAWholeNumber'', ''aString'', ''anotherWholeNumber'', ''anotherNotSoWholeNumber'', ''anotherString''
 4. Wenn möglich: erkläre deine Meinung einem Tutor oder diskutiere sie mit einer anderen Person

== Selber Deklarationen und Definitionen durchführen ==

* Realisiere die Kommentare im folgenden Codestück. 
* Teste deinen Code.

 <nowiki>
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
</nowiki>

== Zuweisung an Variablen ==

* Überlege dir, was für eine Ausgabe der folgende Code erzeugen würde.
* Compiliere den Code, führe ihn aus und vergleiche das Resultat mit deinen Erwartungen.
* Was sind die Unterschiede?
* Diskutiere die Unterschiede mit der Person am Rechner nebenan, oder einem Tutor.


 <nowiki>
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
</nowiki>


== Variablen ändern ihre Werte ==

* Überlege dir, was für eine Ausgabe der folgende Code erzeugen würde.
* Compiliere den Code, führe ihn aus und vergleiche das Resultat mit deinen Erwartungen.
* Was sind die Unterschiede?
* Diskutiere die Unterschiede mit der Person am Rechner nebenan, oder einem Tutor.


 <nowiki>
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
</nowiki>


== Formatierung und Namen ==

* Wieso haben wir die Code-Beispiele nach den geschweiften Klammern eingerückt und die Variablen so benannt, wie wir es taten und nicht so:

 <nowiki>
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


* Etwas weniger Extrem: Was ist im folgenden Beispiel bei der Formatierung schief gelaufen?

 <nowiki>
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
</nowiki>//Die Einrueckung hat sich verschoben


* Warum ist der folgende Code so schlecht lesbar?
* Woran erinnert er dich?

 <nowiki>
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
</nowiki>

== Kommentare ==
Wenn du Anmerkungen zur Aufgabe hast oder Lob und Kritik loswerden möchtest, ist hier die richtige Stelle dafür. Klicke einfach ganz rechts auf "bearbeiten" und schreibe deinen Kommentar direkt ins Wiki. Keine Scheu, es geht nichts kaputt ;)

<!--
Als kleine Starthilfe folgt ein Beispiel, wie so ein Kommentar formatiert sein könnte. Mit "Vorschau zeigen" kannst du dir ansehen, was deine Änderung bewirken würde, ohne wirklich etwas zu ändern.
Du musst übrigens außerhalb dieses auskommentieren Bereichs schreiben ;)

==== Robert ====
Na mal schauen, ob irgendjemand diese Funktion wirklich benutzt. Ich fände es jedenfalls toll.
-->

[[Kategorie:Java]]
[[Kategorie:Java_Aufgaben]]



--------------------------------
Ich finde die Aufgabe "Selber Deklarationen und Definitionen durchführen" echt cool zum lernen also das Pogram nur mit Hilfe von Komentaren zu schreiben. Ist ne coole Übung.
-------
+1
-------
Vielen Dank Leute! Die Aufgaben waren sehr Hilfreich!!!