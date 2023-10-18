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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * Resource ID
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
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Effective time
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Status of the plan
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
    * Specifies whether to enable auto-renewal
`0`: Default
`1`: Enable auto-renewal
`2`: Disable auto-renewal
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * ID of the plan
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Resource ID 
     * @return Id Resource ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource ID
     * @param Id Resource ID
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
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Effective time 
     * @return EnableTime Effective time
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set Effective time
     * @param EnableTime Effective time
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Status of the plan 
     * @return Status Status of the plan
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the plan
     * @param Status Status of the plan
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
     * Get Specifies whether to enable auto-renewal
`0`: Default
`1`: Enable auto-renewal
`2`: Disable auto-renewal 
     * @return AutoRenewFlag Specifies whether to enable auto-renewal
`0`: Default
`1`: Enable auto-renewal
`2`: Disable auto-renewal
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Specifies whether to enable auto-renewal
`0`: Default
`1`: Enable auto-renewal
`2`: Disable auto-renewal
     * @param AutoRenewFlag Specifies whether to enable auto-renewal
`0`: Default
`1`: Enable auto-renewal
`2`: Disable auto-renewal
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get ID of the plan 
     * @return PlanId ID of the plan
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set ID of the plan
     * @param PlanId ID of the plan
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get  
     * @return Area 
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 
     * @param Area 
     */
    public void setArea(String Area) {
        this.Area = Area;
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

    }
}

