package com.hustunique.parsingplayer.player.io;

import com.hustunique.parsingplayer.Util;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * Created by JianGuo on 2/5/17.
 * Thread pool for file io
 */
public class ConcatExecutorService extends ThreadPoolExecutor {
    private static final String TAG = "ConcatExecutorService";
    private static final int DEFAULT_THREAD_COUNT = 3;

    private ConcatExecutorService() {
        super(DEFAULT_THREAD_COUNT, DEFAULT_THREAD_COUNT, 0, TimeUnit.MILLISECONDS,
                new PriorityBlockingQueue<Runnable>(), new Util.ParsingThreadFactory());
    }

    public static ConcatExecutorService createService() {
        return new ConcatExecutorService();
    }


}
