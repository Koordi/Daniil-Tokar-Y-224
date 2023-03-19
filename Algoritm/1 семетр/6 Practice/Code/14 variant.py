# -*- coding: utf-8 -*-
def ok():
    print('Введите текст')
    a=[str(i)for i in input().split()]
    for i in a:
        if i[0]=='а' or i[len(i)-1]=='я':
            print(i,end=' ')
ok()
