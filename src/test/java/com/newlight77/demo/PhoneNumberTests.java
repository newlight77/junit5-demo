package com.newlight77.demo;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class PhoneNumberTests {

    @Test
    void succeedingTest() throws NumberParseException {
        String numberStr = "+33605040302";
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        Phonenumber.PhoneNumber number = phoneUtil.parse(numberStr, "FR");
        boolean isValid = phoneUtil.isValidNumber(number); // returns true
        String result = phoneUtil.format(number, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);

        assertTrue(isValid);
        assertEquals("06 05 04 03 02", result);
    }

}
