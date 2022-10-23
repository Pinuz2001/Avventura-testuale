package type;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Command {

    private final CommandType type;
    private final String name;

    private Set<String> alias;
    
    public void Command(CommandType type, String name){
        this.type = type;
        this.name = name;
    }

    public void Command(CommandType type, String name, Set<String> alias){
        this.type = type;
        this.name = name;
        this.alias = alias;
    }
    
    public String getName(){
        return name;
    }

    public Set<String> getAlias(){
        return alias;
    }

    public void setAlias(Set<String> alias){
        this.alias = alias;
    }

    public void setAlias(String[] alias){
        this.alias = new HashSet<>(Arrays.asList(alias));  
    }

    public CommandType getType(){
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Command other = (Command) obj;
        if (this.type != other.type) {
            return false;
        }
        return true;
    }
}
