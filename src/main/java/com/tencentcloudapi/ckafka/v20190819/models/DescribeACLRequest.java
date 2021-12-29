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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeACLRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Offset position
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Keyword match
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER). 
     * @return ResourceType ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
     * @param ResourceType ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty. 
     * @return ResourceName Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
     * @param ResourceName Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Offset position 
     * @return Offset Offset position
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset position
     * @param Offset Offset position
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity limit 
     * @return Limit Quantity limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity limit
     * @param Limit Quantity limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Keyword match 
     * @return SearchWord Keyword match
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Keyword match
     * @param SearchWord Keyword match
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeACLRequest(DescribeACLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

