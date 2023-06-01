# Кире Лалков 195062 

## Control flow graph 
![CFG_195062](https://github.com/LalkovKire/SI_2023_lab2_195062/assets/103694277/64ebc6e4-ff6a-4377-b211-96a4840fae9c)


Цикломатската комплексност ја пресметав со формулата\
E - N + 2,  Edges - Nodes + 2. \
Мојот CFG испадна 40 - 31 + 2 = 11.\
Вредностите 40 и 31 ги земав од дијаграмот со select all edges and select all nodes\
Истото може да се заклучи и со бројот на региони кој кај мене се 11.\


## Every branch 
Every branch за да ги помине сите ребра користам 5 test cases.\
Имаме 3 returns и 1 exception каде што кај последниот return имаме гранење така што 
потребни се минимум барем 5 test cases.<br \>
Test - 1) Кога user = null\
Test - 2) Кога username на user е null,емаилот е соодветен,го има во листата, но username не му e еднаков и не влева во вториот if, лозинката има празно место\
Test - 3) Лозинката е помала од 8 карактери, username е соодветен, емаил е соодветен\
Test - 4) Соодветен username, емаилот нема @ и лозинката нема специјален карактер\
Test - 5) Корисникот има соодветна лозинка, username и емаил, валидиран\

| Every branch  | Test - 1    | Test - 2    | Test - 3    | Test - 4    | Test - 5    | 
| ------------- |:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|
| 1,2 - 4       |             | *           | *           | *           | *           |
| 1,2 - 3       | *           |             |             |             |             |
| 3 - 28        | *           |             |             |             |             |
| 4 - 5         |             | *           |             |             |             |
| 4 - 6         |             |             | *           | *           | *           |
| 5 - 6         |             | *           |             |             |             |
| 6 - 7         |             | *           | *           | *           | *           |
| 7 - 8         |             | *           | *           |             | *           |
| 7 - 16        |             |             |             | *           |             |
| 8 - 9.1       |             | *           | *           |             | *           |
| 9.1 - 9.2     |             | *           | *           |             | *           |
| 9.2 - 16      |             | *           | *           |             | *           |
| 9.2 - 10      |             | *           | *           |             | *           |
| 10 - 11       |             | *           | *           |             | *           |
| 11 - 12       |             | *           | *           |             |             |
| 11 - 13       |             |             | *           |             | *           |
| 12 - 13       |             | *           | *           |             |             |
| 13 - 14       |             |             | *           |             |             |
| 13 - 15       |             | *           | *           |             | *           |
| 14 - 15       |             |             | *           |             |             |
| 15 - 9.3      |             | *           | *           |             | *           |
| 9.3 - 9.2     |             | *           | *           |             | *           |
| 16 - 17       |             | *           | *           | *           | *           |
| 17 - 18       |             | *           | *           | *           | *           |
| 18 - 19       |             | *           | *           | *           | *           |
| 19 - 20       |             |             | *           |             |             |
| 20 - 28       |             |             | *           |             |             |
| 19 - 21       |             | *           |             | *           | *           |
| 21 - 22       |             | *           |             | *           | *           |
| 22 - 23.1     |             |             |             | *           | *           |
| 22 - 27       |             | *           |             |             |             |
| 27 - 28       |             | *           |             | *           |             |
| 23.1 - 23.2   |             |             |             | *           | *           |
| 23.2 - 24     |             |             |             | *           | *           |
| 23.2 - 27     |             |             |             | *           |             |
| 24 - 25       |             |             |             |             | *           |
| 24 - 26       |             |             |             | *           |             |
| 25 - 28       |             |             |             |             | *           |
| 26 - 23.3     |             |             |             | *           |             |
| 23.3 - 23.2   |             |             |             | *           |             |

## Multiple condition 
Ги тестираме сите можни случаеви кога може да влеземе во if statement. 
if (user==null || user.getPassword()==null || user.getEmail()==null).\
Test case 1 - T : X : X -> user = null, password and email irrelevant.\
Test case 2 - F : T : X -> user = not null, password = null, email irrelevant.\\
\
Test case 3 - F : F : T -> user = not null, password = not null, email = null.\
Test case 4 - F : F : F -> user = not null, password = not null, email = not null.\

## Unit testing 
Напишав 2 тестови соодветни за двете критериуми. Направив една празна една полна листа.
Everybranch method беше по грубен и потежок за разлика од multiple condition. Користев 
воглавно assertTrue and assertFalse пошто функцијата враќа boolean. 









