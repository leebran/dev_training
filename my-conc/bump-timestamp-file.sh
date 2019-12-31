#!/bin/sh

set -e # fail fast
set -x # print commands

git clone resource-gist updated-gist

cd updated-gist
npm run build

git config user.email "branden.lee.hj@gmail.com"
git config user.name "branden lee"

git add .
git commit -m "first try"
