Java Algorithms Project

Overview

This project demonstrates the implementation of three fundamental algorithms in Java:

Binary Search: Efficiently searches for a target value in a sorted array.
Matrix Determinant: Computes the determinant of a square matrix.
Matrix Multiplication: Multiplies two matrices and returns the resulting matrix.
Each algorithm includes test cases to validate correctness and performance.

Features

Binary Search:
Implements an iterative binary search algorithm.
Test cases demonstrate searching for values at different positions and handling non-existent values.
Matrix Determinant:
Supports computation for 
2
×
2
2×2 and larger matrices using recursion.
Handles cases with zero determinants and non-square matrices.
Matrix Multiplication:
Performs matrix multiplication with proper dimension validation.
Test cases include multiplying regular matrices and multiplying by the identity matrix.
How to Run

Prerequisites
Java Development Kit (JDK) installed (version 8 or later).
A terminal or IDE for compiling and running Java programs.
Instructions
Clone the repository or download the source files.
Navigate to the project directory in your terminal.
Compile all the Java files:
javac *.java
Run the test files for each algorithm:
Binary Search Test:
java BinarySearchTest
Matrix Determinant Test:
java MatrixDeterminantTest
Matrix Multiplication Test:
java MatrixMultiplicationTest
Expected Output

Binary Search
3  // Target found in the middle
0  // Target found at the beginning
6  // Target found at the end
-1 // Target not found
Matrix Determinant
-2 // Determinant of 2x2 matrix
4  // Determinant of 3x3 matrix
0  // Determinant of 2x2 matrix with zero determinant
Matrix Multiplication
[19, 22]
[43, 50]
[1, 2]
[3, 4]
Project Structure

BinarySearch.java: Contains the implementation of the binary search algorithm.
BinarySearchTest.java: Test cases for binary search.
MatrixDeterminant.java: Contains the implementation for calculating the determinant of a matrix.
MatrixDeterminantTest.java: Test cases for matrix determinant.
MatrixMultiplication.java: Contains the implementation for matrix multiplication.
MatrixMultiplicationTest.java: Test cases for matrix multiplication.
