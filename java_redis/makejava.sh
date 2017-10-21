#!/bin/bash


jar=`find ./jar_lib/ -name *.jar | xargs | sed "s/ /:/g"`
echo -e "\033[35m loading jar package......  $jar\033[0m"

file=$1
echo -e "\033[31m compileing ${file}.java.......\033[0m"

javac -cp :$jar ${file}.java
java -cp :$jar  ${file}
#javac -cp :./jar_lib/jedis-2.9.0.jar ${file}.java
#java -cp :./jar_lib/jedis-2.9.0.jar   ${file}
