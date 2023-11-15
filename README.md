
# 5DanaUOblacima

Aplikacija za izracunavanje uspesnosti i proseka kosarkasa

### Okruzenje
Spring boot 3.1.5 applikacija sa maven buildom

### Nacin pokretanja
Na putanji `src/main/java/com.example.demo/DemoApplication` se nalazi file iz koga se pokrece cela spring boot aplikacija, sve sto je potrebno je imati instalirano neko razvojno java okruzenja, npr. `Intellij` ili `Eclipse`

Link do screenshota lokacije fajla: `https://ibb.co/tZs6WW1`

### Lista korišćenih tehnologija
    1. Spring Boot: za kreiranje API-a
    
    2. H2-database: in-memory baza

### Lokacija csv-fajla
Trenutno se csv fajl nalazi na putanji `src/main/resources`, da bi program mogao da ocita csv on mora ostati na toj lokaciji, ukoliko se koriste jos neki test podaci, ubacite ih na tu putanju i u gameService klasi u metodi getAllGames promenite naziv fajla po potrebi.
    

