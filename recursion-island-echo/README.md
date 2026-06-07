# Echo Island

## Story
On Echo Island, the villagers send a chant through a series of enchanted hollows. Each time the chant travels deeper, it echoes back and repeats, building a larger message that carries across the island.

## Problem
Given a starting phrase and a recursion depth, generate the final echoed chant.

The chant is defined recursively:
- `Echo(1) = phrase`
- `Echo(k) = Echo(k-1) + " " + phrase + " " + Echo(k-1)` for `k > 1`

## Input
- First line: a phrase (one line of text).
- Second line: an integer `depth`.

## Output
Print the final echoed chant as a single line.

## Constraints
- `1 <= depth <= 6`
- The phrase contains only printable characters and no leading/trailing whitespace.
- The final output length will fit comfortably within typical contest limits.
