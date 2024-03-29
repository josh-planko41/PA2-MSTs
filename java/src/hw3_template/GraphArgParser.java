package hw3_template;

/*
 * GraphArgParser parses command line arguments --graph_file, s, t, and --alg
 * into the appropriate instance variables to facilitate commandline
 * graph algorithms
 */
public class GraphArgParser {
    private String alg;
    private String s, t;
    private String graph_file;

    /**
     * Constructor
     * @param args commandline arguments
     */
    public GraphArgParser(String[] args) {
        int i = 0;
        while (i < args.length) {
            if (args[i].equals("--alg")) {
                i++;
                alg = args[i];
            }
            if (args[i].equals("--graph")) {
                i++;
                graph_file = args[i];
            }
            if (args[i].equals("-s")) {
                i++;
                s = args[i];
            }
            if (args[i].equals("-t")) {
                i++;
                t = args[i];
            }
            i++;
        }
    }
    /**
     * returns the graph algorithm you should use.
     * @return A string representing the algorithm
     */
    public String getAlg() {
        return alg;
    }

    /**
     * returns the source vertex label.
     * @return A string representing the source vertex
     */
    public String getS() {
        return s;
    }

    /**
     * returns the target vertex label
     * @return A string representing the target vertex
     */
    public String getT() {
        return t;
    }

    /**
     * returns the path to the file containing the list of edges in our graph
     * @return A string representing graph's path
     */
    public String getGraphFile() {
        return graph_file;
    }
}
