#20211006_0804_101/5

Комплиляция
javac --module-path mods -d feeding zoo/animal/feeding/*.java module-info.java

Запуск
java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task

Архивирование
jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .