package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankTeamsByVotes {

    public static void main(String[] args) {
        RankTeamsByVotes rankTeamsByVotes = new RankTeamsByVotes();

        String[] votes = new String[]{"WAYZ","AWYZ"};
        final String s = rankTeamsByVotes.rankTeams(votes);
        System.out.println(s);
    }

    public String rankTeams(String[] votes) {
        Map<Character, int[]> map = new HashMap<>();
        int numberOfTeams = votes[0].length();

        for(String vote : votes) {
            for(int i = 0; i < numberOfTeams; i++) {
                char team = vote.charAt(i);
                map.putIfAbsent(team, new int[numberOfTeams]);
                map.get(team)[i]++;
            }
        }

        List<Character> characters = new ArrayList<>(map.keySet());
        characters.sort((a, b) -> {
            for(int i = 0; i < numberOfTeams; i++) {
                if(map.get(a)[i] != map.get(b)[i]) {
                    return map.get(b)[i] - map.get(a)[i];
                }
            }
            return a - b;
        });

        StringBuilder stringBuilder = new StringBuilder();

        for(char c : characters) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}