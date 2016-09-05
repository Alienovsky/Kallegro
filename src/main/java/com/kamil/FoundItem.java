package com.kamil;

class FoundItem {
    String id;

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    String content;

    public FoundItem(String id, String content) {
        this.id = id;
        this.content = content;
    }
}
