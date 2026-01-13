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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateAclRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL resource type. Default value: `2` (topic).
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * Resource list array, obtainable through the DescribeTopic API (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
    */
    @SerializedName("ResourceNames")
    @Expose
    private String [] ResourceNames;

    /**
    * Specifies the set ACL rule list, which can be obtained through the DescribeAclRule API (https://www.tencentcloud.com/document/product/597/89217?from_cn_redirect=1).
    */
    @SerializedName("RuleList")
    @Expose
    private AclRuleInfo [] RuleList;

    /**
     * Get The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL resource type. Default value: `2` (topic). 
     * @return ResourceType ACL resource type. Default value: `2` (topic).
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ACL resource type. Default value: `2` (topic).
     * @param ResourceType ACL resource type. Default value: `2` (topic).
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource list array, obtainable through the DescribeTopic API (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1). 
     * @return ResourceNames Resource list array, obtainable through the DescribeTopic API (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     */
    public String [] getResourceNames() {
        return this.ResourceNames;
    }

    /**
     * Set Resource list array, obtainable through the DescribeTopic API (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     * @param ResourceNames Resource list array, obtainable through the DescribeTopic API (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     */
    public void setResourceNames(String [] ResourceNames) {
        this.ResourceNames = ResourceNames;
    }

    /**
     * Get Specifies the set ACL rule list, which can be obtained through the DescribeAclRule API (https://www.tencentcloud.com/document/product/597/89217?from_cn_redirect=1). 
     * @return RuleList Specifies the set ACL rule list, which can be obtained through the DescribeAclRule API (https://www.tencentcloud.com/document/product/597/89217?from_cn_redirect=1).
     */
    public AclRuleInfo [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set Specifies the set ACL rule list, which can be obtained through the DescribeAclRule API (https://www.tencentcloud.com/document/product/597/89217?from_cn_redirect=1).
     * @param RuleList Specifies the set ACL rule list, which can be obtained through the DescribeAclRule API (https://www.tencentcloud.com/document/product/597/89217?from_cn_redirect=1).
     */
    public void setRuleList(AclRuleInfo [] RuleList) {
        this.RuleList = RuleList;
    }

    public BatchCreateAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateAclRequest(BatchCreateAclRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceNames != null) {
            this.ResourceNames = new String[source.ResourceNames.length];
            for (int i = 0; i < source.ResourceNames.length; i++) {
                this.ResourceNames[i] = new String(source.ResourceNames[i]);
            }
        }
        if (source.RuleList != null) {
            this.RuleList = new AclRuleInfo[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new AclRuleInfo(source.RuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ResourceNames.", this.ResourceNames);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);

    }
}

