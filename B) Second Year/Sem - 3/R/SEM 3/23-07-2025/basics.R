## Basic Operations
x=10; y=15; 
# Assign variables.
x+y; 
# Add variables and display the sum.


## Repeat Function
rep(1,5) 
# Repeat the number 1 five times.
rep(x, 10); 
# Repeat the current value of x ten times.


## Vector Creation and Manipulation
x=c(5,10,15); 
# Create a numeric vector 'x'.
y=c(20,25,30); 
# Create a numeric vector 'y'.
z=c(x,y,x+y); 
# Concatenate x, y, and their element-wise sum into a new vector 'z'.
z; 
# Display the contents of z.


names=c("Tanay","Anish","Shreya"); 
# Create a character vector.
names; 
# Display the 'names' vector.
names=c("a","b","A","B"); 
# Reassign 'names' with new elements.
names; 


## Display the new 'names' vector.
c1=c(1,2,3,"a","n","i","s","h"); 
# Create a mixed-type vector (all elements become characters).
c1; 
# Display c1.


## Sequence Generation
num=0.1:100.0; 
# Create a sequence from 0.1 to 100.0.
length(num); 
# Get the number of elements in num.
num2=seq(1,2,0.001) 
# Create a fine-grained sequence from 1 to 2.
length(num2); 
# Get the length of num2.

## Type Checking
typeof(num); 
# Get the internal storage type (double).
is.numeric(num); 
# Check if the vector is numeric (returns TRUE).


## Matrix Creation
ab=1:9 
# Create an integer sequence from 1 to 9.
mat=matrix(ab, nrow=3, ncol=3, byrow=TRUE); 
# Create a 3x3 matrix, filling by row.
mat; 
# Display the matrix 'mat'.
mat1=matrix(ab, nrow=3, ncol=3, byrow=FALSE); 
# Create a 3x3 matrix, filling by column (default).
mat1; 
# Display the matrix 'mat1'.


## Matrix Inspection and Subsetting
dim(mat); 
# Get matrix dimensions (rows, columns).
mat[1,3]; 
# Get element at [row 1, col 3].
is.vector(mat); 
# Check if 'mat' is a vector (returns FALSE).
is.matrix(mat); 
# Check if 'mat' is a matrix (returns TRUE).
row=mat[1,]; 
# Extract the first row as a vector.
is.vector(row); 
# Check if the extracted 'row' is a vector (returns TRUE).
mat[,3] 
# Get all elements from the third column.


hm=mat[c(1,2,3),2]; 
# Get all rows from the second column.
hm1=mat[c(3,2,1),2]; 
# Get the second column with rows in reverse order.
hm3=mat[2,c(1,2,3)]; 
# Get all columns from the second row.
hm4=mat[2,c(1,2)]; 
# Get elements from row 2, columns 1 and 2.
hm5=mat[1,c(-2,-3)]; 
# Get row 1, excluding columns 2 and 3.


## Modifying Matrices
vec=c(14,15,16); 
# Create a new vector.
matnew=rbind(mat,vec); 
# Add 'vec' as a new row to 'mat', store in 'matnew'.
dim(matnew) 
# Get dimensions of the new 4x3 matrix.
new1=c(1:4); 
# Create a vector with 4 elements.
matnew2=cbind(matnew,new1); 
# Add 'new1' as a new column to 'matnew'.
matnew2; 
# Display the final 4x4 matrix.

mata=c(1,2,3,4,5)
matb=c(15,24,33,64,75)

matnew=cbind(matb,mata)
matnew

matnew[4,1]=64;
emat=c(1,2);
matnew[1,]=emat;

lock(matnew);
A=1:9;
B=11:19;
