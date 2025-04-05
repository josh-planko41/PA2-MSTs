# Programming Assignment 2 - COMP221

Your goal is to implement Kruskal's algorithm for finding MSTs in either C, Java, or Python from (roughly) scratch. In order to implement an efficient version of Kruskal's, you will be expected to write an array-based forest implementation of the Union-Find data structure.

To recieve full credit, you will need a working implementation of Kruskal's. While there will be no grading of the Union-Find data structure independently, you will be expected to rigorously test your implementation as well, since errors will propogate to Kruskal's. Limited credit will be given to Kruskal's implementations that use other methods for determining connectivity. 

### Project Specifications 

Your solution will be graded on **correctness** (does the algorithm actually sort, and is it the sort that it claims to be). However, to be tested, you will need to make sure your code accepts the correct command-line arguments and outputs the proper output, up to the exact formatting. For this assignment, expectations are minimal

#### Sorting Mode

Given an input that looks like the following

```bash
./pa2.sh --graph sample_graphs/graph.txt
```
Your code should output the cost of the MST in a single line. **If no MST exists (i.e., the graph is disconnected), you should print -1.** A few testing graphs are provided, but you should study the format and construct, by hand or automatically, graphs to test for edge cases. 

#### Notes:

- Consult the notes on Kruskal's on the course website, as well as your own notes and the textbook, to analyze 

- If you choose to code in python, note that since there isn't a first-party array implementation, you must use the array implementation from `numpy`, as the starter code does. **This is the only 3rd-party library you are allowed to use**. 

- The provided starter code provides sample code for interacting with command-line arguments, in case you haven't seen code like this before. You should modify this code as necessary to match the project specification above.

- The provided starter code also provides pa2.sh, a bash file that simplifies grading by providing a single way to run your code regardless of what language it's in. Be sure to open the file and read the instructions in the file to understand how it should function, and how to edit the script so it selects the language you chose to use. **Failure to do this may result in the loss of points!**

- Note that the pa2.sh file DOES NOT compile your c or java code for you. Make sure you setup/modify the provided build system (Make or Gradle) to compile your sorting code in a place where pa2.sh can find it. You should feel free to modify pa2.sh as needed to do so, but be wary that it should *not* print any extraneous output! You may use the (currently empty) setup.sh to indicate how you would like your code to be built.

- If anything is unclear, or you think you've found a typo, please let me know as soon as you can!

- Consult PA1 for details on how to use setup.sh to compile Java code, if this is unfamilar.

#### Crediting Help

**If you recieve assistance in any way (from OH, from a preceptor, from a source on the internet), provide credit (and, if an external source, a link to that source).** Note that while seeking sources to better understand the algorithm and it's underlying data structures is fine (and encouraged), looking up source code for an implementation (or using Generative AI) is a violation of academic integrity. To properly credit those sources, I recommend either providing annotations in comments for specific algorithms, or by modifying this README.
