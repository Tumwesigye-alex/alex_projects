import smtplib
import speech_recognition as sr
import pyttsx3
listener=sr.Recognizer()
engine= pyttsx3.init()
def talk(text):
    engine.say(text)
    engine.runAndWait()
def get_info():
    try:
        with sr.Microphone() as source:
            print('Listening.......')
            voice=listener.listen(source)
            info=listener.recognise_google(voice)
            print(info)
            return info.lower()
    except:
        pass
def send_email():

    server = smtplib.SMTP('smtp.gmail.com',587)
    server.starttls()
    server.login('alextumwesigye51@gmail.com','6alexis6')
    server.sendmail('alextumwesigye51@gmail.com',
                    'jacklinekyasiimire5@gmail.com',
                    'Hey Jackie')
def get_email_info():
     talk('To whom do you want to send the email?')
     name=get_info()
     talk('To whom do you want to send the email?')
     name=get_info()
     talk('Tell me the person you want to send the email?')
     subject = get_info()

get_email_info()

