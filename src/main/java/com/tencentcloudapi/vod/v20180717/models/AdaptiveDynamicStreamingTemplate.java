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

public class AdaptiveDynamicStreamingTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 
    */
    @SerializedName("DrmKeyProvider")
    @Expose
    private String DrmKeyProvider;

    /**
    * 
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
    * 
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * 
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * 
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * 
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

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
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return Format 
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 
     * @param Format 
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get  
     * @return DrmType 
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set 
     * @param DrmType 
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get  
     * @return DrmKeyProvider 
     */
    public String getDrmKeyProvider() {
        return this.DrmKeyProvider;
    }

    /**
     * Set 
     * @param DrmKeyProvider 
     */
    public void setDrmKeyProvider(String DrmKeyProvider) {
        this.DrmKeyProvider = DrmKeyProvider;
    }

    /**
     * Get  
     * @return DrmEncryptType 
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set 
     * @param DrmEncryptType 
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
    }

    /**
     * Get  
     * @return StreamInfos 
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 
     * @param StreamInfos 
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get  
     * @return DisableHigherVideoBitrate 
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set 
     * @param DisableHigherVideoBitrate 
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get  
     * @return DisableHigherVideoResolution 
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set 
     * @param DisableHigherVideoResolution 
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return SegmentType 
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 
     * @param SegmentType 
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get  
     * @return SegmentDuration 
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set 
     * @param SegmentDuration 
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    public AdaptiveDynamicStreamingTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTemplate(AdaptiveDynamicStreamingTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.DrmKeyProvider != null) {
            this.DrmKeyProvider = new String(source.DrmKeyProvider);
        }
        if (source.DrmEncryptType != null) {
            this.DrmEncryptType = new String(source.DrmEncryptType);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "DrmKeyProvider", this.DrmKeyProvider);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);

    }
}

