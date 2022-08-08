package helper

class HelperTagLib {
    static namespace = 'someNamespace'
    def sometag = { attrs ->
        out << 'This came from HelperTagLib.someTagLib'
    }
}
