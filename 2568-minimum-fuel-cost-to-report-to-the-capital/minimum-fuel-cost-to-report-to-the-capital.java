class Solution {

    private long[] helper(int currentCity, int parentCity, List<List<Integer>> cities, int seats) {

        long noOfPersons = (currentCity == 0 ? 0 : 1);
        long fuelConsumed = 0;

        for (int neighbourCity: cities.get(currentCity)) {
            if (neighbourCity != parentCity) {
                long[] subResult = helper(neighbourCity, currentCity, cities, seats);
                noOfPersons += subResult[0];
                fuelConsumed += subResult[1];
                // System.out.println(neighbourCity + " " + Arrays.toString(subResult));
            }
        }

        long cars = (noOfPersons / seats) + (noOfPersons % seats != 0 ? 1 : 0);
        if (currentCity != 0)
            fuelConsumed += cars;
        long[] result = new long[2];
        result[0] = noOfPersons;
        result[1] = fuelConsumed;
        return result;
    }

    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length + 1;
        List<List<Integer>> cities = new ArrayList<>();

        for (int city = 0; city < n; city++) {
            cities.add(new ArrayList<>());
        }

        for (int[] road: roads) {
            cities.get(road[0]).add(road[1]);
            cities.get(road[1]).add(road[0]);
        }

        return helper(0, -1, cities, seats)[1];
    }
}