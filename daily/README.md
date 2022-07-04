* * *

#### Work: Putting 2D Arrays to Use -- CGOL

_GOAL:_

Design and implement an engine to play Conway's Game of Life.

_GUIDELINES:_

__The Rules of Life:__

Survivals: 
  - Every cell with 2 or 3 living neighbours survives for the next generation.

Death:
  - Each cell with >3 neighbours dies from overpopulation.
  - Every cell with <2 neighbours dies from isolation.

Birth:
  - Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
  
_Nota bene: All births and deaths occur simultaneously. Together, they constitute a single generation._


_YOUR CODING MISSION:_

1. Read the entire skeleton file, as a team, for understanding. 
2. Discuss, as a team, how you will approach this. Pick the approach that makes the most sense to all teammates, and implement it.

- PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code. 
- Need to tune your mental model? Play here: https://playgameoflife.com/
- That one not fancy enough for you? Play here: https://gameoflife.pro/
- Want more background? Read up here: https://en.wikipedia.org/wiki/The_Game_of_Life
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `3/Cgol.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

* * *



```
//////////////////////////////////
//////////////////////////////////
//////////////////////////////////
```





### Day 4 | Day 0b0100 | Day 0x04 : 7/6

Lab work time in small groups. (CGOL)

Demos, discussion of development techniques.

Extensions/applications of CGOL and cellular automata in general.

#### Work: Optional CGOL extension:

_GOAL:_

Apply an automated generational propagation mechanism to your CGOL apparatus.

_YOUR CODING MISSION:_

1. Make your own copy of Animate.java from the daily code directory.
3. As a team, read for understanding, run, repeat as necessary until understanding achieved.
4. Discuss, as a team, how you will approach grafting the animation code onto your generation transition code. Pick the approach that makes the most sense to all teammates, and implement it.

- PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code.
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your work repo: `4/Cgol.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

* * *

### Day 5 | Day 0b0101 | Day 0x05 : 7/7

Lab work time in small groups. (recursion)

#### Work: Recursion -- Have it your way
_GOAL:_

Implement a mechanism to calculate the _nth_ value in the Fibonacci sequence.

_GUIDELINES:_

Some test calls and associated return values:
* `fib(0) -> 0`
* `fib(1) -> 1`
* `fib(2) -> 1`
* `fib(3) -> 2`
* `fib(4) -> 3`
* `fib(5) -> 5`

###### Hallmarks of a Recursive Function: 
* A BASE CASE, which is a simple case value we know how to evaluate without a recursive call. It stops the recursion. 
  - a.k.a. "exit case."
  - _E.g._, 0! => 1 for factorial(n)
* A RECURSIVE REDUCTION, wherein the function calls a simpler version of itself or a version closer to "the answer." 
  - This must lead toward the base case... Or else?
  - _E.g._, (n-1)! for factorial(n)

###### STEPS FOR DEVELOPING A RECURSIVE PROCEDURE:
1. Write down simple cases & expected outputs.
2. Write down a case slightly more complex than base case
(e.g. factorial(2) )
3. Ask Q: How can I get from this case to a base case?
(Ans is key to developing recursive reduction.)
4. Q: What must be done in addition to the reduction?
(e.g. +1, +n, *n, etc...)
As you design your algorithms, brainstorm on paper.
Work out the base case and recursive reduction
BEFORE you start coding...

_YOUR CODING MISSION:_

1. Discuss, as a team, how you will approach this. Pick the approach that makes the most sense to all teammates, and implement it.
2. Once you get that working, entertain alternate approaches. 
   - Discuss pros/cons of each approach, and record these as part of the comments preceding each method.
   - Comment out your existing fib() implementation, and implement your new version.
   - Repeat for as many different approaches as you can.

- PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
    - Start with test calls like `fib(0)` and `fib(1)`... and only test larger inputs once you have a working function.
  - Never stray far from runnable code. 
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `5/Fib.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

* * *

Lecture: Java Classes and Objects
- reading: Ch10 and Ch11 in ThinkJava

Lab work time in small groups. (basic class implementation)

#### Work: Intro to Classes and Objects

_GOAL:_

Gain familiarity with basics of classes in Java.

_GUIDELINES:_

Starter kit: This daily directory has two Java files: 
- `Time.java`
- `Driver.java`

`Time.java` will hold the Time class. `Driver.java` holds the main method that will be used to test the functionality of Time. 
- To compile, run `javac Driver.java Time.java` -- which will compile both Java files. 
- To run, use `java Driver`.

_YOUR CODING MISSION:_

1. Make sure you have scrap paper and notes on hand.
1. Discuss questions/comments/concerns regarding [chapter 10](https://books.trinket.io/thinkjava/chapter10.html) in ThinkJava with your team.
1. Copy `Time.java` and `Driver.java` into your work repo.
1. Discuss questions/comments/concerns regarding [chapter 11](https://books.trinket.io/thinkjava/chapter11.html) in ThinkJava with your team.
1. Fill in your Time class implementation in `Time.java`. Grow it incrementally, testing as you go. Some things you should be able to do below...

* Your driver file should contain code to (in suggested development order)
    - instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    - instantiate a newly-created Time object with specified value(s)
    - assign a Time var the value `null`
    - assign a Time var the value of an existing Time var
    - print all of the above (See multiple ways to do this? Try all -- and document in comments!)
    - test for equality of each of the Time instances above. Print results.
    - add two Time objects and print results
    - add two Time objects and save the result in another Time object
* Your Time class definition file should contain code to
    - tell a Time object how to do the tasks necessary to achieve the above

- PROTIPS:
  - Copy the "todo-list" above into your code as comments, then use as your development guide...
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code. 
- Grow cohort KB ("knowledge base") on slack:
  - __Have a Q/C/C? Post.__ _Especially to the java channel, while working on this assignment..._
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `5/Time.java` and `5/Driver.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

