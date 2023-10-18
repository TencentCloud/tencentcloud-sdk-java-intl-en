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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescAcItem extends AbstractModel {

    /**
    * Access source.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Access destination.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Action that Cloud Firewall performs on the traffic. Valid values: accept (allow), drop (reject), and log (monitor).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of rule matching times.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Rule sequence number.
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Access source type. Valid values for an inbound rule: ip, net, template, and location; valid values for an outbound rule: ip, net, template, instance, group, and tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Access destination type. Valid values for an inbound rule: ip, net, template, instance, group, and tag; valid values for an outbound rule: ip, net, domain, template, and location.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Unique ID of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * Rule validity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * Valid values: 0: common rules; 1: regional rules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * Country ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CountryCode")
    @Expose
    private Long CountryCode;

    /**
    * City ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CityCode")
    @Expose
    private Long CityCode;

    /**
    * Country name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
    * City name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * Cloud provider code.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * Valid values: 0: common rules; 1: cloud provider rules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
    * Rule status. Valid values: true: enabled; false: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * Rule direction. Valid values: 1: inbound; 0: outbound.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * UUID for internal use. Generally, this field is not required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * Rule status. This field is valid when you query rule matching details. Valid values: 0: new; 1: deleted; 2: edited and deleted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Details of associated tasks
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
     * Get Access source.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceContent Access source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set Access source.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceContent Access source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Access destination.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetContent Access destination.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set Access destination.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetContent Access destination.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get Protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Action that Cloud Firewall performs on the traffic. Valid values: accept (allow), drop (reject), and log (monitor).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleAction Action that Cloud Firewall performs on the traffic. Valid values: accept (allow), drop (reject), and log (monitor).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Action that Cloud Firewall performs on the traffic. Valid values: accept (allow), drop (reject), and log (monitor).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleAction Action that Cloud Firewall performs on the traffic. Valid values: accept (allow), drop (reject), and log (monitor).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get Description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of rule matching times. 
     * @return Count Number of rule matching times.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of rule matching times.
     * @param Count Number of rule matching times.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Rule sequence number. 
     * @return OrderIndex Rule sequence number.
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Rule sequence number.
     * @param OrderIndex Rule sequence number.
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Access source type. Valid values for an inbound rule: ip, net, template, and location; valid values for an outbound rule: ip, net, template, instance, group, and tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceType Access source type. Valid values for an inbound rule: ip, net, template, and location; valid values for an outbound rule: ip, net, template, instance, group, and tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type. Valid values for an inbound rule: ip, net, template, and location; valid values for an outbound rule: ip, net, template, instance, group, and tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceType Access source type. Valid values for an inbound rule: ip, net, template, and location; valid values for an outbound rule: ip, net, template, instance, group, and tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Access destination type. Valid values for an inbound rule: ip, net, template, instance, group, and tag; valid values for an outbound rule: ip, net, domain, template, and location.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetType Access destination type. Valid values for an inbound rule: ip, net, template, instance, group, and tag; valid values for an outbound rule: ip, net, domain, template, and location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Access destination type. Valid values for an inbound rule: ip, net, template, instance, group, and tag; valid values for an outbound rule: ip, net, domain, template, and location.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetType Access destination type. Valid values for an inbound rule: ip, net, template, instance, group, and tag; valid values for an outbound rule: ip, net, domain, template, and location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Unique ID of the rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Unique ID of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set Unique ID of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Unique ID of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Rule validity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Invalid Rule validity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set Rule validity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Invalid Rule validity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get Valid values: 0: common rules; 1: regional rules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsRegion Valid values: 0: common rules; 1: regional rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set Valid values: 0: common rules; 1: regional rules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsRegion Valid values: 0: common rules; 1: regional rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get Country ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CountryCode Country ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CountryCode Country ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountryCode(Long CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get City ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CityCode City ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCityCode() {
        return this.CityCode;
    }

    /**
     * Set City ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CityCode City ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCityCode(Long CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get Country name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CountryName Country name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set Country name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CountryName Country name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * Get City name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CityName City name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set City name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CityName City name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get Cloud provider code.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudCode Cloud provider code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set Cloud provider code.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudCode Cloud provider code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get Valid values: 0: common rules; 1: cloud provider rules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCloud Valid values: 0: common rules; 1: cloud provider rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set Valid values: 0: common rules; 1: cloud provider rules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCloud Valid values: 0: common rules; 1: cloud provider rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get Rule status. Valid values: true: enabled; false: disabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Rule status. Valid values: true: enabled; false: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Rule status. Valid values: true: enabled; false: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Rule status. Valid values: true: enabled; false: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Rule direction. Valid values: 1: inbound; 0: outbound.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Direction Rule direction. Valid values: 1: inbound; 0: outbound.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Rule direction. Valid values: 1: inbound; 0: outbound.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Direction Rule direction. Valid values: 1: inbound; 0: outbound.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Instance name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get UUID for internal use. Generally, this field is not required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternalUuid UUID for internal use. Generally, this field is not required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set UUID for internal use. Generally, this field is not required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternalUuid UUID for internal use. Generally, this field is not required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get Rule status. This field is valid when you query rule matching details. Valid values: 0: new; 1: deleted; 2: edited and deleted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Rule status. This field is valid when you query rule matching details. Valid values: 0: new; 1: deleted; 2: edited and deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. This field is valid when you query rule matching details. Valid values: 0: new; 1: deleted; 2: edited and deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Rule status. This field is valid when you query rule matching details. Valid values: 0: new; 1: deleted; 2: edited and deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Details of associated tasks
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BetaList Details of associated tasks
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set Details of associated tasks
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BetaList Details of associated tasks
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    public DescAcItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescAcItem(DescAcItem source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
        }
        if (source.IsRegion != null) {
            this.IsRegion = new Long(source.IsRegion);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new Long(source.CountryCode);
        }
        if (source.CityCode != null) {
            this.CityCode = new Long(source.CityCode);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
        if (source.IsCloud != null) {
            this.IsCloud = new Long(source.IsCloud);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BetaList != null) {
            this.BetaList = new BetaInfoByACL[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new BetaInfoByACL(source.BetaList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);

    }
}

