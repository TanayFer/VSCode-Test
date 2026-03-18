#-----------------------------Assign 3-----------------------------
#============Q1============
n1 = 10000;
X1 = sample(1:6, n1, replace = T)
X1
pmf_1 =  table(X1)/n1;
pmf_1

#============Q2============ 
cdf_1 = cumsum(pmf_1);
cdf_1 

Plot_2 = plot(as.numeric(names(pmf_1)), as.numeric(cdf_1), 
              type = "s", 
              xlab = "Outcomes", 
              ylab = "Cumulative Probability")

#============Q3============
n3 = 8000;
X3 = sample(c("H","T"),n3,replace = T);

pmf_3 = table(X3)/n3
pmf_3;

cdf_3 = cumsum(pmf_3);
cdf_3

Plot3 = plot(cdf_3, 
        type = "s", 
        main = "CDF: cumsum(pmf_3)", 
        ylab = "Cumulative Probability");

#============Q4============
n4 = 10000;
X4_1 = sample(c("H","T"),n4,replace = T);  
X4_2 = sample(c("H","T"),n4,replace = T);  
X4 = data.frame(X4_1,X4_2)
X4
X4$X = rowSums(X4 == "H")

pmf_4 = table(X4$X)/n4 ; pmf_4
cdf_4 =  cumsum(pmf_4)

Plot4 = plot(cdf_4, 
             type = "s", 
             main = "CDF: cumsum(pmf_4)", 
             ylab = "Cumulative Probability");

#============Q5============
n5 = 12000
X5_Comb = c(rep("Red", 26), rep("Black", 26))

X5 = sample(X5_Comb, size = n5, replace = TRUE)

X = ifelse(X5 == "Red", 1, 0)

pmf = table(X) / n5
print("Estimated p.m.f.")
print(pmf)

cdf = cumsum(X)

plot(cdf, 
     main = "Empirical c.d.f. of X", 
     xlab = "Outcome (0=Black, 1=Red)", 
     ylab = "Cumulative Probability",
     col = "blue",
     verticals = TRUE,
     do.points = TRUE)

