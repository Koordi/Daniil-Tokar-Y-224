# -*- coding: utf-8 -*-
from math import sin
print('Введите x,y,z поочередно')#14 вариант
x=float(input())
y=float(input())
z=float(input())
s=((y**(x+1))/((abs(y-2)**(1/3))+3))+(((x+(y/2))/((abs(x+y))*2))*((x+1)**(-1/sin(z))))
print(s)