* * *


### Day 6 | Day 0b0110 | Day 0x06 : 7/8

Lab work time in small groups. 

Demos/discussion of Time lab.

Lecture: Encapsulation vis-a-vis addressing array limitations

Lab work time in small groups. (implement more advanced class functionality)

#### Work: Writing a Wrapper Class

_GOAL:_

Gain familiarity with encapsulation by implementing a wrapper class.

_GUIDELINES:_

Starter kit: This daily directory has two Java files: 
- `SuperArray.java`
- `SuperArrayDriver.java`

`SuperArray.java` will contain the blueprint for a SuperArray. `SuperArrayDriver.java` will contain the main method that will be used to test the functionality of SuperArray. 
- To compile, run `javac SuperArrayDriver.java SuperArray.java` -- which will compile both Java files. 
- To run, use `java SuperArrayDriver`.

_YOUR CODING MISSION:_

1. Make sure you have scrap paper and notes on hand.
1. Discuss questions/comments/concerns regarding demo/intro of SuperArray with teammates. 
1. Implement each method in the skeleton, in the order that makes most sense to your team.

* Your driver file should contain code to test each aspect of SuperArray functionality.
* Your SuperArray class definition file should contain code to
    - tell a SuperArray object how to do the tasks necessary to achieve the above

- PROTIPS:
  - Use encapsulation diagram ("whiteboarding") as focal point for addressing intra-team Q/C/C, and for verbal walk-through of algorithm for each method you develop.
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
  - Never stray far from runnable code. 
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q/C/C? Post. 
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `6/SuperArray.java` and `6/SuperArrayDriver.java`
  - You are welcome/encouraged to store auxiliary materials in your `6/` directory. (diagrams, notes, etc.) 
  - Include heading at top of file, as comment. List all collaborators and consultants.

* * *

### Day 7 | Day 0b0111 | Day 0x07 : 7/11

Lab work time in small groups. 

Demos/discussion of SuperArray.

Demos/discussion of ArrayList.

Lecture: Sorting and Searching

Lab work time in small groups. 

#### Work: Reading Code for Understanding / Utilizing ArrayList

_GOAL:_

Gain familiarity with usage of ArrayList and with reviewing/documenting code.

_YOUR MISSION:_

1. Save a copy of the "mystery" file for today. 
1. As a team, follow usage instructions contained therein.

- PROTIPS:
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q/C/C? Post. 
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `7/Foogle.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

* * *


```
//////////////////////////////////
//////////////////////////////////
//////////////////////////////////
```


#### Work: Organize Work Repo
Your work repo should take on the structure shown below.
- You may create each subdirectory daily, or pre-create all in advance.
- PROTIP: While a readme in each subdir is not required, it is suggested as a way to keep notes, aid navigation, etc.
- `tree` command will display the filesystem tree from the current location, as shown below.

```
$ tree
.
├── 0
│   └── readme.md
├── 1
│   └── readme.md
├── 2
│   └── readme.md
├── 3
│   └── readme.md
├── 4
│   └── readme.md
├── 5
│   └── readme.md
├── 6
│   └── readme.md
├── 7
│   └── readme.md
├── 8
│   └── readme.md
├── pre
│   ├── 0
│   │   ├── Hello.java
│   │   └── readme.md
│   ├── 1
│   │   └── readme.md
│   ├── 2
│   │   ├── Date.java
│   │   ├── GuessStarter.java
│   │   ├── readme.md
│   │   └── Time.java
│   ├── 3
│   │   ├── answer.txt
│   │   └── readme.md
│   ├── 4
│   │   └── readme.md
│   ├── 5
│   │   ├── Methods.java
│   │   └── readme.md
│   ├── 6
│   │   ├── Loops.java
│   │   └── readme.md
│   ├── 7
│   │   ├── Arrays.java
│   │   └── readme.md
│   └── 8
│       ├── Craps.java
│       └── readme.md
└── README.org
```


#### Work: Mancala
_GOAL:_

Collect as many stones as possible in your mancala.

_RULES:_
* you can only move stones on your side
* a move consists of collecting all stones in a pit and dropping them 1 by 1 into each consecutive pit in a counterclockwise direction
* if last stone dropped is into your mancala, you go again
* if last stone dropped is into an empty pit on your side, you capture the stones in the opposite pit (store in mancala)

_GAMEBOARD_:
```
M p p p p p p 
  p p p p p p M
```
key: 
p: pit
m: mancala

_YOUR CODING MISSION:_

With your new team, write a program to facilitate a mancala game in the terminal. 
* "AI"-vs-human or human-vs-human (you choose)
* prompt user for which pit they wish to empty
* display relevant info after each turn:
  - state of the board
  - location of last stone dropped
  - which player goes next
* facilitate play until one entity wins, and announce winner
- PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - You will be prompted to share your algo (or algo-in-progress) to the chat after teams have had time to work up their approaches. At this point, all teams will be encouraged to review others' approaches and offer feedback and/or take inspiration.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
    - New to java and/or arrays? Since the primary goal here is to grow facility with 1D arrays, simply getting the stones transfer algorithm implemented for a single player's side of the board (not bothering with emptying pits on the other side) would be a good thing to aim for...
  - Never stray far from runnable code. 
- Need to tune your mental model? Play here: https://www.mathplayground.com/mancala.html 
- Want more background? Read up here: https://en.wikipedia.org/wiki/Mancala 
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your work repo: `programming/1or2/Mancala.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.



```
000000000000000000000000000000000000000000000000000000
```




