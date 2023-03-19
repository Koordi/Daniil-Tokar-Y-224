# -*- coding: utf-8 -*-
print('Введите число a:')
a = int(input())
print('Введите число b:')
b = int(input())
print('Введите число c:')
c = int(input())
def f(a,b,c):
    return min(a,b,c)
print('Наименьшее число:')
print(f(a,b,c))
