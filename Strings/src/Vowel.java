public class Vowel {
    public static void main(String[] args) {
        String place = "Cuddalore";
        System.out.println(Vowel.output(place));
    }

    public static boolean output(String place) {
        boolean value = false;
        for (int i = 0; i < place.length(); i++) {
            char ch = place.charAt(i);
            char lowcas = Character.toLowerCase(ch);

            if (lowcas == 'a') {
                value = true;
                break;
            } else if (lowcas == 'e') {
                value = true;
                break;
            } else if (lowcas == 'i') {
                value = true;
                break;
            } else if (lowcas == 'o') {
                value = true;
                break;
            } else {
                value = true;
                break;
            }
        }
        return value;
    }
}

