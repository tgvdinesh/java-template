### About
Java template for the [Mind sport IntelliJ plugin](https://plugins.jetbrains.com/plugin/10688-mind-sport)


## Supported websites

| Website                    | Problem parser | Contest parser |
|----------------------------|----------------|----------------|
| 33OJ                       | ✔              | ✔              |
| A2 Online Judge            | ✔              | ✔              |
| ACMP                       | ✔              |                |
| AcWing                     | ✔              |                |
| Aizu Online Judge          | ✔              |                |
| Algotester                 | ✔              |                |
| AlgoZenith                 | ✔              |                |
| Anarchy Golf               | ✔              |                |
| AtCoder                    | ✔              | ✔              |
| A.Y. Jackson Online Judge  | ✔              | ✔              |
| Baekjoon Online Judge      | ✔              |                |
| BAPS OJ                    | ✔              | ✔              |
| beecrowd                   | ✔              | ✔              |
| Bloomberg CodeCon          | ✔              |                |
| BUCTOJ                     | ✔              | ✔              |
| CodeChef                   | ✔              | ✔              |
| CodeDrills                 | ✔              |                |
| Codeforces                 | ✔              | ✔              |
| CodeMarshal                | ✔              | ✔              |
| CodeRun                    | ✔              | ✔              |
| CodeUp                     | ✔              |                |
| COJ                        | ✔              | ✔              |
| Contest Hunter             | ✔              | ✔              |
| CPython.uz                 | ✔              | ✔              |
| CS Academy                 | ✔              |                |
| CSES                       | ✔              | ✔              |
| CSGOJ                      | ✔              |                |
| CSU-ACM Online Judge       | ✔              | ✔              |
| CYEZOJ                     | ✔              | ✔              |
| Daimayuan Online Judge     | ✔              | ✔              |
| Dimik OJ                   | ✔              |                |
| DMOJ                       | ✔              | ✔              |
| DOMjudge                   |                | ✔              |
| Eolymp                     | ✔              | ✔              |
| ECNU Online Judge          | ✔              | ✔              |
| FZU Online Judge           | ✔              | ✔              |
| Google Coding Competitions | ✔              |                |
| HackerEarth                | ✔              | ✔              |
| HackerRank                 | ✔              | ✔              |
| HDOJ                       | ✔              | ✔              |
| HIT Online Judge           | ✔              |                |
| hihoCoder                  | ✔              | ✔              |
| HKOI Online Judge          | ✔              | ✔              |
| Hrbust Online Judge        | ✔              |                |
| Hydro                      | ✔              | ✔              |
| ICPC Live Archive          | ✔              |                |
| InfoArena                  | ✔              |                |
| ITCoder HUTECH             | ✔              |                |
| Jutge                      | ✔              |                |
| Kattis                     | ✔              | ✔              |
| KEP.uz                     | ✔              | ✔              |
| Kilonova                   | ✔              | ✔              |
| Lanqiao                    | ✔              | ✔              |
| Le Quy Don Online Judge    | ✔              | ✔              |
| Library Checker            | ✔              |                |
| LibreOJ                    | ✔              | ✔              |
| LightOJ                    | ✔              | ✔              |
| LSYOI                      | ✔              |                |
| Luogu                      | ✔              | ✔              |
| MarisaOJ                   | ✔              | ✔              |
| Mendo                      | ✔              |                |
| Meta Coding Competitions   | ✔              |                |
| MOI Arena                  | ✔              | ✔              |
| mrJudge                    | ✔              |                |
| MSK Informatics            | ✔              |                |
| NBUT Online Judge          | ✔              | ✔              |
| Neps Academy               | ✔              |                |
| NerdArena                  | ✔              |                |
| Newton School              | ✔              |                |
| NOJ                        | ✔              | ✔              |
| NowCoder                   | ✔              |                |
| NYTD Online Judge          | ✔              | ✔              |
| oiClass                    | ✔              | ✔              |
| omegaUp                    | ✔              |                |
| OpenJudge                  | ✔              | ✔              |
| OTOG                       | ✔              |                |
| Panda Online Judge         | ✔              |                |
| PBInfo                     | ✔              |                |
| PEG Judge                  | ✔              | ✔              |
| POJ                        | ✔              | ✔              |
| PTA                        | ✔              |                |
| Public Judge               | ✔              | ✔              |
| QBXTOJ                     | ✔              |                |
| QDUOJ                      | ✔              | ✔              |
| QQWhale                    | ✔              |                |
| RoboContest                | ✔              | ✔              |
| SDUT OnlineJudge           | ✔              |                |
| SeriousOJ                  | ✔              | ✔              |
| Sort Me                    | ✔              |                |
| SPOJ                       | ✔              |                |
| SSOIER                     | ✔              |                |
| StarryCoding               | ✔              |                |
| TheJobOverflow             | ✔              |                |
| Timus Online Judge         | ✔              | ✔              |
| TLX                        | ✔              | ✔              |
| Toph                       | ✔              |                |
| uDebug                     | ✔              |                |
| Universal Cup              | ✔              | ✔              |
| UOJ                        | ✔              | ✔              |
| USACO                      | ✔              |                |
| USACO Training             | ✔              |                |
| UVa Online Judge           | ✔              |                |
| Virtual Judge              | ✔              | ✔              |
| VNOI Online Judge          | ✔              | ✔              |
| Yandex                     | ✔              | ✔              |
| XXM                        | ✔              |                |
| X-Camp                     | ✔              |                |
| yukicoder                  | ✔              | ✔              |
| ZOJ                        | ✔              |                |
| ZUFEOJ                     | ✔              | ✔              |

### Screenshot

![Successful run](/img/success-run.png)

### How does it work ?

#### Running with [competitive-companion](https://github.com/jmerle/competitive-companion) browser extension
Like a regular maven project. The plugin will replace the content of io.json file with the sample input and output available. This can be run with `AppTest.runTestCases`.
#### Running custom test case
In case if we want to test with custom input and assert it with custom output then we need to manually paste them in `src/test/resources/input.txt` and `src/test/resources/output.txt` respectively and the run `AppTest.runCustomTestCase`

### Sample question in this program

You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
#### Input
The only input line contains a string of n characters.
#### Output
Print one integer: the length of the longest repetition.
Constraints

1 <= n <= 10^6

#### Example
##### Input:
ATTCGGGA

##### Output:
3

# TODO
 - [ ] Implement [dynamic test](https://dzone.com/articles/junit-5-dynamic-tests-generate-tests-at-run-time)