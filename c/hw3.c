#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFER_LEN 128

int main(int argc, char *argv[]) {
    char *alg;
    char *s, *t;
    char *graph_file;
    // Argument parsing
    int i = 1;
    while (i < argc) {
        // Grab the algorithm name
        if(strcmp(argv[i], "--alg") == 0) {
            i++;
            alg = argv[i];
        } 
        else if(strcmp(argv[i], "-s") == 0) {
            i++;
            s = argv[i];
        } 
        else if(strcmp(argv[i], "-t") == 0) {
            i++;
            t = argv[i];
        } 
        else if(strcmp(argv[i], "--graph") == 0) {
            i++;
            graph_file = argv[i];
        } 
        i++;
    }

    // Get edges in our graph file
    FILE *f_ptr;
    char buffer[BUFFER_LEN]; 

    f_ptr = fopen(graph_file, "r");

    // Check to see if the file has been opened properly
    if (!f_ptr) {
        printf("Invalid filename %s\n", graph_file);
        return(-1);
    }

    // for each line
    while (fgets(buffer, BUFFER_LEN, f_ptr)) {
        // Assume 1 character vertex names.
        //
        // buffer[0] is vertex 1
        // buffer[2] is vertex 2
        // buffer[4...] is the weight
        int c;
        c = atoi(buffer+4);
        printf("Edge (%c, %c) with weight %d\n", buffer[0], buffer[2], c);
    }

    // Our commandline arguments are here! Print them
    printf("%s\n", alg);
    printf("Source: %s\n", s);
    printf("Target: %s\n", t);

}
