# -*- coding: utf-8 -*-
def ok():
    n=int(input('Введите N:'))
    s=0
    print('Введите числа поочередно')
    for i in range(n):
        s+=int(input())
    print(s)
ok()
