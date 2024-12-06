package com.ryusw.ipc.api;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ryusw.ipc.callback.CmcResponseCallback;
import com.ryusw.ipc.constant.CmcBundleKey;
import com.ryusw.ipc.constant.CmcMessageType;
import com.ryusw.ipc.constant.CmcResultCode;
import com.ryusw.ipc.constant.CmcResultMsg;
import com.ryusw.ipc.params.CmcCalcRequestParams;
import com.ryusw.ipc.setting.Config;
import com.ryusw.ipc.util.RandomKeyGenerator;

public class CmcManager {

    public static boolean isInstalled(@NonNull Context context) {
        return getApplicationInfo(context) != null;
    }

    @Nullable
    private static ApplicationInfo getApplicationInfo(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo;
        try {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
                applicationInfo = packageManager.getApplicationInfo(
                        Config.FLAVOR_APPCLIATION_ID,
                        PackageManager.ApplicationInfoFlags.of(0)
                );
            } else {
                applicationInfo = packageManager.getApplicationInfo(
                        Config.FLAVOR_APPCLIATION_ID,
                        PackageManager.GET_META_DATA
                );
            }
        } catch (Exception e) {
            return null;
        }
        return applicationInfo;
    }
}
