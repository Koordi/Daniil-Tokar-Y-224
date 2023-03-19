# -*- coding: utf-8 -*-
def ok():
    print('Введите массив')
    l=[int(i)for i in input().split()]
    p=0
    i=l.index(min(l))
    j=l.index(max(l))
    p=l[i]
    l[i]=l[j]
    l[j]=p
    for i in range(len(l)):
        print(l[i],end=' ')
ok()
