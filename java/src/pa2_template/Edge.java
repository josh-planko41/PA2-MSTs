/*
 * An Edge class that defines the properties of the edge component of graphs
 * of a graph. Written using the assistance of old COMP128 homeworks/activities
 * Written by Josh Planko, github: josh-planko41
 * PA2 - MSTs (4/14/25)
 */

package pa2_template;

public class Edge implements Comparable<Edge>{
    char v1;
    char v2;
    int weight;

    public Edge(char v1, char v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge edge) {
        return Integer.compare(this.weight, edge.weight);
    }

    // Getters

    public char getSource(){
        return v1;
    }

    public char getDest(){
        return v2;
    }

    public int getWeight(){
        return weight;
    }
}
