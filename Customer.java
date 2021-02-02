public class Customer {      /// NewCustomer
    	
        
		//Customer Attributes:
        static String customerName;
        static String customerTelNum;
        static String customerEmail;
        static String customerPhyAdd;

        /**
         * @param customerName   - Customer Name
         * @param customerTelNum - Customer Telephone Number
         * @param customerEmail  - Customer Email
         * @param customerPhyAdd - Customer Physical Address
         */
        public Customer(String customerName,
                           String customerTelNum,
                           String customerEmail,
                           String customerPhyAdd) {
            Customer.customerName = customerName;
            Customer.customerTelNum = customerTelNum;
            Customer.customerEmail = customerEmail;
            Customer.customerPhyAdd = customerPhyAdd;    // Customer.customerPhyAdd = customerPhyAdd;
        }

        /**
         * Create String to Display Object.
         *
         * @return - Object toString
         */
        @Override
		public String toString() {
            String output =
                    "______________________________________________________________________\n";
            output += "Customer Details:";
            output += "\n______________________________________________________________________";
            output += "\nCustomer Name:.........................  " + customerName;
            output += "\nCustomer Telephone Number:.............  " + customerTelNum;
            output += "\nCustomer Email Address:................  " + customerEmail;
            output += "\nCustomer Physical Address:.............  " + customerPhyAdd;
            output += "\n______________________________________________________________________";

            return output;
        }

        /**
         * Customer Details are sent here to convert data to String for writing
         * to ProjectFile.txt
         *
         * @param customerDetails - String Customer Details for Project.
         * @return - Data for ProjectFile.txt
         */
        public static String toTxtFile(String customerDetails) {   //public static String toTxtFile(String customerDetails) {
            customerDetails += ("Customer Details, ");
            customerDetails += (customerName + ", ");
            customerDetails += (customerTelNum + ", ");
            customerDetails += (customerEmail + ", ");
            customerDetails += (customerPhyAdd);

            return customerDetails;
        }

    }

