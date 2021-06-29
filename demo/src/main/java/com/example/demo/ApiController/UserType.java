package com.example.demo.ApiController;

public enum UserType {
    

        EMPLOYEE("EMPLOYEE", 0.3), AFFILIATE("AFFILIATE", 0.1), OLD_CUSTOMER("OLD_CUSTOMER", 0.05), CUSTOMER("CUSTOMER", 0.0);
    
        private final String typeId;
        private final Double discPercentage;
    
        /**
         * 
         */
        private UserType(String type, Double discPercentage) {
            this.typeId = type;
            this.discPercentage = discPercentage;
        }
    
        public Double getDiscountPercentage() {
            return this.discPercentage;
        }
    
        public String getUserTypeId() {
            return this.typeId;
        }
    
    
}
