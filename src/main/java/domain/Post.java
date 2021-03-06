package domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private String authorAvatar;
    private int date;
    private String text;
    private String imageUrl;
    private String url;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private CommentsInfo commentsInfo;
    private Donut donut;
    private Geo geo;
    private PlaceHolder placeHolder;
    private PostLikeLine postLikeLine;
    private PostSource postSource;
    private Repost repost;
    private Views views;

     // + getters/setters
}
