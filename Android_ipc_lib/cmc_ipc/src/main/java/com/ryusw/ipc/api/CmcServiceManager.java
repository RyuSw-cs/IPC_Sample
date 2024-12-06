package com.ryusw.ipc.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

import androidx.annotation.NonNull;

import com.ryusw.ipc.callback.CmcResponseCallback;
import com.ryusw.ipc.callback.CmcServiceConnectionCallback;
import com.ryusw.ipc.constant.CmcBundleKey;
import com.ryusw.ipc.constant.CmcResultCode;
import com.ryusw.ipc.constant.CmcResultMsg;
import com.ryusw.ipc.setting.Config;


public class CmcServiceManager {

}
