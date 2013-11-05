
/**
 * Created with IntelliJ IDEA.
 * User: ken
 * Date: 11/5/13
 * Time: 7:41 AM
 * To change this template use File | Settings | File Templates.
 */
class Session {
    Session(HashMap properties) {

    }

    def execute(String status, Closure<Object> objectClosure) {
        if (notDone(status)) {
            try {
               objectClosure(this)
            } catch (Exception e) {
                fail(status, e)
                throw e
            }
            done(statis)

        }
    }
}
