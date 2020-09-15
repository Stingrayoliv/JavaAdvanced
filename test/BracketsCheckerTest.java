import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsCheckerTest {
    @Test
    public void bracketsCheckerTest(){
        BracketsChecker checker = new BracketsChecker();
        assertTrue(checker.test("qw(er)ty"));
        assertTrue(checker.test("qwerty"));
        assertTrue(checker.test("qw((er))ty"));
        assertTrue(checker.test("q{w((er))ty gf}hg"));
        assertTrue(checker.test("q{w((er))ty gf}h[g]"));
        assertTrue(checker.test("q{w((er))ty gf}h[g] [idwg] g{d}s"));
        assertTrue(checker.test(""));
        assertTrue(checker.test("()"));
        assertTrue(checker.test("(hdwshwd)"));

        assertFalse(checker.test(null));
        assertFalse(checker.test("re(iw}ouw"));
        assertFalse(checker.test("re)iwo(uw"));
        assertFalse(checker.test("(re}iw}o)uw"));
        assertFalse(checker.test("(re[iwj}u]w"));
        assertFalse(checker.test("(re[iwj}u]w"));
        assertFalse(checker.test("(r{e[i]w(o)u]w"));
    }

}