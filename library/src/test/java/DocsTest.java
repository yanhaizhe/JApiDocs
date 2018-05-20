import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.IResponseWrapper;
import io.github.yedaxia.apidocs.Resources;
import io.github.yedaxia.apidocs.parser.ResponseNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yeguozhong yedaxia.github.com
 */
public class DocsTest {

    @Test
    public void test_generatePlayApiDocs(){
        Resources.setDebug();
        Docs.buildHtmlDocs(getDocsConfig(Projects.PlayProject));
    }

    @Test
    public void test_generateSpringApiDocs(){
        Resources.setDebug();
        Docs.buildHtmlDocs(getDocsConfig(Projects.SpringProject));
    }

    @Test
    public void test_generateGenericApiDocs(){
        Resources.setDebug();
        Docs.buildHtmlDocs(getDocsConfig(Projects.GenericProject));
    }

    @Test
    public void test_generateJFinalApiDocs(){
        Resources.setDebug();
        Docs.buildHtmlDocs(getDocsConfig(Projects.JFinalProject));
    }

    @Test
    public void test_generateMultiModuleDocs(){
        Resources.setDebug();
        Docs.buildHtmlDocs(getDocsConfig("/Users/yeguozhong/Desktop/svnLibrary/jap"));
    }

    private Docs.DocsConfig getDocsConfig(String projectPath){
        Docs.DocsConfig config = new Docs.DocsConfig();
        config.setProjectPath(projectPath);
        //config.setRapProjectId("1");
        //config.setRapHost("http://rap.yedaxia.me");
        //config.setRapAccount("***");
        //config.setRapPassword("123456");
        return config;
    }
}
