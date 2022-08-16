# Refactoring for Extensibility, Maintenance, and Readability

Author:

This code simulates the game of Roulette.

## Running Roulette

Execute the `roulette.main.Main` class to run Roulette.

## Testing Roulette

Some basic tests are implemented in the `tests` package.  You can run each one individually (as a JUnit Test Case), or you can run the whole package as JUnit test cases by pressing the play button on the package.

## Analysis of Refactoring Code

The refactored code is simpler because I created a different class for each of the bets meaning that instead of following various if statements in a single method each bet has its methods in its own class.

The refactored code is more complex because it has to utilize an abstract class meaning that the code has more backtracking to find how it works unlike the unfactored code which all in one location.
The tradeoffs I made were that the code had to now be spread among various child classes making it time consuming to write it all but because of this it is easier to understand how each bet works and each bet can be called on individually and the game class is no longer do as much work.
I personally prefer the unfactored code in this project. Simply because it is just as easy to understand as the other code is. ALthough it my be a bit harder to control and manipulate it just existing as is worked fine. If I was to write from scratch I would prefer the refactored code because it does make it easier to manipulate in the long term.


### Testing Discussion
The challenge of testing the project is the amount of test needed to run and the avoiding the randomness of the project itself. It is hard to try and figure out how to remove the randomness. The worst part was figuring out how to get betIsmade to work. It was hard to change how to implement without user input so I created a very odd way to test it which worked in the end. Also Figuring out was two and three consecutive numbers was a diffcult and I couldn't understand how t ofully do it. I tested the code by running each method or class each time I made change making sure to look for errors after each time I ran the code.

