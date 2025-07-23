# ---- Basic Arithmetic Operations ----
# This section shows simple addition and subtraction with single numbers.
num1 = 10; num2 = 15; num3 = 101

# Addition
num1 + num2;
num2 + num3;
num1 + num2 + num3;

# Subtraction
num1 - num2;
num2 - num3;
num1 - num2 - num3;


# ---- Vector Arithmetic ----
# This section shows how arithmetic works on vectors (lists of numbers).
# Operations are performed element-by-element.
vector_a = c(5, 10, 15)
vector_b = c(15, 10, 5)

vector_a + vector_b; 
# Adds the first elements, then the second, etc.
vector_a - vector_b; 
# Subtracts the first elements, then the second, etc.


# ---- Vector Indexing (Accessing Elements) ----
# This section shows how to pull out specific elements from a larger list.
# We define a dataset and then use an 'index' vector to pick items from it.
sample_data      = 1:100 
# A sample dataset of numbers from 1 to 100
index_positions  = c(31, 22, 53, 46, 53) 
# The positions we want to get
selected_values  = sample_data[index_positions] 
# Pulls the values from sample_data at the specified positions
selected_values;


# ---- Sequence Generation ----
# This section shows different ways to create a sequence of numbers.
simple_sequence = 0.1:10; 
# Creates a simple sequence, incrementing by 1
print(simple_sequence)

# The 'seq()' function gives more control over the sequence steps.
# Both of the following commands do the exact same thing.
detailed_sequence1 = seq(1, 100, 0.01)
detailed_sequence2 = seq(from=1, to=100, by=0.01)

detailed_sequence1;