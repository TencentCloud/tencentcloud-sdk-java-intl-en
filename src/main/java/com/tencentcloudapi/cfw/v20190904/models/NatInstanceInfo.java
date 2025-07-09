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

public class NatInstanceInfo extends AbstractModel {

    /**
    * NAT instance ID
    */
    @SerializedName("NatinsId")
    @Expose
    private String NatinsId;

    /**
    * NAT instance name
    */
    @SerializedName("NatinsName")
    @Expose
    private String NatinsName;

    /**
    * Instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 0: create new; 1: use existing
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * Instance bandwidth (Mbps)
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Inbound traffic peak bandwidth (bps)
    */
    @SerializedName("InFlowMax")
    @Expose
    private Long InFlowMax;

    /**
    * Outbound traffic peak bandwidth (bps)
    */
    @SerializedName("OutFlowMax")
    @Expose
    private Long OutFlowMax;

    /**
    * Chinese region information
    */
    @SerializedName("RegionZh")
    @Expose
    private String RegionZh;

    /**
    * Public IP array
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EipAddress")
    @Expose
    private String [] EipAddress;

    /**
    * Array of internal and external IPs
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VpcIp")
    @Expose
    private String [] VpcIp;

    /**
    * Array of subnets associated with an instance
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * 0: normal 1: initializing
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Region information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionDetail")
    @Expose
    private String RegionDetail;

    /**
    * Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneZhBak")
    @Expose
    private String ZoneZhBak;

    /**
    * Number of used rules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleUsed")
    @Expose
    private Long RuleUsed;

    /**
    * The maximum number of rules allowed in the instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleMax")
    @Expose
    private Long RuleMax;

    /**
     * Get NAT instance ID 
     * @return NatinsId NAT instance ID
     */
    public String getNatinsId() {
        return this.NatinsId;
    }

    /**
     * Set NAT instance ID
     * @param NatinsId NAT instance ID
     */
    public void setNatinsId(String NatinsId) {
        this.NatinsId = NatinsId;
    }

    /**
     * Get NAT instance name 
     * @return NatinsName NAT instance name
     */
    public String getNatinsName() {
        return this.NatinsName;
    }

    /**
     * Set NAT instance name
     * @param NatinsName NAT instance name
     */
    public void setNatinsName(String NatinsName) {
        this.NatinsName = NatinsName;
    }

    /**
     * Get Instance region 
     * @return Region Instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
     * @param Region Instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 0: create new; 1: use existing 
     * @return FwMode 0: create new; 1: use existing
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set 0: create new; 1: use existing
     * @param FwMode 0: create new; 1: use existing
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get Instance bandwidth (Mbps) 
     * @return BandWidth Instance bandwidth (Mbps)
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Instance bandwidth (Mbps)
     * @param BandWidth Instance bandwidth (Mbps)
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Inbound traffic peak bandwidth (bps) 
     * @return InFlowMax Inbound traffic peak bandwidth (bps)
     */
    public Long getInFlowMax() {
        return this.InFlowMax;
    }

    /**
     * Set Inbound traffic peak bandwidth (bps)
     * @param InFlowMax Inbound traffic peak bandwidth (bps)
     */
    public void setInFlowMax(Long InFlowMax) {
        this.InFlowMax = InFlowMax;
    }

    /**
     * Get Outbound traffic peak bandwidth (bps) 
     * @return OutFlowMax Outbound traffic peak bandwidth (bps)
     */
    public Long getOutFlowMax() {
        return this.OutFlowMax;
    }

    /**
     * Set Outbound traffic peak bandwidth (bps)
     * @param OutFlowMax Outbound traffic peak bandwidth (bps)
     */
    public void setOutFlowMax(Long OutFlowMax) {
        this.OutFlowMax = OutFlowMax;
    }

    /**
     * Get Chinese region information 
     * @return RegionZh Chinese region information
     */
    public String getRegionZh() {
        return this.RegionZh;
    }

    /**
     * Set Chinese region information
     * @param RegionZh Chinese region information
     */
    public void setRegionZh(String RegionZh) {
        this.RegionZh = RegionZh;
    }

