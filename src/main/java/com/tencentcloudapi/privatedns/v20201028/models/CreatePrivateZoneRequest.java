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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrivateZoneRequest extends AbstractModel{

    /**
    * Domain name, which must be in the format of standard TLD
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Tags the private domain when it is created
    */
    @SerializedName("TagSet")
    @Expose
    private TagInfo [] TagSet;

    /**
    * Associates the private domain to a VPC when it is created
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether to enable subdomain recursive DNS. Valid values: `ENABLED` (default) and `DISABLED`.
    */
    @SerializedName("DnsForwardStatus")
    @Expose
    private String DnsForwardStatus;

    /**
    * Associates the private domain to a VPC when it is created
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcInfo [] Vpcs;

    /**
    * List of authorized accounts' VPCs to associate with the private domain
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfo [] AccountVpcSet;

    /**
    * Whether to enable CNAME flattening. Valid values: `ENABLED` (default) and `DISABLED`.
    */
    @SerializedName("CnameSpeedupStatus")
    @Expose
    private String CnameSpeedupStatus;

    /**
     * Get Domain name, which must be in the format of standard TLD 
     * @return Domain Domain name, which must be in the format of standard TLD
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name, which must be in the format of standard TLD
     * @param Domain Domain name, which must be in the format of standard TLD
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Tags the private domain when it is created 
     * @return TagSet Tags the private domain when it is created
     */
    public TagInfo [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tags the private domain when it is created
     * @param TagSet Tags the private domain when it is created
     */
    public void setTagSet(TagInfo [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Associates the private domain to a VPC when it is created 
     * @return VpcSet Associates the private domain to a VPC when it is created
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set Associates the private domain to a VPC when it is created
     * @param VpcSet Associates the private domain to a VPC when it is created
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether to enable subdomain recursive DNS. Valid values: `ENABLED` (default) and `DISABLED`. 
     * @return DnsForwardStatus Whether to enable subdomain recursive DNS. Valid values: `ENABLED` (default) and `DISABLED`.
     */
    public String getDnsForwardStatus() {
        return this.DnsForwardStatus;
    }

    /**
     * Set Whether to enable subdomain recursive DNS. Valid values: `ENABLED` (default) and `DISABLED`.
     * @param DnsForwardStatus Whether to enable subdomain recursive DNS. Valid values: `ENABLED` (default) and `DISABLED`.
     */
    public void setDnsForwardStatus(String DnsForwardStatus) {
        this.DnsForwardStatus = DnsForwardStatus;
    }

    /**
     * Get Associates the private domain to a VPC when it is created 
     * @return Vpcs Associates the private domain to a VPC when it is created
     */
    public VpcInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set Associates the private domain to a VPC when it is created
     * @param Vpcs Associates the private domain to a VPC when it is created
     */
    public void setVpcs(VpcInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get List of authorized accounts' VPCs to associate with the private domain 
     * @return AccountVpcSet List of authorized accounts' VPCs to associate with the private domain
     */
    public AccountVpcInfo [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set List of authorized accounts' VPCs to associate with the private domain
     * @param AccountVpcSet List of authorized accounts' VPCs to associate with the private domain
     */
    public void setAccountVpcSet(AccountVpcInfo [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    /**
     * Get Whether to enable CNAME flattening. Valid values: `ENABLED` (default) and `DISABLED`. 
     * @return CnameSpeedupStatus Whether to enable CNAME flattening. Valid values: `ENABLED` (default) and `DISABLED`.
     */
    public String getCnameSpeedupStatus() {
        return this.CnameSpeedupStatus;
    }

    /**
     * Set Whether to enable CNAME flattening. Valid values: `ENABLED` (default) and `DISABLED`.
     * @param CnameSpeedupStatus Whether to enable CNAME flattening. Valid values: `ENABLED` (default) and `DISABLED`.
     */
    public void setCnameSpeedupStatus(String CnameSpeedupStatus) {
        this.CnameSpeedupStatus = CnameSpeedupStatus;
    }

    public CreatePrivateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateZoneRequest(CreatePrivateZoneRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagInfo[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagInfo(source.TagSet[i]);
            }
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DnsForwardStatus != null) {
            this.DnsForwardStatus = new String(source.DnsForwardStatus);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcInfo(source.Vpcs[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfo[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfo(source.AccountVpcSet[i]);
            }
        }
        if (source.CnameSpeedupStatus != null) {
            this.CnameSpeedupStatus = new String(source.CnameSpeedupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DnsForwardStatus", this.DnsForwardStatus);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);
        this.setParamSimple(map, prefix + "CnameSpeedupStatus", this.CnameSpeedupStatus);

    }
}

