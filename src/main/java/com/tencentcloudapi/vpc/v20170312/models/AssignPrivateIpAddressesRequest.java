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

public class AssignPrivateIpAddressesRequest extends AbstractModel {

    /**
    * The ID of the ENI instance, such as `eni-m6dyj72l`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * The information on private IP addresses, of which you can specify a maximum of 10 at a time. You should provide either this parameter or SecondaryPrivateIpAddressCount, or both.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * The number of newly-applied private IP addresses. You should provide either this parameter or PrivateIpAddresses, or both. The total number of private IP addresses cannot exceed the quota. For more information, see<a href="/document/product/576/18527">ENI Use Limits</a>.
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * IP service level. It is used together with `SecondaryPrivateIpAddressCount`. Values: PT` (Gold), `AU` (Silver), `AG `(Bronze) and DEFAULT (Default).
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * 
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get The ID of the ENI instance, such as `eni-m6dyj72l`. 
     * @return NetworkInterfaceId The ID of the ENI instance, such as `eni-m6dyj72l`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The ID of the ENI instance, such as `eni-m6dyj72l`.
     * @param NetworkInterfaceId The ID of the ENI instance, such as `eni-m6dyj72l`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get The information on private IP addresses, of which you can specify a maximum of 10 at a time. You should provide either this parameter or SecondaryPrivateIpAddressCount, or both. 
     * @return PrivateIpAddresses The information on private IP addresses, of which you can specify a maximum of 10 at a time. You should provide either this parameter or SecondaryPrivateIpAddressCount, or both.
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set The information on private IP addresses, of which you can specify a maximum of 10 at a time. You should provide either this parameter or SecondaryPrivateIpAddressCount, or both.
     * @param PrivateIpAddresses The information on private IP addresses, of which you can specify a maximum of 10 at a time. You should provide either this parameter or SecondaryPrivateIpAddressCount, or both.
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get The number of newly-applied private IP addresses. You should provide either this parameter or PrivateIpAddresses, or both. The total number of private IP addresses cannot exceed the quota. For more information, see<a href="/document/product/576/18527">ENI Use Limits</a>. 
     * @return SecondaryPrivateIpAddressCount The number of newly-applied private IP addresses. You should provide either this parameter or PrivateIpAddresses, or both. The total number of private IP addresses cannot exceed the quota. For more information, see<a href="/document/product/576/18527">ENI Use Limits</a>.
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set The number of newly-applied private IP addresses. You should provide either this parameter or PrivateIpAddresses, or both. The total number of private IP addresses cannot exceed the quota. For more information, see<a href="/document/product/576/18527">ENI Use Limits</a>.
     * @param SecondaryPrivateIpAddressCount The number of newly-applied private IP addresses. You should provide either this parameter or PrivateIpAddresses, or both. The total number of private IP addresses cannot exceed the quota. For more information, see<a href="/document/product/576/18527">ENI Use Limits</a>.
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get IP service level. It is used together with `SecondaryPrivateIpAddressCount`. Values: PT` (Gold), `AU` (Silver), `AG `(Bronze) and DEFAULT (Default). 
     * @return QosLevel IP service level. It is used together with `SecondaryPrivateIpAddressCount`. Values: PT` (Gold), `AU` (Silver), `AG `(Bronze) and DEFAULT (Default).
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set IP service level. It is used together with `SecondaryPrivateIpAddressCount`. Values: PT` (Gold), `AU` (Silver), `AG `(Bronze) and DEFAULT (Default).
     * @param QosLevel IP service level. It is used together with `SecondaryPrivateIpAddressCount`. Values: PT` (Gold), `AU` (Silver), `AG `(Bronze) and DEFAULT (Default).
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get  
     * @return ClientToken 
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 
     * @param ClientToken 
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public AssignPrivateIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignPrivateIpAddressesRequest(AssignPrivateIpAddressesRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new PrivateIpAddressSpecification[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new PrivateIpAddressSpecification(source.PrivateIpAddresses[i]);
            }
        }
        if (source.SecondaryPrivateIpAddressCount != null) {
            this.SecondaryPrivateIpAddressCount = new Long(source.SecondaryPrivateIpAddressCount);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

