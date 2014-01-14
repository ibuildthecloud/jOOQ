#!/bin/bash

git update-index --assume-unchanged */.project
git update-index --assume-unchanged */.classpath
for i in */.settings/*; do
    git update-index --assume-unchanged $i
done
