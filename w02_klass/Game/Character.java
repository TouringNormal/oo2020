/**
 * Character
 */
public class Character {

    private int x;
    private int y;

    private String name;
    private CharacterType characterType;
    private Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;

    }
}