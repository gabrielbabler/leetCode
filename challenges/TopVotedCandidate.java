package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopVotedCandidate {

    public static void main(String[] args) {

    }

    Map<Integer, Integer> timeLeader = new HashMap<>(); //time and leader
    int[] times;
    public TopVotedCandidate(int[] persons, int[] times) {
        int numberOfPersons = persons.length;
        int leader = -1;
        Map<Integer, Integer> votesCounter = new HashMap<>(); //person and votes
        this.times = times;
        for (int i = 0; i < numberOfPersons; i++) {
            votesCounter.put(persons[i], votesCounter.getOrDefault(persons[i], 0) + 1);
            if (i == 0 || votesCounter.get(persons[i]) >= votesCounter.get(leader)) {
                leader = persons[i];
            }
            timeLeader.put(times[i], leader);
        }
    }

    public int q(int t) {
            int i = Arrays.binarySearch(times, t);
            return i < 0 ? timeLeader.get(times[-i-2]) : timeLeader.get(times[i]);
    }
}