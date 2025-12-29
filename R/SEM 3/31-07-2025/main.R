# --- Section 1: Create Vectors ---
# The c() command combines multiple items into a single list (vector).
Names=c("Tanay","Anish","Ashish","Deepinder");
Names;
Stats=c(25,24,23,22);
Stats;
Math=c(24,10,20,21);
Math;

# --- Section 2: Create a Data Table ---
# The data.frame() command organizes vectors into a table with columns and rows.
D=data.frame(Names,Stats,Math);
D;

# --- Section 3: Get Dimensions ---
# The dim() command returns the number of rows and columns in a data table.
A=dim(D);
A;

# --- Section 4: Access a Column ---
# The $ operator selects a single column from a data frame by its name.
A1=D$Stats;
A1;

# --- Section 5: Get/Set Column Names ---
# The colnames() command checks or changes the names of the columns.
colnames(D)=c("A","B","C");
D;

# Change the name of the first column.
colnames(D)[1]="A1";
D;
# Change the name of the third column.
colnames(D)[3]="C1";
D;

# Change the names of the first and third columns at the same time.
colnames(D)[c(1,3)]=c("A2","C2");
D;

# --- Section 6: Column Bind ---
# The cbind() command joins tables or vectors together side-by-side.
History=c(22,08,21,25);
History;
D1=cbind(D,History);
D1;

# --- Section 7: Filter Data ---
# The subset() command creates a new data table containing only matching rows.
# Get rows where Math score is less than 20.
D2=subset(D1, subset=Math<20);
D2;

# Get rows where Math score is greater than 20.
D3=subset(D1, subset=Math>20);
D3;

# Get rows using a condition with AND (&).
D4=subset(D1, subset=(B>20)&(C<20));
D4;

# Get rows using a condition with OR (|).
D5=subset(D1, subset=(B>20)|(C<20));
D5;

# --- Section 8: Prepare Data for Plotting ---
# Extracting columns to use as x and y values in the graph.
M1=D$B;
M2=D$C;
M1;M2;

# --- Section 9: Create a Graph ---
# The plot() command generates a 2D plot from x and y data points.
# Parameters like main, xlab, ylab, type, col, etc., customize the plot's appearance.
plot(M1,M2, main="Score");
plot(M1,M2, main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="c" ,main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="l",lwd=10 ,main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="s",lwd=10,col="Blue" ,main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="l",lwd=10,lty=101 ,col="Blue" ,main="Score", xlab="Statistics",ylab="Mathematics");

# --- Section 10: Add a Straight Line ---
# The abline() command draws a horizontal (h) or vertical (v) line on an existing plot.
abline(h=20)
abline(v=23.5, col="Red" , lwd=5)

# --- Section 11: Read User Input ---
# The scan() command pauses the script to allow the user to type data.
data1=scan();
data1;

# --- Section 12: Repeat a Task (Loop) ---
# A for loop executes a block of code repeatedly for each item in a sequence.
print(A);
sum=0;
# This loop is set to run for 15 items, but requires data1 from scan() to work.
for(i in 1:15)
{
	sum = sum + data1[i];
}
sum;
