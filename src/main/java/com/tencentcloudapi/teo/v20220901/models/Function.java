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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Function extends AbstractModel {

    /**
    * <p>Function ID.</p>
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Function name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Function description.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Function content.</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Default domain name of a function.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>List of regional access restrictions on the default domain name of edge functions due to compliance issues.</p>
    */
    @SerializedName("DomainComplianceRestrictions")
    @Expose
    private ComplianceRestriction [] DomainComplianceRestrictions;

    /**
    * <p>Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Function ID.</p> 
     * @return FunctionId <p>Function ID.</p>
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set <p>Function ID.</p>
     * @param FunctionId <p>Function ID.</p>
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Function name.</p> 
     * @return Name <p>Function name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Function name.</p>
     * @param Name <p>Function name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Function description.</p> 
     * @return Remark <p>Function description.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Function description.</p>
     * @param Remark <p>Function description.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Function content.</p> 
     * @return Content <p>Function content.</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Function content.</p>
     * @param Content <p>Function content.</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Default domain name of a function.</p> 
     * @return Domain <p>Default domain name of a function.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Default domain name of a function.</p>
     * @param Domain <p>Default domain name of a function.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>List of regional access restrictions on the default domain name of edge functions due to compliance issues.</p> 
     * @return DomainComplianceRestrictions <p>List of regional access restrictions on the default domain name of edge functions due to compliance issues.</p>
     */
    public ComplianceRestriction [] getDomainComplianceRestrictions() {
        return this.DomainComplianceRestrictions;
    }

    /**
     * Set <p>List of regional access restrictions on the default domain name of edge functions due to compliance issues.</p>
     * @param DomainComplianceRestrictions <p>List of regional access restrictions on the default domain name of edge functions due to compliance issues.</p>
     */
    public void setDomainComplianceRestrictions(ComplianceRestriction [] DomainComplianceRestrictions) {
        this.DomainComplianceRestrictions = DomainComplianceRestrictions;
    }

    /**
     * Get <p>Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p> 
     * @return CreateTime <p>Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     * @param CreateTime <p>Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p> 
     * @return UpdateTime <p>Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     * @param UpdateTime <p>Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Function() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Function(Function source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainComplianceRestrictions != null) {
            this.DomainComplianceRestrictions = new ComplianceRestriction[source.DomainComplianceRestrictions.length];
            for (int i = 0; i < source.DomainComplianceRestrictions.length; i++) {
                this.DomainComplianceRestrictions[i] = new ComplianceRestriction(source.DomainComplianceRestrictions[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "DomainComplianceRestrictions.", this.DomainComplianceRestrictions);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

