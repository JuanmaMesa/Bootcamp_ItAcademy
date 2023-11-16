var mongoose = require('mongoose');
var Schema = mongoose.Schema;
var Customer = new Schema({
  name: {
    type: String,
    required: true
  },
  lastName: {
    type: String,
    required: true
  },
  mail: {
    type: String,
    required: true
  },
  address: {
    street: {
      type: String,
      required: true
    },
    number: {
      type: Number,
      required: true
    },
    stairCase: {
      type: String,
      required: true
    },
    floor: {
      type: Number,
      required: true
    },
    door: {
      type: String,
      required: true
    },
    postcode: {
      type: String,
      required: true
    },
    city: {
      type: String,
      required: true
    },
    country: {
      type: String,
      required: true
    }
  },
  registration: {
    type: Date
  },
  refererCustomer: {
    type: Number,
    required: true
  },
  transaction: [{
    id_transaction: {
      type: Schema.Types.ObjectId,
      required: true
    },
    glasses: {
      type: Schema.Types.ObjectId,
      required: true
    },
    date: {
      type: Date,
      required: true
    },
    employee: {
      type: Schema.Types.ObjectId,
      required: true
    }
  }]
});
var mongoose = require('mongoose');
var Schema = mongoose.Schema;
var provider = new Schema({
  name: {
    type: String,
    required: true
  },
  address: {
    street: {
      type: String,
      required: true
    },
    number: {
      type: Number,
      required: true
    },
    floor: {
      type: Number,
      required: true
    },
    door: {
      type: String,
      required: true
    },
    poscode: {
      type: String,
      required: true
    },
    city: {
      type: String,
      required: true
    },
    country: {
      type: String,
      required: true
    }
  },
  nif: {
    type: String,
    required: true
  },
  brand: [{
    id_brand: {
      type: Schema.Types.ObjectId,
      required: true
    },
    name: {
      type: String,
      required: true
    }
  }],
  phone: {
    type: String,
    required: true
  },
  fax: {
    type: String,
    required: true
  }
});
var mongoose = require('mongoose');
var Schema = mongoose.Schema;
var glases_model = new Schema({
  brand: {
    type: Schema.Types.ObjectId,
    required: true
  },
  leftlLensGrade: {
    type: String,
    required: true
  },
  rightLensGrade: {
    type: String,
    required: true
  },
  frameType: {
    type: String,
    required: true
  },
  frameColor: {
    type: String,
    required: true
  },
  lensColor: {
    type: String,
    required: true
  },
  price: {
    type: Number,
    required: true
  }
});
var mongoose = require('mongoose');
var Schema = mongoose.Schema;
var employee = new Schema({
  name: {
    type: String,
    required: true
  },
  surname: {
    type: String,
    required: true
  },
  address: [{
    street: {
      type: String,
      required: true
    },
    number: {
      type: Number,
      required: true
    },
    StairCase: {
      type: String,
      required: true
    },
    floor: {
      type: Number,
      required: true
    },
    door: {
      type: String,
      required: true
    },
    postcode: {
      type: String,
      required: true
    },
    city: {
      type: String,
      required: true
    },
    country: {
      type: String,
      required: true
    }
  }]
});
