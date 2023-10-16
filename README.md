<details>
<summary>Assignment_1</summary>
<br>
Write a program in java that should recognize the lexemes (operators) given in the table below and output the correct token name and the attribute value for them:

|Lexeme|Token Name|Attribute Value|
|--|--|--|
|<|RELOP|LT|
|<=|RELOP|LE|
|>|RELOP|GT|
|>=|RELOP|GE|
|<>|RELOP|NE|
|==|RELOP|EQ|

<strong>Sample Input line:</strong>
```
<> >	== ++ <=
```

<strong>Sample output on screen:</strong>
```
<> RELOP NE
> RELOP GT
== RELOP EQ
++ Error Unrecognized Lexeme
<= RELOP LE
```
</details>