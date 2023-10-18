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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesAttributeRequest extends AbstractModel {

    /**
    * List of IDs of the instances to be modified. You can request up to 100 instances at a time.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Instance name displayed after successful modification, which can contain up to 60 characters. If this parameter is not specified, an empty value will be displayed.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * List of IDs of the security groups of the instance. The instance will be associated with the specified security groups and will be disassociated from the original security groups. The maximum quantity is 5.
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
     * Get List of IDs of the instances to be modified. You can request up to 100 instances at a time. 
     * @return InstanceIdSet List of IDs of the instances to be modified. You can request up to 100 instances at a time.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances to be modified. You can request up to 100 instances at a time.
     * @param InstanceIdSet List of IDs of the instances to be modified. You can request up to 100 instances at a time.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Instance name displayed after successful modification, which can contain up to 60 characters. If this parameter is not specified, an empty value will be displayed. 
     * @return InstanceName Instance name displayed after successful modification, which can contain up to 60 characters. If this parameter is not specified, an empty value will be displayed.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name displayed after successful modification, which can contain up to 60 characters. If this parameter is not specified, an empty value will be displayed.
     * @param InstanceName Instance name displayed after successful modification, which can contain up to 60 characters. If this parameter is not specified, an empty value will be displayed.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get List of IDs of the security groups of the instance. The instance will be associated with the specified security groups and will be disassociated from the original security groups. The maximum quantity is 5. 
     * @return SecurityGroups List of IDs of the security groups of the instance. The instance will be associated with the specified security groups and will be disassociated from the original security groups. The maximum quantity is 5.
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set List of IDs of the security groups of the instance. The instance will be associated with the specified security groups and will be disassociated from the original security groups. The maximum quantity is 5.
     * @param SecurityGroups List of IDs of the security groups of the instance. The instance will be associated with the specified security groups and will be disassociated from the original security groups. The maximum quantity is 5.
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    public ModifyInstancesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesAttributeRequest(ModifyInstancesAttributeRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);

    }
}

