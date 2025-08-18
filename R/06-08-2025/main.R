# --- Block 1: Basic For Loop ---
# This block demonstrates a simple loop that prints numbers from 1 to 10.
for(i in 1:10)
{
  print(i)
}


# --- Block 2: For Loop with a Different Range ---
# This block shows a loop printing numbers in a different sequence, from 90 to 110.
for(i in 90:110)
{
  print(i)
}


# --- Block 3: Sum of First 10 Numbers ---
# This block calculates the sum of all numbers from 1 to 10.
total = 0 
for(i in 1:10)
{
  total = total + i
}
total


# --- Block 4: Sum of Squares ---
# This block calculates the sum of the squares of the first 10 numbers (1^2 + 2^2 + ...).
total = 0
for(i in 1:10)
{
  total = total + i^2
}
total


# --- Block 5: Sum of Cubes ---
# This block calculates the sum of the cubes of the first 10 numbers (1^3 + 2^3 + ...).
total = 0
for(i in 1:10)
{
  total = total + i^3
}
total


# --- Block 6: Sum of Numbers to a Certain Power ---
# This block calculates the sum of numbers raised to a specific power, set by a variable.
power_value = 3 
total = 0
for(i in 1:10)
{
  total = total + i^power_value
}
total


# --- Block 7: Sum of Odd Numbers ---
# This block generates a sequence of odd numbers up to 30 and calculates their sum.
odd_numbers = seq(from=1, to=30, by=2)
total = 0
for(i in odd_numbers)
{
  total = total + i
}
total


# --- Block 8: Sum of Even Numbers ---
# This block generates a sequence of even numbers up to 30 and calculates their sum.
even_numbers = seq(from=0, to=30, by=2)
total = 0
for(i in even_numbers)
{
  total = total + i
}
total


# --- Block 9: Factorial Calculation ---
# This block calculates the factorial of a number (e.g., 10! = 10 * 9 * ... * 1).
factorial_result = 1
limit = 10
for(i in 1:limit)
{
  factorial_result = factorial_result * i
}
factorial_result


# --- Block 10: Matrix Creation ---
# This block creates a 5x5 matrix filled with numbers from 1 to 25.
all_numbers = c(1:25)
my_matrix = matrix(all_numbers, nrow=5, ncol=5, byrow=TRUE)
my_matrix


# --- Block 11: Row-Wise Sum of a Matrix ---
# This block calculates the sum of elements for each row in the matrix using a nested loop.
row_sums = c()
for(i in 1:5)
{
  row_sums[i] = 0
  for(j in 1:5)
  {
    row_sums[i] = row_sums[i] + my_matrix[i,j]
  }
}
row_sums


# --- Block 12: Column-Wise Sum of a Matrix ---
# This block calculates the sum of elements for each column in the matrix using a nested loop.
column_sums = c()
for(i in 1:5)
{
  column_sums[i] = 0
  for(j in 1:5)
  {
    column_sums[i] = column_sums[i] + my_matrix[j,i]
  }
}
column_sums


# --- Block 13: Transpose of a Matrix ---
# This block creates the transpose of a matrix, where rows become columns and columns become rows.
# Creating an empty matrix to store the result
transposed_matrix = matrix(nrow=5, ncol=5)
for(i in 1:5)
{
  for(j in 1:5)
  {
    transposed_matrix[i,j] = my_matrix[j,i]
  }
}
my_matrix 
# Original Matrix
transposed_matrix 
# Transposed Matrix
