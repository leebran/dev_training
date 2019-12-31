#!/bin/sh

set -e # fail fast
set -x # print commands

git clone resource-gist updated-gist

cd updated-gist
cd my-app
npm install
npm run build

git config user.email "branden.lee.hj@gmail.com"
git config user.name "branden lee"
