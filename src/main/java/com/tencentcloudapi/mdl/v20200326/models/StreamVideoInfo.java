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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamVideoInfo extends AbstractModel{

    /**
    * Video `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Video codec.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Video frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Video bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * Video width.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video height.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Video `Pid`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Pid Video `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Video `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Pid Video `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Video codec.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Codec Video codec.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video codec.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Codec Video codec.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Video frame rate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Fps Video frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Fps Video frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Video bitrate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rate Video bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set Video bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rate Video bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Video width.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Width Video width.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video width.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Width Video width.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video height.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Height Video height.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video height.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Height Video height.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

