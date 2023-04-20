//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(N);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> jugglerSequence(int N){
        // code here
        List<Integer> l=new ArrayList<Integer>();
        l.add(N);
        while(N>1){
            if(N%2==0){
                N=(int)Math.pow(N,0.5);
                l.add(N);
            }else{
                N=(int)Math.pow(N,1.5);
                l.add(N);
            }
        }
        return l;
    }
}