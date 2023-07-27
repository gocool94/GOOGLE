#uvicorn main:app
#uvicorn main:app --reload

from fastapi import FastAPI , File, UploadFile, HTTPException
from fastapi.responses import StreamingResponse
from fastapi.middleware.cors import CORSMiddleware
import openai
from decouple import config

from functions.openai_requests import convert_audio_to_text

app = FastAPI()

#cors origin



origin = [
    "http://localhost:5173/",
    "http://localhost:5174/",
    "http://localhost:4173/",
    "http://localhost:4174/",
    "http://localhost:3000/"
]

#CORS  - Middleware

app.add_middleware(
    CORSMiddleware,
    allow_origins=origin,
    allow_credentials= True,
    allow_methods=["*"],
    allow_headers=["*"]
)




#check health
@app.get("/health")
async def check_health():
    print("Hello")
    return {"message" : "Healthy"}


#post bot response

# Note : Not playing in browser using post request


@app.get("/post-audio/")
async def get_audio():
    print("Hello")
    #get saved audio
    audio_input = open("voice.mp3","rb")

    messsage_decoded = convert_audio_to_text(audio_file=audio_input)

    print(messsage_decoded)