class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= 0;
        List <Boolean> b = new ArrayList<>();
        for(int candy : candies){
            if(candy> max)
                max=candy;
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                b.add(true);
            }
            else
                b.add(false);
        }
        return b;
    }
}