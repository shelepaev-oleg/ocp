#20211127_0800_101/17
У меня заработало так:
javac -d mods --module-source-path src -m service_provider_interface,service_provider,service_locator,consumer
java --module-path mods -m consumer/c.Main