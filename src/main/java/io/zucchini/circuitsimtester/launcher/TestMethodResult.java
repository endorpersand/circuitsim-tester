package io.zucchini.circuitsimtester.launcher;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.support.descriptor.MethodSource;
import org.junit.platform.launcher.TestIdentifier;

public class TestMethodResult implements Comparable<TestMethodResult> {
    private TestIdentifier id;
    private MethodSource source;
    private TestExecutionResult result;

    public TestMethodResult(TestIdentifier id,
                            MethodSource source,
                            TestExecutionResult result) {
        this.id = id;
        this.source = source;
        this.result = result;
    }

    public TestIdentifier getId() { return id; }
    public MethodSource getSource() { return source; }
    public TestExecutionResult getResult() { return result; }

    @Override
    public int compareTo(TestMethodResult other) {
        return id.getDisplayName().compareTo(other.id.getDisplayName());
    }
}
