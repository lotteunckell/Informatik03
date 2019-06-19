# INFO3: lab06

**Lotte Unckell** (565918), **Salomon Popp** (558834)

2019-06-19

GitHub Repository: https://github.com/lotteunckell/Informatik03

## 6.1 Decorator

Eine Eisdiele möchte sein Angebot an Eis modellieren (Wassereis, Kugeleis, ...). Im Angebot gibt es 4 verschiedene Eisvariationen mit jeweils unterschiedlichem Preis. Jedes Eis kann mit Toppings verfeinert werden. Zur Auswahl stehen dabei Sahne (+1€), Mandelsplitter (+0,8€) und Schokostreusel (+0,5€).

Implementiert den im Klassendiagramm dargestellten Sachverhalt, welcher das Entwurfsmuster "Decorator" verwendet.

![Klassendiagramm_Decorator](aufgabe_dekorierer/Klassendiagramm_Decorator.png)

## 6.2 Fassade

Nun wollen Kunden dieses Eis auch Kaufen. Baut einen Eisverkäufer als Fassade ein, damit die Kunden nicht Kreuz und Quer über das Eis herfallen. Der Dekorierer kann hier auch weggelassen werden.

![Klassendiagramm_Fassade](aufgabe_fassade/Klassendiagramm_Fassade.png)

---



### Schwierigkeiten / Überlegungen beim Entwurf

- Decorator bei der Auswahl der Toppings, demzufolge leicht erweiterbar

- `calcPrice()`-Methode in allen Klassen implementiert

  in den Toppings ruft es zunächst `calcPrice()` bei dem aggregierten Basis-Eis auf und addiert den eigenen Aufpreis, ermöglicht damit Verkettung:

  ```java
  new Mandelsplitter(new KugeleisStandard()).calcPrice()
  ```

  

- Berechnung mit `double` bereitete Kopfzerbrechen in der Implementierung