# Aufgabenstellung

Diese Aufgabe stellt eine etwas erweitere Version von HelloWorld dar. Als Vorbild dient das Unix-Programm Cowsay. Diesem Programm übergibt man einen Text und als Ergebnis erhält man eine kleines Bild (als ASCII-Art) auf der Konsole, welches den übergeben Text enthält. Dies könnte so aussehen wie hier zu sehen.

```
  _____________
 < Java rocks! >
  -------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
                
```

# Java
 1. Als ersten Schritt könnt ihr mit mehreren `System.out.println("...");` erstmal ein wenig herumprobieren und versuchen eine ASCII Graphik, die ihr euch ausgedacht habt, auszugeben. Natürlich könnt ihr auch die aus dem Beispiel nehmen.

 2. Als zweiten Schritt könnt ihr probieren, auch etwas Text mit in die Graphik einzubinden, wie in dem ersten Beispiel zu sehen.

     * Für Mehrdenker: Beachtet, dass wie bei der orginal Cowsay/Cowthink die Länge des Strings auch berücksichtigt wird um den String mit "_" (oder anderen Zeichen) zu unter- bzw oberstreichen.

## Hinweise

Wenn ihr auf der Konsole ein Backslash "\" ausgeben wollt, dann müsst ihr dieses Zeichen, da es selbst ein sogenanntes [Escapezeichen](http://de.wikipedia.org/wiki/Escape-Sequenz) ist, mit einem Backslash "escapen".
Der Code um ein Backslash auszugeben, sieht also so aus:

```java
System.out.println("\\");
```

## Tipps

### Lesen von der Konsole

Wenn ihr beim Ausführen eures Programms in der Konsole ein Parameter (also ein Wort) mit übergebt, so findet ihr ihn an Position [0] im String-Array eurer `main`-Methode wieder.

Beispiel:
 `java cowsay rocks`
-> `arguments[0]` enthält rocks.

Bei einem Satz muesst ihr diesen in Hochkomma angeben.

Beispiel:
 `java cowsay "Java Rocks"`
-> `arguments[0]` enthaelt nun *Java Rocks*

# Quelle

<https://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Cowsay>

# Lösung

```java
public class Cowsay {
    public static void main(String[] args){
        String message = "Java rocks!";
        if(args.length > 0){
            message = args[0];
        }
  
        System.out.println(" _____________");
        System.out.println("< " + message + " >");
        System.out.println(" -------------");
        System.out.println("        \\   ^__^");
        System.out.println("         \\  (oo)\\________");
        System.out.println("            (__)\\        )\\/\\");
        System.out.println("                ||-----w |");
        System.out.println("                ||      ||");
    }
}
```