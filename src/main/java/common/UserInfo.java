package common;

import java.util.Random;

public class UserInfo {
    public String username = "";
    public String password = "";
    public String username2 = "";
    public String validUsernameBlankSpace = "";
    public String validPasswordBlankSpace = "";
    public String usernameSpecialCharacters = "";
    public String passwordSpecialCharacters = "";
    public String usernameDigits = "";
    public String passwordDigits = "";
    public String usernameLowercaseCredentials = "";
    public String passwordLowercaseCredentials = "";
    public String usernameUppercaseCredentials = "";
    public String passwordUppercaseCredentials = "";
    public String invalidEmail = "";
    public String invalidName = "";
    public String invalidMessage = "";


    //generate valid random user info
    public UserInfo generateUser() {

        // Valid credentials
        RandomString randomString = new RandomString(8, new Random(), RandomString.lower);
        username = new RandomString(2, new Random(), RandomString.upper).nextString() +
                new RandomString(7, new Random(), RandomString.lower).nextString() +
                new RandomString(3, new Random(), RandomString.digits).nextString() +
                new RandomString(2, new Random(), RandomString.specialCharacter).nextString();
        password = username;
        username2 = "yopeso" + randomString.nextString();

        // Invalid Credentials-
        validUsernameBlankSpace = new RandomString(20, new Random(), RandomString.alphanum).nextString() +
                " ";
        validPasswordBlankSpace = validUsernameBlankSpace;
        usernameSpecialCharacters = new RandomString(10, new Random(), RandomString.specialCharacter).nextString();
        passwordSpecialCharacters = usernameSpecialCharacters;
        usernameDigits = new RandomString(10, new Random(), RandomString.digits).nextString();
        passwordDigits = usernameDigits;
        usernameLowercaseCredentials = new RandomString(10, new Random(), RandomString.lower).nextString();
        passwordLowercaseCredentials = usernameLowercaseCredentials;
        usernameUppercaseCredentials = new RandomString(10, new Random(), RandomString.upper).nextString();
        passwordUppercaseCredentials = usernameUppercaseCredentials;
        invalidEmail = new RandomString(10,new Random(), RandomString.alphanum).nextString();
        invalidName = invalidEmail;
        invalidMessage = invalidEmail;


        // login name for mail validation flow
        return this;

    }
}



