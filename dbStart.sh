#!/bin/bash

docker run \
--name postgres-test \
-e POSTGRES_PASSWORD=docker \
-e POSTGRES_USER=postgres \
-e POSTGRES_DB=student \
-e PGUSER=postgres \
-p 5432:5432 \
-d postgres:alpine