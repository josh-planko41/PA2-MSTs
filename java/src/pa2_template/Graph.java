/*
 * A Graph Data Structure class that defines the properties and components
 * of a graph. Written using the assistance of old COMP128 homeworks/activities
 * Written by Josh Planko, github: josh-planko41
 * PA2 - MSTs (4/14/25)
 */

package pa2_template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    int vertices = 0;
    ArrayList<Edge> edges;
    // Hashmaps to control char to int casting between the given char vertices and the ints we want to work with (received advice from senior Comp major Cam Scholl about hashmaps and subsequent work)
    Map<Character, Integer> char2Int = new HashMap<>();
    Map<Integer, Character> int2Char = new HashMap<>();

    public Graph(){
        this.vertices = 0;
        this.edges = new ArrayList<Edge>();
    }

    // Received small bits of help from Cam about how to correctly use the hash maps
    public void addEdge(char source, char dest, int weight){
        if (!char2Int.containsKey(source)){
            vertices++;
            char2Int.put(source, vertices);
            int2Char.put(vertices, source);
        }
        if (!char2Int.containsKey(dest)){
            vertices++;
            char2Int.put(dest, vertices);
            int2Char.put(vertices, dest);
        }
        edges.add(new Edge(source, dest, weight));
    }

    // Getters

    public ArrayList<Edge> getEdgeList(){
        return edges;
    }

    public int getTotalEdges(){
        return edges.size();
    }

    public int getVertices(){
        return vertices;
    }

    public int getInt(char c){
        return char2Int.get(c);
    }

    public char getChar (int i){
        return int2Char.get(i);
    }

}
