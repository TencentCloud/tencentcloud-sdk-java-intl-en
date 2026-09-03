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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInterface extends AbstractModel {

    /**
    * <p>Network interface card type. This field is required in the request for each network interface.</p><p>Enumeration values:</p><ul><li>PRIMARY: Primary network interface</li><li>SECONDARY: Auxiliary network interface</li></ul><p>When configuring upper-level NetworkInterfaces, the array must explicitly contain and can only contain one PRIMARY. AS does not auto-complete the primary network interface.</p>
    */
    @SerializedName("InterfaceType")
    @Expose
    private String InterfaceType;

    /**
    * <p>Total number of private IPv4 addresses requested for the network interface card, including the primary IP.</p><p>Value range: [1, 40]</p><p>Required for SECONDARY network interface card requests; optional for PRIMARY network interface card requests. If left empty, it is processed as 1 only when constructing a CVM request copy during actual scaling, and is not written back to the launch configuration. The explicitly passed in value is passed through to CVM by AS, and finally validated by CVM/VPC.</p>
    */
    @SerializedName("PrivateIpv4AddressCount")
    @Expose
    private Long PrivateIpv4AddressCount;

    /**
    * <p>List of security group IDs bound to the ENI.</p><p>Input limit: up to 10.</p><p>For PRIMARY, a non-empty list explicitly configured in the network interface takes precedence over the SecurityGroupIds parameter in the launch configuration; if not configured in the network interface, the SecurityGroupIds parameter in the launch configuration is used. If neither is configured, AS does not specify security groups and proceeds with the CVM default rule. For SECONDARY, only the non-empty list explicitly configured in the network interface is passed through, and the SecurityGroupIds parameter in the launch configuration is not inherited.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Whether to reserve the auxiliary network interface when instance is terminated. Only applicable to SECONDARY.</p><p>Enumeration values:</p><ul><li>false: Do not retain the auxiliary network interface. It will destroy with the instance.</li><li>true: Retain the auxiliary network interface.</li></ul><p>Default value: false</p><p>PRIMARY does not allow configuration of true.</p>
    */
    @SerializedName("IsKeepENI")
    @Expose
    private Boolean IsKeepENI;

    /**
     * Get <p>Network interface card type. This field is required in the request for each network interface.</p><p>Enumeration values:</p><ul><li>PRIMARY: Primary network interface</li><li>SECONDARY: Auxiliary network interface</li></ul><p>When configuring upper-level NetworkInterfaces, the array must explicitly contain and can only contain one PRIMARY. AS does not auto-complete the primary network interface.</p> 
     * @return InterfaceType <p>Network interface card type. This field is required in the request for each network interface.</p><p>Enumeration values:</p><ul><li>PRIMARY: Primary network interface</li><li>SECONDARY: Auxiliary network interface</li></ul><p>When configuring upper-level NetworkInterfaces, the array must explicitly contain and can only contain one PRIMARY. AS does not auto-complete the primary network interface.</p>
     */
    public String getInterfaceType() {
        return this.InterfaceType;
    }

    /**
     * Set <p>Network interface card type. This field is required in the request for each network interface.</p><p>Enumeration values:</p><ul><li>PRIMARY: Primary network interface</li><li>SECONDARY: Auxiliary network interface</li></ul><p>When configuring upper-level NetworkInterfaces, the array must explicitly contain and can only contain one PRIMARY. AS does not auto-complete the primary network interface.</p>
     * @param InterfaceType <p>Network interface card type. This field is required in the request for each network interface.</p><p>Enumeration values:</p><ul><li>PRIMARY: Primary network interface</li><li>SECONDARY: Auxiliary network interface</li></ul><p>When configuring upper-level NetworkInterfaces, the array must explicitly contain and can only contain one PRIMARY. AS does not auto-complete the primary network interface.</p>
     */
    public void setInterfaceType(String InterfaceType) {
        this.InterfaceType = InterfaceType;
    }

    /**
     * Get <p>Total number of private IPv4 addresses requested for the network interface card, including the primary IP.</p><p>Value range: [1, 40]</p><p>Required for SECONDARY network interface card requests; optional for PRIMARY network interface card requests. If left empty, it is processed as 1 only when constructing a CVM request copy during actual scaling, and is not written back to the launch configuration. The explicitly passed in value is passed through to CVM by AS, and finally validated by CVM/VPC.</p> 
     * @return PrivateIpv4AddressCount <p>Total number of private IPv4 addresses requested for the network interface card, including the primary IP.</p><p>Value range: [1, 40]</p><p>Required for SECONDARY network interface card requests; optional for PRIMARY network interface card requests. If left empty, it is processed as 1 only when constructing a CVM request copy during actual scaling, and is not written back to the launch configuration. The explicitly passed in value is passed through to CVM by AS, and finally validated by CVM/VPC.</p>
     */
    public Long getPrivateIpv4AddressCount() {
        return this.PrivateIpv4AddressCount;
    }

    /**
     * Set <p>Total number of private IPv4 addresses requested for the network interface card, including the primary IP.</p><p>Value range: [1, 40]</p><p>Required for SECONDARY network interface card requests; optional for PRIMARY network interface card requests. If left empty, it is processed as 1 only when constructing a CVM request copy during actual scaling, and is not written back to the launch configuration. The explicitly passed in value is passed through to CVM by AS, and finally validated by CVM/VPC.</p>
     * @param PrivateIpv4AddressCount <p>Total number of private IPv4 addresses requested for the network interface card, including the primary IP.</p><p>Value range: [1, 40]</p><p>Required for SECONDARY network interface card requests; optional for PRIMARY network interface card requests. If left empty, it is processed as 1 only when constructing a CVM request copy during actual scaling, and is not written back to the launch configuration. The explicitly passed in value is passed through to CVM by AS, and finally validated by CVM/VPC.</p>
     */
    public void setPrivateIpv4AddressCount(Long PrivateIpv4AddressCount) {
        this.PrivateIpv4AddressCount = PrivateIpv4AddressCount;
    }

    /**
     * Get <p>List of security group IDs bound to the ENI.</p><p>Input limit: up to 10.</p><p>For PRIMARY, a non-empty list explicitly configured in the network interface takes precedence over the SecurityGroupIds parameter in the launch configuration; if not configured in the network interface, the SecurityGroupIds parameter in the launch configuration is used. If neither is configured, AS does not specify security groups and proceeds with the CVM default rule. For SECONDARY, only the non-empty list explicitly configured in the network interface is passed through, and the SecurityGroupIds parameter in the launch configuration is not inherited.</p> 
     * @return SecurityGroupIds <p>List of security group IDs bound to the ENI.</p><p>Input limit: up to 10.</p><p>For PRIMARY, a non-empty list explicitly configured in the network interface takes precedence over the SecurityGroupIds parameter in the launch configuration; if not configured in the network interface, the SecurityGroupIds parameter in the launch configuration is used. If neither is configured, AS does not specify security groups and proceeds with the CVM default rule. For SECONDARY, only the non-empty list explicitly configured in the network interface is passed through, and the SecurityGroupIds parameter in the launch configuration is not inherited.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>List of security group IDs bound to the ENI.</p><p>Input limit: up to 10.</p><p>For PRIMARY, a non-empty list explicitly configured in the network interface takes precedence over the SecurityGroupIds parameter in the launch configuration; if not configured in the network interface, the SecurityGroupIds parameter in the launch configuration is used. If neither is configured, AS does not specify security groups and proceeds with the CVM default rule. For SECONDARY, only the non-empty list explicitly configured in the network interface is passed through, and the SecurityGroupIds parameter in the launch configuration is not inherited.</p>
     * @param SecurityGroupIds <p>List of security group IDs bound to the ENI.</p><p>Input limit: up to 10.</p><p>For PRIMARY, a non-empty list explicitly configured in the network interface takes precedence over the SecurityGroupIds parameter in the launch configuration; if not configured in the network interface, the SecurityGroupIds parameter in the launch configuration is used. If neither is configured, AS does not specify security groups and proceeds with the CVM default rule. For SECONDARY, only the non-empty list explicitly configured in the network interface is passed through, and the SecurityGroupIds parameter in the launch configuration is not inherited.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Whether to reserve the auxiliary network interface when instance is terminated. Only applicable to SECONDARY.</p><p>Enumeration values:</p><ul><li>false: Do not retain the auxiliary network interface. It will destroy with the instance.</li><li>true: Retain the auxiliary network interface.</li></ul><p>Default value: false</p><p>PRIMARY does not allow configuration of true.</p> 
     * @return IsKeepENI <p>Whether to reserve the auxiliary network interface when instance is terminated. Only applicable to SECONDARY.</p><p>Enumeration values:</p><ul><li>false: Do not retain the auxiliary network interface. It will destroy with the instance.</li><li>true: Retain the auxiliary network interface.</li></ul><p>Default value: false</p><p>PRIMARY does not allow configuration of true.</p>
     */
    public Boolean getIsKeepENI() {
        return this.IsKeepENI;
    }

    /**
     * Set <p>Whether to reserve the auxiliary network interface when instance is terminated. Only applicable to SECONDARY.</p><p>Enumeration values:</p><ul><li>false: Do not retain the auxiliary network interface. It will destroy with the instance.</li><li>true: Retain the auxiliary network interface.</li></ul><p>Default value: false</p><p>PRIMARY does not allow configuration of true.</p>
     * @param IsKeepENI <p>Whether to reserve the auxiliary network interface when instance is terminated. Only applicable to SECONDARY.</p><p>Enumeration values:</p><ul><li>false: Do not retain the auxiliary network interface. It will destroy with the instance.</li><li>true: Retain the auxiliary network interface.</li></ul><p>Default value: false</p><p>PRIMARY does not allow configuration of true.</p>
     */
    public void setIsKeepENI(Boolean IsKeepENI) {
        this.IsKeepENI = IsKeepENI;
    }

    public NetworkInterface() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInterface(NetworkInterface source) {
        if (source.InterfaceType != null) {
            this.InterfaceType = new String(source.InterfaceType);
        }
        if (source.PrivateIpv4AddressCount != null) {
            this.PrivateIpv4AddressCount = new Long(source.PrivateIpv4AddressCount);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.IsKeepENI != null) {
            this.IsKeepENI = new Boolean(source.IsKeepENI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InterfaceType", this.InterfaceType);
        this.setParamSimple(map, prefix + "PrivateIpv4AddressCount", this.PrivateIpv4AddressCount);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "IsKeepENI", this.IsKeepENI);

    }
}

