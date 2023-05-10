package leetcode5;

import java.util.*;

public class Combination {

    public static void main(String[] args) {
        Combination combination=new Combination();
        System.out.println(combination.combinationSum3(3,7));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int i=0;
        Queue<Node> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        Node node;
        Set<List<Integer>> listOfList=new HashSet<>();
        for(i=1;i<=9;i++)
        {
            list.add(i);
            queue.add(new Node(i,list));
            list=new ArrayList<>();
        }
        while(!queue.isEmpty())
        {
            node=queue.poll();
            for(i=1;i<=9;i++)
            {
                if(!node.list.contains(i)&&node.sum+i<=n&&node.list.size()<k)
                {
                    node.list.add(i);
                    if(node.sum+i==n&&node.list.size()==k)
                    {
                        Collections.sort(node.list);
                        listOfList.add(node.list);
                    }
                    else
                    {
                        queue.add(new Node(node.sum+i,new ArrayList<Integer>(node.list)));
                        node.list.remove(node.list.size()-1);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(listOfList);
    }
}
class Node
{
    int sum;
    List<Integer> list;
    public Node(int sum,List<Integer> list) {
        this.sum = sum;
        this.list = list;
    }}
