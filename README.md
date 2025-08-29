# Stack Problems in Java

This repository contains implementations of common **Stack problems** in Java.  
Each problem demonstrates the use of **Stack data structure** for solving coding interview and DSA questions.

---

## 📌 Problems

### 🔹 Core Problems
1. **Balanced Parentheses**  
   - Problem: Check if a string containing parentheses is balanced.  
   - Example:  
     Input → `{[()]}`  
     Output → `true`  
   - Approach: Use a stack to push opening brackets and check matches with closing brackets.

2. **Reverse a Stack (Recursion)**  
   - Problem: Reverse the elements of a stack using only recursion (no extra data structures).  
   - Approach: Use recursion to pop all elements and insert at the bottom.

3. **Sort a Stack (Recursion)**  
   - Problem: Sort the elements of a stack using recursion.  
   - Example:  
     Input → `3, 5, 1, 4`  
     Output → `1, 3, 4, 5`  
   - Approach: Use recursion and insert elements in sorted order.

4. **Infix to Postfix Conversion**  
   - Problem: Convert an infix expression (e.g., `a+b*c`) to a postfix expression.  
   - Example:  
     Input → `a+b*c`  
     Output → `abc*+`  
   - Approach: Use operator precedence rules and a stack for operators.

5. **Evaluate Postfix Expression**  
   - Problem: Evaluate an arithmetic expression given in postfix notation.  
   - Example:  
     Input → `2 3 1 * + 9 -`  
     Output → `-4`  
   - Approach: Use a stack to store operands and evaluate operators step by step.

6. **Min Stack**  
   - Problem: Design a stack that supports:  
     - `push(x)`  
     - `pop()`  
     - `top()`  
     - `getMin()` → Retrieve the minimum element in **O(1)** time.  
   - Approach: Use an auxiliary stack to track minimum values.
