#! /bin/bash

# Uncomment the line corresponding to the language you used
# This makes testing your sorts in the commandline 
# the same regardless of the language you use.
#
# Test with a line like:
# ./pa2.sh --graph graph.txt
#
# It should construct an MST using Kruskal's algorithm
# and print the relevant cost.


# If using python
# Update to python3 if necessary!
python python/pa2.py "$@" 

# If using java
java -cp java/build/classes/java/main pa2_template.pa2 "$@"

# If using c
c/pa2 "$@"
