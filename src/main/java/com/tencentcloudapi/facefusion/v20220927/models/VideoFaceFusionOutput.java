/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoFaceFusionOutput extends AbstractModel {

    /**
    * URL of the video output after video face fusion
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * MD5 value of the video output after video face fusion, which is used for verification
    */
    @SerializedName("VideoMD5")
    @Expose
    private String VideoMD5;

    /**
    * Video width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frames per second
    */
    @SerializedName("FPS")
    @Expose
    private Long FPS;

    /**
    * Video duration, in seconds
    */
    @SerializedName("DurationInSec")
    @Expose
    private Float DurationInSec;

    /**
    * Number of frames
    */
    @SerializedName("Frame")
    @Expose
    private Long Frame;

    /**
     * Get URL of the video output after video face fusion 
     * @return VideoUrl URL of the video output after video face fusion
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set URL of the video output after video face fusion
     * @param VideoUrl URL of the video output after video face fusion
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get MD5 value of the video output after video face fusion, which is used for verification 
     * @return VideoMD5 MD5 value of the video output after video face fusion, which is used for verification
     */
    public String getVideoMD5() {
        return this.VideoMD5;
    }

    /**
     * Set MD5 value of the video output after video face fusion, which is used for verification
     * @param VideoMD5 MD5 value of the video output after video face fusion, which is used for verification
     */
    public void setVideoMD5(String VideoMD5) {
        this.VideoMD5 = VideoMD5;
    }

    /**
     * Get Video width 
     * @return Width Video width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video width
     * @param Width Video width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video height 
     * @return Height Video height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video height
     * @param Height Video height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frames per second 
     * @return FPS Frames per second
     */
    public Long getFPS() {
        return this.FPS;
    }

    /**
     * Set Frames per second
     * @param FPS Frames per second
     */
    public void setFPS(Long FPS) {
        this.FPS = FPS;
    }

    /**
     * Get Video duration, in seconds 
     * @return DurationInSec Video duration, in seconds
     */
    public Float getDurationInSec() {
        return this.DurationInSec;
    }

    /**
     * Set Video duration, in seconds
     * @param DurationInSec Video duration, in seconds
     */
    public void setDurationInSec(Float DurationInSec) {
        this.DurationInSec = DurationInSec;
    }

    /**
     * Get Number of frames 
     * @return Frame Number of frames
     */
    public Long getFrame() {
        return this.Frame;
    }

    /**
     * Set Number of frames
     * @param Frame Number of frames
     */
    public void setFrame(Long Frame) {
        this.Frame = Frame;
    }

    public VideoFaceFusionOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoFaceFusionOutput(VideoFaceFusionOutput source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.VideoMD5 != null) {
            this.VideoMD5 = new String(source.VideoMD5);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.FPS != null) {
            this.FPS = new Long(source.FPS);
        }
        if (source.DurationInSec != null) {
            this.DurationInSec = new Float(source.DurationInSec);
        }
        if (source.Frame != null) {
            this.Frame = new Long(source.Frame);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoMD5", this.VideoMD5);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FPS", this.FPS);
        this.setParamSimple(map, prefix + "DurationInSec", this.DurationInSec);
        this.setParamSimple(map, prefix + "Frame", this.Frame);

    }
}

