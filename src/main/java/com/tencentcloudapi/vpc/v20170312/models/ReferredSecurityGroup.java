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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferredSecurityGroup extends AbstractModel{

    /**
    * Security group instance ID.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * IDs of all referred security group instances.
    */
    @SerializedName("ReferredSecurityGroupIds")
    @Expose
    private String [] ReferredSecurityGroupIds;

    /**
     * Get Security group instance ID. 
     * @return SecurityGroupId Security group instance ID.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID.
     * @param SecurityGroupId Security group instance ID.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get IDs of all referred security group instances. 
     * @return ReferredSecurityGroupIds IDs of all referred security group instances.
     */
    public String [] getReferredSecurityGroupIds() {
        return this.ReferredSecurityGroupIds;
    }

    /**
     * Set IDs of all referred security group instances.
     * @param ReferredSecurityGroupIds IDs of all referred security group instances.
     */
    public void setReferredSecurityGroupIds(String [] ReferredSecurityGroupIds) {
        this.ReferredSecurityGroupIds = ReferredSecurityGroupIds;
    }

    public ReferredSecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferredSecurityGroup(ReferredSecurityGroup source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.ReferredSecurityGroupIds != null) {
            this.ReferredSecurityGroupIds = new String[source.ReferredSecurityGroupIds.length];
            for (int i = 0; i < source.ReferredSecurityGroupIds.length; i++) {
                this.ReferredSecurityGroupIds[i] = new String(source.ReferredSecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "ReferredSecurityGroupIds.", this.ReferredSecurityGroupIds);

    }
}

