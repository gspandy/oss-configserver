package cn.home1.oss.environment.configserver.util;

/**
 * Created by leo on 16/9/19.
 */
public class TestEnv {

  private static String BASE_URL = "http://oss-configserver.local:8888/config";

  public static String getUrl(String uri) {
    return BASE_URL + uri;
  }

  public static String getUrl(String uri, String projectPath) {
    return BASE_URL + uri + projectPath;
  }
}
