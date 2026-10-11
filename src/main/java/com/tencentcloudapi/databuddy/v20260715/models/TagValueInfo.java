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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagValueInfo extends AbstractModel {

    /**
    * Tag value ID
    */
    @SerializedName("TagValueId")
    @Expose
    private String TagValueId;

    /**
    * Tag value content. Fill in when querying. Do not pass in when writing.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Tag source. See web_enum_standard.proto -> TagSource: 0=not specified 1=directly bound to user 2=inherited from user group 3=both. Populated during queries. Do not pass when writing.
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * List of user group names from the inheritance source. Empty when Source=1. Populated during queries. Do not pass when writing.
    */
    @SerializedName("GroupNames")
    @Expose
    private String [] GroupNames;

    /**
     * Get Tag value ID 
     * @return TagValueId Tag value ID
     */
    public String getTagValueId() {
        return this.TagValueId;
    }

    /**
     * Set Tag value ID
     * @param TagValueId Tag value ID
     */
    public void setTagValueId(String TagValueId) {
        this.TagValueId = TagValueId;
    }

    /**
     * Get Tag value content. Fill in when querying. Do not pass in when writing. 
     * @return TagValue Tag value content. Fill in when querying. Do not pass in when writing.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value content. Fill in when querying. Do not pass in when writing.
     * @param TagValue Tag value content. Fill in when querying. Do not pass in when writing.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Tag source. See web_enum_standard.proto -> TagSource: 0=not specified 1=directly bound to user 2=inherited from user group 3=both. Populated during queries. Do not pass when writing. 
     * @return Source Tag source. See web_enum_standard.proto -> TagSource: 0=not specified 1=directly bound to user 2=inherited from user group 3=both. Populated during queries. Do not pass when writing.
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Tag source. See web_enum_standard.proto -> TagSource: 0=not specified 1=directly bound to user 2=inherited from user group 3=both. Populated during queries. Do not pass when writing.
     * @param Source Tag source. See web_enum_standard.proto -> TagSource: 0=not specified 1=directly bound to user 2=inherited from user group 3=both. Populated during queries. Do not pass when writing.
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get List of user group names from the inheritance source. Empty when Source=1. Populated during queries. Do not pass when writing. 
     * @return GroupNames List of user group names from the inheritance source. Empty when Source=1. Populated during queries. Do not pass when writing.
     */
    public String [] getGroupNames() {
        return this.GroupNames;
    }

    /**
     * Set List of user group names from the inheritance source. Empty when Source=1. Populated during queries. Do not pass when writing.
     * @param GroupNames List of user group names from the inheritance source. Empty when Source=1. Populated during queries. Do not pass when writing.
     */
    public void setGroupNames(String [] GroupNames) {
        this.GroupNames = GroupNames;
    }

    public TagValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagValueInfo(TagValueInfo source) {
        if (source.TagValueId != null) {
            this.TagValueId = new String(source.TagValueId);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.GroupNames != null) {
            this.GroupNames = new String[source.GroupNames.length];
            for (int i = 0; i < source.GroupNames.length; i++) {
                this.GroupNames[i] = new String(source.GroupNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagValueId", this.TagValueId);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupNames.", this.GroupNames);

    }
}

