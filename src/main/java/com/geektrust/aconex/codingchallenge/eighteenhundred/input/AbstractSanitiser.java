package com.geektrust.aconex.codingchallenge.eighteenhundred.input;

import java.util.Optional;
import java.util.logging.Logger;

abstract class AbstractSanitiser implements Sanitiser {

    private final static Logger LOGGER = Logger.getLogger(AbstractSanitiser.class.getName());

    private static final String PUNCTUATION = "\\p{Punct}";
    private static final String WHITESPACE = "\\s";

    String sanitiseGeneric(String s) {
        // All sanitisers should remove punctuation and whitespace, according to challenge.
        return s.replaceAll(PUNCTUATION, "").replaceAll(WHITESPACE, "");
    }

    Optional<String> wrapOptional(String original, String sanitised, String matcher) {
        if (!sanitised.matches(matcher)) {
            LOGGER.warning("Could not sanitise input: " + original + "; best shot: " + sanitised);
            return Optional.empty();
        }
        return Optional.of(sanitised);
    }

}
