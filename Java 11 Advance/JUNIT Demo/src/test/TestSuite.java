package test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ BoothValidatorTest.class, VoterValidatorTest.class })
@ExcludeTags("dev")
public class TestSuite {

}
