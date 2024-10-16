class Character {
    private char value;
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void render(int x, int y) {
        System.out.println("Rendering character '" + value + "' at (" + x + "," + y + ") with font: " + font + ", size: " + size);
    }
}

class CharacterFactory {
    private java.util.Map<String, Character> characterMap = new java.util.HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;
        Character character = characterMap.get(key);

        if (character == null) {
            character = new Character(value, font, size);
            characterMap.put(key, character);
        }

        return character;
    }
}

class TextEditor {
    private java.util.List<Character> characters = new java.util.ArrayList<>();
    private CharacterFactory characterFactory = new CharacterFactory();

    public void insertText(String text, String font, int size) {
        for (int i = 0; i < text.length(); i++) {
            Character character = characterFactory.getCharacter(text.charAt(i), font, size);
            characters.add(character);
        }
    }

    public void renderText() {
        int x = 0, y = 0;
        for (Character character : characters) {
            character.render(x++, y);
        }
    }
}

class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.insertText("Hello World", "Arial", 12);
        editor.insertText("Flyweight Pattern", "Arial", 12);
        editor.renderText();
    }
}
