package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(this.password.equals(newPassword)){
            if(newPassword.length()>=8){
                for(int i=0;i<newPassword.length();i++ ){
                    if(Character.isUpperCase(newPassword.charAt(i))){
                        for(int j=0;j<newPassword.length();j++){
                            if(Character.isLowerCase(newPassword.charAt(j))){
                                for(int k=0;k<newPassword.length();k++ ) {
                                    if (Character.isDigit(newPassword.charAt(k))) {
                                        for (int l = 0; l < newPassword.length(); l++) {
                                            if (!Character.isLetterOrDigit(newPassword.charAt(l))) {
                                               setPassword(newPassword);
                                                System.out.println("Password changed successfully");

                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
