package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", propOrder = {
        "result",
        "val2"
})
@XmlRootElement(name = "TestRequestResponse")
public class TestRequestResponse {
   /* @XmlElement(name = "Result")*/
    protected boolean result;
    protected String val2;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }
}
