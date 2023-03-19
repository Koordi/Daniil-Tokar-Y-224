# -*- coding: utf-8 -*-
def ok():
    n=int(input("Введите число n: "))
    s=0
    for i in range(1,n+1):
        s+=i**3
    print(s)
ok()
