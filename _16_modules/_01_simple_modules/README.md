#20201223_0625

https://www.baeldung.com/java-9-modularity

Компиляция:
C:\Work\_github\ocp\_16_understanding_modules\_01_simple_modules\simple-modules>javac -d out --module-source-path src --module hello.modules
C:\Work\_github\ocp\_16_understanding_modules\_01_simple_modules\simple-modules>javac -d out --module-source-path src --module test.app

Запуск:
java --module-path out --module test.app/com.test.Main

Помещение в .jar
jar --create --file hello.modules.jar --test-class com.hello.HelloModules -C out\hello.modules