#! /bin/bash

# Uncomment the line corresponding to the language you used
# This makes testing your sorts in the commandline 
# the same regardless of the language you use.
#
# Test with a line like:
# ./hw3.sh -s A -t C --alg SP --graph graph.txt
#
# You should handle alg options named...
# SP
# MST-Lin
# MST-PQ
#
# and return the relevant cost.


# If using python
# Update to python3 if necessary!
python python/hw3.py "$@" 

# If using java
java -cp java/bin/main hw3_template.hw3 "$@"

# If using c
c/hw3 "$@"
