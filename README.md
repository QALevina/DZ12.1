# Задание 1. Менеджер Афиши (обязательное к выполнению)

Вам необходимо реализовать менеджер Афиши для фильмов. В качестве объекта фильма можно взять объект строки (название фильма) или создать свой дата-класс.

![image](https://user-images.githubusercontent.com/53707586/152697921-e71d853c-aa2e-482b-be61-39e6c2cfb0b1.png)

В этой задаче не нужно разделять менеджер и репозиторий - все фильмы должны храниться внутри массива в поле самого менеджера. Изначально, сразу после создания, менеджер не должен содержать фильмов. 

Менеджер должен уметь выполнять следующие операции:
1. Добавление нового фильма.
2. Вывод всех фильмов в порядке добавления (`findAll`)
3. Вывод максимум лимит* последних добавленных фильмов в обратном от добавления порядке (`findLast`)

*Сделайте так, чтобы по умолчанию выводилось последние 10 добавленных фильмов, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 5 (а не 10). Т.е. у вас у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 10, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.
