"""
Your goal is to create a social media post model using pydantic. The model should have:
An author, which is a string
An optional co-author, which is a string
A date, which is a string
A title, which is a string
The content, which is a string
An ID, which is an integer
Likes, which is a list of strings

The post should also have a field for comments, which is a list of comment models. The model should have:
An author, which is a string
The comment, which is a string
Likes, which is an integer

Practice creating a social media post with whatever data you like, so long as it compiles.
"""

from pydantic import BaseModel
from typing import Optional, List, Dict


class Comment(BaseModel):
    author: str
    comment: str
    likes: int


class SocialMediaPost(BaseModel):
    author: str
    coauthor: Optional[str]
    date: str
    title: str
    ID: int
    Like: List[int]
    comments: List[Comment]


comment = [Comment(author="Gokul", comment="Good", likes=2)]

post = SocialMediaPost(author="dharani",
                       date="12/12/12",
                       title="The start",
                       ID=123,
                       Like=[1, 2, 3],
                       comments=comment)

print(post.comments)
print(post)
