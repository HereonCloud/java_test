# Festival Performance Schedule

## Story
The Lantern Festival has many performances on different stages. A visitor wants to attend as many shows as possible without overlap.

## Problem
Given show times for festival performances, choose the maximum number of performances that can be attended.

## Input
- First line: integer `N`, the number of performances.
- Next `N` lines: two integers `start end` for each show.

A performance can be attended if its start time is not earlier than the end time of the previous show.

## Output
Print the maximum number of performances that can be attended.

## Constraints
- `1 <= N <= 10000`
- `0 <= start < end <= 100000`

## Approach
This is a greedy scheduling problem. Always choose the next performance with the earliest end time that does not overlap the current schedule.
