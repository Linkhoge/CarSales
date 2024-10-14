class Car

    {
        private static int startNumber = 100;
        private int saleNumber;
        private String carName;
        private String makeName;
        private String modelName;
        private String carType;
        private double engineSize;
        private double salePrice;

        public Car()
        {
            setSaleNumber(startNumber);
            startNumber++;
        }

        //Set Methods
        //

        public void setSaleNumber(int number)
        {
            saleNumber = number;
        }

        public void setName(String name)
        {
            carName = name;
        }

        public void setMake(String name)
        {
            makeName = name;
        }

        public void setModel(String name)
        {
            modelName = name;
        }

        public void setType(String name)
        {
            carType = name;
        }

        public void setEngineSize(double size)
        {
            engineSize = size;
        }

        public void setPrice(double price)
        {
            salePrice = price;
        }
    }