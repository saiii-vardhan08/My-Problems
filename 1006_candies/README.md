# Candies

## Problem

Abhi is a salesman. He was given two types of candies, which he is selling in N different cities.

For the prices of the candies to be valid, Abhi's boss laid down the following condition:

- A given type of candy must have distinct prices in all N cities.

In his excitement, Abhi wrote down the prices of both the candies on the same page and in random order instead of writing them on different pages.

Now he is asking for your help to find out if the prices he wrote are valid or not.

You are given an array A of size 2N.  
Find out whether it is possible to split A into two arrays, each of length N, such that both arrays consist of distinct elements.

Both arrays can have distinct elements only if no element in the original array is repeated more than twice.

---

## Input Format

- The first line contains integer T — number of test cases.
- Each test case contains:
  - Integer N — number of cities
  - 2N integers A1, A2, …, A2N

---

## Output Format

For each test case print:

- YES → if valid
- NO → if not valid

Output is case insensitive.

---

## Constraints

1 ≤ T ≤ 1000  
1 ≤ N ≤ 1000  
1 ≤ Ai ≤ 1e9  
Sum of N over all test cases ≤ 2000

---

## Approach

- Count frequency of each element
- If any element appears more than 2 times → NO
- Otherwise → YES

---

## Language Used

Java