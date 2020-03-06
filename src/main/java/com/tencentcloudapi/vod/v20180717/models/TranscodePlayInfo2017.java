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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodePlayInfo2017 extends AbstractModel{

    /**
    * Playback address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://cloud.tencent.com/document/product/266/33478#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sum of the average bitrate of a video stream and that of an audio stream in bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Maximum value of the height of a video stream in px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Maximum value of the width of a video stream in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * Get Playback address. 
     * @return Url Playback address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Playback address.
     * @param Url Playback address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://cloud.tencent.com/document/product/266/33478#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF). 
     * @return Definition Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://cloud.tencent.com/document/product/266/33478#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://cloud.tencent.com/document/product/266/33478#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     * @param Definition Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://cloud.tencent.com/document/product/266/33478#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sum of the average bitrate of a video stream and that of an audio stream in bps. 
     * @return Bitrate Sum of the average bitrate of a video stream and that of an audio stream in bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Sum of the average bitrate of a video stream and that of an audio stream in bps.
     * @param Bitrate Sum of the average bitrate of a video stream and that of an audio stream in bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Maximum value of the height of a video stream in px. 
     * @return Height Maximum value of the height of a video stream in px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of the height of a video stream in px.
     * @param Height Maximum value of the height of a video stream in px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Maximum value of the width of a video stream in px. 
     * @return Width Maximum value of the width of a video stream in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the width of a video stream in px.
     * @param Width Maximum value of the width of a video stream in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

