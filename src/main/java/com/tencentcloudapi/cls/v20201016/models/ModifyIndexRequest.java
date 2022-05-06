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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIndexRequest extends AbstractModel{

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * It does not take effect by default
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Index rule
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

    /**
    * Internal field marker of full-text index. Default value: `false`. Valid value: `false`: excluding internal fields; `true`: including internal fields
    */
    @SerializedName("IncludeInternalFields")
    @Expose
    private Boolean IncludeInternalFields;

    /**
    * Metadata flag. Default value: `0`. Valid value: `0`: full-text index (including the metadata field with key-value index enabled); `1`: full-text index (including all metadata fields); `2`: full-text index (excluding metadata fields).
    */
    @SerializedName("MetadataFlag")
    @Expose
    private Long MetadataFlag;

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get It does not take effect by default 
     * @return Status It does not take effect by default
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set It does not take effect by default
     * @param Status It does not take effect by default
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Index rule 
     * @return Rule Index rule
     */
    public RuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set Index rule
     * @param Rule Index rule
     */
    public void setRule(RuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Internal field marker of full-text index. Default value: `false`. Valid value: `false`: excluding internal fields; `true`: including internal fields 
     * @return IncludeInternalFields Internal field marker of full-text index. Default value: `false`. Valid value: `false`: excluding internal fields; `true`: including internal fields
     */
    public Boolean getIncludeInternalFields() {
        return this.IncludeInternalFields;
    }

    /**
     * Set Internal field marker of full-text index. Default value: `false`. Valid value: `false`: excluding internal fields; `true`: including internal fields
     * @param IncludeInternalFields Internal field marker of full-text index. Default value: `false`. Valid value: `false`: excluding internal fields; `true`: including internal fields
     */
    public void setIncludeInternalFields(Boolean IncludeInternalFields) {
        this.IncludeInternalFields = IncludeInternalFields;
    }

    /**
     * Get Metadata flag. Default value: `0`. Valid value: `0`: full-text index (including the metadata field with key-value index enabled); `1`: full-text index (including all metadata fields); `2`: full-text index (excluding metadata fields). 
     * @return MetadataFlag Metadata flag. Default value: `0`. Valid value: `0`: full-text index (including the metadata field with key-value index enabled); `1`: full-text index (including all metadata fields); `2`: full-text index (excluding metadata fields).
     */
    public Long getMetadataFlag() {
        return this.MetadataFlag;
    }

    /**
     * Set Metadata flag. Default value: `0`. Valid value: `0`: full-text index (including the metadata field with key-value index enabled); `1`: full-text index (including all metadata fields); `2`: full-text index (excluding metadata fields).
     * @param MetadataFlag Metadata flag. Default value: `0`. Valid value: `0`: full-text index (including the metadata field with key-value index enabled); `1`: full-text index (including all metadata fields); `2`: full-text index (excluding metadata fields).
     */
    public void setMetadataFlag(Long MetadataFlag) {
        this.MetadataFlag = MetadataFlag;
    }

    public ModifyIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIndexRequest(ModifyIndexRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new RuleInfo(source.Rule);
        }
        if (source.IncludeInternalFields != null) {
            this.IncludeInternalFields = new Boolean(source.IncludeInternalFields);
        }
        if (source.MetadataFlag != null) {
            this.MetadataFlag = new Long(source.MetadataFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "IncludeInternalFields", this.IncludeInternalFields);
        this.setParamSimple(map, prefix + "MetadataFlag", this.MetadataFlag);

    }
}

