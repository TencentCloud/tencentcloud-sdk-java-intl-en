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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcDnsInfo extends AbstractModel {

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * NAT firewall mode. 0: Create new; 1: Use existing
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * VPC IPv4 CIDR block (Classless Inter-Domain Routing)
    */
    @SerializedName("VpcIpv4Cidr")
    @Expose
    private String VpcIpv4Cidr;

    /**
    * Public EIP, which is the firewall DNS resolution address
    */
    @SerializedName("DNSEip")
    @Expose
    private String DNSEip;

    /**
    * NAT gateway ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * NAT gateway name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NatInsName")
    @Expose
    private String NatInsName;

    /**
    * 0: off; 1: on
    */
    @SerializedName("SwitchStatus")
    @Expose
    private Long SwitchStatus;

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get NAT firewall mode. 0: Create new; 1: Use existing 
     * @return FwMode NAT firewall mode. 0: Create new; 1: Use existing
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set NAT firewall mode. 0: Create new; 1: Use existing
     * @param FwMode NAT firewall mode. 0: Create new; 1: Use existing
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get VPC IPv4 CIDR block (Classless Inter-Domain Routing) 
     * @return VpcIpv4Cidr VPC IPv4 CIDR block (Classless Inter-Domain Routing)
     */
    public String getVpcIpv4Cidr() {
        return this.VpcIpv4Cidr;
    }

    /**
     * Set VPC IPv4 CIDR block (Classless Inter-Domain Routing)
     * @param VpcIpv4Cidr VPC IPv4 CIDR block (Classless Inter-Domain Routing)
     */
    public void setVpcIpv4Cidr(String VpcIpv4Cidr) {
        this.VpcIpv4Cidr = VpcIpv4Cidr;
    }

    /**
     * Get Public EIP, which is the firewall DNS resolution address 
     * @return DNSEip Public EIP, which is the firewall DNS resolution address
     */
    public String getDNSEip() {
        return this.DNSEip;
    }

    /**
     * Set Public EIP, which is the firewall DNS resolution address
     * @param DNSEip Public EIP, which is the firewall DNS resolution address
     */
    public void setDNSEip(String DNSEip) {
        this.DNSEip = DNSEip;
    }

    /**
     * Get NAT gateway ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NatInsId NAT gateway ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set NAT gateway ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param NatInsId NAT gateway ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get NAT gateway name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NatInsName NAT gateway name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getNatInsName() {
        return this.NatInsName;
    }

    /**
     * Set NAT gateway name
Note: This field may return `null`, indicating that no valid value was found.
     * @param NatInsName NAT gateway name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNatInsName(String NatInsName) {
        this.NatInsName = NatInsName;
    }

    /**
     * Get 0: off; 1: on 
     * @return SwitchStatus 0: off; 1: on
     */
    public Long getSwitchStatus() {
        return this.SwitchStatus;
    }

    /**
     * Set 0: off; 1: on
     * @param SwitchStatus 0: off; 1: on
     */
    public void setSwitchStatus(Long SwitchStatus) {
        this.SwitchStatus = SwitchStatus;
    }

    public VpcDnsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcDnsInfo(VpcDnsInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.VpcIpv4Cidr != null) {
            this.VpcIpv4Cidr = new String(source.VpcIpv4Cidr);
        }
        if (source.DNSEip != null) {
            this.DNSEip = new String(source.DNSEip);
        }
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.NatInsName != null) {
            this.NatInsName = new String(source.NatInsName);
        }
        if (source.SwitchStatus != null) {
            this.SwitchStatus = new Long(source.SwitchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "VpcIpv4Cidr", this.VpcIpv4Cidr);
        this.setParamSimple(map, prefix + "DNSEip", this.DNSEip);
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "NatInsName", this.NatInsName);
        this.setParamSimple(map, prefix + "SwitchStatus", this.SwitchStatus);

    }
}

