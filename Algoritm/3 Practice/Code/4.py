# -*- coding: utf-8 -*-
print('Введите расстояние между рядами:')
a = int(input())
print('Введите расстояние между дырочками в ряду:')
b = int(input())
print('Введите длину свободного конца шнурка:')
l = int(input())
print('Введите количество дырочек в каждом ряду:')
N = int(input())
def f(a,b,l,N):
    return (2*l + a + (2*b + 2*a)*(N-1))
print(f(a,b,l,N))
