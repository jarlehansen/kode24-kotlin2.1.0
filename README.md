# Kotlin 2.1 og veien videre

I mai i år ble Kotlin 2.0 sluppet. En av de store nyhetene var den nye K2 compileren.
Det var noen små language features og det var en ganske fin forbedring på kompileringstiden. Dette var noe vi så nærmere på i frokostseminaret vi holdt på Oslo Kotlin meetup om Kotlin 2.0.

Vi gjorde noen tester på ulike prosjekter med hjelp fra et prosjekt som heter [k2-performance-metrics](https://github.com/Kotlin/k2-performance-metrics).
Her kan man kjøre en rekke tester på sine egne prosjekter og se hvilken effekt det har å gå fra Kotlin K1 til K2 kompilatoren.
En av grunnen til at Jetbrains valgte å gå til det skrittet med å lage K2 fra bunnen av, var nettopp det å kunne tilby ny funksjonalitet raskere og tryggere.
Med 2.0 releasen så var det viktigste å ha et stabilt produkt som kunne bli tatt i bruk. Veien videre vil kunne enklere implementere nye language features.

Vi skal ta en titt på hva Kotlin 2.1 nettopp kom med, som ble releaset 27. november.

# Kotlin 2.1

Fra Kotlin 2.1 begynner Jetbrains teamet å legge til ny funksjonalitet. Det er kanskje ikke de eller mest revolusjonerende features som har blitt introdusert, men de er absolutt verdt å ta en titt på.
En detaljert oversikt over ny funksjonalitet er tilgjengelig på siden [What's new in Kotlin 2.1.0](https://kotlinlang.org/docs/whatsnew21.html).

Hvis man ikke er så gira på å lese igjennom såpass mye tekst, så anbefaler jeg å ta en titt på live stream'en som ble holdt rett etter Kotlin 2.1.0 releasen.
Anoton Arhipov, som vi også har hatt [besøk av på Oslo Kotlin meetup](https://www.meetup.com/meetup-group-nwerbymu/events/287832922/?utm_medium=referral&utm_campaign=share-btn_savedevents_share_modal&utm_source=link),
holdt en stream sammen med to fra Language Evolution Team for å gå inn på detaljene i denne nye Kotlin-versjonen. [Livestreamen er tilgjengelig her](https://www.youtube.com/live/jlgRcpVRqEo?si=C9YrEFPgQoe6XK6w), og jeg anbefaler alle å sjekke det ut. De går igjennom 5 nye features:
- Support for requiring opt-in to extend APIs
- Non-local break and continue
- Multi-dollar interpolation
- Guard conditions in when-with-subject expressions
- Improved exhaustiveness checks for when expressions with sealed classes

Kode eksemplene som de går igjennom er selfølgelig tilgjengelig på [github](https://github.com/antonarhipov/kotlin-langauge-updates-2.1.0).
De går igjennom den nye funksjonaliteten i detalj og svarer på spørsmål fra publikum, så jeg syns dette var en fin måte å presentere det på.

Viktig å tenke på at en del av den nye funksjonaliteten er i preview, og vil derfor måtte skrus på med en compiler option setting.
Eksempler på dette finnes også på github-eksempelet linket til over.

## Kotlin scripting

Kotlin scripting er teknologien som gjør det mulig å kjøre Kotlin kode uten å måtte kompilere den på forhånd.
Jetbrains har undersøkt bruken av script-støtten i Kotlin, og funnet ut at utenom Gradle byggescript så er det relativt få som bruker denne funksjonaliteten.

Fordi den var lite brukt og at funksjonalitet for scripting var krevende å holde oppdatert, og [har de derfor tenkt å kutte støtten for en del av det](https://blog.jetbrains.com/kotlin/2024/11/state-of-kotlin-scripting-2024/).
Det gjelder blant annet:
- JSR-223 og KotlinScriptMojo (maven plugin)
- Standard Kotlin REPL implementasjonene i Kotlin compiler og Intellij

Som alternativ for bruk av REPL funksjonaliteten anbefaler de bruk av Kotlin notebook og scratch filer. Deres erfaring er at dette er et mye bedre alternativ for de fleste.
Min erfaring er at Kotlin notebook har vært et veldig fint verktøy, både for å kunne teste ut ting og dokumentere det, men også for å eksperimentere litt med koden.

Jeg har ikke selv erfaring med ustrakt bruk av scripting i Kotlin utenfor Gradle byggescript.
Så for min del vil ikke dette få noen større konsekvenser, men jeg lurer på om det er prosjekter som har tatt dette i bruk i større omfang. Og eventuelt hvilke konsekvenser det får for dere?

## Veien videre

Hva skjer videre med utviklingen av Kotlin? Jetbrains gjorde en oppdatering av "[Kotlin roadmap](https://kotlinlang.org/docs/roadmap.html)" i september i år.
De viktigste prioriteringene er å utvikle språket videre, forbedre Intellij pluginen, KMP (Kotlin Multiplatform) og forenkle utviklingen av Kotlin biblioteker/verktøy/rammeverk.
Dette blir selvfølgelig veldig generelle punkter som kanskje ikke sier så veldig mye. 
På planen går de også mer i detalj, hvor det er linket inn en rekke youtrack saker de har som man kan følge med på hvis det er noe spesielt man er interessert i.
Her er det selvfølgelig også muligheter til å komme med innspill hvis det er noe spesielt du ønsker at de skal fikse eller videreutvikle.

Det blir interessant å se om noe av gevinsten med Kotlin 2.0 (og K2 kompilatoren) gjør at språket kan utvikle seg raskere, og at det blir enklere å få inn nye features i språket.
