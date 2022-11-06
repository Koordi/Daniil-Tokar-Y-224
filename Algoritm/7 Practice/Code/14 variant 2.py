# -*- coding: utf-8 -*-
print('Введите массив')
l=[int(i)for i in input().split()]
sr=sum(l)/10
for i in range(10):
    if l[i]>sr:
        l[i]=1
for i in range(10):
    print(l[i],end=' ')
