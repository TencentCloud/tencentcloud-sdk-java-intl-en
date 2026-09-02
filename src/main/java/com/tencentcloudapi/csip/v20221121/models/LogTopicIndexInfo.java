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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogTopicIndexInfo extends AbstractModel {

    /**
    * <p>Topic</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>Rule</p>
    */
    @SerializedName("Rule")
    @Expose
    private LogIndexRuleInfo Rule;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Whether it contains</p>
    */
    @SerializedName("IncludeInternalFields")
    @Expose
    private Boolean IncludeInternalFields;

    /**
    * <p>Metadata tag</p>
    */
    @SerializedName("MetadataFlag")
    @Expose
    private Long MetadataFlag;

    /**
     * Get <p>Topic</p> 
     * @return TopicId <p>Topic</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Topic</p>
     * @param TopicId <p>Topic</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Status.</p> 
     * @return Status <p>Status.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.</p>
     * @param Status <p>Status.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Rule</p> 
     * @return Rule <p>Rule</p>
     */
    public LogIndexRuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Rule</p>
     * @param Rule <p>Rule</p>
     */
    public void setRule(LogIndexRuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return ModifyTime <p>Modification time.</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Modification time.</p>
     * @param ModifyTime <p>Modification time.</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Whether it contains</p> 
     * @return IncludeInternalFields <p>Whether it contains</p>
     */
    public Boolean getIncludeInternalFields() {
        return this.IncludeInternalFields;
    }

    /**
     * Set <p>Whether it contains</p>
     * @param IncludeInternalFields <p>Whether it contains</p>
     */
    public void setIncludeInternalFields(Boolean IncludeInternalFields) {
        this.IncludeInternalFields = IncludeInternalFields;
    }

    /**
     * Get <p>Metadata tag</p> 
     * @return MetadataFlag <p>Metadata tag</p>
     */
    public Long getMetadataFlag() {
        return this.MetadataFlag;
    }

    /**
     * Set <p>Metadata tag</p>
     * @param MetadataFlag <p>Metadata tag</p>
     */
    public void setMetadataFlag(Long MetadataFlag) {
        this.MetadataFlag = MetadataFlag;
    }

    public LogTopicIndexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogTopicIndexInfo(LogTopicIndexInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new LogIndexRuleInfo(source.Rule);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IncludeInternalFields", this.IncludeInternalFields);
        this.setParamSimple(map, prefix + "MetadataFlag", this.MetadataFlag);

    }
}

