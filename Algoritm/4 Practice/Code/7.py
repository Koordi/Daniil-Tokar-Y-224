# -*- coding: utf-8 -*-
n = int(input("Введите число n: "))
s=0
f=1
for i in range(1,n+1):
    f*=i
    s+=f
print(s)
