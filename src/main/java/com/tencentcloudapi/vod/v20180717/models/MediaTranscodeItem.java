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

public class MediaTranscodeItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * 
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * 
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * 
    */
    @SerializedName("CopyRightWatermarkText")
    @Expose
    private String CopyRightWatermarkText;

    /**
    * 
    */
    @SerializedName("BlindWatermarkDefinition")
    @Expose
    private Long BlindWatermarkDefinition;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * @return Size 
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 
     * @param Size 
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return Md5 
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 
     * @param Md5 
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get  
     * @return Container 
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 
     * @param Container 
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get  
     * @return VideoStreamSet 
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set 
     * @param VideoStreamSet 
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get  
     * @return AudioStreamSet 
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set 
     * @param AudioStreamSet 
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get  
     * @return DigitalWatermarkType 
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set 
     * @param DigitalWatermarkType 
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get  
     * @return CopyRightWatermarkText 
     */
    public String getCopyRightWatermarkText() {
        return this.CopyRightWatermarkText;
    }

    /**
     * Set 
     * @param CopyRightWatermarkText 
     */
    public void setCopyRightWatermarkText(String CopyRightWatermarkText) {
        this.CopyRightWatermarkText = CopyRightWatermarkText;
    }

    /**
     * Get  
     * @return BlindWatermarkDefinition 
     */
    public Long getBlindWatermarkDefinition() {
        return this.BlindWatermarkDefinition;
    }

    /**
     * Set 
     * @param BlindWatermarkDefinition 
     */
    public void setBlindWatermarkDefinition(Long BlindWatermarkDefinition) {
        this.BlindWatermarkDefinition = BlindWatermarkDefinition;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public MediaTranscodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTranscodeItem(MediaTranscodeItem source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStreamSet != null) {
            this.VideoStreamSet = new MediaVideoStreamItem[source.VideoStreamSet.length];
            for (int i = 0; i < source.VideoStreamSet.length; i++) {
                this.VideoStreamSet[i] = new MediaVideoStreamItem(source.VideoStreamSet[i]);
            }
        }
        if (source.AudioStreamSet != null) {
            this.AudioStreamSet = new MediaAudioStreamItem[source.AudioStreamSet.length];
            for (int i = 0; i < source.AudioStreamSet.length; i++) {
                this.AudioStreamSet[i] = new MediaAudioStreamItem(source.AudioStreamSet[i]);
            }
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.CopyRightWatermarkText != null) {
            this.CopyRightWatermarkText = new String(source.CopyRightWatermarkText);
        }
        if (source.BlindWatermarkDefinition != null) {
            this.BlindWatermarkDefinition = new Long(source.BlindWatermarkDefinition);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
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
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamSimple(map, prefix + "CopyRightWatermarkText", this.CopyRightWatermarkText);
        this.setParamSimple(map, prefix + "BlindWatermarkDefinition", this.BlindWatermarkDefinition);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