    /**
     * Get Public IP array
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EipAddress Public IP array
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set Public IP array
Note: This field may return `null`, indicating that no valid value was found.
     * @param EipAddress Public IP array
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEipAddress(String [] EipAddress) {
        this.EipAddress = EipAddress;
    }

    /**
     * Get Array of internal and external IPs
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VpcIp Array of internal and external IPs
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getVpcIp() {
        return this.VpcIp;
    }

    /**
     * Set Array of internal and external IPs
Note: This field may return `null`, indicating that no valid value was found.
     * @param VpcIp Array of internal and external IPs
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVpcIp(String [] VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * Get Array of subnets associated with an instance
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Subnets Array of subnets associated with an instance
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set Array of subnets associated with an instance
Note: This field may return `null`, indicating that no valid value was found.
     * @param Subnets Array of subnets associated with an instance
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get 0: normal 1: initializing
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Status 0: normal 1: initializing
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: normal 1: initializing
Note: This field may return `null`, indicating that no valid value was found.
     * @param Status 0: normal 1: initializing
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Region information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionDetail Region information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionDetail() {
        return this.RegionDetail;
    }

    /**
     * Set Region information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionDetail Region information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionDetail(String RegionDetail) {
        this.RegionDetail = RegionDetail;
    }

    /**
     * Get Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneZh Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneZh Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneZhBak Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneZhBak() {
        return this.ZoneZhBak;
    }

    /**
     * Set Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneZhBak Availability zone of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneZhBak(String ZoneZhBak) {
        this.ZoneZhBak = ZoneZhBak;
    }

    /**
     * Get Number of used rules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleUsed Number of used rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleUsed() {
        return this.RuleUsed;
    }

    /**
     * Set Number of used rules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleUsed Number of used rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleUsed(Long RuleUsed) {
        this.RuleUsed = RuleUsed;
    }

    /**
     * Get The maximum number of rules allowed in the instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleMax The maximum number of rules allowed in the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleMax() {
        return this.RuleMax;
    }

    /**
     * Set The maximum number of rules allowed in the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleMax The maximum number of rules allowed in the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleMax(Long RuleMax) {
        this.RuleMax = RuleMax;
    }

    public NatInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatInstanceInfo(NatInstanceInfo source) {
        if (source.NatinsId != null) {
            this.NatinsId = new String(source.NatinsId);
        }
        if (source.NatinsName != null) {
            this.NatinsName = new String(source.NatinsName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.InFlowMax != null) {
            this.InFlowMax = new Long(source.InFlowMax);
        }
        if (source.OutFlowMax != null) {
            this.OutFlowMax = new Long(source.OutFlowMax);
        }
        if (source.RegionZh != null) {
            this.RegionZh = new String(source.RegionZh);
        }
        if (source.EipAddress != null) {
            this.EipAddress = new String[source.EipAddress.length];
            for (int i = 0; i < source.EipAddress.length; i++) {
                this.EipAddress[i] = new String(source.EipAddress[i]);
            }
        }
        if (source.VpcIp != null) {
            this.VpcIp = new String[source.VpcIp.length];
            for (int i = 0; i < source.VpcIp.length; i++) {
                this.VpcIp[i] = new String(source.VpcIp[i]);
            }
        }
        if (source.Subnets != null) {
            this.Subnets = new String[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new String(source.Subnets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RegionDetail != null) {
            this.RegionDetail = new String(source.RegionDetail);
        }
        if (source.ZoneZh != null) {
            this.ZoneZh = new String(source.ZoneZh);
        }
        if (source.ZoneZhBak != null) {
            this.ZoneZhBak = new String(source.ZoneZhBak);
        }
        if (source.RuleUsed != null) {
            this.RuleUsed = new Long(source.RuleUsed);
        }
        if (source.RuleMax != null) {
            this.RuleMax = new Long(source.RuleMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatinsId", this.NatinsId);
        this.setParamSimple(map, prefix + "NatinsName", this.NatinsName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "InFlowMax", this.InFlowMax);
        this.setParamSimple(map, prefix + "OutFlowMax", this.OutFlowMax);
        this.setParamSimple(map, prefix + "RegionZh", this.RegionZh);
        this.setParamArraySimple(map, prefix + "EipAddress.", this.EipAddress);
        this.setParamArraySimple(map, prefix + "VpcIp.", this.VpcIp);
        this.setParamArraySimple(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RegionDetail", this.RegionDetail);
        this.setParamSimple(map, prefix + "ZoneZh", this.ZoneZh);
        this.setParamSimple(map, prefix + "ZoneZhBak", this.ZoneZhBak);
        this.setParamSimple(map, prefix + "RuleUsed", this.RuleUsed);
        this.setParamSimple(map, prefix + "RuleMax", this.RuleMax);

    }
}

