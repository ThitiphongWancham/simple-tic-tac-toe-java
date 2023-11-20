# Simple Tic-Tac-Toe in Java

## Introduction

"Simple Tic-Tac-Toe" is one of the Java projects from the Java Introduction course provided by JetBrains Academy on the Hyperskill platform.
JetBrains Academy provided me with the expected outputs of the project, and then I wrote the code to meet the expectations. After writing
the code on my own, I have to test the code with the JetBrain Academy testing tool to check whether I did it correctly or not.

You can find more details about this course by [clicking here](https://hyperskill.org/tracks/8). 

## How to Play the Game
You can play this game via the command line by following these steps:
1. Clone this project into your local machine.
2. Open the project in your IDE.
3. Run the project.
4. There will be an empty 3x3 field displayed on your IDE's terminal.
5. There are two players, 'X' and 'O'; the first move belongs to the 'X' player.
6. You can place your move by typing the coordinate into the terminal input. The coordination is as follows:

```text
-----------------------
| (1,1)  (1,2)  (1,3) |
| (2,1)  (2,2)  (2,3) |
| (3,1)  (3,2)  (3,3) |
-----------------------
```

For example, if you want to place your move on the coordinate `(2,3)`, just type `2 3` into the terminal and press Enter. 
**Don't forget a space between two numbers**. The result will be like the following:

```text
---------
|       |
|     X |
|       |
---------
```

Then it will be the next player's turn. Do the same process as before; let's say the next player wants to place the move 
on the coordinate `(1,1)`, type `1 1` into the terminal and press Enter. The result will be like the following:

```text
---------
| O     |
|     X |
|       |
---------
```

This process will go on and on until the winner is found. 
You can read more about the "Tic-Tac-Toe" game on [Wikipedia](https://en.wikipedia.org/wiki/Tic-tac-toe). 
***Enjoy the game!***
