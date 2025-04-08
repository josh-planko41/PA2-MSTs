package pa2_template;


public class UnionFind {
    
    int p[];        // Parent Element
    int size[];     // Number of Elements in Subtree i
    int n;          // Number of Elements in the Set

    public UnionFind(int setSize){
        this.n = setSize;
        this.p = new int[n];
        this.size = new int[n];

        for (int i = 0; i < n; i++){
            p[i] = i;
            size[i] = 1;
        }
    }

    int find(int x){
        if (p[x] == x){
            return x;
        }
        return (find(p[x]));
    }

    void unionSets(int s1, int s2){
        int r1, r2; // Roots of Sets

        r1 = find(s1);
        r2 = find(s2);

        if (r1 == r2){
            return;
        }

        if(size[r1] >= size[r2]){
            size[r1] = size[r1] + size[r2];
            p[r2] = r1;
        } else {
            size[r2] = size[r1] + size[r2];
            p[r1] = r2;
        }
    }

    boolean same_component(int s1, int s2){
        return(find(s1) == find(s2));
    }

}
