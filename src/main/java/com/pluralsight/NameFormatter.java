
package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }

    // First and last name
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    // Name with prefix, middle name and suffix
    public static String format(String prefix, String firstName,
                                String middleName, String lastName,
                                String suffix) {

        String name = lastName + ", ";

        if (prefix != null && !prefix.isEmpty()) {
            name += prefix + " ";
        }

        name += firstName;

        if (middleName != null && !middleName.isEmpty()) {
            name += " " + middleName;
        }

        if (suffix != null && !suffix.isEmpty()) {
            name += ", " + suffix;
        }

        return name;
    }

    // Full name as one String
    public static String format(String fullName) {

        String[] parts = fullName.split(",");
        String[] words = parts[0].trim().split(" ");

        String lastName = words[words.length - 1];
        String firstName = words[0];
        String middleName = "";
        String prefix = "";
        String suffix = "";

        int start = 0;

        if (words[0].endsWith(".")) {
            prefix = words[0];
            start = 1;
        }

        firstName = words[start];

        for (int i = start + 1; i < words.length - 1; i++) {
            middleName += words[i] + " ";
        }

        if (parts.length > 1) {
            suffix = parts[1].trim();
        }

        return format(prefix, firstName, middleName.trim(),
                lastName, suffix);
    }
}
