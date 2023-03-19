# -*- coding: utf-8 -*-
def ok():
    n = int(input("Введите число N: "))
    num = 2
    d = 1
    while num*2 < n:
        num *= 2
        d += 1
    print("2 в степени:", str(d), "=", str(num))
ok()
