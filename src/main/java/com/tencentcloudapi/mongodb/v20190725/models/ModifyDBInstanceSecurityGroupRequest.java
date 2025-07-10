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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupRequest extends AbstractModel {

    /**
    * Instance ID. For example, cmgo-7pje****.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IDs of target security groups. Call the [DescribeSecurityGroup](https://intl.cloud.tencent.com/document/product/240/55675?from_cn_redirect=1) API to view IDs of specific security groups.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Instance ID. For example, cmgo-7pje****. 
     * @return InstanceId Instance ID. For example, cmgo-7pje****.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, cmgo-7pje****.
     * @param InstanceId Instance ID. For example, cmgo-7pje****.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IDs of target security groups. Call the [DescribeSecurityGroup](https://intl.cloud.tencent.com/document/product/240/55675?from_cn_redirect=1) API to view IDs of specific security groups. 
     * @return SecurityGroupIds IDs of target security groups. Call the [DescribeSecurityGroup](https://intl.cloud.tencent.com/document/product/240/55675?from_cn_redirect=1) API to view IDs of specific security groups.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set IDs of target security groups. Call the [DescribeSecurityGroup](https://intl.cloud.tencent.com/document/product/240/55675?from_cn_redirect=1) API to view IDs of specific security groups.
     * @param SecurityGroupIds IDs of target security groups. Call the [DescribeSecurityGroup](https://intl.cloud.tencent.com/document/product/240/55675?from_cn_redirect=1) API to view IDs of specific security groups.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public ModifyDBInstanceSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSecurityGroupRequest(ModifyDBInstanceSecurityGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

