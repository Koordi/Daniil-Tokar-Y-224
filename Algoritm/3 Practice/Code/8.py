# -*- coding: utf-8 -*-
print('Введите три числа:')
a = int(input())
b = int(input())
c = int(input())
if a==b and b==c and a==c:
    k=3
else:
    if a==b or a==c or c==b:
        k=2
    else:
        k=0
print(k)
