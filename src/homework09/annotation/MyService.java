package homework09.annotation;

@Version(version = "1.1")
public class MyService {

    private String name;
    private String somethingElse;

    public MyService(String name, String somethingElse) {
        this.setVersion(somethingElse);
        this.setCodeName(somethingElse);
    }

    public String getVersion() {
        return name;
    }

    public void setVersion(String version) {
        this.name = version;
    }

    public String getCodeName() {
        return somethingElse;
    }

    public void setCodeName(String codeName) {
        this.somethingElse = codeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyService)) return false;
        MyService service = (MyService) o;
        return ((name == null && service.name == null) || name != null && name.equals(service.name)) && ((somethingElse == null && service.somethingElse == null) || somethingElse != null && somethingElse.equals(service.somethingElse));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (getVersion() == null ? 0 : getVersion().hashCode());
        result = 31 * result + (getCodeName() == null ? 0 : getCodeName().hashCode());
        return result;
    }

    private void thisClassInfo() {
        System.out.println("ClassName: " + this.getClass().getName() + "\n" +
                "Version: " + getVersion() + "\n" +
                "CodeName: " + getCodeName());
    }
}