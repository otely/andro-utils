package com.sandroid.android.common.util;

import com.sandroid.android.common.entity.PatchResult;

/**
 * PatchUtils
 * 
 *  2013-12-10
 */
public class PatchUtils {

    /**
     * patch old apk and patch file to new apk
     * 
     * @param oldApkPath
     * @param patchPath
     * @param newApkPath
     * @return
     */
    public static native PatchResult patch(String oldApkPath, String patchPath, String newApkPath);
}
