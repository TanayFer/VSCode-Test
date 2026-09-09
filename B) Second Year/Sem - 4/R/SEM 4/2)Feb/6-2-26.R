#------------Q9---------------
n = 1000
A9 = sample(c(1:20),n, replace = T)
A9
cntr9 = 0
for (i in A9) {
  if(i %% 3 == 0 | i %% 5 == 0){
    cntr9 = cntr9 + 1;
  }
}
Prob_dist = cntr9/n 
Prob_dist

#------------Q10---------------
n = 1000
A10 = sample(c("H","T"),n, replace = T)
cntr10 = 0
for (i in A10) {
  if (i == "H") {
    cntr10 = cntr10 + 1
  }
}
Prob_dist = cntr10 / n
Prob_dist

#------------Q11---------------
n = 1000
A11 = sample(c(1:6),n, replace = T)
cntr11 = 0
for (i in A11) {
  if (i %% 2 == 0) {
    cntr11 = cntr11 + 1
  }
}
Prob_dist = cntr11 / n
Prob_dist

#------------Q12---------------
n = 5000
coin12a = sample(c("H","T"), n, replace = TRUE)
coin12b = sample(c("H","T"), n, replace = TRUE)

A12 = data.frame(coin12a, coin12b)
A12$Heads_count = rowSums(A12 == "H")

cntr12 = 0
for (i in A12$Heads_count) {
  if (i == 1) {
    cntr12 = cntr12 + 1
  }
}
Prob_dist = cntr12 / n
Prob_dist

#------------Q13---------------
n = 1000
coin13a = sample(c(0 , 1), n, replace = TRUE) 
coin13b = sample(c(0 , 1), n, replace = TRUE)
coin13c = sample(c(0 , 1), n, replace = TRUE)

A13 = data.frame(coin13a, coin13b, coin13c)
A13$Sum = rowSums(A13)

cntr13 = 0
for (i in 1:n) {
  if(A13$Sum[i] == 0 | A13$Sum[i] == 3){
    cntr13 = cntr13 + 1
  }
}
Prob_dist = cntr13/n
Prob_dist

#------------Q14---------------
n = 10000 
A14a = sample(c(1:6),n,replace = T)
A14b = sample(c(1:6),n,replace = T)

A14 = data.frame(A14a,A14b)
A14

A14$Sum = rowSums(A14)
A14$Sum

cntr14 = 0
for (i in A14$Sum) {
  if (i > 7) {
    cntr14 = cntr14 + 1
  }
}
Prob_dist = cntr14 / n
Prob_dist

#------------Q15---------------
n = 1000
A15a = sample(c(1:6),n,replace = T)
A15b = sample(c(1:6),n,replace = T)

A15 = data.frame(A15a,A15b)
A15

#------------Q15a---------------
cntrEven = 0
A15$Even = (A15a %% 2 == 0 & A15b %% 2 == 0)
for (i in A15$Even) {
  if (i == "TRUE") {
    cntrEven = cntrEven + 1
  }
}
Prob_dist1 = cntrEven / n
Prob_dist1

#------------Q15b---------------
cntrsix = 0
A15$Six = (A15a == 6) | (A15b == 6)
for (i in A15$Six) {
  if (i == "TRUE") {
    cntrsix = cntrsix + 1
  }
}
Prob_dist2 = cntrEven / n
Prob_dist2

#------------Q16---------------
n = 1000
A16a = sample(1:6, n, replace = TRUE)
A16b = sample(1:6, n, replace = TRUE)

A16 = data.frame(prod = A16a * A16b)

cntr16 = 0
for (i in A16$prod) {
  if (i > 20) {
    cntr16 = cntr16 + 1 
  }
}

Prob_dist = cntr16 / n
Prob_dist

#------------Q17---------------
n = 1000
coin17a = sample(c("H","T"), n, replace = TRUE)
coin17b = sample(c("H","T"), n, replace = TRUE)
coin17c = sample(c("H","T"), n, replace = TRUE)

A17 = data.frame(coin17a,coin17b,coin17c)
A17$Heads = rowSums(A17 == "H")

cntr17 = 0
for (i in A17$Heads) {
  if (i >1) {
    cntr17 = cntr17 + 1
  }
}
Prob_dist = cntr17 / n
Prob_dist

#------------Q18---------------
n = 1000
A18a = sample(c(1:6),n,replace = T)
A18b = sample(c(1:6),n,replace = T)

A18 = data.frame(Diff = abs(A18a - A18b))
A18$Diff

cntr18 = 0
for (i in A18$Diff) {
  if (i < 2) {
    cntr18 = cntr18 + 1
  }
}
Prob_dist = cntr18 / n
Prob_dist
