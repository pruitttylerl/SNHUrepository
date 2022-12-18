
#Tyler Pruitt
#Master Donoho
#CS-340-H7681
#Client/Server Development 22EW2

from pymongo import MongoClient
from bson.objectid import ObjectId

class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """

    def __init__(self):
        # Initializing the MongoClient. This helps to 
        # access the MongoDB databases and collections. 
        self.client = MongoClient('mongodb://%s:%s@localhost:53406' % (aacuser, 1785870))
        # where xxxx is your unique port number
        self.database = self.client['project']

# Create method to implement the C in CRUD. Tyler.pruitt2@snhu.edu
    def create(self, data):
        if data is not None:
            result = self.database.animals.insert(data)  # data should be dictionary   
            print(result)
        else:
            raise Exception("Nothing to save, because data parameter is empty")

# Read method to implement the R in CRUD. Tyler.pruitt2@snhu.edu
def read(self, dictionary):
        if dictionary is not None:
            if self.database.animals.find(dictionary) is not None:
                result = self.database.animals.find(dictionary)
                print (result)
        else:
            raise Exception("Nothing to read, because data parameter is empty")

# Update method to implement the U in CRUD. Tyler.pruitt2@snhu.edu
    def update(self, dictionary, data):
        if data is not None and dictionary is not None:
            result = self.database.animals.update(dictionary, data)  # data should be dictionary   
            print(result)
        else:
            raise Exception("Nothing to update, because data or dictionary  parameter is empty")

# Delete method to implement the D in CRUD. Tyler.pruitt2@snhu.edu
    def delete(self, dictionary):
        if dictionary is not None:
            if self.database.animals.find(dictionary) is not None:
                result = self.database.animals.remove(dictionary)
                print (result)
        else:
            raise Exception("Nothing to read, because data parameter is empty")