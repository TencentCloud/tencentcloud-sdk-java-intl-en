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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPInstance extends AbstractModel {

    /**
    * Details of the Anti-DDoS Pro instance
    */
    @SerializedName("InstanceDetail")
    @Expose
    private InstanceRelation InstanceDetail;

    /**
    * Specifications of the Anti-DDoS Pro instance
    */
    @SerializedName("SpecificationLimit")
    @Expose
    private BGPInstanceSpecification SpecificationLimit;

    /**
    * Usage statistics of the Anti-DDoS Pro instance
    */
    @SerializedName("Usage")
    @Expose
    private BGPInstanceUsages Usage;

    /**
    * Region of the Anti-DDoS Pro instance
    */
    @SerializedName("Region")
    @Expose
    private RegionInfo Region;

    /**
    * Status of the Anti-DDoS Pro instance. Valid values:
`idle`: The instance is running normally.
`attacking`: The instance is under attack.
`blocking`: The instance is blocked.
`creating`: The instance is being created.
`deblocking`: Unblocking the instance
`isolate`: The instance is being isolated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Purchase time
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
    * Name of the Anti-DDoS Pro instance
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Details of the package to which the Anti-DDoS Pro instance belongs.
When the package provided is not used by the instance, this field is `null`.
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
`idle`: The instance is bound.
 `bounding`: Binding the instance.
`failed`: Failed to bind
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
    * Status of CC protection
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * Tags associated with the resource
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * New edition of Anti-DDoS Pro
    */
    @SerializedName("IpCountNewFlag")
    @Expose
    private Long IpCountNewFlag;

    /**
    * The version of attack defense package
    */
    @SerializedName("VitalityVersion")
    @Expose
    private Long VitalityVersion;

    /**
    * Network line
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * Whether to enable elastic bandwidth
    */
    @SerializedName("ElasticServiceBandwidth")
    @Expose
    private Long ElasticServiceBandwidth;

    /**
    * Bandwidth quota given away by Tencent Cloud
    */
    @SerializedName("GiftServiceBandWidth")
    @Expose
    private Long GiftServiceBandWidth;

    /**
     * Get Details of the Anti-DDoS Pro instance 
     * @return InstanceDetail Details of the Anti-DDoS Pro instance
     */
    public InstanceRelation getInstanceDetail() {
        return this.InstanceDetail;
    }

    /**
     * Set Details of the Anti-DDoS Pro instance
     * @param InstanceDetail Details of the Anti-DDoS Pro instance
     */
    public void setInstanceDetail(InstanceRelation InstanceDetail) {
        this.InstanceDetail = InstanceDetail;
    }

    /**
     * Get Specifications of the Anti-DDoS Pro instance 
     * @return SpecificationLimit Specifications of the Anti-DDoS Pro instance
     */
    public BGPInstanceSpecification getSpecificationLimit() {
        return this.SpecificationLimit;
    }

    /**
     * Set Specifications of the Anti-DDoS Pro instance
     * @param SpecificationLimit Specifications of the Anti-DDoS Pro instance
     */
    public void setSpecificationLimit(BGPInstanceSpecification SpecificationLimit) {
        this.SpecificationLimit = SpecificationLimit;
    }

    /**
     * Get Usage statistics of the Anti-DDoS Pro instance 
     * @return Usage Usage statistics of the Anti-DDoS Pro instance
     */
    public BGPInstanceUsages getUsage() {
        return this.Usage;
    }

    /**
     * Set Usage statistics of the Anti-DDoS Pro instance
     * @param Usage Usage statistics of the Anti-DDoS Pro instance
     */
    public void setUsage(BGPInstanceUsages Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Region of the Anti-DDoS Pro instance 
     * @return Region Region of the Anti-DDoS Pro instance
     */
    public RegionInfo getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the Anti-DDoS Pro instance
     * @param Region Region of the Anti-DDoS Pro instance
     */
    public void setRegion(RegionInfo Region) {
        this.Region = Region;
    }

    /**
     * Get Status of the Anti-DDoS Pro instance. Valid values:
`idle`: The instance is running normally.
`attacking`: The instance is under attack.
`blocking`: The instance is blocked.
`creating`: The instance is being created.
`deblocking`: Unblocking the instance
`isolate`: The instance is being isolated. 
     * @return Status Status of the Anti-DDoS Pro instance. Valid values:
`idle`: The instance is running normally.
`attacking`: The instance is under attack.
`blocking`: The instance is blocked.
`creating`: The instance is being created.
`deblocking`: Unblocking the instance
`isolate`: The instance is being isolated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the Anti-DDoS Pro instance. Valid values:
`idle`: The instance is running normally.
`attacking`: The instance is under attack.
`blocking`: The instance is blocked.
`creating`: The instance is being created.
`deblocking`: Unblocking the instance
`isolate`: The instance is being isolated.
     * @param Status Status of the Anti-DDoS Pro instance. Valid values:
`idle`: The instance is running normally.
`attacking`: The instance is under attack.
`blocking`: The instance is blocked.
`creating`: The instance is being created.
`deblocking`: Unblocking the instance
`isolate`: The instance is being isolated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Purchase time 
     * @return CreatedTime Purchase time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Purchase time
     * @param CreatedTime Purchase time
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
     * Get Name of the Anti-DDoS Pro instance 
     * @return Name Name of the Anti-DDoS Pro instance
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the Anti-DDoS Pro instance
     * @param Name Name of the Anti-DDoS Pro instance
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Details of the package to which the Anti-DDoS Pro instance belongs.
When the package provided is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PackInfo Details of the package to which the Anti-DDoS Pro instance belongs.
When the package provided is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public PackInfo getPackInfo() {
        return this.PackInfo;
    }

    /**
     * Set Details of the package to which the Anti-DDoS Pro instance belongs.
When the package provided is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PackInfo Details of the package to which the Anti-DDoS Pro instance belongs.
When the package provided is not used by the instance, this field is `null`.
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
`idle`: The instance is bound.
 `bounding`: Binding the instance.
`failed`: Failed to bind
] 
     * @return BoundStatus Binding status of the Anti-DDoS Pro instance
`idle`: The instance is bound.
 `bounding`: Binding the instance.
`failed`: Failed to bind
]
     */
    public String getBoundStatus() {
        return this.BoundStatus;
    }

    /**
     * Set Binding status of the Anti-DDoS Pro instance
`idle`: The instance is bound.
 `bounding`: Binding the instance.
`failed`: Failed to bind
]
     * @param BoundStatus Binding status of the Anti-DDoS Pro instance
`idle`: The instance is bound.
 `bounding`: Binding the instance.
`failed`: Failed to bind
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
     * Get Status of CC protection 
     * @return CCEnable Status of CC protection
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set Status of CC protection
     * @param CCEnable Status of CC protection
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get Tags associated with the resource 
     * @return TagInfoList Tags associated with the resource
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set Tags associated with the resource
     * @param TagInfoList Tags associated with the resource
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get New edition of Anti-DDoS Pro 
     * @return IpCountNewFlag New edition of Anti-DDoS Pro
     */
    public Long getIpCountNewFlag() {
        return this.IpCountNewFlag;
    }

    /**
     * Set New edition of Anti-DDoS Pro
     * @param IpCountNewFlag New edition of Anti-DDoS Pro
     */
    public void setIpCountNewFlag(Long IpCountNewFlag) {
        this.IpCountNewFlag = IpCountNewFlag;
    }

    /**
     * Get The version of attack defense package 
     * @return VitalityVersion The version of attack defense package
     */
    public Long getVitalityVersion() {
        return this.VitalityVersion;
    }

    /**
     * Set The version of attack defense package
     * @param VitalityVersion The version of attack defense package
     */
    public void setVitalityVersion(Long VitalityVersion) {
        this.VitalityVersion = VitalityVersion;
    }

    /**
     * Get Network line
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Line Network line
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set Network line
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Line Network line
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get Whether to enable elastic bandwidth 
     * @return ElasticServiceBandwidth Whether to enable elastic bandwidth
     */
    public Long getElasticServiceBandwidth() {
        return this.ElasticServiceBandwidth;
    }

    /**
     * Set Whether to enable elastic bandwidth
     * @param ElasticServiceBandwidth Whether to enable elastic bandwidth
     */
    public void setElasticServiceBandwidth(Long ElasticServiceBandwidth) {
        this.ElasticServiceBandwidth = ElasticServiceBandwidth;
    }

    /**
     * Get Bandwidth quota given away by Tencent Cloud 
     * @return GiftServiceBandWidth Bandwidth quota given away by Tencent Cloud
     */
    public Long getGiftServiceBandWidth() {
        return this.GiftServiceBandWidth;
    }

    /**
     * Set Bandwidth quota given away by Tencent Cloud
     * @param GiftServiceBandWidth Bandwidth quota given away by Tencent Cloud
     */
    public void setGiftServiceBandWidth(Long GiftServiceBandWidth) {
        this.GiftServiceBandWidth = GiftServiceBandWidth;
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
        if (source.TagInfoList != null) {
            this.TagInfoList = new TagInfo[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new TagInfo(source.TagInfoList[i]);
            }
        }
        if (source.IpCountNewFlag != null) {
            this.IpCountNewFlag = new Long(source.IpCountNewFlag);
        }
        if (source.VitalityVersion != null) {
            this.VitalityVersion = new Long(source.VitalityVersion);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.ElasticServiceBandwidth != null) {
            this.ElasticServiceBandwidth = new Long(source.ElasticServiceBandwidth);
        }
        if (source.GiftServiceBandWidth != null) {
            this.GiftServiceBandWidth = new Long(source.GiftServiceBandWidth);
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
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamSimple(map, prefix + "IpCountNewFlag", this.IpCountNewFlag);
        this.setParamSimple(map, prefix + "VitalityVersion", this.VitalityVersion);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "ElasticServiceBandwidth", this.ElasticServiceBandwidth);
        this.setParamSimple(map, prefix + "GiftServiceBandWidth", this.GiftServiceBandWidth);

    }
}

