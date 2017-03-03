package test

class AbstractStuffController {

    static namespace = "main"

    def index() {
        def abstractStuffList = AbstractStuff.findAll()

        abstractStuffList.each {
            println g.createLink(resource: it, action: "edit")
        }
    }
}
