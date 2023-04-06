public class CodingHours {
    public static void main(String[] args) {
        double atendee = 6;
        double semestr = 17;
        double week = 5;
        double result = atendee*semestr*week;
        double hourWork = 52;
        double numebrWeek = 17;
        double wholeNumber = hourWork*numebrWeek;
        double percentage = result/wholeNumber;

        System.out.println("average attende spent by coding " + result + " hours");
        System.out.println("percentage of the coding hours in the semester is " + percentage + "%");
    }



}
