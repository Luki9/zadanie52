class FootballTeamPlayers  implements Comparable <FootballTeamPlayers>{

   private String firstName;
   private String lastName;
   private double results;

    public FootballTeamPlayers(String firstName, String lastName, double results) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = results;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getResults() {
        return results;
    }

    public void setResults(double results) {
        this.results = results;
    }



    @Override
    public String toString() {
        return "FootballTeamPlayers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", results=" + results +
                '}';
    }

    @Override
    public int compareTo(FootballTeamPlayers o) {
        return 0;
    }
}
