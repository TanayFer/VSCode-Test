#--------------Q1------------------
n = 1000;
A1 = sample(c("H","T"), n , replace = T)
A1
count1 = 0;
for(i in A1){
  if(i == "H"){
    count1 = count1+1;
  }
}
Prob_dist = count / n;
Prob_dist;

#--------------Q2------------------
n = 6000;
A2 = sample(c(1,2,3,4,5,6), n , replace = T)
A2
count2 = 0;
for(i in A2){
  if(i %% 2 != 0){
    count2 = count2+1;
  }
}
Prob_dist = count2 / n
Prob_dist
  
#--------------Q3------------------
n = 1000;
A3 = sample(c(1,2,3,4,5,6), n , replace = T)
A3
count3 = 0;
for(i in A3){
  if(i > 4){
    count3 = count3+1;
  }
}
Prob_dist = count3 / n
Prob_dist

#--------------Q4------------------
n = 1000
X = rep(c("H", "D", "S", "C"),13)
A4 = sample(X , n , replace = T)
A4
count4 = 0
for (i in A4) {
  if(i == "H"){
    count4 = count4+1;
  }
}
Prob_dist = count4 / n
Prob_dist

#--------------Q5------------------
n = 5000
coin1 = sample(c("H","T"), n, replace = T)
coin2 = sample(c("H","T"), n, replace = T)
A5 = data.frame(coin1,coin2)
A5
count5 = 0
A5$heads_sum = rowSums(A5 == "H")
for (i in A5$heads_sum) {
  if (i == 1) {
    count5 = count5+1;
  }
}
Prob_dist = count5 / n
Prob_dist

#--------------Q6------------------
n = 10000
A6 = runif(n, 0, 1)
A6
count6 = 0
for (i in A6) {
  if (i > 0.2 & i < 0.6) {
    count6 = count6 + 1;
  }
}
Prob_dist = count6 / n;
Prob_dist

#--------------Q7------------------
n = 8000
die1 = sample(c(1:6),n,replace = T)
die2 = sample(c(1:6),n,replace = T)
A7 = data.frame(die1,die2)
A7
A7$sum = rowSums(A7)
A7$sum
count7 = 0
for (i in A7$sum) {
  if (i == 7) {
    count7 = count7+1
  }
}
Prob_dist = count7 / n
Prob_dist

#--------------Q8------------------
n <- 25
trials <- 10000
count8 <- 0
month_lengths <- c(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

for (i in 1:trials) {
  B1 = sample(1:31, n, replace = T)
  B2 = sample(1:28, n, replace = T)
  B3 = sample(1:31, n, replace = T)
  B4 = sample(1:30, n, replace = T)
  B5 = sample(1:31, n, replace = T)
  B6 = sample(1:30, n, replace = T)
  B7 = sample(1:31, n, replace = T)
  B8 = sample(1:31, n, replace = T)
  B9 = sample(1:30, n, replace = T)
  B10 = sample(1:31, n, replace = T)
  B11 = sample(1:30, n, replace = T)
  B12 = sample(1:31, n, replace = T)
  
  A8 = data.frame(B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12)
  
  months <- sample(1:12, n, replace = TRUE, prob = month_lengths)
  
  birthdays <- c()
  for (j in 1:n) {
    m <- months[j]
    d <- A8[j, m]
    birthdays[j] <- m * 100 + d
  }
  
  if (length(unique(birthdays)) < n) {
    count8 <- count8 + 1
  }
}

prob_estimate <- count8 / trials

print(count8)
print(prob_estimate)

