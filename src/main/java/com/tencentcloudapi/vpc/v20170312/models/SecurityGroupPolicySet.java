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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicySet extends AbstractModel {

    /**
    * The version number of the security group policy, which will automatically increase by one each time you update the security group policy, so as to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored. 
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Outbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Egress")
    @Expose
    private SecurityGroupPolicy [] Egress;

    /**
    * Inbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ingress")
    @Expose
    private SecurityGroupPolicy [] Ingress;

    /**
     * Get The version number of the security group policy, which will automatically increase by one each time you update the security group policy, so as to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored. 
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Version The version number of the security group policy, which will automatically increase by one each time you update the security group policy, so as to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set The version number of the security group policy, which will automatically increase by one each time you update the security group policy, so as to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Version The version number of the security group policy, which will automatically increase by one each time you update the security group policy, so as to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Outbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Egress Outbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public SecurityGroupPolicy [] getEgress() {
        return this.Egress;
    }

    /**
     * Set Outbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Egress Outbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setEgress(SecurityGroupPolicy [] Egress) {
        this.Egress = Egress;
    }

    /**
     * Get Inbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Ingress Inbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public SecurityGroupPolicy [] getIngress() {
        return this.Ingress;
    }

    /**
     * Set Inbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Ingress Inbound rule. 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setIngress(SecurityGroupPolicy [] Ingress) {
        this.Ingress = Ingress;
    }

    public SecurityGroupPolicySet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicySet(SecurityGroupPolicySet source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Egress != null) {
            this.Egress = new SecurityGroupPolicy[source.Egress.length];
            for (int i = 0; i < source.Egress.length; i++) {
                this.Egress[i] = new SecurityGroupPolicy(source.Egress[i]);
            }
        }
        if (source.Ingress != null) {
            this.Ingress = new SecurityGroupPolicy[source.Ingress.length];
            for (int i = 0; i < source.Ingress.length; i++) {
                this.Ingress[i] = new SecurityGroupPolicy(source.Ingress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Egress.", this.Egress);
        this.setParamArrayObj(map, prefix + "Ingress.", this.Ingress);

    }
}

