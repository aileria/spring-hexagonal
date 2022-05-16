package com.aitorleria.springhexagonal;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "com.aitorleria.springhexagonal.modules")
public class HexagonalArchitectureTest {

    @ArchTest
    static final ArchRule hexagonal_architecture_respected = onionArchitecture()
            .domainModels("..domain.model..")
            .domainServices("..domain.service..")
            .applicationServices("..application..")
            .adapter("rest", "..adapter.in..")
            .adapter("persistence", "..adapter.out..");
}
