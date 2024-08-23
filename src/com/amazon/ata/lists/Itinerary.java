package com.amazon.ata.lists;

import com.amazon.ata.resources.lists.prework.Destination;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing travel itinerary. The basic functionality it supports is to add, get or remove
 * a destination. Additionally, it allows a user to get a list of locations that are going to be visited
 * and get the total number of days that will be spent in trip.
 */
public class Itinerary {
    private List<Destination> destinations;
    public Itinerary() {
        this.destinations = new ArrayList<>();
    }
    /**
     * Add a new destination to the end of itinerary.
     *
     * @param destination destination to add to itinerary
     */
    public void addDestination(Destination destination) {
        if (destination != null) {
            destinations.add(destination);
        }
    }

    /**
     * Get the destination from itinerary based on its position.
     *
     * @param position position of destination to retrieve.
     * @return Destination at position.
     */
    public Destination getDestination(int position) {
        if (position >= 0 && position < destinations.size()) {
            return destinations.get(position);
        }
        return null;
    }



    /**
     * Remove a destination from itinerary based on its position.
     *
     * @param position position of destination to remove.
     * @return destination that was removed from itinerary.
     */
    public Destination removeDestination(int position) {
        if (destinations.isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot remove from empty itinerary");
        }
        if (position >= 0 && position < destinations.size()) {
            return destinations.remove(position);
        }
        // Implement the method here
        return null;
    }


    /**
     * Get list of locations (cities) in the order in which they
     * appear in the itinerary.
     *
     * @return full list of locations from itinerary.
     */
    public List<String> getListOfLocations() {
        List<String> locations = new ArrayList<>();
        for (Destination destination : destinations) {
            locations.add(destination.getLocation());
        }
        return locations;
    }

    /**
     * Get total number of days spent on the trip planned by the
     * itinerary.
     *
     * @return total number of days spent in all locations.
     */
    public int getTotalNumberOfDays() {
        int totalDays = 0;
        for (Destination destination : destinations) {
            totalDays += destination.getDaysAtLocation();
        }
        return totalDays;
    }

    /**
     * Get number of destinations contained in itinerary.
     *
     * @return number of destinations contained in itinerary.
     */
    public int getNumberOfDestinations() {
        int totalDestinations = 0;
        totalDestinations += destinations.size();

        // Implement the method here
        return totalDestinations;
    }
}
