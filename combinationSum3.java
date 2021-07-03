class Solution {
    List<List<Integer>> lst;
    public List<List<Integer>> combinationSum3(int k, int n) {
        lst = new ArrayList<List<Integer>>();
        backtracking(k,n,new ArrayList<Integer>(),1);
        return lst;
    }
    public void backtracking(int k,int n, ArrayList<Integer> arr,int start) {
        if (n==0 && arr.size()==k) {
            List<Integer> temp=new ArrayList<Integer>(arr);
            lst.add(temp);
            return;
        }
        for (int i=start;i<=n && i<=9;i++) {
            arr.add(i);
            backtracking(k,n-i,arr,i+1);
            arr.remove(arr.size()-1);
        }
        
    }
}
