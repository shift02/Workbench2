package net.orekyuu.workbench.service.exceptions;

/**
 * すでにプロジェクトが存在する時にスローされる
 */
public class ProjectExistsException extends Exception {
    public ProjectExistsException(String projectId) {
        super("projectId=" + projectId);
    }
}
