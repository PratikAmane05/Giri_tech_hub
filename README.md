# PPW_1 - Java Assignment Programs

This repository contains Java programs organized day-wise.

## Day 1 (Ques_1 to Ques_18)

Basic introductory Java programs are available in the `Day1` folder:

- Ques_1.java — Print: "This is first java program"
- Ques_2.java — Input all basic data types and print them
- Ques_3.java — Two numbers: all arithmetic operations
- Ques_4.java — Find third angle of a triangle
- Ques_5.java — Marks of five subjects: total and percentage
- Ques_6.java — Simple interest calculation
- Ques_7.java — Swap two numbers using third variable
- Ques_8.java — Swap two numbers without third variable
- Ques_9.java — ASCII value of a character
- Ques_10.java — Convert seconds to hours, minutes, seconds
- Ques_11.java — Check neon number
- Ques_12.java — Toggle alphabet case using ASCII
- Ques_13.java — Check even or odd
- Ques_14.java — Check triangle validity
- Ques_15.java — Check equilateral/isosceles/scalene
- Ques_16.java — Check positive/negative/zero
- Ques_17.java — Check divisibility by 5 and 11
- Ques_18.java — Calculate gross salary from basic

## Day 2 (Ques_1 to Ques_19)

Day 2 Java exercises are available in the `Day_2` folder:

1. Reverse a three-digit number without loops
2. Find first and last digit of a three-digit number
3. Sum of first and last digit of a number
4. Find the third angle of a triangle
5. Check whether a three-digit number is palindrome or not
6. Check whether character is alphabetic or not
7. Check profit or loss using cost price and selling price
8. Check whether alphabet is vowel or consonant
9. Find maximum between three numbers
10. Find minimum between three numbers
11. Print grade using ternary operator (A/B/C/F)
12. Find number of notes for a given amount
13. Check employee bonus eligibility
14. Calculate commission based on sales amount
15. Simple calculator using `switch`
16. Grade remark using `switch`
17. Day type (weekday/weekend) using `switch`
18. Vowel/consonant check using `switch`
19. Number to word conversion (1 to 5) using `switch`

How to compile and run (example):

```powershell
cd PPW_1/Day_2
javac Ques_1.java
java Ques_1
```

## Day 3 (Ques_1 to Ques_25 + patterns)

Day 3 exercises are available in the `Day_3` folder. This set includes core loop and number-manipulation problems (Ques_1..Ques_25) and pattern programs (patt_1..patt_10).

Selected tasks included:

- Ques_1 — Print natural numbers from 1 to n using a while loop
- Ques_2 — Print natural numbers in reverse from n to 1 using a while loop
- Ques_3 — Print alphabets a to z using a while loop
- Ques_4 — Print even numbers between 1 and 100
- Ques_5 — Print odd numbers between 1 and 100
- Ques_6 — Sum of natural numbers from 1 to n
- Ques_7 — Sum of even numbers from 1 to n
- Ques_8 — Sum of odd numbers from 1 to n
- Ques_9 — Multiplication table of a number
- Ques_10 — Count digits in a number
- Ques_11 — Sum of digits
- Ques_12 — Product of digits
- Ques_13 — Reverse a number
- Ques_14 — Check palindrome
- Ques_15 — Print ASCII characters and values
- Ques_16 — Power computation (a^b)
- Ques_17 — List factors of a number
- Ques_18 — First and last digit
- Ques_19 — Sum of first and last digit
- Ques_20 — Swap first and last digits
- Ques_21 — Prime number check
- Ques_22 — Perfect number check
- Ques_23 — Duck number check
- Ques_24 — Strong number check
- Ques_25 — Armstrong number check

- patt_1 .. patt_10 — Various number/character/star patterns (triangle, pyramid, grids)

How to compile and run Day 3 examples:

```powershell
cd PPW_1/Day_3
javac Ques_1.java
java Ques_1
```

## Day 4 (Ques_1 to Ques_15)

Day 4 array programs are available in the `Day_4` folder. These cover array input/output, searching, copying, insertion, deletion, duplicate handling, merging, and reversing.

Problems included:

- Ques_1.java — Input and print elements of an array
- Ques_2.java — Find sum of all array elements
- Ques_3.java — Find maximum and minimum element in an array
- Ques_4.java — Find second largest element in an array
- Ques_5.java — Count total number of even and odd elements in an array
- Ques_6.java — Count total number of negative elements in an array
- Ques_7.java — Copy all elements from one array to another array
- Ques_8.java — Insert an element in an array at a given position
- Ques_9.java — Delete an element from array at a given position
- Ques_10.java — Count frequency of each element in an array
- Ques_11.java — Print all unique elements in an array
- Ques_12.java — Count total number of duplicate elements in an array
- Ques_13.java — Delete all duplicate elements from an array
- Ques_14.java — Merge two arrays into a third array
- Ques_15.java — Reverse an array

How to compile and run Day 4 examples:

```powershell
cd PPW_1
javac Day_4/Ques_1.java
java Day_4.Ques_1
```

How to create a GitHub repo and push these files:

1. Initialize git and commit locally:

```bash
cd PPW_1
git init
git add .
git commit -m "Add 18 basic Java programs"
```

2. Create a remote repository on GitHub (replace `PratikAmane05` and `PPW_1` as needed) and push:

Using the `gh` CLI:

```bash
gh repo create PratikAmane05/PPW_1 --public --source=. --remote=origin --push
```

Or using the web UI: create repository `PPW_1`, then run:

```bash
git remote add origin https://github.com/PratikAmane05/PPW_1.git
git branch -M main
git push -u origin main
```
