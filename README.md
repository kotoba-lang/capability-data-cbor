# capability-data-cbor

Atomic authority package for `data/cbor`.

- imports: `#{:cbor-encode}`
- effects: `#{:codec}`
- default policy: `:autonomous`
- semantic definition CID: `bafyreibcxvtartawnqeasi6sblidclt5qimza65zni4p7nsac47s62xjii`
- hash contract CID: `bafkreiflhj3fslsbh7okdas2fzlhmogai64x6p3lkla6gtr7berbp7ftvi`
- provider status: `contract-only`

The repository name is a discovery alias. The semantic definition CID
is the immutable import identity. Importing it does not grant runtime
authority: Tamaki must request it explicitly and Kototama must admit
the sealed envelope.

```sh
clojure -M:test
```
