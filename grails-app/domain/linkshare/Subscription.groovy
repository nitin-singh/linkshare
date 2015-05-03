package linkshare

class Subscription {
 Date dateCreated
    static belongsTo = [topic:Topic,user:User]
    static constraints = {
    }
}
