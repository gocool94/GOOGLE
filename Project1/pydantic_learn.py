from pydantic import BaseModel
from typing import List, Dict, Optional


class User(BaseModel):
    username: str
    password: Optional[str] = None
    likes: Dict[str, int]


class AdminUser(User):
    admin_password: str
