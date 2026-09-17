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

public class AttachMediaSubtitlesRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * 
    */
    @SerializedName("SubtitleIds")
    @Expose
    private String [] SubtitleIds;

    /**
    * 
    */
    @SerializedName("DefaultSubtitleId")
    @Expose
    private String DefaultSubtitleId;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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

    /**
     * Get  
     * @return Operation 
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 
     * @param Operation 
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get  
     * @return AdaptiveDynamicStreamingDefinition 
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set 
     * @param AdaptiveDynamicStreamingDefinition 
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get  
     * @return SubtitleIds 
     */
    public String [] getSubtitleIds() {
        return this.SubtitleIds;
    }

    /**
     * Set 
     * @param SubtitleIds 
     */
    public void setSubtitleIds(String [] SubtitleIds) {
        this.SubtitleIds = SubtitleIds;
    }

    /**
     * Get  
     * @return DefaultSubtitleId 
     */
    public String getDefaultSubtitleId() {
        return this.DefaultSubtitleId;
    }

    /**
     * Set 
     * @param DefaultSubtitleId 
     */
    public void setDefaultSubtitleId(String DefaultSubtitleId) {
        this.DefaultSubtitleId = DefaultSubtitleId;
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

    public AttachMediaSubtitlesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachMediaSubtitlesRequest(AttachMediaSubtitlesRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.AdaptiveDynamicStreamingDefinition != null) {
            this.AdaptiveDynamicStreamingDefinition = new Long(source.AdaptiveDynamicStreamingDefinition);
        }
        if (source.SubtitleIds != null) {
            this.SubtitleIds = new String[source.SubtitleIds.length];
            for (int i = 0; i < source.SubtitleIds.length; i++) {
                this.SubtitleIds[i] = new String(source.SubtitleIds[i]);
            }
        }
        if (source.DefaultSubtitleId != null) {
            this.DefaultSubtitleId = new String(source.DefaultSubtitleId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamArraySimple(map, prefix + "SubtitleIds.", this.SubtitleIds);
        this.setParamSimple(map, prefix + "DefaultSubtitleId", this.DefaultSubtitleId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

