// Address class Definition
public class Address

    {// Begin Address class
        private String streetName;
        private String cityName;
        private String countyName;

        public Address(String street, String city, String county)
        {
            streetName = street;
            cityName = city;
            countyName = county;
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

        //Get methods
        //
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
    }