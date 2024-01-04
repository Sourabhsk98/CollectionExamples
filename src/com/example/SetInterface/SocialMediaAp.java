package com.example.SetInterface;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SocialMediaAp {
    public static void main(String[] args) {
        // Create social media users
        SocialMediaUser arunima = new SocialMediaUser("Arunima");
        SocialMediaUser pooja = new SocialMediaUser("pooja");
        SocialMediaUser poornima = new SocialMediaUser("poornima");

        // Followers using different set implementations
        Set<SocialMediaUser> arunimaFollowers = new HashSet<>();//the order is not guaranteed, so the followers for Alice might be in a different order in subsequent runs.
        Set<SocialMediaUser> poojaFollowers = new LinkedHashSet<>();//the order is maintained based on insertion, so the followers for Bob are in the order they were added.
        Set<SocialMediaUser> poornimaFollowers = new TreeSet<>();//the followers are sorted in natural order (alphabetical order of usernames).

        // arunima gains followers
        arunimaFollowers.add(pooja);
        arunimaFollowers.add(poornima);

        // pooja gains followers
        poojaFollowers.add(poornima);
       poojaFollowers.add(poornima);

        // Charlie gains followers
        poornimaFollowers.add(arunima);
        poornimaFollowers.add(pooja);

        // Display follower lists
        displayFollowers("Arunima", arunimaFollowers);
        displayFollowers("pooja", poojaFollowers);
        displayFollowers("poornima", poornimaFollowers);
    }

    // Method to display the follower list for a user
    private static void displayFollowers(String user, Set<SocialMediaUser> followers) {
        System.out.println("Followers for " + user + " using " + followers.getClass().getSimpleName() + ": " + followers);
    }
}
