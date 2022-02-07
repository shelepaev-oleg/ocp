module hello.modules {
    exports com.hello;
    provides com.hello.HelloInterface with com.hello.HelloModules;
}