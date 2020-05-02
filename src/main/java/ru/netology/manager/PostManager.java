package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    private int [] duo = {0,1};
    private int ownerOnly = 0;
    private int extended = 0;


    public Post[] search(int ownerId, String domain, String query, boolean flagOwnersOnly,int count,boolean flagExtended){
        if (flagExtended)   extended = 1;
        if (flagOwnersOnly)  ownerOnly = 1;
        return null;

    }
    public void delete(int ownerId, int postId){

    }
}
