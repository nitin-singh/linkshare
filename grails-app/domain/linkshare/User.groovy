package linkshare

class User {
String email
    String username
    String password
    String firstName
    String LastName
    Byte[] photo
    Boolean Admin
    Boolean Active
    Date DateCreated
    Date LastUpdated
    static hasMany = [resource:Resource,topic:Topic,subcription:Subscription]
    static constraints = {
        photo nullable: true
    }
}
