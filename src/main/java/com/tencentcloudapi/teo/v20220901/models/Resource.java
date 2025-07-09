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

public class Resource extends AbstractModel {

    /**
    * The resource ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Billing mode
`0`: Pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The effective time.
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * The expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * The plan status. Values:
<li>`normal`: Normal</li>
<li>`isolated`: Isolated</li>
<li>`destroyed`: Terminated</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Pricing query parameter
    */
    @SerializedName("Sv")
    @Expose
    private Sv [] Sv;

    /**
    * Whether to enable auto-renewal. Values:
<li>`0`: Default status.</li>
<li>`1`: Enable auto-renewal.</li>
<li>`2`: Disable auto-renewal.</li>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * ID of the resource associated with the plan.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Applicable area. Values:
<li>`mainland`: Chinese mainland</li>
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`global`: Global</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The resource type. Values:
<li>`plan`: Plan resources</li>
<li>`pay-as-you-go`: Pay-as-you-go resources </li>
<li>`value-added`: Value-added resources </li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * The sites that are associated with the current resources.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneNumber")
    @Expose
    private Long ZoneNumber;

    /**
    * Resource tag type. Valid values:
<li>vodeo: vodeo resource.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get The resource ID. 
     * @return Id The resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The resource ID.
     * @param Id The resource ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Billing mode
`0`: Pay-as-you-go 
     * @return PayMode Billing mode
`0`: Pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
`0`: Pay-as-you-go
     * @param PayMode Billing mode
`0`: Pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The effective time. 
     * @return EnableTime The effective time.
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set The effective time.
     * @param EnableTime The effective time.
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get The expiration time. 
     * @return ExpireTime The expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time.
     * @param ExpireTime The expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The plan status. Values:
<li>`normal`: Normal</li>
<li>`isolated`: Isolated</li>
<li>`destroyed`: Terminated</li> 
     * @return Status The plan status. Values:
<li>`normal`: Normal</li>
<li>`isolated`: Isolated</li>
<li>`destroyed`: Terminated</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The plan status. Values:
<li>`normal`: Normal</li>
<li>`isolated`: Isolated</li>
<li>`destroyed`: Terminated</li>
     * @param Status The plan status. Values:
<li>`normal`: Normal</li>
<li>`isolated`: Isolated</li>
<li>`destroyed`: Terminated</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Pricing query parameter 
     * @return Sv Pricing query parameter
     */
    public Sv [] getSv() {
        return this.Sv;
    }

    /**
     * Set Pricing query parameter
     * @param Sv Pricing query parameter
     */
    public void setSv(Sv [] Sv) {
        this.Sv = Sv;
    }

    /**
     * Get Whether to enable auto-renewal. Values:
<li>`0`: Default status.</li>
<li>`1`: Enable auto-renewal.</li>
<li>`2`: Disable auto-renewal.</li> 
     * @return AutoRenewFlag Whether to enable auto-renewal. Values:
<li>`0`: Default status.</li>
<li>`1`: Enable auto-renewal.</li>
<li>`2`: Disable auto-renewal.</li>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to enable auto-renewal. Values:
<li>`0`: Default status.</li>
<li>`1`: Enable auto-renewal.</li>
<li>`2`: Disable auto-renewal.</li>
     * @param AutoRenewFlag Whether to enable auto-renewal. Values:
<li>`0`: Default status.</li>
<li>`1`: Enable auto-renewal.</li>
<li>`2`: Disable auto-renewal.</li>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get ID of the resource associated with the plan. 
     * @return PlanId ID of the resource associated with the plan.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set ID of the resource associated with the plan.
     * @param PlanId ID of the resource associated with the plan.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Applicable area. Values:
<li>`mainland`: Chinese mainland</li>
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`global`: Global</li> 
     * @return Area Applicable area. Values:
<li>`mainland`: Chinese mainland</li>
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`global`: Global</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Applicable area. Values:
<li>`mainland`: Chinese mainland</li>
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`global`: Global</li>
     * @param Area Applicable area. Values:
<li>`mainland`: Chinese mainland</li>
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`global`: Global</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The resource type. Values:
<li>`plan`: Plan resources</li>
<li>`pay-as-you-go`: Pay-as-you-go resources </li>
<li>`value-added`: Value-added resources </li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Group The resource type. Values:
<li>`plan`: Plan resources</li>
<li>`pay-as-you-go`: Pay-as-you-go resources </li>
<li>`value-added`: Value-added resources </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set The resource type. Values:
<li>`plan`: Plan resources</li>
<li>`pay-as-you-go`: Pay-as-you-go resources </li>
<li>`value-added`: Value-added resources </li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Group The resource type. Values:
<li>`plan`: Plan resources</li>
<li>`pay-as-you-go`: Pay-as-you-go resources </li>
<li>`value-added`: Value-added resources </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get The sites that are associated with the current resources.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneNumber The sites that are associated with the current resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneNumber() {
        return this.ZoneNumber;
    }

    /**
     * Set The sites that are associated with the current resources.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneNumber The sites that are associated with the current resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneNumber(Long ZoneNumber) {
        this.ZoneNumber = ZoneNumber;
    }

    /**
     * Get Resource tag type. Valid values:
<li>vodeo: vodeo resource.</li> 
     * @return Type Resource tag type. Valid values:
<li>vodeo: vodeo resource.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Resource tag type. Valid values:
<li>vodeo: vodeo resource.</li>
     * @param Type Resource tag type. Valid values:
<li>vodeo: vodeo resource.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Sv != null) {
            this.Sv = new Sv[source.Sv.length];
            for (int i = 0; i < source.Sv.length; i++) {
                this.Sv[i] = new Sv(source.Sv[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.ZoneNumber != null) {
            this.ZoneNumber = new Long(source.ZoneNumber);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Sv.", this.Sv);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "ZoneNumber", this.ZoneNumber);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

