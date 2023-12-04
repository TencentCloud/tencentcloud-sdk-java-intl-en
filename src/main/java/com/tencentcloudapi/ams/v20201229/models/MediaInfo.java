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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel {

    /**
    * This field is used to return the codec of the media file passed in, such as WAV, MP3, AAC, FLAC, AMR, 3GP, M4A, WMA, OGG, and APE.
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * This field is used to return the segment length of the input streaming media file in milliseconds.** It is 15 seconds** by default and is customizable.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * *This field is in beta test. Stay tuned*
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * *This field is in beta test. Stay tuned*
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * *This field is in beta test. Stay tuned*
    */
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;

    /**
     * Get This field is used to return the codec of the media file passed in, such as WAV, MP3, AAC, FLAC, AMR, 3GP, M4A, WMA, OGG, and APE. 
     * @return Codecs This field is used to return the codec of the media file passed in, such as WAV, MP3, AAC, FLAC, AMR, 3GP, M4A, WMA, OGG, and APE.
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set This field is used to return the codec of the media file passed in, such as WAV, MP3, AAC, FLAC, AMR, 3GP, M4A, WMA, OGG, and APE.
     * @param Codecs This field is used to return the codec of the media file passed in, such as WAV, MP3, AAC, FLAC, AMR, 3GP, M4A, WMA, OGG, and APE.
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get This field is used to return the segment length of the input streaming media file in milliseconds.** It is 15 seconds** by default and is customizable. 
     * @return Duration This field is used to return the segment length of the input streaming media file in milliseconds.** It is 15 seconds** by default and is customizable.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set This field is used to return the segment length of the input streaming media file in milliseconds.** It is 15 seconds** by default and is customizable.
     * @param Duration This field is used to return the segment length of the input streaming media file in milliseconds.** It is 15 seconds** by default and is customizable.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get *This field is in beta test. Stay tuned* 
     * @return Width *This field is in beta test. Stay tuned*
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set *This field is in beta test. Stay tuned*
     * @param Width *This field is in beta test. Stay tuned*
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get *This field is in beta test. Stay tuned* 
     * @return Height *This field is in beta test. Stay tuned*
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set *This field is in beta test. Stay tuned*
     * @param Height *This field is in beta test. Stay tuned*
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get *This field is in beta test. Stay tuned* 
     * @return Thumbnail *This field is in beta test. Stay tuned*
     */
    public String getThumbnail() {
        return this.Thumbnail;
    }

    /**
     * Set *This field is in beta test. Stay tuned*
     * @param Thumbnail *This field is in beta test. Stay tuned*
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

