/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaVideoStreamItem extends AbstractModel{

    /**
    * Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bitrate Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bitrate Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Width Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Width Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Codec Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Codec Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fps Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fps Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

