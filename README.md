# keystone-svc-auth-forge

`keystone-svc-auth-forge` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for auth systems, covering security rule linting, safe and unsafe fixtures, and failure-oriented tests.

## Why This Exists

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Keystone Svc Auth Forge Review Notes

For a quick review, compare `queue pressure` with `worker slack` before reading the middle cases.

## Capabilities

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/keystone-svc-auth-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `worker slack`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Shape

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin implementation avoids hidden state so fixture changes are easy to reason about.

## Local Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Verification

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Roadmap

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
