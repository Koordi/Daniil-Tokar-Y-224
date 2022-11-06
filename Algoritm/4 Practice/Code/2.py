# -*- coding: utf-8 -*-
A = int(input("Введите число A: "))
B = int(input("Введите число B: "))
if A < B:
    for number in range(A, B + 1):
        print(number)
else:
    for number in range(A, B - 1, -1):
        print(number)
