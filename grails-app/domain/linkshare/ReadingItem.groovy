package linkshare

class ReadingItem {
    static belongsTo = [resource:Resource,user:User]
    Boolean isRead
    static constraints = {
    }
}
