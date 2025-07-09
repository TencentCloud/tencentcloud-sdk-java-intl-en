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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkInterfaceAttributeRequest extends AbstractModel {

    /**
    * The ID of the ENI instance, such as `eni-pxir56ns`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * The name of the ENI. The maximum length is 60 characters.
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * ENI description can be named freely, but the maximum length is 60 characters.
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * The specified security groups to be bound with, such as ['sg-1dd51d'].
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
    */
    @SerializedName("TrunkingFlag")
    @Expose
    private String TrunkingFlag;

    /**
     * Get The ID of the ENI instance, such as `eni-pxir56ns`. 
     * @return NetworkInterfaceId The ID of the ENI instance, such as `eni-pxir56ns`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The ID of the ENI instance, such as `eni-pxir56ns`.
     * @param NetworkInterfaceId The ID of the ENI instance, such as `eni-pxir56ns`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get The name of the ENI. The maximum length is 60 characters. 
     * @return NetworkInterfaceName The name of the ENI. The maximum length is 60 characters.
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set The name of the ENI. The maximum length is 60 characters.
     * @param NetworkInterfaceName The name of the ENI. The maximum length is 60 characters.
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get ENI description can be named freely, but the maximum length is 60 characters. 
     * @return NetworkInterfaceDescription ENI description can be named freely, but the maximum length is 60 characters.
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set ENI description can be named freely, but the maximum length is 60 characters.
     * @param NetworkInterfaceDescription ENI description can be named freely, but the maximum length is 60 characters.
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get The specified security groups to be bound with, such as ['sg-1dd51d']. 
     * @return SecurityGroupIds The specified security groups to be bound with, such as ['sg-1dd51d'].
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The specified security groups to be bound with, such as ['sg-1dd51d'].
     * @param SecurityGroupIds The specified security groups to be bound with, such as ['sg-1dd51d'].
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`. 
     * @return TrunkingFlag Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
     */
    public String getTrunkingFlag() {
        return this.TrunkingFlag;
    }

    /**
     * Set Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
     * @param TrunkingFlag Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
     */
    public void setTrunkingFlag(String TrunkingFlag) {
        this.TrunkingFlag = TrunkingFlag;
    }

    public ModifyNetworkInterfaceAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkInterfaceAttributeRequest(ModifyNetworkInterfaceAttributeRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.TrunkingFlag != null) {
            this.TrunkingFlag = new String(source.TrunkingFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "TrunkingFlag", this.TrunkingFlag);

    }
}

