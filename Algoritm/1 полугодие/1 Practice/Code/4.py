# -*- coding: utf-8 -*-
print('Введите количество секунд')
seconds=int(input())
a=seconds//((60*60)*24)
b=(seconds//(60*60))-(a*24)
c=(seconds//60)-((a*24*60)+b*60)
d=seconds%60
print(f'{a:02}:{b:02}:{c:02}:{d:02}')
