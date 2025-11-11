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

public class SecurityGroupRoute extends AbstractModel {

    /**
    * Specifies the routing information.
    */
    @SerializedName("InstanceRoute")
    @Expose
    private InstanceRoute InstanceRoute;

    /**
    * Specifies the security group list to associate.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * CKafka cluster instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Specifies the route vpcId.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Route vip.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get Specifies the routing information. 
     * @return InstanceRoute Specifies the routing information.
     */
    public InstanceRoute getInstanceRoute() {
        return this.InstanceRoute;
    }

    /**
     * Set Specifies the routing information.
     * @param InstanceRoute Specifies the routing information.
     */
    public void setInstanceRoute(InstanceRoute InstanceRoute) {
        this.InstanceRoute = InstanceRoute;
    }

    /**
     * Get Specifies the security group list to associate. 
     * @return SecurityGroupIds Specifies the security group list to associate.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Specifies the security group list to associate.
     * @param SecurityGroupIds Specifies the security group list to associate.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get CKafka cluster instance name. 
     * @return InstanceName CKafka cluster instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CKafka cluster instance name.
     * @param InstanceName CKafka cluster instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Specifies the route vpcId. 
     * @return VpcId Specifies the route vpcId.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the route vpcId.
     * @param VpcId Specifies the route vpcId.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Route vip. 
     * @return Vip Route vip.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Route vip.
     * @param Vip Route vip.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public SecurityGroupRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRoute(SecurityGroupRoute source) {
        if (source.InstanceRoute != null) {
            this.InstanceRoute = new InstanceRoute(source.InstanceRoute);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceRoute.", this.InstanceRoute);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

