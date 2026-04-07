#---------------- Practical 4 ----------------

#---------------- Q1 ----------------
values = 1:4
probs = c(0.1,0.2,0.3,0.4)
EX = 0
for(i in 1:4){
  EX = EX + (values[i]*probs[i])
}
print(EX)

EXsq = 0
for(i in 1:4){
  EXsq = EXsq + (values[i]^2*probs[i])
}
print(EXsq)

VarX = EXsq - (EX)^2
print(VarX)

# Method 2
EX2 = sum(values*probs)
EXsq2 = sum(values^2*probs)
VarX2 = EXsq2 - (EX2)^2
print(EX2); print(VarX2)

#---------------- Q2 ----------------
n = 12000
die_rolls = sample(1:6, n, replace=TRUE)
counts = rep(0,6)
for(i in die_rolls){
  if(i==1){counts[1]=counts[1]+1}
  if(i==2){counts[2]=counts[2]+1}
  if(i==3){counts[3]=counts[3]+1}
  if(i==4){counts[4]=counts[4]+1}
  if(i==5){counts[5]=counts[5]+1}
  if(i==6){counts[6]=counts[6]+1}
}
pmf = counts/n
EX = sum((1:6)*pmf)
EXsq = sum((1:6)^2*pmf)
VarX = EXsq - EX^2
print(EX); print(VarX)

#---------------- Q3 ----------------
values = c(0,1,2,3)
probs = c(0.25,0.35,0.25,0.15)
EX = sum(values*probs)
EXsq = sum(values^2*probs)
VarX = EXsq - EX^2
print(EX); print(VarX)

#---------------- Q4 ----------------
n = 10000
coins = sample(c("H","T"), n, replace=TRUE)
counts = c(0,0)  # [Heads, Tails]
for(i in coins){
  if(i=="H"){counts[1]=counts[1]+1}
  else{counts[2]=counts[2]+1}
}
pmf = counts/n
EX = sum(c(1,0)*pmf)
EXsq = sum(c(1,0)^2*pmf)
VarX = EXsq - EX^2
print(EX); print(VarX)

#---------------- Q5 ----------------
n = 10000
coins = sample(c("HH","HT","TH","TT"), n, replace=TRUE)
counts = c(0,0,0)  # [0 heads, 1 head, 2 heads]
for(i in coins){
  if(i=="TT"){counts[1]=counts[1]+1}
  if(i=="HT" | i=="TH"){counts[2]=counts[2]+1}
  if(i=="HH"){counts[3]=counts[3]+1}
}
pmf = counts/n
EX = sum(c(0,1,2)*pmf)
EXsq = sum(c(0,1,2)^2*pmf)
VarX = EXsq - EX^2
print(EX); print(VarX)

#---------------- Q6 ----------------
values = 1:4
probs = c(0.2,0.3,0.3,0.2)
EX = sum(values*probs)
EXsq = sum(values^2*probs)
VarX = EXsq - EX^2
cdf = cumsum(probs)
median = values[which(cdf>=0.5)[1]]
mode = values[which.max(probs)]
print(EX); print(VarX); print(median); print(mode)

#---------------- Q7 ----------------
values = 1:4
probs = c(0.1,0.25,0.45,0.2)
EX = sum(values*probs)
EXsq = sum(values^2*probs)
VarX = EXsq - EX^2
cdf = cumsum(probs)
median = values[which(cdf>=0.5)[1]]
mode = values[which.max(probs)]
print(EX); print(VarX); print(median); print(mode)

#---------------- Q8 ----------------
n = 12000
nums = sample(1:9, n, replace=TRUE)
counts = c(0,0)  # [prime=2, composite=1]
for(i in nums){
  if(i %in% c(2,3,5,7)){counts[1]=counts[1]+1}
  else{counts[2]=counts[2]+1}
}
pmf = counts/n
EX = sum(c(2,1)*pmf)
EXsq = sum(c(2,1)^2*pmf)
VarX = EXsq - EX^2
print(EX); print(VarX)

#---------------- Q9 ----------------
values = 1:5
probs = c(0.10,0.20,0.40,0.20,0.10)
cdf = cumsum(probs)
median = values[which(cdf>=0.5)[1]]
mode = values[which.max(probs)]
print(median); print(mode)

#---------------- Q10 ----------------
n = 15000
dice = sample(1:6, n, replace=TRUE)
pmf = table(dice)/n
cdf = cumsum(pmf)
median = as.numeric(names(pmf))[which(cdf>=0.5)[1]]
mode = as.numeric(names(pmf))[which.max(pmf)]
print(median); print(mode)

#---------------- Q11 ----------------
values = 0:3
probs = c(0.3,0.3,0.2,0.2)
cdf = cumsum(probs)
median = values[which(cdf>=0.5)[1]]
print(median)

#---------------- Q12 ----------------
n = 10000
deck = sample(c(rep("Face",12),rep("Others",40)), n, replace=TRUE)
X = ifelse(deck=="Face",1,0)
pmf = table(X)/n
cdf = cumsum(pmf)
median = as.numeric(names(pmf))[which(cdf>=0.5)[1]]
mode = as.numeric(names(pmf))[which.max(pmf)]
print(median); print(mode)

#---------------- Q13 ----------------
values = 1:5
probs = c(0.05,0.15,0.40,0.25,0.15)
EX = sum(values*probs)
EXsq = sum(values^2*probs)
VarX = EXsq - EX^2
cdf = cumsum(probs)
median = values[which(cdf>=0.5)[1]]
mode = values[which.max(probs)]
print(EX); print(VarX); print(median); print(mode)