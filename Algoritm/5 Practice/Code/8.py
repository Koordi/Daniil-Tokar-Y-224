# -*- coding: utf-8 -*-
x = int(input("Введите число: "))
l = []
while x != 0:
    l.append(x)
    x = int(input("Введите число: "))
c1=0
c2=0
for i in range(0, len(l)-1):
    if l[i] == l[i+1]:
        c2+=1
    elif c2>c1:
        c1=c2
    else:
        c2=0
print(c1+1, "элементов этой последовательности равны друг другу")
