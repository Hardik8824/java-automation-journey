class AutomationDecisionExample {
    public static void main(String[] args) {

        boolean isElementDisplayed = true;

        if (isElementDisplayed) {
            System.out.println("Click element");
        } else {
            System.out.println("Fail test - element not found");
        }
    }
}
