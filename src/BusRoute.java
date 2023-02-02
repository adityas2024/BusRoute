public class BusRoute {
        private int route;
        private String start;

        public BusRoute ( int r, String s){
            this.route = r;
            this.start = s;
        }

        public int getRoute() {
            return route;
        }

        public void setRoute(int r) {
            this.route = r;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String s) {
            this.start = s;

        }

        public String toString(){
            return "This is bus route number " + getRoute() + " and it starts at " + getStart() ;

        }
}


