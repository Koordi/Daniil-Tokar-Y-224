import json
import requests
from tkinter import*
def buttonAction():
    with open("file.txt","w") as file:
        user = txtField.get()
        url = f"https://api.github.com/users/{user}"
        userInfo = requests.get(url).json()
        enum = ['company', 'created_at', 'email', 'id', 'name', 'url']
        data = userInfo.keys()
        for i in data:
            if i in enum:
                file.write(f"{i}:{userInfo[i]}" + '\n')
    head.configure(text = "Данные записаны (*_*)")


root = Tk()
root.title('GIT request')
root.geometry('900x600')
root["bg"] = "orange"

head = Label(root, bg = "orange", fg = "green", text = 'Введите название репозитория на git', font = ('Franklin Gothic Medium', 24))
head.pack(expand=True)
txtField = Entry(root,width=40,font=('Franklin Gothic Medium', 16))
txtField.pack(expand=True)
button = Button(root, bg = "gold", fg = "green", text = 'Нажми на меня',command = buttonAction)
button.pack(expand=True)

root.mainloop()
