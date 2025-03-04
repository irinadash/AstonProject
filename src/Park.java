import java.util.Arrays;

public class Park {
    public static class Attraction {
        final String name;
        final String workingTime;
        final String price;

        public Attraction(String name, String workingTime, String price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;

        }
    }

    public static void main(String[] args) {
        Attraction[] attractionArray = new Attraction[3];
        attractionArray[0] = new Attraction("Орбита", "9:00 - 20:00", "30-руб");
        attractionArray[1] = new Attraction("Американские горки", "10:00 - 22:00", "50-руб");
        attractionArray[2] = new Attraction("Сюрприз", "10:00 - 20:00", "50-руб");
        for (int i = 0; i < attractionArray.length; i++) {
            System.out.println(attractionArray[i].name);
            System.out.println(attractionArray[i].workingTime);
            System.out.println(attractionArray[i].price);
        }
    }
}
