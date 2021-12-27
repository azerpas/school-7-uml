import java.util.List;

public class Ev {
    public String os;
    public List<String> tools;
    public boolean isRunning;

    public Ev() {
    }

    public Ev(String os, List<String> tools, boolean isRunning) {
        this.os = os;
        this.tools = tools;
        this.isRunning = isRunning;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public List<String> getTools() {
        return this.tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public boolean isIsRunning() {
        return this.isRunning;
    }

    public boolean getIsRunning() {
        return this.isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public Ev os(String os) {
        setOs(os);
        return this;
    }

    public Ev tools(List<String> tools) {
        setTools(tools);
        return this;
    }

    public Ev isRunning(boolean isRunning) {
        setIsRunning(isRunning);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ev)) {
            return false;
        }
        Ev ev = (Ev) o;
        return Objects.equals(os, ev.os) && Objects.equals(tools, ev.tools) && isRunning == ev.isRunning;
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, tools, isRunning);
    }

    @Override
    public String toString() {
        return "{" +
            " os='" + getOs() + "'" +
            ", tools='" + getTools() + "'" +
            ", isRunning='" + isIsRunning() + "'" +
            "}";
    }
}
