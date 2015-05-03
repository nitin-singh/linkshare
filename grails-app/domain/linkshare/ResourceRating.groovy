package linkshare

class ResourceRating {
static belongsTo = [resource:Resource,user:User]
    int score
    static constraints = {
    }
}
