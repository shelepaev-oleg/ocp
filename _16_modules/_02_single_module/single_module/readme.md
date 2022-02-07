#20211006_0804_101/7

Комплиляция
javac -p mods -d mods a/*.java module-info.java
javac -d mods a/*.java module-info.java

Запуск
java -p mods -m x/a.Main

Архивирование
jar -cvf target/x.jar -C mods/ .