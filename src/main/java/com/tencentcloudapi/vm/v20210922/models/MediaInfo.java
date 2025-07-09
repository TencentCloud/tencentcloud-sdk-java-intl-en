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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel {

    /**
    * Encoding format
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * Segment duration during stream detection
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Width, in pixels
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height, in pixels
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Cover
    */
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;

    /**
     * Get Encoding format 
     * @return Codecs Encoding format
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set Encoding format
     * @param Codecs Encoding format
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get Segment duration during stream detection
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Duration Segment duration during stream detection
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Segment duration during stream detection
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Duration Segment duration during stream detection
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Width, in pixels 
     * @return Width Width, in pixels
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width, in pixels
     * @param Width Width, in pixels
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height, in pixels 
     * @return Height Height, in pixels
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height, in pixels
     * @param Height Height, in pixels
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Cover 
     * @return Thumbnail Cover
     */
    public String getThumbnail() {
        return this.Thumbnail;
    }

    /**
     * Set Cover
     * @param Thumbnail Cover
     */
    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.Codecs != null) {
            this.Codecs = new String(source.Codecs);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Thumbnail != null) {
            this.Thumbnail = new String(source.Thumbnail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codecs", this.Codecs);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Thumbnail", this.Thumbnail);

    }
}

