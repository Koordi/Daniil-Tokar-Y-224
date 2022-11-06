# -*- coding: utf-8 -*-
x=int(input("Введите число: "))
c=0
s=0
while x!=0:
    c+=1
    s+=x
    x=int(input("Введите число: "))
print(s/c)
