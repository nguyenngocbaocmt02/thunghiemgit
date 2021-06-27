import java.lang.*;
import java.io.*;
import java.util.*;
class Game implements Comparable<Game> {
    public int value;
    public int key;
    public int compareTo(Game x) {
        if(this.value==x.value) return 0;
        else {
            if(this.value<x.value) return 1;
            else return -1;
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int nbGame= keyboard.nextInt();
        while(nbGame-->0) {
            int n= keyboard.nextInt();
            Game[] game= new Game[n];
            for(int i=0;i<n;i++) {
                game[i].value= keyboard.nextInt();
                game[i].key= i;
            }
            Arrays.sort(game);
            
        }
    }
}
