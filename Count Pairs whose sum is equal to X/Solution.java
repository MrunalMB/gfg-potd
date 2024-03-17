class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int count = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
      //adding all values of 2nd linkedList to set
        for (Integer value : head2) {
            set.add(value);
        }
        //finding whether set of 2nd linkedList is containg element which is nothing but the difference between value of 1st Linkedlist and x
        for (Integer i : head1) {
            if (set.contains(x - i)) {
                count++;
            }
        }
        
        return count;
    }
}
