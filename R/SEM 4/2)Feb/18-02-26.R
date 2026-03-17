#Univariate Discrete Probability Distribution Using R
#---------------Q1---------------
n1 = 10000
Die_Q1 = sample(1:6, n, replace = T) 
cntr1 = rep(0,6)
for (i in Die_Q1) {
  if (i == 1 ) {
    cntr1[1] = cntr1[1] + 1
  }
  if (i == 2 ) {
    cntr1[2] = cntr1[2] + 1
  }
  if (i == 3 ) {
    cntr1[3] = cntr1[3] + 1
  }
  if (i == 4 ) {
    cntr1[4] = cntr1[4] + 1
  }
  if (i == 5 ) {
    cntr1[5] = cntr1[5] + 1
  }
  if (i == 6 ) {
    cntr1[6] = cntr1[6] + 1
  }
}
PMF_Q1 = cntr1 / n
PMF_Q1
A1 = data.frame(X,PMF_Q1)
A1

#---------------Q2---------------
CDF_Q2 = numeric(6)
for (i in 1:6) {
  if (i == 1) {
    CDF_Q2[1] = PMF_Q1[1]
  } else {
    CDF_Q2[i] = CDF_Q2[i-1] + PMF_Q1[i]
  }
}

A2 = data.frame(A1 , CDF_Q2)
A2
X = 1:6
Plot_Q2 = plot(X,CDF_Q2, type = "s")
Plot_Q2

#---------------Q3---------------
n3= 8000
coin1_Q3 = sample(c(0,1), n3, replace = T)
cntr3 = rep(0,2)
for (i in coin1_Q3) {
  if (i == 0) {
    cntr3[1] = cntr3[1] + 1
  }
  if (i == 1) {
    cntr3[2] = cntr3[2] + 1
  }
}

PMF_Q3 = cntr3 / n
PMF_Q3
X = 1:2
A1 = data.frame(X,PMF_Q3)
A1

CDF_Q3 = cumsum(PMF_Q3)
CDF_Q3

Plot_Q3 = plot(X,CDF_Q3, type = "s")
Plot_Q3

#---------------Q4---------------
n4= 10000
coin1_Q3 = sample(c("H","T"), n3, replace = T)
coin2_Q3 = sample(c("H","T"), n3, replace = T)
A4 = data.frame(coin1_Q3,coin2_Q3)
A4$Count = rowSums(A4 == "H") ; A4

cntr4 = rep(0,3)
for (i in A4$Count) {
  if (i == 0) {
    cntr4[1] = cntr4[1] + 1
  }
  if (i == 1) {
    cntr4[2] = cntr4[2] + 1
  }
  if (i == 2) {
    cntr4[3] = cntr4[3] + 1
  }
}

PMF_Q4 = cntr4 / n
PMF_Q4

X = 1:3
CDF_Q4 = cumsum(PMF_Q4)
CDF_Q4
A4 = data.frame(X,PMF_Q4,CDF_Q4)
A4

Plot_Q4 = plot(X,CDF_Q4, type = "s")
Plot_Q4

#---------------Q5---------------
n5= 12000
card_Q5 = sample(c("Black","Red"), n5, replace = T)
cntr5 = rep(0,2)
for (i in card_Q5) {
  if (i == "Black") {
    cntr5[1] = cntr5[1] + 1
  }
  if (i == "Red") {
    cntr5[2] = cntr5[2] + 1
  }
}

PMF_Q5 = cntr5 / n
PMF_Q5

X = 1:2
CDF_Q5 = cumsum(PMF_Q5)
CDF_Q5
A5 = data.frame(X,PMF_Q5,CDF_Q5)
A5

Plot_Q5 = plot(X,CDF_Q5, type = "s")
Plot_Q5

#---------------Q6---------------
n6 = 10000
Die1_Q6 = sample(1:6, n, replace = T) 
Die2_Q6 = sample(1:6, n, replace = T) 
A6 = data.frame(Die1_Q6,Die2_Q6,Die1_Q6+Die2_Q6)
A6
X=1:11
cntr6 = rep(0,11)
for (i in A6$Die1_Q6...Die2_Q6) {
  if (i == 2) {
    cntr6[1] = cntr6[1] + 1
  }
  if (i == 3) {
    cntr6[2] = cntr6[2] + 1
  }
  if (i == 4) {
    cntr6[3] = cntr6[3] + 1
  }
  if (i == 5) {
    cntr6[4] = cntr6[4] + 1
  }
  if (i == 6) {
    cntr6[5] = cntr6[5] + 1
  }
  if (i == 7) {
    cntr6[6] = cntr6[6] + 1
  }
  if (i == 8) {
    cntr6[7] = cntr6[7] + 1
  }
  if (i == 9) {
    cntr6[8] = cntr6[8] + 1
  }
  if (i == 10) {
    cntr6[9] = cntr6[9] + 1
  }
  if (i == 11) {
    cntr6[10] = cntr6[10] + 1
  }
  if (i == 12) {
    cntr6[11] = cntr6[11] + 1
  }
}

PMF_Q6 = cntr6 / n
PMF_Q6

X = 1:11
CDF_Q6 = cumsum(PMF_Q6)
CDF_Q6
A6 = data.frame(X,PMF_Q6,CDF_Q6)
A6

Plot_Q6 = plot(X,CDF_Q6, type = "s")
Plot_Q6

#---------------Q7---------------
n7 = 10000
A7 = sample(1:10 , n , replace = T) ; A7
