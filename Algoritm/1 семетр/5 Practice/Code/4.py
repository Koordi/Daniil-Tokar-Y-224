# -*- coding: utf-8 -*-
def ok():
    X = int(input("Введите x: "))
    Y = int(input("Введите y: "))
    days = 1
    while X < Y:
        X *= 1.1
        days += 1
    print("Спортсмен достигнет y расстояния на", days, "день")
ok()
