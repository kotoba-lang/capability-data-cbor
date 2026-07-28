# capability-data-cbor

Atomic authority package for `data/cbor`.

- imports: `#{:cbor-encode}`
- effects: `#{:codec}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
