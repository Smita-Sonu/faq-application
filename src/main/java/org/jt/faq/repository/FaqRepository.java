package org.jt.faq.repository;

import org.jt.faq.model.Faq;

public class FaqRepository {
    public Faq getQuestion1() {
        var faq = new Faq();
        faq.setQuestion("What is Spring Framework?");
        faq.setAnswer(
                "Spring Framework is a comprehensive framework for enterprise Java development. It provides support for dependency injection, aspect-oriented programming, transaction management, and more. It helps in building robust and scalable applications with ease.");

        return faq;
    }

    public Faq getQuestion2() {
        var faq = new Faq();
        faq.setQuestion("What are the core features of Spring?");
        faq.setAnswer(
                "The core features of Spring include Dependency Injection (DI), Aspect-Oriented Programming (AOP), Transaction Management, Spring MVC for web applications, and integration with various other technologies like Hibernate and JPA.");

        return faq;
    }

    public Faq getQuestion3() {
        var faq = new Faq();
        faq.setQuestion("What is Dependency Injection?");
        faq.setAnswer(
                "Dependency Injection (DI) is a design pattern used to implement Inversion of Control (IoC). It allows objects to be created and injected into other objects, thus promoting loose coupling and making the code more modular and testable.");

        return faq;
    }

    public Faq getQuestion4() {
        var faq = new Faq();
        faq.setQuestion("What is Aspect-Oriented Programming (AOP) in Spring?");
        faq.setAnswer(
                "Aspect-Oriented Programming (AOP) is a programming paradigm that provides a way to modularize cross-cutting concerns (like logging or transaction management) by defining aspects. Spring AOP allows you to define aspects and apply them to your codebase in a clean and modular way.");

        return faq;
    }

    public Faq getQuestion5() {
        var faq = new Faq();
        faq.setQuestion("How does Spring manage transactions?");
        faq.setAnswer(
                "Spring provides a consistent programming model for transaction management. It supports both programmatic and declarative transaction management. The declarative approach, using annotations like @Transactional, simplifies the management of transactions, ensuring that they are handled correctly and consistently across your application.");
        return faq;

    }
}
