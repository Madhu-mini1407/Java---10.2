import java.util.Scanner;
public class Main {
    public static Candidate getCandidateDetails() throws InvalidInternException {

        System.out.println("Ener the candidate details ");
        System.out.println("name");
        String name = scanner.next();
        System.out.println("Gender");
        String gender = scanner.next();
        System.out.println("Enter percentage in 10th");
        int percentage = scanner.nextInt();

        if (percentage < 50) {
            throw new InvalidInternException("Registration failed. Percentage can't be less than 50%");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to InterHiring Tool");
        try {
            getCandidateDetails(scanner);
            System.out.println("Registration Successful");
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}