import java.util.*;

public class SocialMediaFollowersTracker {

    private Map<String, Set<String>> followersMap;

    public SocialMediaFollowersTracker() {
        followersMap = new HashMap<>();
    }

    public void addFollower(String user, String follower) {
        followersMap.putIfAbsent(user, new HashSet<>());
        followersMap.get(user).add(follower);
        System.out.println(follower + " started following " + user);
    }

    public void removeFollower(String user, String follower) {
        Set<String> followers = followersMap.get(user);
        if (followers != null && followers.remove(follower)) {
            System.out.println(follower + " unfollowed " + user);
        } else {
            System.out.println(follower + " was not following " + user);
        }
    }

    public void displayFollowers(String user) {
        Set<String> followers = followersMap.get(user);
        if (followers != null && !followers.isEmpty()) {
            System.out.println("Followers of " + user + ": " + followers);
        } else {
            System.out.println(user + " has no followers.");
        }
    }

    public void displayAllUsersAndFollowers() {
        if (followersMap.isEmpty()) {
            System.out.println("No users or followers.");
        } else {
            for (Map.Entry<String, Set<String>> entry : followersMap.entrySet()) {
                System.out.println("User: " + entry.getKey() + ", Followers: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialMediaFollowersTracker tracker = new SocialMediaFollowersTracker();

        while (true) {
            System.out.println("\nOptions: ");
            System.out.println("1. Add Follower");
            System.out.println("2. Remove Follower");
            System.out.println("3. Display Followers of a User");
            System.out.println("4. Display All Users and Followers");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter User:");
                    String user = scanner.nextLine();
                    System.out.println("Enter Follower:");
                    String follower = scanner.nextLine();
                    tracker.addFollower(user, follower);
                    break;

                case 2:
                    System.out.println("Enter User:");
                    user = scanner.nextLine();
                    System.out.println("Enter Follower:");
                    follower = scanner.nextLine();
                    tracker.removeFollower(user, follower);
                    break;

                case 3:
                    System.out.println("Enter User:");
                    user = scanner.nextLine();
                    tracker.displayFollowers(user);
                    break;

                case 4:
                    tracker.displayAllUsersAndFollowers();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
