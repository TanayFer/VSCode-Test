#-------------Practical 5--------------
#====Q1=====
n1 = 3000;
A1 = sample(1:6, n1, replace = T)
freq_dist1 = table(A1)
freq_dist1
prob_dist1 = prop.table(freq_dist1)
prob_dist1
sam_mean1 = mean(A1)
sam_mean1;
theo_mean1 = (6+1) / 2
theo_mean1;

isTRUE(sam_mean1 < theo_mean1)

#====Q2=====
n2 = 5000;
A2 = sample(c(2,4,6,8,10,12,16),n2 , replace = T)
freq_dist2 = table(A2)
freq_dist2
prob_dist2 = prop.table(freq_dist2)
prob_dist2
count2 = 0;
for (i in A2) {
  if (i >= 6) {
    count2 = count2 + 1
  }
}
count2
prob_dist2 = count2 / n2
prob_dist2

#====Q3=====
n3 = 4000
A3 = sample(1:7, n3, replace = T)
freq_dist3 = table(A3)
freq_dist3
prob_dist3 = prop.table(freq_dist3)
prob_dist3

sam_mean3 = mean(A3)
sam_mean3;
theo_mean3 = (7+1) / 2
theo_mean3;
isTRUE(sam_mean1 < theo_mean1)

theo_var3 = (7^2 - 1) / 12
theo_var3;
sam_var3 = var(A3)
sam_var3
isTRUE(sam_var3 < theo_var3)

#====Q4=====
n4 = 5000
X4 = sample(1:4, n4, replace = T)
Y4 = sample(1:4, n4, replace = T)
A4 = data.frame(X4, Y4, Z4 = X4 + Y4)
A4
freq_dist4 = table(A4$Z4)
freq_dist4
prob_dist4 = prop.table(freq_dist4)
prob_dist4

XMean = mean(X4) ; XMean
YMean = mean(Y4) ; YMean
ZMean = mean(A4$Z4) ; ZMean

#====Q5=====
n5 = 3000
A5 = sample(c(10,20,30,40,50), n5, replace = T)
freq_dist5 = table(A5)
freq_dist5
prob_dist5 = prop.table(freq_dist5)
prob_dist5
sam_mean5 = mean(A5) 
sam_mean5;
theo_mean5 = (5+1) / 2
theo_mean5;

isTRUE(sam_mean5 < theo_mean5)

#====Q6=====
n6 = 4000
A6 = sample(1:6, n6, replace = T)
count6 = 0
for (i in A6) {
  if (i > 3) {
    count6 = count6 + 1
  }
}
prob_dist6 = count6 / n6
prob_dist6

#====Q7=====
n7 = 5000
p7 = 0.5
A7 = rbinom(n7, 1, p7)
A7
freq_dist7 = table(A7)
prob_dist7 = prop.table(freq_dist7)
prob_dist7

mean7 = mean(A7)
var7 = var(A7)
mean7; var7
#====Q8=====
n8 = 8000
p8 = 0.6
A8 = rbinom(n8, 1, p8)
freq_dist8 = table(A8)
prob_dist8 = prop.table(freq_dist8)
prob_dist8

sam_mean8 = mean(A8)
sam_mean8; p8

#====Q9=====
n9 = 1000
p9 = 0.4

A9 = rbinom(n9, 1, p9)
freq_dist9 = table(A9)
prob_dist9 = prop.table(freq_dist9)
prob_dist9

mean9 = mean(A9)
mean9 ; p9
var9 = var(A9)
theo_var9 = (1^2 -1)/12
theo_var9; var9

#====Q10=====
p10 = 0.3
n10a = 2000
A10a = rbinom(n10a, 1, p10)
freq_dist10 = table(A10a)
prob_dist10 = prop.table(freq_dist10)
prob_dist10
meanA10a = mean(A10a)

n10b = 5000
A10b = rbinom(n10b, 1, p10)
freq_dist10 = table(A10b)
prob_dist10 = prop.table(freq_dist10)
prob_dist10
meanA10b = mean(A10b)

n10c = 1000
A10c = rbinom(n10c, 1, p10)
freq_dist10 = table(A10c)
prob_dist10 = prop.table(freq_dist10)
prob_dist10
meanA10c = mean(A10c)

meanA10a;meanA10b;meanA10c
#====Q11=====
X11 = rbinom(1000, 1, 0.6)
Y11 = 2*X11 +3

prob_dist11 = table(Y11) / 1000
prob_dist11
mean11 = mean(Y11)

mean11

#====Q12=====
X12 = rbinom(6000,1, 0.4)
Mean12_1 = mean(X12 == 1)
Mean12_0 = mean(X12 == 0)
Total12 = Mean12_1 + Mean12_0

Mean12_1;Mean12_0; Total12

#====Q13=====
X13 = rbinom(4000, 4, 0.5)
prob_dist13 = table(X13) / 4000

exp_mean11 = mean(X13)
exp_mean11
exp_var11 = var(X13)
exp_var11

#====Q14=====
X14 = rbinom(5000, 5, 0.3)

freq_dist14 = table(X14)
freq_dist14
prob_dist14 = mean(X14 <= 2)
prob_dist14

#====Q15=====
X15 = rbinom(6000, 3, 0.6)

prob_dist15 = table(X15)
prob_dist15

exp_mean15 = mean(X15)
theo_mean15 = 3 * 0.6
exp_mean15; theo_mean15

#====Q16=====
X16 = rbinom(1000, 6, 0.4)
mean16a = mean(X16 == 3)
mean16b = mean(X16 > 3)
mean16a; mean16b;

#====Q17=====
X17 = rbinom(5000, 4, 0.7)
prob_dist17 = mean(X17 >= 2)
prob_dist17

#====Q18=====
X18 = rbinom(1000, 5, 0.2)
prob_dist18 = table(X18) / 1000
mean18 = mean(X18)
var18 = var(X18)
mean18 ; var18
plot(prob_dist18,
  type = "s"
)

#====Q19=====
X19 = rbinom(1200, 6, 0.5)

mean19a = mean(X19 == 3)
mean19b = mean(X19 >= 4)
mean19a; mean19b

#====Q20=====
X20 = rbinom(1000, 3, 0.5)
Y20 = rbinom(1000, 2, 0.5)
Z = X20 + Y20 ; Z

prob_dist20 = table(Z) / 1000
Mean20 = mean(Z)
prob_dist20; Mean20
