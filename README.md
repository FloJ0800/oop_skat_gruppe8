# HWR OOP Group Project Skat Game

This repository contains a student project created for an ongoing lecture on object-oriented
programming with Java at HWR Berlin (summer term 2024).

> :warning: This code is for educational purposes only. Do not rely on it!

## Prerequisites

Installed:

1. IDE of your choice (e.g. IntelliJ IDEA)
2. JDK of choice installed (e.g. through IntelliJ IDEA)
3. Maven installed (e.g. through IntelliJ IDEA)
4. Git installed

## Local Development

This project uses [Apache Maven][maven] as build tool.

To build from your shell (without an additional local installation of Maven), ensure that `./mvnw`
is executable:

```
chmod +x ./mvnw
```

I recommend not to dive into details about Maven at the beginning.
Instead, you can use [just][just] to build the project.
It reads the repositories `justfile` which maps simplified commands to corresponding sensible Maven
calls.

With _just_ installed, you can simply run this command to perform a build of this project and run
all of its tests:

```
just build
```

## Abstract

Our project aimed for a playable Skat game for three players. The foundation of the game
(Cards, Players, etc.) are implemented including the Game Logic as a combination of Comparator and Game.
As a persistence we use a FileWriting and FileReading system in the DataManager class.
The program is currently not a runnable skat game. The persistance system is also not fully working as
single Strings can be saved and loaded but the actual game data is not yet implemented in the persistance system.


We created a card deck which can be filled and shuffled on command. The cards in the deck can be drawn
individually or directly given into the players' hands. The two remaining cards will automatically be put
into the Skat. 

Every player can lay one Card into the current Trick where afterward they will be compared.

Cards can be compared to each other including the trump attribute. The comparator also considers trump
and the card that was first played. It can also compare trump cards and non-trump cards to each other.

In the beginning of our fixed game, the 3 players are written into the SaveText.txt file including the
information that Player1 will be playing solo.


The most interesting problem to be solved was to always stay with Test-driven-Development and when
we didn't to return to 100% line coverage. 
The Mutation Coverage was also a big part of our process. To go through the written code and look for lines
with non-killed mutations and fix those was a struggle.

## Feature List

| Number | Feature                                       | Tests           |
|--------|-----------------------------------------------|-----------------|
| 1      | CardDeck can be filled                        | CardDeckTest    |
| 2      | CardDeck can be shuffled                      | CardDeckTest    |
| 3      | Cards can be drawn from the CardDeck          | CardDeckTest    |
| 4      | Cards can be given to players hands           | PlayerTest      |
| 5      | Skat is filled automatically                  | GameTest        |
| 6      | Players can lay a Card into the current Trick | GameTest        |
| 7      | Cards can be compared to each other           | ComparatorTest  |
| 8      | the 3 players are written into a text file    | DataManagerTest |
   

## Additional Dependencies

| Number | Dependency Name | Dependency Description | Why is it necessary? |
|--------|-----------------|------------------------|----------------------|
| 1      | /               | /                      | /                    |