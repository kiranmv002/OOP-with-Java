# ☕ OOP-with-Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-green?style=for-the-badge)

A day-by-day Java learning journey focused on **Object Oriented Programming** concepts — from basics to advanced.

---

## 📝 What I Have Done So Far

---

### ✅ day 1 — hello world & basics

file → `Week1-Basics/Day01-HelloWorld/`

- java is a compiled language, you write code and the compiler converts it to bytecode.
- every java program needs a `main` method — it is the entry point of the program.
- `System.out.println()` is used to print output to the console.
- java is case sensitive, so `Main` and `main` are different.

---

### ✅ day 2 — data types

file → `Week1-Basics/Day02-DataTypes/`

- java has primitive data types like `int`, `float`, `double`, `char` and `boolean`.
- `String` is not a primitive type, it is an object in java.
- `float` values need an `f` at the end like `95.5f`, otherwise java treats it as `double`.
- typecasting means converting one type to another — widening is automatic, narrowing is manual.
- every data type has a limit — going beyond that limit causes overflow and value wraps around.

---

### ✅ day 3 — operators

file → `Week1-Basics/Day03-Operators/`

- arithmetic operators `+`, `-`, `*`, `/`, `%` are used for calculations.
- `%` gives the remainder — useful to check even or odd numbers.
- `Scanner` class is used to take input from the user through keyboard.
- always check if divisor is `0` before dividing — dividing by zero causes an error.
- two numbers can be swapped without a third variable using `+` and `-` operators.
- simple interest formula is `SI = (P * R * T) / 100`.

---

### ✅ day 4 — if else

file → `Week2-Conditions-Loops-Arrays/Day04-IfElse/`

- if else is used to check conditions and run different blocks of code.
- else if ladder is used when there are multiple conditions to check.
- leap year logic was tricky — divisible by 4 but not 100, unless divisible by 400.
- `&&` means both conditions must be true, `||` means at least one must be true.

---

### ✅ day 5 — switch

file → `Week2-Conditions-Loops-Arrays/Day05-Switch/`

- switch is cleaner than if else when checking one variable against many values.
- every case needs a `break` otherwise it falls through to next case.
- `default` handles any input that doesnt match any case.
- used `charAt(0)` to read a single character from scanner.

---
 
### ✅ day 6 — loops
 
file → `Week2-Conditions-Loops-Arrays/Day06-Loops/`
 
- for loop is used when we know how many times to repeat.
- while loop is used when we dont know how many times.
- do while runs at least once even if condition is false.
- fibonacci — each number is sum of previous two numbers.
- prime number — check divisibility from 2 to n/2, no need to go till n.
- armstrong number — sum of cubes of digits equals the number. example: 153.

---

### ✅ day 7 — arrays
 
file → `Week2-Conditions-Loops-Arrays/Day07-Arrays/`
 
- array stores multiple values of same type, index starts from 0.
- for each loop is a cleaner way to loop through an array.
- to find largest — assume first element is largest then compare with rest.
- to reverse — loop from last index to first index.
- bubble sort — compare adjacent elements and swap if wrong order, biggest bubbles to end.

---
 
### ✅ day 8 — methods
 
file → `Week3-Methods-Strings/Day08-Methods/`
 
- method is a block of code that does a specific task, define once use many times.
- method overloading — same name different parameters, java picks the right one.
- recursion — method calling itself, base case is important otherwise it runs forever.
- moved prime check logic into a separate method, feels much cleaner.



---
 
### ✅ day 9 — strings
 
file → `Week3-Methods-Strings/Day09-Strings/`
 
- string has lots of built in methods like `length()`, `toUpperCase()`, `charAt()`.
- always use `.equals()` to compare strings, not `==`.
- palindrome — reverse the string and compare with original.
- anagram — sort both strings and compare, if equal they are anagrams.
- counted vowels by looping through each character and checking if its a, e, i, o, u.

---
 
### ✅ day 10 — classes and objects
 
file → `Week4-OOP-Basics/Day10-Classes-Objects/`
 
- class is a blueprint, object is the real thing created from it.
- variables inside class are called fields, functions are called methods.
- made student, bank account and car classes to practice.
- bank account was fun — added deposit, withdraw and balance check.

---
 
### ✅ day 11 — constructors
 
file → `Week4-OOP-Basics/Day11-Constructors/`
 
- constructor runs automatically when object is created, same name as class.
- default constructor sets initial values with no parameters.
- parameterized constructor lets us pass values at the time of object creation.
- `this` keyword refers to current object — used to avoid confusion between field and parameter.

---
 
### ✅ day 12 — inheritance
 
file → `Week4-OOP-Basics/Day12-Inheritance/`
 
- inheritance lets child class get all properties and methods of parent class.
- `extends` keyword is used for inheritance.
- dog and cat both get `eat()` from animal but have their own methods.
- manager and developer both extend employee and share name and salary.

---
 
### ✅ day 13 — polymorphism
 
file → `Week5-OOP-Advanced/Day13-Polymorphism/`
 
- polymorphism means one thing in many forms.
- method overloading — same name different parameters, decided at compile time.
- method overriding — child redefines parent method, decided at runtime.
- parent reference can point to child object — java calls the right method at runtime.

---

## 📈 Progress

### Week 1 — Basics
- [x] Day 01 - Hello World
- [x] Day 02 - Data Types
- [x] Day 03 - Operators

### Week 2 — Conditions, Loops, Arrays
- [x] Day 04 - If-Else
- [x] Day 05 - Switch
- [x] Day 06 - Loops
- [x] Day 07 - Arrays

### Week 3 — Methods & Strings
- [x] Day 08 - Methods
- [x] Day 09 - String Handling

### Week 4 — OOP Basics
- [x] Day 10 - Classes & Objects
- [x] Day 11 - Inheritance

### Week 5 — OOP Advanced
- [x] Day 12 - Polymorphism
- [x] Day 13 - Abstraction & Interfaces

### Week 6 — Advanced Java
- [ ] Day 14 - Collections
- [ ] Day 15 - Exception Handling

---

## 🚀 How to Run

```bash
javac FileName.java
java FileName
```

---

## 📅 Daily Habit

```
Learn → Code → Commit → Push
```

---

## 🙋‍♂️ Connect with Me

[![GitHub](https://img.shields.io/badge/GitHub-kiranmv002-black?style=flat&logo=github)](https://github.com/kiranmv002)

---

> ⭐ Star this repo if you find it helpful!
