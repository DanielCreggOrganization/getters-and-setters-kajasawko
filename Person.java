class Person {
    // Instance Variables
    private String firstName;
    private String[] middleNames;
    private String userName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames.split(" ");
        
    }

    public void setUserName(String userName) {
        if(userName.length() > 10){
            this.userName = userName.substring(0,10);
        }else{
            this.userName = userName;
        }
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void getMiddleNames() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < middleNames.length; i++){
            sb.append(middleNames[i] + " ");
        }
    }

    public String getUserName() {
        return userName;
    }

}