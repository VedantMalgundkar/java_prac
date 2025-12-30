import java.util.ArrayList;
import java.util.List;

interface IdocItem {
    public String render();
}

interface Ipersistance {
    public void save(String anyText);
}

class mySqlDb implements Ipersistance {
    public void save(String anyText) {
        System.out.println("Text saved to mysql db");
    }
}

class TextItem implements IdocItem{
    private String text;

    TextItem(String anyText) {
        this.text = anyText;
    }

    public String render() {
        return this.text;
    }
}

class ImageItem implements IdocItem {
    private String text;

    ImageItem(String anyText) {
        this.text = anyText;
    }

    public String render() {
        return "[Image : //"+this.text;
    }
}

class NewLineItem implements IdocItem {
    public String render() {
        return "\n";
    }
}

class Document {
    private List<IdocItem> docs = new ArrayList<>();
    
    public void AddItem (IdocItem anyItem) {
        docs.add(anyItem);
    }

    public String getDocStrings() {
        String document = ""; 
        for (var eachDocItem : this.docs) {
            String eachDocText = eachDocItem.render();
            document += eachDocText;
        }
        return document;
    }

    public void renderDocument() {
        String getDocStrings = this.getDocStrings();
        System.out.println("rendered doc >>>" + getDocStrings);
    }
}

class DocumentEditor {
    Document doc;

    DocumentEditor(Document doc) {
        this.doc = doc;
    }

    public void AddText(String text) {
        this.doc.AddItem(new TextItem(text));
    }
    
    public void AddImage(String text) {
        this.doc.AddItem(new ImageItem(text));
    }

    public void AddNewLine() {
        this.doc.AddItem(new NewLineItem());
    }

    public void render() {
        this.doc.renderDocument();
    }
}

public class DocEditorDesign {

    public static void main(String[] args) {
        Document doc = new Document();
        Ipersistance db = new mySqlDb();

        DocumentEditor docEditor = new DocumentEditor(doc);

        docEditor.AddText("Hi learning system design");
        docEditor.AddNewLine();
        docEditor.AddImage("Parrot image");

        docEditor.render();

        db.save(doc.getDocStrings());
    }
}