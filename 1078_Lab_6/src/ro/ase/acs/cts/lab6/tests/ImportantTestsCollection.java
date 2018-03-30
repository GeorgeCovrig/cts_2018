package ro.ase.acs.cts.lab6.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


@IncludeCategory(ImportantTests.class)
@SuiteClasses({ExamTestCase.class, Dummy.class})
@RunWith(Categories.class)
public class ImportantTestsCollection {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
