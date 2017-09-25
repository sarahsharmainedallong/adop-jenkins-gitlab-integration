import javaposse.jobdsl.plugin.GlobalJobDslSecurityConfiguration
import jenkins.model.GlobalConfiguration

// Check if enabled
def env = System.getenv()
def useScriptSecurity = (env['USE_SCRIPT_SECURITY']) ? env['USE_SCRIPT_SECURITY'].toBoolean() : false
GlobalConfiguration.all().get(GlobalJobDslSecurityConfiguration.class).useScriptSecurity = useScriptSecurity