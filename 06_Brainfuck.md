###Einführung

Java ist eine komplexe und mächtige Programmiersprache mit der man viele Informatikprobleme lösen kann. Doch wie weit kann man den Befehlssatz einer Sprache reduzieren, ohne dass diese die Eigenschaft verliert, beliebige mathematische Probleme zu lösen? Diese spezielle Eigenschaft wird [[wikipedia:Turing-Vollständigkeit|Turing-Vollständigkeit]] genannt. Alle Programmiersprachen sind für gewöhnlich turingvollständig, was bedeutet, dass sie jedes berechenbare Problem lösen können. Zu diesen Problemen zählen zum Beispiel sämtliche mathematische Probleme, aber auch Probleme die eher struktureller Natur sind, also auch das Suchen von Einträgen in einer Kontaktliste (nein, der Weltfrieden ist leider nicht berechenbar).

[[wikipedia:Brainfuck|Brainfuck]] ist eine Programmiersprache, die ebenfalls turingvollständig ist, allerdings nur aus **acht** Befehlen besteht. In dieser Aufgabe könnt ihr selbst einen auf einer Turingmaschine basierten Interpreter für eine eigene kleine Sprache schreiben, die man in einen weiteren Schritt Brainfuck-kompatibel machen kann und damit auch turingvollständig.

###Aufgabenstellung

In dieser Aufgabe bauen wir uns eine simple [[wikipedia:Turingmaschine|Turingmaschine]], welche vorgegebenen Programmcode einer eigenen Sprache lesen und auswerten soll. Die Turingmaschine besitzt dabei nur ein Arbeitsband (workingTape) der Länge 10. Es existiert ein Lese/Schreibe-Kopf (head), der über das workingTape gleiten kann, dort Werte ändern und Werte ausgeben soll. Bewegt sich der Kopf über ein Ende des Arbeitsbandes hinaus, so taucht er auf der anderen Seite wieder auf (wenn also z.B der head von Feld 10 auf das 11. Feld bewegt wird, dann soll er wieder auf das 1. zeigen).

Die Maschine selbst wird durch einen einfachen Programmcode gesteuert, der aus 5 Befehlen besteht:
* **>** Dieser Befehl bewegt den head ein Feld nach rechts
* **<** Dieser Befehl bewegt den head ein Feld nach links
* **+** Dieser Befehl erhöht den Wert des aktuellen Feldes um 1
* **-** Dieser Befehl verringert den Wert aktuelles Feldes um 1
* **#** Dieser Befehl gibt den aktuellen Wert auf der Konsole aus

Der Programmcode der die Turingmaschine steuert, soll in einem Array namens *sourceCode* stehen, der Code soll Schritt für Schritt durchgegangen und ausgeführt werden. Auf dem Arbeitsband werden Werte vom Typ **char** gespeichert, die anfangs alle den Wert 'a' haben. Der head zeigt am Anfang auf das erste Feld auf dem workingTape.

**Hinweis 1:** char-Werte werden intern als Zahlenwerte gespeichert, deshalb könnt ihr ohne Probleme sowas wie **char example = (char)('a'+1);** schreiben, dies nennt man casten. Wenn ihr wissen wollt, welche Zeichen durch welche Zahlen repräsentiert werden, dann schaut in die [[wikipedia:ASCII-Tabelle|ASCII-Tabelle]].

Jetzt solltet ihr auch in der Lage sein, mit eurer eigenen Turingmaschine ein "Hello World"-Programm zu schreiben. Wenn ihr eure Turingmaschine eigenständig erweitern wollt, dann schaut euch die Sprache [[wikipedia:Brainfuck|Brainfuck]] an. Brainfuck ist eine Programmiersprache, welche ähnlich arbeitet wie unsere Turingmaschine in dieser Aufgabe.

**Hinweis 2:** Zum Testen verwendet einfach diese Initialisierung der Variable Source-Code. Wenn ihr alles richtig gemacht habt, dann sollten die Buchstaben a, b  und c ausgegeben werden. Die Schreibweise mit den geschweiften Klammern und den Kommawerten legt automatisch ein Array an und füllt es mit den beschriebenen Werten (Deklaration & Initialisierung in einem Schritt):
 char[] sourceCode = {'#', '+', '#', '+', '#'};