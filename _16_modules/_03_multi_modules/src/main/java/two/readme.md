#20211010_1428_101/7

Комплиляция
javac -d mods operation/*.java module-info.java

Запуск
java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task

Архивирование
jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .