package linkshare

class Resource {
    String description;
    Topic topic;
    Date dateCreated;
    Date lastUpdated;
    static belongsTo = [topic:Topic]
    static hasMany = [read:ReadingItem]
    static constraints = {
    }
}
