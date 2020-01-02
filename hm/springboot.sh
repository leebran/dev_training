#!/bin/sh

set -e # fail fast
set -x # print commands

git clone resource-gist updated-gist

cd updated-gist
cd demo2

mvn clean install

git config user.email "branden.lee.hj@gmail.com"
git config user.name "branden lee"
