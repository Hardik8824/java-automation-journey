class LogicalOperatorsDemo {
    public static void main(String[] args) {

        String role = "tester";
        int experience = 3;

        if (role.equals("tester") && experience >= 2) {
            System.out.println("Eligible for automation training");
        } else {
            System.out.println("Not eligible");
        }
    }
}
