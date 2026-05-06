# Keystone Svc Auth Forge Walkthrough

I use this file as a small checklist before changing the Kotlin implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 228 | ship |
| stress | retry load | 191 | ship |
| edge | worker slack | 142 | ship |
| recovery | session drift | 210 | ship |
| stale | queue pressure | 199 | ship |

Start with `baseline` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around retry load and session drift.
