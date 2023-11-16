
db.createCollection('order', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'order',
      required: ['time', 'type', 'total', 'id_Customer', 'id_employee', 'id_restaurant', 'id_productos'],
      properties: {
        time: {
          bsonType: 'timestamp'
        },
        type: {
          enum:
        },
        total: {
          bsonType: 'double'
        },
        id_Customer: {
          bsonType: 'objectId'
        },
        id_employee: {
          bsonType: 'objectId'
        },
        id_restaurant: {
          bsonType: 'objectId'
        },
        id_productos: {
          bsonType: 'objectId'
        }
      }
    }
  }
});
db.createCollection('Customer', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'Customer',
      required: ['name', 'surName', 'postCode', 'phone', 'id_city', 'address'],
      properties: {
        name: {
          bsonType: 'string'
        },
        surName: {
          bsonType: 'string'
        },
        postCode: {
          bsonType: 'string'
        },
        phone: {
          bsonType: 'string'
        },
        id_city: {
          bsonType: 'objectId'
        },
        address: {
          bsonType: 'array',
          items: {
            title: 'object',
            required: ['street', 'num', 'province', 'city'],
            properties: {
              street: {
                bsonType: 'string'
              },
              num: {
                bsonType: 'int'
              },
              province: {
                bsonType: 'string'
              },
              city: {
                bsonType: 'string'
              }
            }
          }
        }
      }
    }
  }
});
db.createCollection('employee', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'employee',
      required: ['name', 'surName', 'nif', 'phone', 'type', 'id_restaurant', 'address'],
      properties: {
        name: {
          bsonType: 'string'
        },
        surName: {
          bsonType: 'string'
        },
        nif: {
          bsonType: 'string'
        },
        phone: {
          bsonType: 'string'
        },
        type: {
          enum:
        },
        id_restaurant: {
          bsonType: 'objectId'
        },
        address: {
          bsonType: 'object',
          title: 'object',
          required: ['street', 'num', 'province', 'city'],
          properties: {
            street: {
              bsonType: 'string'
            },
            num: {
              bsonType: 'int'
            },
            province: {
              bsonType: 'string'
            },
            city: {
              bsonType: 'string'
            }
          }
        }
      }
    }
  }
});
db.createCollection('restaurant', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'restaurant',
      required: ['postCode', 'address', 'id_city'],
      properties: {
        postCode: {
          bsonType: 'string'
        },
        address: {
          bsonType: 'object',
          title: 'object',
          required: ['street', 'num', 'province', 'city'],
          properties: {
            street: {
              bsonType: 'string'
            },
            num: {
              bsonType: 'int'
            },
            province: {
              bsonType: 'string'
            },
            city: {
              bsonType: 'string'
            }
          }
        },
        id_city: {
          bsonType: 'objectId'
        }
      }
    }
  }
});
db.createCollection('products', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'products',
      required: ['name', 'description', 'image', 'price', 'type'],
      properties: {
        name: {
          bsonType: 'string'
        },
        description: {
          bsonType: 'string'
        },
        image: {
          bsonType: 'binData'
        },
        price: {
          bsonType: 'double'
        },
        type: {
          enum:
        },
        pizza_category: {
          bsonType: 'array',
          items: {
            title: 'object',
            required: ['id_pizza', 'name'],
            properties: {
              id_pizza: {
                bsonType: 'objectId'
              },
              name: {
                bsonType: 'string'
              }
            }
          }
        }
      }
    }
  }
});

