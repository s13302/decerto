# Recruitment task from Decerto

[Decerto page](https://decerto.com/pl/)

## PL Description

Aplikacja ma za zadanie łączyć dane z dwóch różnych źródeł, obecnie danymi są liczby. Przykładowe źródła danych:

- generowanie liczb losowych języka Java,
- [API REST](https://www.random.org/),
- odczyt z bazy danych (hipotetyczna zewnętrzna baza lub baza pamięciową).

Łączenie danych to dodawanie.

Pamiętaj, że wymagania mogą się zmienić. Może zmienić się zarówno sposób łączenia, mogą się zmienić źródła danych, mogą się zmienić również typy danych. Architektura rozwiązania powinna być elastyczna aby takie zmiany można było łatwo wprowadzić.

### Założenia:

1. Aplikacja może wykorzystać dowolny framework. Może być również napisanie w czystej Javie.
2. Kod musi być możliwy do skompilowania i uruchomienia na komputerze z zainstalowanym JDK w wersjach 8 i 11, Mavenem oraz Gradle.
3. Kod musi być przekazany w formie archiwum lub jako link do otwartego repozytorium. W obu przypadkach projekt powinien spełniać wymogi projektu produkcyjnego, tzn. takiego, którego powinniśmy się spodziewać w repozytorium na głównym branchu, spełniającego powszechnie przyjęte zasady (np. gitignore, wyłącznie niezbędne pliki, brak nadmiarowego czy martwego kodu).

## EN Description

Application should join data from different sources together, now the data will be numbers. You can use the following data sources:

- Generate random numbers in Java
- [API REST](https://www.random.org/)
- Database read (you can use an external or in-memory database)

In this case join means to add the numbers.

Remember, requirements can be changed. It would change join method or data sources or data types. The architecture should allow these changes and the changes itself should be possible to add easily.

### Assumptions:

1. You can use any framework, you can also write the application in pure Java.
2. The code has to be compileable and runnable on device with JDK 8 and 11 verions. Using Maven and Gradle.
3. The code should be passed in compressed version or as a link to the public repository.

## Work breakdown

* [X] Setup a project
    * [X] Create a Maven project
    * [X] Create and fill `.gitignore` file
    * [X] Create and fill `README.md` file
    * [X] Create base `Main.java` file and check project setup
    * [X] Push as initial commit
* [X] Getting the data
    * [X] Strategy design pattern
    * [X] Random numbers generator