package test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses( { EmailValidatorTest.class, PasswordValidatorTest.class } )
public class TestSuite {

}