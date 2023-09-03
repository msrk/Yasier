package adapter.driver.com;

public class IOSAutomatedAdapter implements MobileAutomatedDriver {
    IOSAutomatedDriver _automated;
    public IOSAutomatedAdapter(IOSAutomatedDriver automated){
        this._automated = automated;
    }
}
