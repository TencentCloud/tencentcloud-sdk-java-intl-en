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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Endpoint extends AbstractModel {

    /**
    * Access point type, with the enumerated values as follows:.

- VPC: specifies the VPC network.

-PUBLIC: public network.

-INTERNAL: specifies the support network.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Status.
OPEN: indicates to start or activate a function.
CLOSE: indicates the closed state.
PROCESSING: operation in progress.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Payment type, only public network.
PREPAID: annual/monthly package.
Pay-As-You-Go.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Access point address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndpointUrl")
    @Expose
    private String EndpointUrl;

    /**
    * VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specifies the subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Public network bandwidth, in Mbps

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Public network access rules

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * Whether the public network is billed by traffic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
     * Get Access point type, with the enumerated values as follows:.

- VPC: specifies the VPC network.

-PUBLIC: public network.

-INTERNAL: specifies the support network. 
     * @return Type Access point type, with the enumerated values as follows:.

- VPC: specifies the VPC network.

-PUBLIC: public network.

-INTERNAL: specifies the support network.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Access point type, with the enumerated values as follows:.

- VPC: specifies the VPC network.

-PUBLIC: public network.

-INTERNAL: specifies the support network.
     * @param Type Access point type, with the enumerated values as follows:.

- VPC: specifies the VPC network.

-PUBLIC: public network.

-INTERNAL: specifies the support network.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Status.
OPEN: indicates to start or activate a function.
CLOSE: indicates the closed state.
PROCESSING: operation in progress. 
     * @return Status Status.
OPEN: indicates to start or activate a function.
CLOSE: indicates the closed state.
PROCESSING: operation in progress.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
OPEN: indicates to start or activate a function.
CLOSE: indicates the closed state.
PROCESSING: operation in progress.
     * @param Status Status.
OPEN: indicates to start or activate a function.
CLOSE: indicates the closed state.
PROCESSING: operation in progress.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Payment type, only public network.
PREPAID: annual/monthly package.
Pay-As-You-Go.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Payment type, only public network.
PREPAID: annual/monthly package.
Pay-As-You-Go.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment type, only public network.
PREPAID: annual/monthly package.
Pay-As-You-Go.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Payment type, only public network.
PREPAID: annual/monthly package.
Pay-As-You-Go.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Access point address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndpointUrl Access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndpointUrl() {
        return this.EndpointUrl;
    }

    /**
     * Set Access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndpointUrl Access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndpointUrl(String EndpointUrl) {
        this.EndpointUrl = EndpointUrl;
    }

    /**
     * Get VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specifies the subnet ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Specifies the subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Specifies the subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Specifies the subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Public network bandwidth, in Mbps

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bandwidth Public network bandwidth, in Mbps

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Public network bandwidth, in Mbps

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bandwidth Public network bandwidth, in Mbps

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Public network access rules

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpRules Public network access rules

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set Public network access rules

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpRules Public network access rules

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get Whether the public network is billed by traffic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingFlow Whether the public network is billed by traffic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set Whether the public network is billed by traffic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingFlow Whether the public network is billed by traffic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    public Endpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endpoint(Endpoint source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.EndpointUrl != null) {
            this.EndpointUrl = new String(source.EndpointUrl);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "EndpointUrl", this.EndpointUrl);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);

    }
}

