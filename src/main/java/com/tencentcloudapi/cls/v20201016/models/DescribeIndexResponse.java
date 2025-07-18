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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexResponse extends AbstractModel {

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Whether it takes effect
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Index configuration information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

    /**
    * Index modification time. The default value is the index creation time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Whether full-text indexing includes internal fields (`__FILENAME__`, `__HOSTNAME__`, and `__SOURCE__`)
* `false`: Full-text indexing does not include internal fields.
* `true`: Full-text indexing includes internal fields.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncludeInternalFields")
    @Expose
    private Boolean IncludeInternalFields;

    /**
    * Whether full-text indexing includes metadata fields (which are prefixed with `__TAG__`)
* `0`: Full-text indexing includes only the metadata fields with key-value indexing enabled.
* `1`: Full-text indexing includes all metadata fields.
* `2`: Full-text indexing does not include metadata fields.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetadataFlag")
    @Expose
    private Long MetadataFlag;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Whether it takes effect 
     * @return Status Whether it takes effect
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether it takes effect
     * @param Status Whether it takes effect
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Index configuration information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Rule Index configuration information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set Index configuration information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Rule Index configuration information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRule(RuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Index modification time. The default value is the index creation time. 
     * @return ModifyTime Index modification time. The default value is the index creation time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Index modification time. The default value is the index creation time.
     * @param ModifyTime Index modification time. The default value is the index creation time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Whether full-text indexing includes internal fields (`__FILENAME__`, `__HOSTNAME__`, and `__SOURCE__`)
* `false`: Full-text indexing does not include internal fields.
* `true`: Full-text indexing includes internal fields.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncludeInternalFields Whether full-text indexing includes internal fields (`__FILENAME__`, `__HOSTNAME__`, and `__SOURCE__`)
* `false`: Full-text indexing does not include internal fields.
* `true`: Full-text indexing includes internal fields.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIncludeInternalFields() {
        return this.IncludeInternalFields;
    }

    /**
     * Set Whether full-text indexing includes internal fields (`__FILENAME__`, `__HOSTNAME__`, and `__SOURCE__`)
* `false`: Full-text indexing does not include internal fields.
* `true`: Full-text indexing includes internal fields.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncludeInternalFields Whether full-text indexing includes internal fields (`__FILENAME__`, `__HOSTNAME__`, and `__SOURCE__`)
* `false`: Full-text indexing does not include internal fields.
* `true`: Full-text indexing includes internal fields.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncludeInternalFields(Boolean IncludeInternalFields) {
        this.IncludeInternalFields = IncludeInternalFields;
    }

    /**
     * Get Whether full-text indexing includes metadata fields (which are prefixed with `__TAG__`)
* `0`: Full-text indexing includes only the metadata fields with key-value indexing enabled.
* `1`: Full-text indexing includes all metadata fields.
* `2`: Full-text indexing does not include metadata fields.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetadataFlag Whether full-text indexing includes metadata fields (which are prefixed with `__TAG__`)
* `0`: Full-text indexing includes only the metadata fields with key-value indexing enabled.
* `1`: Full-text indexing includes all metadata fields.
* `2`: Full-text indexing does not include metadata fields.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMetadataFlag() {
        return this.MetadataFlag;
    }

    /**
     * Set Whether full-text indexing includes metadata fields (which are prefixed with `__TAG__`)
* `0`: Full-text indexing includes only the metadata fields with key-value indexing enabled.
* `1`: Full-text indexing includes all metadata fields.
* `2`: Full-text indexing does not include metadata fields.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetadataFlag Whether full-text indexing includes metadata fields (which are prefixed with `__TAG__`)
* `0`: Full-text indexing includes only the metadata fields with key-value indexing enabled.
* `1`: Full-text indexing includes all metadata fields.
* `2`: Full-text indexing does not include metadata fields.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetadataFlag(Long MetadataFlag) {
        this.MetadataFlag = MetadataFlag;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIndexResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIndexResponse(DescribeIndexResponse source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new RuleInfo(source.Rule);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

