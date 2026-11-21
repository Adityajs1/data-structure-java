class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] result = new String[n];
        int alice = 0, bob = 0;

        for(int i = 0; i < n; i++){
            boolean aliceneed = i+1 < n && rain[i] == 1 && rain[i+1] == 1;
            if(aliceneed && alice <= bob){
                result[i] = "Alice";
                alice++;
            }
            else if(rain[i] == 1){
                result[i] = "Bob";
                bob++;
            }
            else{
                result[i] = "None";
            }
        }
        return result;
    }
}