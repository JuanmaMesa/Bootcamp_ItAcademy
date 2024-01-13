
db.createCollection('Customers', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      required: ['name', 'lastName', 'email', 'address', 'registrationDate', 'refererCustomer'],
      properties: {
        name: { bsonType: 'string' },
        lastName: { bsonType: 'string' },
        email: { bsonType: 'string' },
        address: {
          bsonType: 'object',
          required: ['street', 'number', 'stairCase', 'floor', 'door', 'postcode', 'city', 'country'],
          properties: {
            street: { bsonType: 'string' },
            number: { bsonType: 'int' },
            stairCase: { bsonType: 'string' },
            floor: { bsonType: 'int' },
            door: { bsonType: 'string' },
            postcode: { bsonType: 'string' },
            city: { bsonType: 'string' },
            country: { bsonType: 'string' }
          }
        },
        registrationDate: { bsonType: 'date' },
        refererCustomer: { bsonType: 'int' }
      }
    }
  }
});



db.createCollection('Providers', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      required: ['name', 'address', 'nif', 'brand', 'phone', 'fax'],
      properties: {
        name: { bsonType: 'string' },
        address: {
          bsonType: 'object',
          required: ['street', 'number', 'floor', 'door', 'postcode', 'city', 'country'],
          properties: {
            street: { bsonType: 'string' },
            number: { bsonType: 'int' },
            floor: { bsonType: 'int' },
            door: { bsonType: 'string' },
            postcode: { bsonType: 'string' },
            city: { bsonType: 'string' },
            country: { bsonType: 'string' }
          }
        },
        nif: { bsonType: 'string' },
        brand: {
          bsonType: 'array',
          items: {
            bsonType: 'object',
            required: ['id_brand', 'name'],
            properties: {
              id_brand: { bsonType: 'objectId' },
              name: { bsonType: 'string' }
            }
          }
        },
        phone: { bsonType: 'string' },
        fax: { bsonType: 'string' }
      }
    }
  }
});


db.createCollection('Employees', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      required: ['name', 'surname', 'address'],
      properties: {
        name: { bsonType: 'string' },
        surname: { bsonType: 'string' },
        address: {
          bsonType: 'array',
          items: {
            bsonType: 'object',
            required: ['street', 'number', 'stairCase', 'floor', 'door', 'postcode', 'city', 'country'],
            properties: {
              street: { bsonType: 'string' },
              number: { bsonType: 'int' },
              stairCase: { bsonType: 'string' },
              floor: { bsonType: 'int' },
              door: { bsonType: 'string' },
              postcode: { bsonType: 'string' },
              city: { bsonType: 'string' },
              country: { bsonType: 'string' }
            }
          }
        }
      }
    }
  }
});

db.createCollection('Glasses', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      required: ['brand', 'leftLensGrade', 'rightLensGrade', 'frameType', 'frameColor', 'lensColor', 'price'],
      properties: {
        brand: { bsonType: 'objectId' },
        leftLensGrade: { bsonType: 'string' },
        rightLensGrade: { bsonType: 'string' },
        frameType: { bsonType: 'string' },
        frameColor: { bsonType: 'string' },
        lensColor: { bsonType: 'string' },
        price: { bsonType: 'double' }
      }
    }
  }
});

