class Solution {
    public List<Integer> findDuplicates(int[] nums) {

       HashMap<Integer, List<Integer>> Ind = new HashMap<>();
        
        // Build the map
        for (int i = 0; i < nums.length; i++) {
            int ch = nums[i];
            Ind.putIfAbsent(ch, new ArrayList<>());
            Ind.get(ch).add(i);
        }
      List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : Ind.entrySet()) {
            if (entry.getValue().size() > 1) {
                result.add(entry.getKey());
            }
        }
            return result;     
    }
}
