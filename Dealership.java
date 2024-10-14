// Dealership class Definition
public class Dealership

    {// Begin Dealership class
        private static int startNumber = 1000;
        private int dealershipID;
        private String tradeName;
        private String streetName;
        private String cityName;
        private String countyName;
        private Address dealershipAddress;

        public Dealership(String trade, Address address)
        {
            setID(startNumber);
            dealershipID++;
            tradeName = trade;
            dealershipAddress = address;
        }

        //Set methods
        //
        public void setTrade(String name)
        {
            tradeName = name;
        }

        public void setStreet(String name)
        {
            streetName = name;
        }

        public void setCity(String name)
        {
            cityName = name;
        }

        public void setCounty(String name)
        {
            countyName = name;
        }

        public void setID(int id)
        {
            dealershipID = id;
        }

        //Get methods
        //
        public String getTrade()
        {
            return tradeName;
        }

        public String getStreet()
        {
            return streetName;
        }

        public String getCity()
        {
            return cityName;
        }

        public String getCounty()
        {
            return countyName;
        }

        public int getID()
        {
            return dealershipID;
        }
    }

