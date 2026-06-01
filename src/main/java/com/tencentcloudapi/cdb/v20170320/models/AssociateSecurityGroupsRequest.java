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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateSecurityGroupsRequest extends AbstractModel {

    /**
    * Security group ID, which can be obtained through the [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/api/236/15854?from_cn_redirect=1) API.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Instance ID list, an array consisting of one or more instance IDs. You can obtain it through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * This parameter takes effect only when the IDs of read-only replicas are passed in. If this parameter is set to `False` or left empty, the security group will be bound to the RO groups of these read-only replicas. If this parameter is set to `True`, the security group will be bound to the read-only replicas themselves.
    */
    @SerializedName("ForReadonlyInstance")
    @Expose
    private Boolean ForReadonlyInstance;

    /**
     * Get Security group ID, which can be obtained through the [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/api/236/15854?from_cn_redirect=1) API. 
     * @return SecurityGroupId Security group ID, which can be obtained through the [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/api/236/15854?from_cn_redirect=1) API.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID, which can be obtained through the [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/api/236/15854?from_cn_redirect=1) API.
     * @param SecurityGroupId Security group ID, which can be obtained through the [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/api/236/15854?from_cn_redirect=1) API.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Instance ID list, an array consisting of one or more instance IDs. You can obtain it through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceIds Instance ID list, an array consisting of one or more instance IDs. You can obtain it through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list, an array consisting of one or more instance IDs. You can obtain it through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceIds Instance ID list, an array consisting of one or more instance IDs. You can obtain it through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get This parameter takes effect only when the IDs of read-only replicas are passed in. If this parameter is set to `False` or left empty, the security group will be bound to the RO groups of these read-only replicas. If this parameter is set to `True`, the security group will be bound to the read-only replicas themselves. 
     * @return ForReadonlyInstance This parameter takes effect only when the IDs of read-only replicas are passed in. If this parameter is set to `False` or left empty, the security group will be bound to the RO groups of these read-only replicas. If this parameter is set to `True`, the security group will be bound to the read-only replicas themselves.
     */
    public Boolean getForReadonlyInstance() {
        return this.ForReadonlyInstance;
    }

    /**
     * Set This parameter takes effect only when the IDs of read-only replicas are passed in. If this parameter is set to `False` or left empty, the security group will be bound to the RO groups of these read-only replicas. If this parameter is set to `True`, the security group will be bound to the read-only replicas themselves.
     * @param ForReadonlyInstance This parameter takes effect only when the IDs of read-only replicas are passed in. If this parameter is set to `False` or left empty, the security group will be bound to the RO groups of these read-only replicas. If this parameter is set to `True`, the security group will be bound to the read-only replicas themselves.
     */
    public void setForReadonlyInstance(Boolean ForReadonlyInstance) {
        this.ForReadonlyInstance = ForReadonlyInstance;
    }

    public AssociateSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateSecurityGroupsRequest(AssociateSecurityGroupsRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ForReadonlyInstance != null) {
            this.ForReadonlyInstance = new Boolean(source.ForReadonlyInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForReadonlyInstance", this.ForReadonlyInstance);

    }
}

