public class driver {
    public static void main(String[] args) {
        BusRoute BR1 = new BusRoute(55, "Piazza Gran Madre");
       // System.out.println(BR1);

        Bus BC = new Bus(4445678, "Stefano", BR1);
        System.out.println(BC);

    }
}

