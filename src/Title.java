public class Title {
    private String title;
    private String rules;

    public Title (String title){
        this.title = title;
    }

    public void setRules(String rules){
        this.rules = "Please type under a 140 characters and feel free to include @, #, and links";

    }

    public String getRules(){
        return rules;
    }

}
