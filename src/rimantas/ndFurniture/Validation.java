package rimantas.ndFurniture;


    public class Validation {
        public static boolean isNullOrEmpty(String Text) {
            if (Text == null || Text.isEmpty() ) {
                return true;
            } else {
                return false;
            }
        }
    }