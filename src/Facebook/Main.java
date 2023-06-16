package Facebook;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Account {
    String id;
    String email;
    String password;
    String phone;
    Status status;
}

class Profile {

    String name;
    Date dateOfBirth;
    String city;
    String country;
    String profilePicUrl;
    String coverPicUrl;
    Gender gender;
    private List<Work> workExperiences;
    private List<Education> educations;
    private List<Place> places;
    public boolean addWorkExperience(Work work){};
    public boolean addEducation(Education education){};
    public boolean addPlace(Place place){};
}
class Work {
    private String title; private String company; private String location; private Date from;private Date to;
    private String description;
}
enum Gender {
    MALE,FEMALE, OTHERS
}
enum Status {
    ACTIVE,
    INACTIVE;
}

class Member {
    private Integer memberId;
    private Date dateOfMembership;
     String name;
    private Profile profile;
    private Account account;
    private HashSet<Integer> memberFollows;
    private HashSet<Integer> memberConnections;
    private HashSet<Integer> pageFollows;
    private HashSet<Integer> memberSuggestions;
    private HashSet<ConnectionInvitation> connectionInvitations; private HashSet<Integer> groupFollows;
    public boolean sendMessage(Message message){};
    public boolean createPost(Post post){};
    public boolean sendConnectionInvitation(ConnectionInvitation invitation){};
    private Map<Integer, Integer> searchMemberSuggestions(){};
    List<Feed> feeds;
    public void addFeed() {

    }

}


class ConnectionInvitation {
    private Member memberInvited;
    private ConnectionInvitationStatus status;
    private Date dateCreated;
    private Date dateUpdated;
    public boolean acceptConnection(){};
    public boolean rejectConnection(){};
}

class Post {
    private String postId;
    private String text;
    String picUrl;
    String videoUrl;
    List<Likes> likes;
    List<Shares> shares;
    List<Comment> comments;
    private Member owner;
}
class Comment {
    String commentId;
    String text;
    Date createdAt;
    Date updatedAt;
    Member member;
    List<Likes> likes;
}
class Likes {
    String id;
    Date createdAt;
    Member member;
}
class Shares {
    String shareId;
    Member member;
    Date createdAt;
}
class Message { }

interface Search {
    List<Member> searchMember(String name);
    //public List<Group> searchGroup(String name);
    //public List<Page> searchPage(String name);
    List<Post> searchPost(String word);
}

class SearchIndex implements Search {
    HashMap<String, List<Member>> memberNames;
    //HashMap<String, List<Group>> groupNames;
    //HashMap<String, List<Page>> pageTitles;
    HashMap<String, List<Post>> posts;

    public boolean addMember(Member member) {
        if (memberNames.containsKey(member.getName())) {
            memberNames.get(member.getName()).add(member);
        } else {
            memberNames.put(member.getName(), member);
        }
    }
    public boolean addPost(Post post){};

    public List<Member> searchMember(String name) {
        return memberNames.get(name);
    }
    public List<Post> searchPost(String word) {
        return posts.get(word);
    }
}