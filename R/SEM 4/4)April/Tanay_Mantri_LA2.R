#=================================Lab Assignment - 2=================================
#-----Q1-----
X1 = 0:3
prob_1 = c(0.25,0.25,0.25,0.25)
M1 = mean(X1*prob_1)
EX = sum(X1*prob_1)
EXsq = sum(X1^2*prob_1)
VarX = EXsq - EX^2
M1 ; EX ; EXsq ; VarX;

#-----Q2-----
X2=0:2
prob_2=c(0.3, 0.5, 0.2)

Y2=2 * X2 + 1

prob_dist_2=data.frame(Y2 = Y2, P_Y2 = prob_2)
print(prob_dist_2)

mean_2 <- sum(Y2 * prob_2)
print(mean_2)


#-----Q3-----
X3 = 0:4
prob_3 = c(0.1, 0.2, 0.4, 0.2, 0.1)
M3 = mean(X3*prob_3)
EX = sum(X3*prob_3)
EXsq = sum(X3^2*prob_3)
VarX = EXsq - EX^2
M3; EX; EXsq; VarX

#-----Q4-----
X4 = 0:3
prob_4 = c(0.3, 0.4, 0.2, 0.1)
EX = sum(X4*prob_4)
EXsq = sum(X4^2*prob_4)
VarX = EXsq - EX^2
EX; EXsq; VarX

#-----Q5-----
X5 = 1:5
prob_5 = c(0.05, 0.15, 0.4, 0.25, 0.15)
cdf = cumsum(prob_5)
median = X5[which(cdf>=0.5)[1]]
mode = X5[which.max(prob_5)]
median; mode

#-----Q6-----
X6 = 0:4
F6 = c(0.1, 0.3, 0.6, 0.85, 1) 
sum = 0;

PMF6 = diff(c(0,F6))
PMF6

M6 = mean(X6*PMF6)
M6

EX = sum(X6*PMF6)
EXsq = sum(X6^2*PMF6)
VarX = EXsq - EX^2
EX; EXsq; VarX

#-----Q7-----
X7 = 0:3
prob_7 = (1/16) * (2 * X7 + 1)
prob_7
M7 = mean(X7 * prob_7)

EX = sum(X7*prob_7)
EXsq = sum(X7^2*prob_7)
VarX = EXsq - EX^2
sq7 = sqrt(VarX)

M7; EX; EXsq; VarX; sq7
