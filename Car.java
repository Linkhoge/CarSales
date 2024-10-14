// Car class Definition
public class Car

    {// Begin Car class
        private static int startNumber = 1000;
        private int saleNumber;
        private String makeName;
        private String modelName;
        private String carType;
        private double engineSize;
        private double salePrice;
        private Dealership assignedDealership;
        int carCount;

        public Car(String carMake, String carModel, double size, double price, Dealership dealership)
        {
            setSaleNumber(startNumber);
            startNumber++;
            carCount = 1000-startNumber;
            makeName = carMake;
            modelName = carModel;
            engineSize = size;
            salePrice = price;
            assignedDealership = dealership;
        }

        //Set Methods
        // set the sale number
        public void setSaleNumber(int number)
        {
            saleNumber = number;
        }

        // set the car make
        public void setMake(String name)
        {
            makeName = name;
        }

        // set the car model
        public void setModel(String name)
        {
            modelName = name;
        }

        // set the car type
        public void setType(String name)
        {
            carType = name;
        }

        // set the engine size
        public void setEngineSize(double size)
        {
            engineSize = size;
        }

        // set the sale price
        public void setPrice(double price)
        {
            salePrice = price;
        }
        //Get Methods
        // get the car make
        public String getMake()
        {
            return makeName;
        }

        // get the car model
        public String getModel()
        {
            return modelName;
        }

        // get the car type
        public String getType()
        {
            return carType;
        }

        // get the engine size
        public double getSize()
        {
            return engineSize;
        }

        // get the sale price
        public double getPrice()
        {
            return salePrice;
        }

        public int getSaleNumber()
        {
            return saleNumber;
        }

        public int getRecords()
        {
            return carCount;
        }

        public String toString()
        {
            return "Sale number: " + saleNumber + "\nMake: " + makeName
            + "\nModel: " + modelName + "\nType: " + 
        }

        private int saleNumber;
        private String makeName;
        private String modelName;
        private String carType;
        private double engineSize;
        private double salePrice;
        private Dealership assignedDealership;

    }// End Car class