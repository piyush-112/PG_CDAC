#!/bin/bash

read -p "Enter the line:" n

for((i=1; i<=n; i++))
do
	for((j=1; j<=i; j++))
	do
		echo -n "*"
	done
	echo ""
	
done


