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

public class VpcRuleItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * 
    */
    @SerializedName("DetectedTimes")
    @Expose
    private Long DetectedTimes;

    /**
    * 
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * 
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * 
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * 
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * 
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * 
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * 
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * 
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
     * Get  
     * @return SourceContent 
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 
     * @param SourceContent 
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get  
     * @return SourceType 
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 
     * @param SourceType 
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get  
     * @return DestContent 
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 
     * @param DestContent 
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get  
     * @return DestType 
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 
     * @param DestType 
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get  
     * @return Protocol 
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 
     * @param Protocol 
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get  
     * @return RuleAction 
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 
     * @param RuleAction 
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get  
     * @return Port 
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 
     * @param Port 
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return OrderIndex 
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 
     * @param OrderIndex 
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get  
     * @return Enable 
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 
     * @param Enable 
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get  
     * @return EdgeId 
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 
     * @param EdgeId 
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get  
     * @return Uuid 
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 
     * @param Uuid 
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get  
     * @return DetectedTimes 
     */
    public Long getDetectedTimes() {
        return this.DetectedTimes;
    }

    /**
     * Set 
     * @param DetectedTimes 
     */
    public void setDetectedTimes(Long DetectedTimes) {
        this.DetectedTimes = DetectedTimes;
    }

    /**
     * Get  
     * @return EdgeName 
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set 
     * @param EdgeName 
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get  
     * @return InternalUuid 
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set 
     * @param InternalUuid 
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get  
     * @return Deleted 
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 
     * @param Deleted 
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get  
     * @return FwGroupId 
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 
     * @param FwGroupId 
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get  
     * @return FwGroupName 
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 
     * @param FwGroupName 
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get  
     * @return BetaList 
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set 
     * @param BetaList 
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get  
     * @return ParamTemplateId 
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 
     * @param ParamTemplateId 
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get  
     * @return ParamTemplateName 
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set 
     * @param ParamTemplateName 
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get  
     * @return TargetName 
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 
     * @param TargetName 
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get  
     * @return SourceName 
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 
     * @param SourceName 
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get  
     * @return IpVersion 
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set 
     * @param IpVersion 
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get  
     * @return Invalid 
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 
     * @param Invalid 
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    public VpcRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcRuleItem(VpcRuleItem source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.DetectedTimes != null) {
            this.DetectedTimes = new Long(source.DetectedTimes);
        }
        if (source.EdgeName != null) {
            this.EdgeName = new String(source.EdgeName);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Deleted != null) {
            this.Deleted = new Long(source.Deleted);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.BetaList != null) {
            this.BetaList = new BetaInfoByACL[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new BetaInfoByACL(source.BetaList[i]);
            }
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "DetectedTimes", this.DetectedTimes);
        this.setParamSimple(map, prefix + "EdgeName", this.EdgeName);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);

    }
}

