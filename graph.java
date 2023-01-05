import java.util.*;
<<<<<<< HEAD
import fun from 313room;
import MK from seetha heart;
=======
import fun from 313rooml;
>>>>>>> 450dd2c14b847e9a30c83658749999e09b8b7770

class graph{

    class node{
        int data;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of node and edged : ");
        int nv = scan.nextInt(), ne = scan.nextInt();
        int i,j;
        int[][] amat = new int[nv+1][nv+1];
        List<List<Integer>> alist = new ArrayList<>();
        for(i=0;i<nv+1;++i) alist.add(new ArrayList<>());
        for(i=0;i<ne;++i){
            int s = scan.nextInt(), e = scan.nextInt();
            amat[s][e]=1;
            alist.get(s).add(e);
            amat[e][s]=1;
            alist.get(e).add(s);
        }
        System.out.println("*********************adjacency matrix*********************");
        System.out.println(alist);
        System.out.println("*********************adjacency matrix*********************");
        for(i=0;i<nv+1;++i){
            for(j=0;j<nv+1;++j) System.out.print(amat[i][j]+" ");
            System.out.println();
        }
    }
}


/* *************************************BFS Traversel************************************************************* */

/*class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        HashMap<Integer,Integer> visit = new HashMap<>();   
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        q.add(0);
        visit.put(0,0);
        while(!q.isEmpty()){
            int c = q.poll();
            ans.add(c);
            int i,n=adj.get(c).size();
            for(i=0;i<n;++i){
                int t = adj.get(c).get(i);
                if(visit.get(t)==null){
                    q.add(t); visit.put(t,0);
                }
            }
        }
        return ans;
    }
}*/


/* *************************************DFS Traversel************************************************************* */

/*
class Solution {
        
    ArrayList<Integer> ans = new ArrayList<Integer>();
    
    public void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        ans.add(node);
        for(Integer it : adj.get(node)){
            if(vis[it]==0) dfs(it,vis,adj);
        }
        
    }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        dfs(0,vis,adj);
        return ans;
    }
}
*/

//this is my change