#20210806_0626_4/11

```javac packagea/ClassA.java packageb/ClassB.java```

```javac packagea/*.java packageb/*.java```

-d classes - директория, в которую складываем

```javac -d classes packagea/ClassA.java packageb/ClassB.java```

```jar -cvf myNewFile.jar -C classes .```