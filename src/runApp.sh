#!/bin/bash
# Script for automating AVLExperiment, search data items for different 
# randomization levels(1<=x<=20)
# execute "bash runApp.sh" from "../script/" directory

FILES="./tests/inputs/"
OUTPUT="./tests/outputs/"
x=1
echo "Executing AVL Experiment"
for x in {1..20}
do
    java -cp ./bin/ AVLExperiment $x < $FILES"testinput.txt" > $OUTPUT"testoutput$x.txt"
    echo "run : AVLExperiment < testinput$x complete"
done
echo "Automation Done..."