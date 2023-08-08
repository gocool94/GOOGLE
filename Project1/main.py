from fastapi import FastAPI, Query, Path, HTTPException, status, Body, Request
from fastapi.encoders import jsonable_encoder
from pydantic import BaseModel, Field
from typing import Optional, List, Dict
from fastapi.templating import Jinja2Templates
from fastapi.staticfiles import StaticFiles
from starlette.responses import HTMLResponse
from starlette.status import HTTP_400_BAD_REQUEST
from database import cars

print(cars)


templates = Jinja2Templates(directory="templates")


class Car(BaseModel):
    make: Optional[str]
    model: Optional[str]
    year: Optional[int] = Field(..., gt=2000, lt=2023)
    price: Optional[float]
    engine: Optional[str] = "v4"
    autonomous: Optional[bool]
    sold: Optional[List[str]]


app = FastAPI()

app.mount("/static", StaticFiles(directory="static"), name="static  ")


@app.get("/", response_class=HTMLResponse)
def root(request: Request):
    # return {"Hello": "Gokul"}
    return templates.TemplateResponse("home.html", {"request": request, "title": "FASTAPI Learning",
                                                    "text": "Welcome to the learning FAST"})


@app.get("/cars", response_model=List[dict[str, Car]])
async def get_all_cars(number: Optional[str] = Query("10", max_length=3)):
    response = []
    for id, car in list(cars.items())[:int(number)]:
        to_add = {}
        to_add[id] = car
        response.append(to_add)
    return response


@app.get("/cars/{id}", response_model=Car)
async def get_car_by_id(id: int = Path(...)):
    car = cars.get(id)
    if not car:
        return HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Could not find car id")
    return car


@app.post("/cars", status_code=status.HTTP_201_CREATED)
async def add_cars(body_cars: List[Car], min_id: Optional[int] = Body(0)):
    if (len(body_cars) < 1):
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND, detail="No cars to add")
    min_id = len(cars.values()) + min_id
    for car in body_cars:
        while cars.get(min_id):
            min_id += 1

        cars[min_id] = car
        min_id += 1


@app.put("/cars", response_model=Dict[str, Car])
def update_car(id: int, car: Car = Body(...)):
    stored = cars.get(id)  # getting from the database and the id
    if not stored:  # to check this
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND, detail="Could not find car")
    stored = Car(**stored)  # unpacking the dict
    print(stored)
    new = car.dict(exclude_unset=True)
    print(new)
    new = stored.copy(update=new)
    print(new)
    cars[id] = jsonable_encoder(new)
    print(cars[id])
    reponse = {}
    reponse[id] = cars[id]
    print(reponse)
    return reponse
    # todo: not clear


@app.delete("/cars/{id}")
async def delete_car(id: int):
    if not cars.get(id):
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND, detail="Could not find car")
    del cars[id]
