### Handwerkszeug

* Entpacke die Datei `03_Ein_eigenes_Menue.tar` in dein Arbeitsverzeichnis.

Solange diese Datei in demselben Verzeichnis liegt wie die java-Datei, an der du arbeitest, stehen dir einige Befehle zur Verfügung, die das Lesen von Tastatureingaben stark erleichtern.

Falls das nicht funktioniert, ist der sogenannte CLASSPATH falsch gesetzt.
Gib dazu in dem Terminal(Eingabeaufforderung) direkt nach dem Öffnen vor dem Aufruf des Compilers in der Shell folgendes Kommando ein: 

```  
CLASSPATH=".:$CLASSPATH"
```

Zurück zum Thema: Einer dieser Befehle lautet "Terminal.readString()". Er liest eine Tastatureingabe bis zum nächsten Zeilenumbruch von der Konsole und liefert ihn als String zurück.

Beispiel:

```java
// Einlesen einer Tastatureingabe bis zum nächsten Zeilenumbruch in die Variable "eingegebeneTextzeile"

String eingegebeneTextzeile;
eingegebeneTextzeile = Terminal.readString();
```

### Erste Konsolenabfrage

Probieren wir das Ganze einmal aus.

* Frage auf der Konsole nach dem Namen des Benutzers.
* Speichere seine Eingabe mit Hilfe von `Terminal.readString()`.
* Begrüße den Benutzer mit seinem Namen.


### Menü mit Zahlen

Schonmal nicht schlecht. Nun zum interessanten Teil.
Ein weiterer Befehl zur Vereinfachung der Konsolenbenutzung lautet `Terminal.readInt()`. Er liest eine Zahl von der Konsole und gibt sie als int zurück.

Beispiel:

```java
// Einlesen einer Zahl per Tastatureingabe in die Variable "eingegebeneZahl"

int eingegebeneZahl;
eingegebeneZahl = Terminal.readInt();
```

* Frage auf der Konsole, ob der Benutzer: 
     1. eine Frau ist.
     2. ein Mann ist.

* Begrüße den Benutzer abhängig von seiner Eingabe mit "Herr" oder "Frau"
* Zeige eine Fehlermeldung an, wenn eine andere Zahl als 1 oder 2 ist.

### Tipps
Einen Text auf der Konsole ausgeben: `System.out.println("text");`

Den Programmfluss abhängig vom Wahrheitsgehalt einer Bedingung lenken:

``java
if (bedingung) { // dies ist eine geschweifte Klammer
  fall1
} // dies ist eine geschweifte Klammer
else { // dies ist eine geschweifte Klammer
  fall2
} // dies ist eine geschweifte Klammer
```

Zwei Bedingungen logisch miteinander verknüpfen:

```java
if (bedingung1 && bedingung2) {...} // Logisches Und

if (bedingung1 || bedingung2) {...} // logisches Oder
```

Je nach Wert einer Variablen unterschiedlichen Code ausführen: (Nur für int!)

```java
switch (variable) {
     case fall1: // Wenn "fall1", wird das hier ausgefuehrt
                break;
     case fall2: // Wenn "fall2", wird jenes hier ausgeführt
                break;
     /*  ...
     Hier koennen noch beliebig viele "case" stehen.
     */
     default:
                // Nur ausgefuehrt, falls sonst kein Fall zutrifft. Hier kein "break"!
}
```