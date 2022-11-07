x1,x2=map(int,input("Введите координаты X:").split())
y1,y2=map(int,input("Введите координаты Y:").split())
z1,z2=map(int,input("Введите координаты Z:").split())
p1,p2=map(int,input("Введите координаты P:").split())
x=[]
y=[]
x.extend([x1,y1,z1,p1])
y.extend([x2,y2,z2,p2])
def loli(a,b,c,d):
    return(((c-a)**2+(d-b)**2)**0.5)
r=[]
for i in range(4):
    for j in range(i+1,4):
        r.append(loli(x[i],y[i],x[j],y[j]))
if r.index(max(r))==0 :
    print('расстояние от X до Y:',max(r))
if r.index(max(r))==1 :
    print('расстояние от X до Z:',max(r))
if r.index(max(r))==2 :
    print('расстояние от X до P:',max(r))        
if r.index(max(r))==3 :
    print('расстояние от Y до Z:',max(r))
if r.index(max(r))==4 :
    print('расстояние от Y до P:',max(r))
if r.index(max(r))==5 :
    print('расстояние от Z до P:',max(r))
#xy xz xp yz yp zp
