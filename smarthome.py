from RPi import GPIO
from firebase import firebase
GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)
light1=17               #Connect the light 1 to pi
light2=27               #Connect the light 2 to pi
light3=22               #Connect the light 3 to pi
light4=14               #Connect the light 4 to pi
GPIO.setup(17,GPIO.OUT)
GPIO.setup(27,GPIO.OUT)
GPIO.setup(22,GPIO.OUT)
GPIO.setup(14,GPIO.OUT)
firebase=firebase.FirebaseApplication(' ')  #Enter the firebase link
while(True):
    light=firebase.get('/',None)
    print(light)
    GPIO.output(17,int(light['light1']))
    GPIO.output(27,int(light['light2']))
    GPIO.output(22,int(light['light3']))
    GPIO.output(14,int(light['light4']))
    

