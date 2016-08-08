package com.tiy.ssa.weekone.assignmenttwo;

public class PigLatin {

    final String word;
    final String vowels = "aeiou";
    final String consonants = "bcdfghjklmnpqrstvwxyz";

    public PigLatin(String word) {
        this.word = word;
    }

    public String translateToPigLatin() {

        String sentence = "";

        String[] parts = word.split(" ");

        for (int i = 0; i < parts.length; i++) {

            String firstLetter = parts[i].substring(0, 1);

            if (parts[i].length() > 1) {
                String secondLetter = parts[i].substring(1, 2);

                for (int z = 0; z < consonants.length(); z++) {

                    if (firstLetter.equals(consonants.substring(z, z + 1))) {

                        for (int x = 0; x < vowels.length(); x++) {

                            if (secondLetter.equals(vowels.substring(x, x + 1))) {

                                // System.out.println(parts[i].substring(1,
                                // parts[i].length()) + firstLetter + "ay");
                                sentence = sentence + " "
                                        + (parts[i].substring(1, parts[i].length()) + firstLetter + "ay");
                                break;

                            }

                        }

                        for (int c = 0; c < consonants.length(); c++) {
                            if (secondLetter.equals(consonants.substring(c, c + 1))) {

                                // System.out.println(parts[i].substring(2,
                                // parts[i].length()) + firstLetter +
                                // secondLetter + "ay");
                                sentence = sentence + " " + (parts[i].substring(2, parts[i].length()) + firstLetter
                                        + secondLetter + "ay");
                                break;

                            }
                        }

                    }

                }
            }

            for (int v = 0; v < vowels.length(); v++) {

                if (firstLetter.equals(vowels.substring(v, v + 1))) {
                    // System.out.println(parts[i].substring(0,
                    // parts[i].length()) + "way");
                    sentence = sentence + " " + (parts[i].substring(0, parts[i].length()) + "way");
                    break;
                }
            }

        }

        return (sentence.trim());
    }

}
