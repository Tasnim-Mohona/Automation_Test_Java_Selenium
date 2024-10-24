package ControlStatements;

public class SecurityClearance {
    public static void main(String[] args) {
        boolean hasSecurityClearance = true;
        boolean knowsPassword = false;

        if (hasSecurityClearance || knowsPassword) {
            System.out.println("User has access.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
