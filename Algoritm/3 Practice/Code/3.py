# -*- coding: utf-8 -*-
print('Введите количество минут:')
n = int(input())
if n <1440:
    a=n//60
    b=n%60
    print(a,b)
else:
    while n>=1440:
        n=n-1440
    d=n//60
    c=n%60
    print(d,c)
