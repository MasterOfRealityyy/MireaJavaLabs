package ru.mirea.lab24.exs3;



interface IDocument {
    void open();
    void save();
}


interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}


public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening text document");

    }

    @Override
    public void save() {
        System.out.println("Saving text document");

    }
}


class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}


class EditorApp {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApp(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document to save.");
        }
    }
}