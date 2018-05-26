#!/bin/bash

file=$1

if [[ -z "$file" ]]; then
	echo "usage: <path_to_file>"
	exit 1
fi

# chapter marker
for chapter in ===== ==== === == =
do
	length=${#chapter}
	md_code=$( printf '#%.0s' $(seq 1 $length) )
	
	sed -i "s/^$chapter /$md_code /g" $file
	sed -i "s/ $chapter$//g" $file

	sed -i "s/^$chapter/$md_code/g" $file
	sed -i "s/$chapter$//g" $file
done

# bold type
sed -i "s/'''/**/g" $file