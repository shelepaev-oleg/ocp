module service_provider {
    requires service_provider_interface;
    provides i.Interface with p.InterfaceImpl;
}