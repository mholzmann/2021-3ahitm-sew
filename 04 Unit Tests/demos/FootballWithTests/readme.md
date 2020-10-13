# Football

## Inhalte

- Einlesen einer CSV-Datei mit `java.nio`
- Anwendung des `List<E>`-Interface
- Sortierung mit `Collections.sort()` und `Comparable<T>`-Interface
- Anwendung von `Collections.unmodifiableList()`

## Aufgabenstellung

Entwickeln Sie eine Anwendung zur Auswertung einer Fußballsaison. Der Aufbau der Applikation ist im folgenden Klassendiagramm dargestellt:

![img](./images/class-diagram.png)

**Hinweise:** 

- Implementieren Sie die Klassen in der angegebenen Reihenfolge.
- Beachten Sie insbesondere die im Klassendiagramm dargestellten *Modifier* der Felder und Methoden (`public`, `private`, `final`, ...).

### Match

- **``getHomePoints()``**
  - berechnet, wie viele Punkte die Heimmannschaft in diesem Spiel gewonnen hat
- **``getGuestPoints``()** 
  - berechnet, wie viele Punkte die Auswärtsmannschaft in diesem Spiel gewonnen hatb

Bei einem Sieg erhält eine Mannschaft drei Punkte, bei einem Unentschieden einen Punkt und bei einer Niederlage keinen Punkt.

### Team

- **`addMatchResult(int points, int goalsShot, int goalsReceived)`** 
  - aktualisiert die Teamdaten (Punkte, Tore, Siege, ...) auf Basis des übergebenen Spielergebnisses
- **``compareTo(Team other)``**
  - vergleicht das Team mit einer anderen Mannschaft
    - Die Mannschaft mit der größeren Punktezahl liegt voran.
    - Bei Punktegleichheit liegt die Mannschaft mit dem besseren Torverhältnis voran.
    - Falls auch das Torverhältnis gleich ist, liegt die Mannschaft mit der größeren Anzahl an geschossenen Toren voran.
  - Die `Team`-Klasse implementiert mithilfe dieser Methode das Interfaces `Comparable<Team>`.

### Season

- **`addMatch(Match match)`**
  - aktualisiert die Teamdaten (Punkte, Tore, Siege, ...) der Heim- und Auswärtsmannschaft auf Basis des übergebenen Spielergebnisses
- **`findOrCreateTeam(String name)`**
  - sucht eine Mannschaft mit dem übergebenen Namen in der `teams`-Liste
  - Falls die Mannschaft noch nicht vorhanden ist, wird der Liste ein neues Team hinzugefügt.
- **`getTeamsSortedByRank()`**
  - sortiert die `teams`-Liste aufgrund des Tabellenrangs
  - gibt eine nicht bearbeitbare Ansicht auf die Liste zurück

### SeasonCsvFile

- `SeasonCsvFile(String path)`
  - der Konstruktor erstellt aus dem übergebenen Pfad der CSV-Datei ein `Path`-Objekt
- **``read()`` **
  -  liest die Matches aus der CSV-Datei ein
- **`parseMatch(String csvLine)`**
  - erstellt aufgrund der Zeile aus der CSV-Datei ein `Match`-Objekt
  - gibt dieses Objekt zurück

### Main

- **`main(String[] args)`**

  - importiert eine Saison aus der Datei `bundesliga-1819.csv`
  - gibt den Tabellenendstand aus

- **`printFootballTable(Season season)`**

  - gibt die Tabelle der übergebenen Saison auf der Konsole aus

    ![img](./images/table.png)