// this class works as the backend and will generate the password

import java.util.Random;

public class PasswordGenerator {
    // character pools
    // these strings will hold
    public static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()_+-=[]{};:,./<>?~`";

    // the random class allows us to generate a random number which will be used to randomly choose the characters
    private final Random random;

    // constructor; we will initialize the random object in the constructor
    public PasswordGenerator(){random = new Random();}

    // length: length of the password to be generated, taken as input from user
    // includeUppercase etc. considers if the password should include uppercase, lowercase, etc.
    public String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers,
                                   boolean includeSpecialSymbols){
        // we will use string builder over string for better efficiency
        StringBuilder passwordBuilder = new StringBuilder();

        // store valid characters (toggle states)
        String validCharacters = "";
        if(includeUppercase) validCharacters += UPPERCASE_CHARACTERS;
        if(includeLowercase) validCharacters += LOWERCASE_CHARACTERS;
        if(includeNumbers) validCharacters += NUMBERS;
        if(includeSpecialSymbols) validCharacters += SYMBOLS;

        // build password
        for (int i = 0; i < length; i++){
            // generate a random index
            int randomIndex = random.nextInt(validCharacters.length());

            // get the char based on the random index
            char randomChar = validCharacters.charAt(randomIndex);

            // store char into password builder
            passwordBuilder.append(randomChar);

            // do this until we've reached length of the password user has specified
        }

        // return the result
        return passwordBuilder.toString();
    }
}
