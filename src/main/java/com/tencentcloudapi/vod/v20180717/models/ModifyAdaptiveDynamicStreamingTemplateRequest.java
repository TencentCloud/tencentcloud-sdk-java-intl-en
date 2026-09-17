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

public class ModifyAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Format")
    @Expose
    private String Format;

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
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

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
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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

    public ModifyAdaptiveDynamicStreamingTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAdaptiveDynamicStreamingTemplateRequest(ModifyAdaptiveDynamicStreamingTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);

    }
}

