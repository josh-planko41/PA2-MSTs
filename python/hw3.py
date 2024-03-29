import argparse

# Use the argument parser library to collect commandline argument in args
parser = argparse.ArgumentParser()
parser.add_argument("--graph", type=str)
parser.add_argument("-s", type=str)
parser.add_argument("-t", type=str)
parser.add_argument("--alg", type=str)
args = parser.parse_args()

# And just print out the args
if __name__ == "__main__":
    with open(args.graph, "r") as in_f:
        for line in in_f:
            v, w, c = line.split()
            print("Edge ({}, {}) with weight {}".format(v, w, c))

    print(args.alg)
    print("Source: {}".format(args.s))
    print("Target: {}".format(args.t))
