/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 2019 Intel Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.multicamera;

import android.content.ContentValues;
import android.graphics.Camera;
import android.net.Uri;

public class MultiCamera {
    private static MultiCamera ic_instance = null;
    //private CameraBase mCameraBack;
    //private CameraBase mCameraFront;
    private CameraBase mTopRightCam;
    private CameraBase mBotmLeftCam;
    private CameraBase mBotmRightCam;
    private CameraBase mTopLeftCam;

    private int OpenCameraId;
    private Uri mCurrentUri;
    private ContentValues mCurrentFileInfo;

    MultiCamera() {
        WhichCamera = 0;
        IsCameraOrSurveillance = 0;
        OpenCameraId = -1;
    }
    public static MultiCamera getInstance() {
        if (ic_instance == null) {
            ic_instance = new MultiCamera();
        }

        return ic_instance;
    }

    private int WhichCamera;

    private int IsCameraOrSurveillance;

    public int getWhichCamera() {
        return WhichCamera;
    }

    public void setWhichCamera(int whichCamera) {
        WhichCamera = whichCamera;
    }

    public int getIsCameraOrSurveillance() {
        return IsCameraOrSurveillance;
    }

    public void setIsCameraOrSurveillance(int isCameraOrSurveillance) {
        IsCameraOrSurveillance = isCameraOrSurveillance;
    }
/*
    public CameraBase getmCameraBack() {
        return mCameraBack;
    }

    public void setmCameraBack(CameraBase mCameraBack) {
        this.mCameraBack = mCameraBack;
    }

    public CameraBase getmCameraFront() {
        return mCameraFront;
    }

    public void setmCameraFront(CameraBase mCameraFront) {
        this.mCameraFront = mCameraFront;
    }*/

    public Uri getmCurrentUri() {
        return mCurrentUri;
    }

    public void setmCurrentUri(Uri mCurrentUri) {
        this.mCurrentUri = mCurrentUri;
    }

    public ContentValues getmCurrentFileInfo() {
        return mCurrentFileInfo;
    }

    public void setmCurrentFileInfo(ContentValues mCurrentFileInfo) {
        this.mCurrentFileInfo = mCurrentFileInfo;
    }

    public CameraBase getmTopRightCam() {
        return mTopRightCam;
    }

    public void setmTopRightCam(CameraBase mTopRightCam) {
        this.mTopRightCam = mTopRightCam;
    }

    public CameraBase getmBotmLeftCam() {
        return mBotmLeftCam;
    }

    public void setmBotmLeftCam(CameraBase mBotmLeftCam) {
        this.mBotmLeftCam = mBotmLeftCam;
    }

    public CameraBase getmBotmRightCam() {
        return mBotmRightCam;
    }

    public void setmBotmRightCam(CameraBase mBotmRightCam) {
        this.mBotmRightCam = mBotmRightCam;
    }

    public CameraBase getmTopLeftCam() {
        return mTopLeftCam;
    }

    public void setmTopLeftCam(CameraBase mTopLeftCam) {
        this.mTopLeftCam = mTopLeftCam;
    }

    public int getOpenCameraId() {
        return OpenCameraId;
    }

    public void setOpenCameraId(int openCameraId) {
        OpenCameraId = openCameraId;
    }
}
