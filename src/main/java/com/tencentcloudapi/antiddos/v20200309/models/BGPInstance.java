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

public class BGPInstance extends AbstractModel{

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
    private BGPInstanceSpecification SpecificationLimit;

    /**
    * Anti-DDoS instance usage statistics
    */
    @SerializedName("Usage")
    @Expose
    private BGPInstanceUsages Usage;

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
`deblocking`: unblocked
`isolate`: isolated
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Purchase Time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

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
    * Details of the cloud product used by the EIP bound to the Anti-DDoS Pro instance
    */
    @SerializedName("EipProductInfos")
    @Expose
    private EipProductInfo [] EipProductInfos;

    /**
    * Binding status of the Anti-DDoS Pro instance
`idle`: the instance is bound.
 `bounding`: the instance is in binding.
`failed`: the binding failed.
]
    */
    @SerializedName("BoundStatus")
    @Expose
    private String BoundStatus;

    /**
    * Layer-4 protection level
    */
    @SerializedName("DDoSLevel")
    @Expose
    private String DDoSLevel;

    /**
    * CC protection switch
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

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
    public BGPInstanceSpecification getSpecificationLimit() {
        return this.SpecificationLimit;
    }

    /**
     * Set Anti-DDoS instance specifications
     * @param SpecificationLimit Anti-DDoS instance specifications
     */
    public void setSpecificationLimit(BGPInstanceSpecification SpecificationLimit) {
        this.SpecificationLimit = SpecificationLimit;
    }

    /**
     * Get Anti-DDoS instance usage statistics 
     * @return Usage Anti-DDoS instance usage statistics
     */
    public BGPInstanceUsages getUsage() {
        return this.Usage;
    }

    /**
     * Set Anti-DDoS instance usage statistics
     * @param Usage Anti-DDoS instance usage statistics
     */
    public void setUsage(BGPInstanceUsages Usage) {
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
`deblocking`: unblocked
`isolate`: isolated 
     * @return Status Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocked
`isolate`: isolated
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
`deblocking`: unblocked
`isolate`: isolated
     * @param Status Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocked
`isolate`: isolated
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Purchase Time 
     * @return CreatedTime Purchase Time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Purchase Time
     * @param CreatedTime Purchase Time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Expiration time 
     * @return ExpiredTime Expiration time
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time
     * @param ExpiredTime Expiration time
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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
     * Get Details of the cloud product used by the EIP bound to the Anti-DDoS Pro instance 
     * @return EipProductInfos Details of the cloud product used by the EIP bound to the Anti-DDoS Pro instance
     */
    public EipProductInfo [] getEipProductInfos() {
        return this.EipProductInfos;
    }

    /**
     * Set Details of the cloud product used by the EIP bound to the Anti-DDoS Pro instance
     * @param EipProductInfos Details of the cloud product used by the EIP bound to the Anti-DDoS Pro instance
     */
    public void setEipProductInfos(EipProductInfo [] EipProductInfos) {
        this.EipProductInfos = EipProductInfos;
    }

    /**
     * Get Binding status of the Anti-DDoS Pro instance
`idle`: the instance is bound.
 `bounding`: the instance is in binding.
`failed`: the binding failed.
] 
     * @return BoundStatus Binding status of the Anti-DDoS Pro instance
`idle`: the instance is bound.
 `bounding`: the instance is in binding.
`failed`: the binding failed.
]
     */
    public String getBoundStatus() {
        return this.BoundStatus;
    }

    /**
     * Set Binding status of the Anti-DDoS Pro instance
`idle`: the instance is bound.
 `bounding`: the instance is in binding.
`failed`: the binding failed.
]
     * @param BoundStatus Binding status of the Anti-DDoS Pro instance
`idle`: the instance is bound.
 `bounding`: the instance is in binding.
`failed`: the binding failed.
]
     */
    public void setBoundStatus(String BoundStatus) {
        this.BoundStatus = BoundStatus;
    }

    /**
     * Get Layer-4 protection level 
     * @return DDoSLevel Layer-4 protection level
     */
    public String getDDoSLevel() {
        return this.DDoSLevel;
    }

    /**
     * Set Layer-4 protection level
     * @param DDoSLevel Layer-4 protection level
     */
    public void setDDoSLevel(String DDoSLevel) {
        this.DDoSLevel = DDoSLevel;
    }

    /**
     * Get CC protection switch 
     * @return CCEnable CC protection switch
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC protection switch
     * @param CCEnable CC protection switch
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    public BGPInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstance(BGPInstance source) {
        if (source.InstanceDetail != null) {
            this.InstanceDetail = new InstanceRelation(source.InstanceDetail);
        }
        if (source.SpecificationLimit != null) {
            this.SpecificationLimit = new BGPInstanceSpecification(source.SpecificationLimit);
        }
        if (source.Usage != null) {
            this.Usage = new BGPInstanceUsages(source.Usage);
        }
        if (source.Region != null) {
            this.Region = new RegionInfo(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PackInfo != null) {
            this.PackInfo = new PackInfo(source.PackInfo);
        }
        if (source.EipProductInfos != null) {
            this.EipProductInfos = new EipProductInfo[source.EipProductInfos.length];
            for (int i = 0; i < source.EipProductInfos.length; i++) {
                this.EipProductInfos[i] = new EipProductInfo(source.EipProductInfos[i]);
            }
        }
        if (source.BoundStatus != null) {
            this.BoundStatus = new String(source.BoundStatus);
        }
        if (source.DDoSLevel != null) {
            this.DDoSLevel = new String(source.DDoSLevel);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
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
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PackInfo.", this.PackInfo);
        this.setParamArrayObj(map, prefix + "EipProductInfos.", this.EipProductInfos);
        this.setParamSimple(map, prefix + "BoundStatus", this.BoundStatus);
        this.setParamSimple(map, prefix + "DDoSLevel", this.DDoSLevel);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);

    }
}

