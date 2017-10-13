# CDIO1
CDIO project 1

## Formål
I ​ ​denne ​ ​opgave ​ ​i ​ ​kurserne ​ ​Indledende ​ ​programmering ​ ​og ​ ​Udviklingsmetoder ​ ​til ​ ​IT-systemer ​ ​har spilfirmaet ​ ​IOOuterActive ​ ​fået ​ ​en ​ ​opgave.
​​I ​ ​er ​ ​udviklerne ​ ​og ​ ​er ​ ​opdelt ​ ​i ​ ​grupper, ​ ​som ​ ​hver ​ ​især ​ ​skal analysere, ​ ​designe, ​ ​implementere ​ ​og ​ ​teste ​ ​denne ​ ​opgave. ​

## Indledning
I denne rapport har vi gennemgået en opgave, som spilfirmaet \textit{IOOuterActive} har modtaget, og vi, som udviklere for dette firma, skabte dette spil, som opgaven beskrev.
Programmet blev skrevet i Java med IntelliJ som IDE, Visual Studio Code som LaTeX-redigeringsprogram og Tower som GIT-UI.

## Kundens vision
"Vi ​ ​vil ​ ​gerne ​ ​have ​ ​et ​ ​system, ​ ​der ​ ​kan ​ ​bruges ​ ​på ​ ​maskinerne ​ ​(Windows)​ ​i ​ ​databarerne ​ ​på ​ ​DTU. ​ ​Det
 skal ​ ​være ​ ​et ​ ​spil ​ ​mellem ​ ​2 ​ ​personer. ​ ​Spillet ​ ​skal ​ ​gå ​ ​ud ​ ​på ​ ​at ​ ​man ​ ​slår ​ ​med ​ ​et ​ ​raflebæger ​ ​med ​ ​to
 terninger ​ ​og ​ ​ser ​ ​resultatet ​ ​med ​ ​det ​ ​samme. ​ ​Summen ​ ​af ​ ​terningernes ​ ​værdier ​ ​lægges ​ ​til ​ ​ens ​ ​point.
 Vinderen ​ ​er ​ ​den, ​ ​der ​ ​opnår ​ ​40 ​ ​point. ​ ​Hvis ​ ​der ​ ​er ​ ​ressourcer ​ ​til ​ ​det, ​ ​er ​ ​der ​ ​følgende ​ ​ekstraopgaver:
 1. Spilleren ​ ​mister ​ ​alle ​ ​sine ​ ​point ​ ​hvis ​ ​spilleren ​ ​slår ​ ​to​ ​1'ere.
 2. Spilleren ​ ​får ​ ​en ​ ​ekstra ​ ​tur ​ ​hvis ​ ​spilleren ​ ​slår ​ ​to​ ​ens.
 3. Spilleren ​ ​kan ​ ​vinde ​ ​spillet ​ ​ved ​ ​at ​ ​slå ​ ​to​ ​6'ere, ​ ​hvis ​ ​spilleren ​ ​også ​ ​i ​ ​forrige ​ ​kast ​ ​slog ​ ​to​ ​6'ere
 uanset ​ ​om ​ ​det ​ ​er ​ ​på ​ ​ekstrakast ​ ​eller ​ ​i ​ ​forrige ​ ​tur.
 4. Spilleren ​ ​skal ​ ​slå ​ ​to​ ​ens ​ ​for ​ ​at ​ ​vinde ​ ​spillet, ​ ​efter ​ ​at ​ ​man ​ ​har ​ ​opnået ​ ​40 ​ ​point.
 Vi ​ ​har ​ ​fået ​ ​lavet ​ ​en ​ ​GUI ​ ​til ​ ​et ​ ​andet ​ ​projekt, ​ ​der ​ ​gerne ​ ​må ​ ​bruges ​ ​til ​ ​at ​ ​vise ​ ​terningernes ​ ​værdi ​ ​på. ​ ​(I
 må ​ ​gerne ​ ​udforske ​ ​GUI'en ​ ​og ​ ​evt. ​ ​benytte ​ ​flere ​ ​funktioner.)
 Vi ​ ​forventer ​ ​at ​ ​alle ​ ​almindelige ​ ​mennesker ​ ​kan ​ ​spille ​ ​det ​ ​uden ​ ​en ​ ​brugsanvisning.
 Vi ​ ​vil ​ ​gerne ​ ​se ​ ​en ​ ​test, ​ ​der ​ ​beviser ​ ​at ​ ​raflebægeret ​ ​virker ​ ​korrekt, ​ ​hen ​ ​over ​ ​1000 ​ ​kast.
 Det ​ ​er ​ ​op ​ ​til ​ ​jer ​ ​om ​ ​dokumentation ​ ​og ​ ​kode ​ ​skal ​ ​være ​ ​på ​ ​dansk ​ ​eller ​ ​engelsk, ​ ​dog ​ ​skal ​ ​fagudtryk ​ ​være
 naturlige."


## Kravspecificering
1.  Spillet skal håndtere to spillere.
2.  Man skal slå med to terninger, som begge er fair.
3.  Summen af de to terningerner lægges sammen og gives til spillerens pointsum.
4.  Man vinder ved at nå 40 point.
5.  Ved at slå to 1’ere, nulstilles spillerens point.
6.  To ens giver ekstra tur.
7.  Skal kunne huske spillerens forrige kast.
8.  Spilleren kan vinde med at slå to 6’ere i forrige kast og nuværende kast.
9.  To ens for at vinde spillet efter 40 point