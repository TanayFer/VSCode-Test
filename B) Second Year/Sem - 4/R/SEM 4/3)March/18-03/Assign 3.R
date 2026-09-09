#-----------------------------Practical 3-----------------------------
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

cdf = cumsum(pmf)

plot(cdf,
     type = "s",
     main = "Empirical c.d.f. of X", 
     xlab = "Outcome", 
     ylab = "Cumulative Probability")

#============Q6============
n6 = 10000;
X6_1 = sample(c(1:6), n6, replace = T)
X6_2 = sample(c(1:6), n6, replace = T)
X6 = data.frame(X6_1,X6_2)
X6$Sum = rowSums(X6);

pmf_6 = table(X6$Sum) / n6 ; pmf_6
cdf_6 = cumsum(pmf_6) ; cdf_6
Plot6 = plot(cdf_6,
             type = "s",
             main = "Cumsum", 
             xlab = "Outcome", 
             ylab = "Cumulative Probability")

#============Q7============
n7 = 10000
X7 = sample(1:10, n7, replace = TRUE)

X = ifelse(X7 %% 3 == 0, 1, 0)

pmf = table(X) / n7

print("Estimated p.m.f. for X (1 = Divisible by 3, 0 = Otherwise):")
print(pmf)

#============Q8============
n8 = 15000
X8_1 = sample(c("H","T"), n8, replace = T)
X8_2 = sample(c("H","T"), n8, replace = T)
X8_3 = sample(c("H","T"), n8, replace = T)
X8 = data.frame(X8_1,X8_2,X8_3)
X8$X = rowSums(X8 == "T")

pmf_8 = table(X8$X) / n8 ; pmf_8
cdf_8 = cumsum(pmf_8) ; cdf_8
Plot8 = plot(cdf_8,
             type = "s",
             main = "Cumsum", 
             xlab = "Outcome", 
             ylab = "Cumulative Probability")

#============Q9============
n = 12000
rolls = sample(1:6, n, replace = TRUE)

X = ifelse(rolls <= 2, 0, 
           ifelse(rolls == 3 | rolls == 4, 1, 2))

pmf = table(X) / n
print(pmf)

cdf = cumsum(pmf)
plot(cdf, 
     type = "s",
     main = "Empirical c.d.f. of X", 
     xlab = "x", 
     ylab = "F(x)")

