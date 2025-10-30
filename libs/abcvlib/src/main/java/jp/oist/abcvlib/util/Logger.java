package jp.oist.abcvlib.util;

import android.util.Log;
import jp.oist.abcvlib.core.BuildConfig;

/**
 * Custom logger wrapper.
 * Logs (v/d/i/w) only for debug builds.
 * Errors (e) are always logged.
 */
public class Logger {

    public static void v(String tag, String msg) {
        if (!BuildConfig.optimized) Log.v(tag, msg);
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (!BuildConfig.optimized) Log.v(tag, msg, tr);
    }

    public static void d(String tag, String msg) {
        if (!BuildConfig.optimized) Log.d(tag, msg);
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (!BuildConfig.optimized) Log.d(tag, msg, tr);
    }

    public static void i(String tag, String msg) {
        if (!BuildConfig.optimized) Log.i(tag, msg);
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (!BuildConfig.optimized) Log.i(tag, msg, tr);
    }

    public static void w(String tag, String msg) {
        if (!BuildConfig.optimized) Log.w(tag, msg);
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (!BuildConfig.optimized) Log.w(tag, msg, tr);
    }

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        Log.e(tag, msg, tr);
    }
}