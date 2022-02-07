#20211014_0745_101/9

У меня заработало так:
javac -d mods --module-source-path src -m donor,implement,recipient
java --module-path mods -m recipient/r.Main


#20211018_0631_101/10
# Информация о модуле:
java -p mods --describe-module donor

# Вывод информации о запускаемых модулях:
java --show-module-resolution -p mods -m recipient/r.Main

# Вывод информации о скомпилированных модулях:
jar -cvf mods/donor.jar -C mods/donor/ .
jar -f mods/donor.jar -d
jar --file mods/donor.jar --describe-module

# Информация о зависимостях модуля
jdeps -s mods/donor.jar
jdeps -summary mods/donor.jar
jdeps mods/donor.jar
jdeps -p mods -s mods/donor.jar