package createlinknamespacetest

import test.BoringStuff
import test.CoolStuff

class BootStrap {

    def init = { servletContext ->
        CoolStuff coolStuff = new CoolStuff(name: "test1", coolName: "this is cool")
        coolStuff.save()

        BoringStuff boringStuff = new BoringStuff(name: "test2", boringName: "this is boring")
        boringStuff.save()
    }
    def destroy = {
    }
}
