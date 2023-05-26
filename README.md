# Кире Лалков 195062 

![CFG_195062](https://github.com/LalkovKire/SI_2023_lab2_195062/assets/103694277/0a33fcd7-75fc-4c00-a3da-46e6410a2c58)

Цикломатската комплексност ја пресметав со формулата\
E - N + 2,  Edges - Nodes + 2. \
Мојот CFG испадна 40 - 31 + 2 = 11.\
Вредностите 40 и 31 ги земав од дијаграмот со select all edges and select all nodes\
Истото може да се заклучи и со бројот на региони кој кај мене се 11.\
\
\
--------------------------------------------------------\
Every branch за да ги помине сите ребра користам 5 test cases.\
Test - 1) Кога user = null\
Test - 2) Кога username на user е null,емаилот содржи @ и лозинката има празно место\
Test - 3) Лозинката е помала од 8 карактери, username е соодветен, емаил е соодветен\
Test - 4) Емаилот нема @ и лозинката нема специјален карактер\
Test - 5) Корисникот има соодветна лозинка и username, валидиран\

| Every branch  | Test - 1    | Test - 2    | Test - 3    | Test - 4    | Test - 4    | 
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
| 13 - 15       |             | *           |             |             | *           |
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


                        
