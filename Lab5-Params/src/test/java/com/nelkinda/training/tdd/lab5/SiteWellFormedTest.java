package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SiteWellFormedTest {
    static Stream<Path> siteFiles() throws IOException {
        return Files.find(
                Path.of("src", "main", "resources", "site"),
                Integer.MAX_VALUE,
                (path, basicFileAttributes) -> path.toString().endsWith(".xhtml")
        );
    }

    @ParameterizedTest
    @MethodSource("siteFiles")
    void siteFileIsValid(final Path path) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        assertTrue(isValid(path));
    }

    static boolean isValid(final Path path) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final DOMImplementationLS domImpl = (DOMImplementationLS) DOMImplementationRegistry.newInstance().getDOMImplementation("LS");
        final LSInput lsInput = domImpl.createLSInput();
        final LSParser lsParser = domImpl.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null);
        lsInput.setSystemId(path.toUri().toString());
        try {
            lsParser.parse(lsInput);
            return true;
        } catch (final Exception e) {
            return false;
        }
    }
}
