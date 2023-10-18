# Kviz Aplikacija

Ova Android aplikacija omogućava korisnicima igranje kviza s pitanjima i provjerom točnih odgovora. Također omogućava praćenje promjena u životnom ciklusu aplikacije, kao i mijenjanje pitanja unaprijed i unatrag.

## Sadržaj

- [Uvod](#uvod)
- [Značajke](#značajke)
- [Kako koristiti aplikaciju](#kako-koristiti-aplikaciju)
- [Promjene u životnom ciklusu](#promjene-u-životnom-ciklusu)
- [Mijenjanje pitanja unaprijed i unatrag](#mijenjanje-pitanja-unaprijed-i-unatrag)
- [Licenca](#licenca)

## Uvod

Ova Android aplikacija predstavlja jednostavan kviz sa pitanjima i odgovorima. Aplikacija je izrađena u programskom jeziku Kotlin i koristi Android Studio za razvoj. Korisnici mogu odgovarati na pitanja, provjeriti jesu li njihovi odgovori točni te mijenjati pitanja unaprijed i unatrag.

## Značajke

- Prikaz pitanja i unos odgovora.
- Provjera točnosti odgovora.
- Mogućnost mijenjanja pitanja unaprijed i unatrag.
- Praćenje promjena u životnom ciklusu aplikacije putem Logcat-a.

## Kako koristiti aplikaciju

1. Otvorite aplikaciju na svom Android uređaju.
2. Prikazat će se prvo pitanje.
3. Unesite odgovor u odgovarajuće polje.
4. Pritisnite "Provjeri odgovor" kako biste provjerili jeste li točno odgovorili.
5. Aplikacija će prikazati poruku "Točan" ili "Netočan".
6. Kliknite na "Sljedeće pitanje" kako biste prešli na sljedeće pitanje.

## Promjene u životnom ciklusu

Ova aplikacija prati promjene u životnom ciklusu kako bi osigurala ispravno ponašanje:

- `onStart`: Aplikacija je započela izvođenje.
- `onResume`: Aplikacija je nastavljena.
- `onPause`: Aplikacija je pauzirana.
- `onStop`: Aplikacija je zaustavljena.
- `onDestroy`: Aplikacija ne postoji.

## Mijenjanje pitanja unaprijed i unatrag

Da biste mijenjali pitanja unaprijed i unatrag, koristite tipke "Sljedeće pitanje" i "Prethodno pitanje" na sučelju aplikacije.

## Licenca


Autor: Borna  

E-pošta: bornakovačević5@gmail.com

GitHub: 
