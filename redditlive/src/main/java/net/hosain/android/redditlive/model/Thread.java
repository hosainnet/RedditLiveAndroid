package net.hosain.android.redditlive.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Thread {
    @SerializedName("_id")
    private String id;
    @SerializedName("kind")
    private String kind;

    @SerializedName("data")
    private ThreadData threadData;

    public void setId(String id) {
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setThreadData(ThreadData threadData) {
        this.threadData = threadData;
    }

    public String getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    public ThreadData getThreadData() {
        return threadData;
    }

    private static class ThreadData {
        @SerializedName("domain")
        private String domain;
        @SerializedName("banned_by")
        private Object bannedBy;

        @SerializedName("media_embed")
        private MediaEmbedEntity mediaEmbed;
        @SerializedName("subreddit")
        private String subreddit;
        @SerializedName("selftext_html")
        private Object selftextHtml;
        @SerializedName("selftext")
        private String selftext;
        @SerializedName("likes")
        private Object likes;
        @SerializedName("suggested_sort")
        private Object suggestedSort;

        @SerializedName("secure_media")
        private SecureMediaEntity secureMedia;
        @SerializedName("link_flair_text")
        private Object linkFlairText;
        @SerializedName("id")
        private String id;
        @SerializedName("from_kind")
        private Object fromKind;
        @SerializedName("gilded")
        private int gilded;
        @SerializedName("archived")
        private boolean archived;
        @SerializedName("clicked")
        private boolean clicked;
        @SerializedName("report_reasons")
        private Object reportReasons;
        @SerializedName("author")
        private String author;

        @SerializedName("media")
        private MediaEntity media;
        @SerializedName("score")
        private int score;
        @SerializedName("approved_by")
        private Object approvedBy;
        @SerializedName("over_18")
        private boolean over18;
        @SerializedName("hidden")
        private boolean hidden;
        @SerializedName("preview")
        private PreviewEntity preview;
        @SerializedName("num_comments")
        private int numComments;
        @SerializedName("thumbnail")
        private String thumbnail;
        @SerializedName("subreddit_id")
        private String subredditId;
        @SerializedName("hide_score")
        private boolean hideScore;
        @SerializedName("edited")
        private boolean edited;
        @SerializedName("link_flair_css_class")
        private Object linkFlairCssClass;
        @SerializedName("author_flair_css_class")
        private String authorFlairCssClass;
        @SerializedName("downs")
        private int downs;

        @SerializedName("secure_media_embed")
        private SecureMediaEmbedEntity secureMediaEmbed;
        @SerializedName("saved")
        private boolean saved;
        @SerializedName("removal_reason")
        private Object removalReason;
        @SerializedName("post_hint")
        private String postHint;
        @SerializedName("stickied")
        private boolean stickied;
        @SerializedName("from")
        private Object from;
        @SerializedName("is_self")
        private boolean isSelf;
        @SerializedName("from_id")
        private Object fromId;
        @SerializedName("permalink")
        private String permalink;
        @SerializedName("locked")
        private boolean locked;
        @SerializedName("name")
        private String name;
        @SerializedName("created")
        private int created;
        @SerializedName("url")
        private String url;
        @SerializedName("author_flair_text")
        private String authorFlairText;
        @SerializedName("quarantine")
        private boolean quarantine;
        @SerializedName("title")
        private String title;
        @SerializedName("created_utc")
        private int createdUtc;
        @SerializedName("distinguished")
        private Object distinguished;
        @SerializedName("visited")
        private boolean visited;
        @SerializedName("num_reports")
        private Object numReports;
        @SerializedName("ups")
        private int ups;
        @SerializedName("user_reports")
        private List<?> userReports;
        @SerializedName("mod_reports")
        private List<?> modReports;

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public void setBannedBy(Object bannedBy) {
            this.bannedBy = bannedBy;
        }

        public void setMediaEmbed(MediaEmbedEntity mediaEmbed) {
            this.mediaEmbed = mediaEmbed;
        }

        public void setSubreddit(String subreddit) {
            this.subreddit = subreddit;
        }

        public void setSelftextHtml(Object selftextHtml) {
            this.selftextHtml = selftextHtml;
        }

        public void setSelftext(String selftext) {
            this.selftext = selftext;
        }

        public void setLikes(Object likes) {
            this.likes = likes;
        }

        public void setSuggestedSort(Object suggestedSort) {
            this.suggestedSort = suggestedSort;
        }

        public void setSecureMedia(SecureMediaEntity secureMedia) {
            this.secureMedia = secureMedia;
        }

        public void setLinkFlairText(Object linkFlairText) {
            this.linkFlairText = linkFlairText;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setFromKind(Object fromKind) {
            this.fromKind = fromKind;
        }

        public void setGilded(int gilded) {
            this.gilded = gilded;
        }

        public void setArchived(boolean archived) {
            this.archived = archived;
        }

        public void setClicked(boolean clicked) {
            this.clicked = clicked;
        }

        public void setReportReasons(Object reportReasons) {
            this.reportReasons = reportReasons;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setMedia(MediaEntity media) {
            this.media = media;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setApprovedBy(Object approvedBy) {
            this.approvedBy = approvedBy;
        }

        public void setOver18(boolean over18) {
            this.over18 = over18;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }

        public void setPreview(PreviewEntity preview) {
            this.preview = preview;
        }

        public void setNumComments(int numComments) {
            this.numComments = numComments;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public void setSubredditId(String subredditId) {
            this.subredditId = subredditId;
        }

        public void setHideScore(boolean hideScore) {
            this.hideScore = hideScore;
        }

        public void setEdited(boolean edited) {
            this.edited = edited;
        }

        public void setLinkFlairCssClass(Object linkFlairCssClass) {
            this.linkFlairCssClass = linkFlairCssClass;
        }

        public void setAuthorFlairCssClass(String authorFlairCssClass) {
            this.authorFlairCssClass = authorFlairCssClass;
        }

        public void setDowns(int downs) {
            this.downs = downs;
        }

        public void setSecureMediaEmbed(SecureMediaEmbedEntity secureMediaEmbed) {
            this.secureMediaEmbed = secureMediaEmbed;
        }

        public void setSaved(boolean saved) {
            this.saved = saved;
        }

        public void setRemovalReason(Object removalReason) {
            this.removalReason = removalReason;
        }

        public void setPostHint(String postHint) {
            this.postHint = postHint;
        }

        public void setStickied(boolean stickied) {
            this.stickied = stickied;
        }

        public void setFrom(Object from) {
            this.from = from;
        }

        public void setIsSelf(boolean isSelf) {
            this.isSelf = isSelf;
        }

        public void setFromId(Object fromId) {
            this.fromId = fromId;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public void setLocked(boolean locked) {
            this.locked = locked;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCreated(int created) {
            this.created = created;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setAuthorFlairText(String authorFlairText) {
            this.authorFlairText = authorFlairText;
        }

        public void setQuarantine(boolean quarantine) {
            this.quarantine = quarantine;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCreatedUtc(int createdUtc) {
            this.createdUtc = createdUtc;
        }

        public void setDistinguished(Object distinguished) {
            this.distinguished = distinguished;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public void setNumReports(Object numReports) {
            this.numReports = numReports;
        }

        public void setUps(int ups) {
            this.ups = ups;
        }

        public void setUserReports(List<?> userReports) {
            this.userReports = userReports;
        }

        public void setModReports(List<?> modReports) {
            this.modReports = modReports;
        }

        public String getDomain() {
            return domain;
        }

        public Object getBannedBy() {
            return bannedBy;
        }

        public MediaEmbedEntity getMediaEmbed() {
            return mediaEmbed;
        }

        public String getSubreddit() {
            return subreddit;
        }

        public Object getSelftextHtml() {
            return selftextHtml;
        }

        public String getSelftext() {
            return selftext;
        }

        public Object getLikes() {
            return likes;
        }

        public Object getSuggestedSort() {
            return suggestedSort;
        }

        public SecureMediaEntity getSecureMedia() {
            return secureMedia;
        }

        public Object getLinkFlairText() {
            return linkFlairText;
        }

        public String getId() {
            return id;
        }

        public Object getFromKind() {
            return fromKind;
        }

        public int getGilded() {
            return gilded;
        }

        public boolean isArchived() {
            return archived;
        }

        public boolean isClicked() {
            return clicked;
        }

        public Object getReportReasons() {
            return reportReasons;
        }

        public String getAuthor() {
            return author;
        }

        public MediaEntity getMedia() {
            return media;
        }

        public int getScore() {
            return score;
        }

        public Object getApprovedBy() {
            return approvedBy;
        }

        public boolean isOver18() {
            return over18;
        }

        public boolean isHidden() {
            return hidden;
        }

        public PreviewEntity getPreview() {
            return preview;
        }

        public int getNumComments() {
            return numComments;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public String getSubredditId() {
            return subredditId;
        }

        public boolean isHideScore() {
            return hideScore;
        }

        public boolean isEdited() {
            return edited;
        }

        public Object getLinkFlairCssClass() {
            return linkFlairCssClass;
        }

        public String getAuthorFlairCssClass() {
            return authorFlairCssClass;
        }

        public int getDowns() {
            return downs;
        }

        public SecureMediaEmbedEntity getSecureMediaEmbed() {
            return secureMediaEmbed;
        }

        public boolean isSaved() {
            return saved;
        }

        public Object getRemovalReason() {
            return removalReason;
        }

        public String getPostHint() {
            return postHint;
        }

        public boolean isStickied() {
            return stickied;
        }

        public Object getFrom() {
            return from;
        }

        public boolean isIsSelf() {
            return isSelf;
        }

        public Object getFromId() {
            return fromId;
        }

        public String getPermalink() {
            return permalink;
        }

        public boolean isLocked() {
            return locked;
        }

        public String getName() {
            return name;
        }

        public int getCreated() {
            return created;
        }

        public String getUrl() {
            return url;
        }

        public String getAuthorFlairText() {
            return authorFlairText;
        }

        public boolean isQuarantine() {
            return quarantine;
        }

        public String getTitle() {
            return title;
        }

        public int getCreatedUtc() {
            return createdUtc;
        }

        public Object getDistinguished() {
            return distinguished;
        }

        public boolean isVisited() {
            return visited;
        }

        public Object getNumReports() {
            return numReports;
        }

        public int getUps() {
            return ups;
        }

        public List<?> getUserReports() {
            return userReports;
        }

        public List<?> getModReports() {
            return modReports;
        }

        private static class MediaEmbedEntity {
            @SerializedName("content")
            private String content;
            @SerializedName("width")
            private int width;
            @SerializedName("scrolling")
            private boolean scrolling;
            @SerializedName("height")
            private int height;

            public void setContent(String content) {
                this.content = content;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public void setScrolling(boolean scrolling) {
                this.scrolling = scrolling;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getContent() {
                return content;
            }

            public int getWidth() {
                return width;
            }

            public boolean isScrolling() {
                return scrolling;
            }

            public int getHeight() {
                return height;
            }
        }

        private static class SecureMediaEntity {
            @SerializedName("event_id")
            private String eventId;
            @SerializedName("type")
            private String type;

            public void setEventId(String eventId) {
                this.eventId = eventId;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getEventId() {
                return eventId;
            }

            public String getType() {
                return type;
            }
        }

        private static class MediaEntity {
            @SerializedName("event_id")
            private String eventId;
            @SerializedName("type")
            private String type;

            public void setEventId(String eventId) {
                this.eventId = eventId;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getEventId() {
                return eventId;
            }

            public String getType() {
                return type;
            }
        }

        private static class PreviewEntity {

            @SerializedName("images")
            private List<ImagesEntity> images;

            public void setImages(List<ImagesEntity> images) {
                this.images = images;
            }

            public List<ImagesEntity> getImages() {
                return images;
            }

            private static class ImagesEntity {

                @SerializedName("source")
                private SourceEntity source;
                @SerializedName("id")
                private String id;

                @SerializedName("resolutions")
                private List<ResolutionsEntity> resolutions;

                public void setSource(SourceEntity source) {
                    this.source = source;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public void setResolutions(List<ResolutionsEntity> resolutions) {
                    this.resolutions = resolutions;
                }

                public SourceEntity getSource() {
                    return source;
                }

                public String getId() {
                    return id;
                }

                public List<ResolutionsEntity> getResolutions() {
                    return resolutions;
                }

                private static class SourceEntity {
                    @SerializedName("url")
                    private String url;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public int getHeight() {
                        return height;
                    }
                }

                private static class ResolutionsEntity {
                    @SerializedName("url")
                    private String url;
                    @SerializedName("width")
                    private int width;
                    @SerializedName("height")
                    private int height;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public int getHeight() {
                        return height;
                    }
                }
            }
        }

        private static class SecureMediaEmbedEntity {
            @SerializedName("content")
            private String content;
            @SerializedName("width")
            private int width;
            @SerializedName("scrolling")
            private boolean scrolling;
            @SerializedName("height")
            private int height;

            public void setContent(String content) {
                this.content = content;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public void setScrolling(boolean scrolling) {
                this.scrolling = scrolling;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getContent() {
                return content;
            }

            public int getWidth() {
                return width;
            }

            public boolean isScrolling() {
                return scrolling;
            }

            public int getHeight() {
                return height;
            }
        }
    }
}