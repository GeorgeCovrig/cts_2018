package ro.ase.cts.acs.course6.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@IncludeCategory({CategorieTesteImportante.class,CategorieTesteObligatorii.class})
@SuiteClasses({TestCaseMathLibrary.class,TestCaseStudent.class})
@RunWith(Categories.class)
public class TestSuiteTotalPartial {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
