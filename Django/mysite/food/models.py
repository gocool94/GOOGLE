from django.db import models

# Create your models here.\

class Item(models.Model):

    def __str__(self) -> str:
        return self.item_name
    
    item_name = models.CharField(max_length=200)
    item_desc = models.CharField(max_length=200)
    price = models.IntegerField(max_length=200)

