package eu.rekawek.jhttp.server;

import java.io.File;

import org.apache.commons.lang3.StringUtils;

/**
 * This class looks for a file specified by the URI in the configured server root.
 * 
 * @author Tomasz Rękawek
 *
 */
public class FileResolver {

    private final File serverRoot;

    public FileResolver(File serverRoot) {
        this.serverRoot = serverRoot;
    }

    public File resolveFile(String uri) {
        return new File(serverRoot, StringUtils.removeStart(uri, "/"));
    }
}
