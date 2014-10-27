package com.company;

import java.security.AccessController;
import java.io.FilePermission;

public class AccessDeniedException extends Exception
{
    private boolean permission = false; // Permission to file is not allowed
    public AccessDeniedException()
    {

        try
        {
            String path = "C:\\Olympians.lgoo";
            String actions = "read";
            AccessController.checkPermission(new FilePermission(path, actions));
        }
        catch (SecurityException se)
        {
            permission = true; // File permission is now allowed
        }
    }
    public boolean getPerm()
    {
        return permission;
    }
}
