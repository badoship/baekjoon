class Solution {
    public int solution(String my_string) {
        return my_string.replaceAll("[^0-9]","").chars().map(ch->ch-'0').sum();
    }
}