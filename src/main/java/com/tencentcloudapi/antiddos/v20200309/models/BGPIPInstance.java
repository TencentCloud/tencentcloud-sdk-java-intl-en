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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPIPInstance extends AbstractModel{

    /**
    * Anti-DDoS instance details
    */
    @SerializedName("InstanceDetail")
    @Expose
    private InstanceRelation InstanceDetail;

    /**
    * Anti-DDoS instance specifications
    */
    @SerializedName("SpecificationLimit")
    @Expose
    private BGPIPInstanceSpecification SpecificationLimit;

    /**
    * Anti-DDoS instance usage statistics
    */
    @SerializedName("Usage")
    @Expose
    private BGPIPInstanceUsages Usage;

    /**
    * Region of the Anti-DDoS instance
    */
    @SerializedName("Region")
    @Expose
    private RegionInfo Region;

    /**
    * Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Purchase time
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Expired At
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Name of the Anti-DDoS instance
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PackInfo")
    @Expose
    private PackInfo PackInfo;

    /**
    * Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("StaticPackRelation")
    @Expose
    private StaticPackRelation StaticPackRelation;

    /**
    * Used to differentiate Anti-DDoS Advanced lines outside the Chinese mainland
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Tgw")
    @Expose
    private Long Tgw;

    /**
    * EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressStatus")
    @Expose
    private String EipAddressStatus;

    /**
    * Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipFlag")
    @Expose
    private Long EipFlag;

    /**
    * EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressPackRelation")
    @Expose
    private EipAddressPackRelation EipAddressPackRelation;

    /**
    * Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressInfo")
    @Expose
    private EipAddressRelation EipAddressInfo;

    /**
     * Get Anti-DDoS instance details 
     * @return InstanceDetail Anti-DDoS instance details
     */
    public InstanceRelation getInstanceDetail() {
        return this.InstanceDetail;
    }

    /**
     * Set Anti-DDoS instance details
     * @param InstanceDetail Anti-DDoS instance details
     */
    public void setInstanceDetail(InstanceRelation InstanceDetail) {
        this.InstanceDetail = InstanceDetail;
    }

    /**
     * Get Anti-DDoS instance specifications 
     * @return SpecificationLimit Anti-DDoS instance specifications
     */
    public BGPIPInstanceSpecification getSpecificationLimit() {
        return this.SpecificationLimit;
    }

    /**
     * Set Anti-DDoS instance specifications
     * @param SpecificationLimit Anti-DDoS instance specifications
     */
    public void setSpecificationLimit(BGPIPInstanceSpecification SpecificationLimit) {
        this.SpecificationLimit = SpecificationLimit;
    }

    /**
     * Get Anti-DDoS instance usage statistics 
     * @return Usage Anti-DDoS instance usage statistics
     */
    public BGPIPInstanceUsages getUsage() {
        return this.Usage;
    }

    /**
     * Set Anti-DDoS instance usage statistics
     * @param Usage Anti-DDoS instance usage statistics
     */
    public void setUsage(BGPIPInstanceUsages Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Region of the Anti-DDoS instance 
     * @return Region Region of the Anti-DDoS instance
     */
    public RegionInfo getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the Anti-DDoS instance
     * @param Region Region of the Anti-DDoS instance
     */
    public void setRegion(RegionInfo Region) {
        this.Region = Region;
    }

    /**
     * Get Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated 
     * @return Status Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
     * @param Status Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Purchase time 
     * @return ExpiredTime Purchase time
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Purchase time
     * @param ExpiredTime Purchase time
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Expired At 
     * @return CreatedTime Expired At
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Expired At
     * @param CreatedTime Expired At
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Name of the Anti-DDoS instance 
     * @return Name Name of the Anti-DDoS instance
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the Anti-DDoS instance
     * @param Name Name of the Anti-DDoS instance
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PackInfo Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public PackInfo getPackInfo() {
        return this.PackInfo;
    }

    /**
     * Set Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PackInfo Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPackInfo(PackInfo PackInfo) {
        this.PackInfo = PackInfo;
    }

    /**
     * Get Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return StaticPackRelation Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public StaticPackRelation getStaticPackRelation() {
        return this.StaticPackRelation;
    }

    /**
     * Set Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param StaticPackRelation Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStaticPackRelation(StaticPackRelation StaticPackRelation) {
        this.StaticPackRelation = StaticPackRelation;
    }

    /**
     * Get Used to differentiate Anti-DDoS Advanced lines outside the Chinese mainland
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ZoneId Used to differentiate Anti-DDoS Advanced lines outside the Chinese mainland
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Used to differentiate Anti-DDoS Advanced lines outside the Chinese mainland
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ZoneId Used to differentiate Anti-DDoS Advanced lines outside the Chinese mainland
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Tgw Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTgw() {
        return this.Tgw;
    }

    /**
     * Set Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Tgw Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTgw(Long Tgw) {
        this.Tgw = Tgw;
    }

    /**
     * Get EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressStatus EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEipAddressStatus() {
        return this.EipAddressStatus;
    }

    /**
     * Set EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressStatus EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressStatus(String EipAddressStatus) {
        this.EipAddressStatus = EipAddressStatus;
    }

    /**
     * Get Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipFlag Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getEipFlag() {
        return this.EipFlag;
    }

    /**
     * Set Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipFlag Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipFlag(Long EipFlag) {
        this.EipFlag = EipFlag;
    }

    /**
     * Get EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressPackRelation EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public EipAddressPackRelation getEipAddressPackRelation() {
        return this.EipAddressPackRelation;
    }

    /**
     * Set EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressPackRelation EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressPackRelation(EipAddressPackRelation EipAddressPackRelation) {
        this.EipAddressPackRelation = EipAddressPackRelation;
    }

    /**
     * Get Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressInfo Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public EipAddressRelation getEipAddressInfo() {
        return this.EipAddressInfo;
    }

    /**
     * Set Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressInfo Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressInfo(EipAddressRelation EipAddressInfo) {
        this.EipAddressInfo = EipAddressInfo;
    }

    public BGPIPInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstance(BGPIPInstance source) {
        if (source.InstanceDetail != null) {
            this.InstanceDetail = new InstanceRelation(source.InstanceDetail);
        }
        if (source.SpecificationLimit != null) {
            this.SpecificationLimit = new BGPIPInstanceSpecification(source.SpecificationLimit);
        }
        if (source.Usage != null) {
            this.Usage = new BGPIPInstanceUsages(source.Usage);
        }
        if (source.Region != null) {
            this.Region = new RegionInfo(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PackInfo != null) {
            this.PackInfo = new PackInfo(source.PackInfo);
        }
        if (source.StaticPackRelation != null) {
            this.StaticPackRelation = new StaticPackRelation(source.StaticPackRelation);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Tgw != null) {
            this.Tgw = new Long(source.Tgw);
        }
        if (source.EipAddressStatus != null) {
            this.EipAddressStatus = new String(source.EipAddressStatus);
        }
        if (source.EipFlag != null) {
            this.EipFlag = new Long(source.EipFlag);
        }
        if (source.EipAddressPackRelation != null) {
            this.EipAddressPackRelation = new EipAddressPackRelation(source.EipAddressPackRelation);
        }
        if (source.EipAddressInfo != null) {
            this.EipAddressInfo = new EipAddressRelation(source.EipAddressInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceDetail.", this.InstanceDetail);
        this.setParamObj(map, prefix + "SpecificationLimit.", this.SpecificationLimit);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamObj(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PackInfo.", this.PackInfo);
        this.setParamObj(map, prefix + "StaticPackRelation.", this.StaticPackRelation);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Tgw", this.Tgw);
        this.setParamSimple(map, prefix + "EipAddressStatus", this.EipAddressStatus);
        this.setParamSimple(map, prefix + "EipFlag", this.EipFlag);
        this.setParamObj(map, prefix + "EipAddressPackRelation.", this.EipAddressPackRelation);
        this.setParamObj(map, prefix + "EipAddressInfo.", this.EipAddressInfo);

    }
}

