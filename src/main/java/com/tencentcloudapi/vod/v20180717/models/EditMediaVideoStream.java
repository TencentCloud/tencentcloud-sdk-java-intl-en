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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaVideoStream extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get  
     * @return Codec 
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 
     * @param Codec 
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get  
     * @return Bitrate 
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 
     * @param Bitrate 
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get  
     * @return ResolutionAdaptive 
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 
     * @param ResolutionAdaptive 
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get  
     * @return Width 
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 
     * @param Width 
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get  
     * @return Height 
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 
     * @param Height 
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get  
     * @return Fps 
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 
     * @param Fps 
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public EditMediaVideoStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaVideoStream(EditMediaVideoStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

