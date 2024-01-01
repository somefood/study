package me.somefood.tobyspring;

import org.springframework.stereotype.Service;

@Service
public class SimpleHelloService implements HelloService {

    private final HelloRepository helloRepository;

    public SimpleHelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String sayHello(String name) {
        this.helloRepository.increase(name);

        return "Hello " + name;
    }

    @Override
    public int countOf(String name) {
        return helloRepository.countOf(name);
    }
}
