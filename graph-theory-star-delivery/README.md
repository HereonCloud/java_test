# Starlight Delivery Network

## Story
The courier ship *Aurora* carries packages across the Starlight Delivery Network, a system of connected star systems with warp routes. Each delivery route must take the fewest possible jumps between systems.

## Problem
Given a list of warp connections between star systems and a sequence of delivery queries, compute the minimum number of jumps required to deliver each package. If a destination cannot be reached, report `unreachable`.

## Input
- First line: three integers `N M Q` — number of systems, number of warp routes, and number of queries.
- Next `M` lines: two integers `u v` indicating a bidirectional warp route between systems `u` and `v`.
- Next `Q` lines: two integers `start end` for each delivery query.

Systems are numbered from `1` to `N`.

## Output
For each query, print the fewest warp jumps needed, or `unreachable` if no path exists.

## Constraints
- `2 <= N <= 1000`
- `1 <= M <= 10000`
- `1 <= Q <= 1000`
- Warp routes are bidirectional and there are no duplicate edges.
