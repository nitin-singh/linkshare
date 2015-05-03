package linkshare

class Topic {
     String name;
    static belongsTo=[user:User]
    Date dateCreated
    Date lastUpdated
    //Visibility visibility
    static hasMany = [resource:Resource,sub:Subscription]
static constraints = {
    }
}
