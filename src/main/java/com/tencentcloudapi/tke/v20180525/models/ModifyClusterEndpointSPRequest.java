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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterEndpointSPRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Security policy opens single IP or CIDR block to the Internet (for example: '192.168.1.0/24', with 'reject all' as the default).
    */
    @SerializedName("SecurityPolicies")
    @Expose
    private String [] SecurityPolicies;

    /**
    * Modify public network security group
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Security policy opens single IP or CIDR block to the Internet (for example: '192.168.1.0/24', with 'reject all' as the default). 
     * @return SecurityPolicies Security policy opens single IP or CIDR block to the Internet (for example: '192.168.1.0/24', with 'reject all' as the default).
     */
    public String [] getSecurityPolicies() {
        return this.SecurityPolicies;
    }

    /**
     * Set Security policy opens single IP or CIDR block to the Internet (for example: '192.168.1.0/24', with 'reject all' as the default).
     * @param SecurityPolicies Security policy opens single IP or CIDR block to the Internet (for example: '192.168.1.0/24', with 'reject all' as the default).
     */
    public void setSecurityPolicies(String [] SecurityPolicies) {
        this.SecurityPolicies = SecurityPolicies;
    }

    /**
     * Get Modify public network security group 
     * @return SecurityGroup Modify public network security group
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Modify public network security group
     * @param SecurityGroup Modify public network security group
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    public ModifyClusterEndpointSPRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterEndpointSPRequest(ModifyClusterEndpointSPRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SecurityPolicies != null) {
            this.SecurityPolicies = new String[source.SecurityPolicies.length];
            for (int i = 0; i < source.SecurityPolicies.length; i++) {
                this.SecurityPolicies[i] = new String(source.SecurityPolicies[i]);
            }
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SecurityPolicies.", this.SecurityPolicies);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);

    }
}

