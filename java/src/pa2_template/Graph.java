/*
 * A Graph Data Structure class that defines the properties and components
 * of a graph. Written using the assistance of old COMP128 homeworks/activities
 * Written by Josh Planko, github: josh-planko41
 * PA2 - MSTs (4/14/25)
 */

package pa2_template;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int vertices;
    List<Edge> edges;

    public Graph(int vertices){
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(char source, char dest, int weight){
        edges.add(new Edge(source, dest, weight));
    }

    // Getters

    public List<Edge> getEdgeList(){
        return edges;
    }

    public int getTotalEdges(){
        return edges.size();
    }
}
