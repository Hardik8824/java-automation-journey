class RetryLikeLoopExample {
    public static void main(String[] args) {

        boolean elementFound = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Attempt: " + attempt);

            if (attempt == 3) {
                elementFound = true;
            }

            if (elementFound) {
                System.out.println("Element found");
                break;
            }
        }
    }
}
class RetryLikeLoopExample {
    public static void main(String[] args) {

        boolean elementFound = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Attempt: " + attempt);

            if (attempt == 3) {
                elementFound = true;
            }

            if (elementFound) {
                System.out.println("Element found");
                break;
            }
        }
    }
}
