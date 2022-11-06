# -*- coding: utf-8 -*-
print('Введите ваше имя')
name=input()
print("Введите ваш возраст") 
age=int(input())
if (0<age<75) and (name.lower()!='иван'):
    if age>=16:
        print("Поздравляем вы поступили в ВГУИТ")
    else:
        print('Сначала нужно окончить школу!')
        print('Осталось',16-age,'лет(год(а)) учиться в школе')
