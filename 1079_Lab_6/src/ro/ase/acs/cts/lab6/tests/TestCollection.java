package ro.ase.acs.cts.lab6.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@IncludeCategory(ImportantTestCategory.class)
@SuiteClasses(
		{StudentTestCase.class}
		)
public class TestCollection {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public void testCollection() {
		fail("Not yet implemented");
	}

}
