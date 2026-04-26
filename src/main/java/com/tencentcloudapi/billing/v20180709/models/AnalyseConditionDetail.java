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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseConditionDetail extends AbstractModel {

    /**
    * product
    */
    @SerializedName("Business")
    @Expose
    private AnalyseBusinessDetail [] Business;

    /**
    * Project
    */
    @SerializedName("Project")
    @Expose
    private AnalyseProjectDetail [] Project;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private AnalyseRegionDetail [] Region;

    /**
    * Billing mode.
    */
    @SerializedName("PayMode")
    @Expose
    private AnalysePayModeDetail [] PayMode;

    /**
    * Transaction type
    */
    @SerializedName("ActionType")
    @Expose
    private AnalyseActionTypeDetail [] ActionType;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private AnalyseZoneDetail [] Zone;

    /**
    * Resource owner Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private AnalyseOwnerUinDetail [] OwnerUin;

    /**
    * Fee type
    */
    @SerializedName("Amount")
    @Expose
    private AnalyseAmountDetail [] Amount;

    /**
     * Get product 
     * @return Business product
     */
    public AnalyseBusinessDetail [] getBusiness() {
        return this.Business;
    }

    /**
     * Set product
     * @param Business product
     */
    public void setBusiness(AnalyseBusinessDetail [] Business) {
        this.Business = Business;
    }

    /**
     * Get Project 
     * @return Project Project
     */
    public AnalyseProjectDetail [] getProject() {
        return this.Project;
    }

    /**
     * Set Project
     * @param Project Project
     */
    public void setProject(AnalyseProjectDetail [] Project) {
        this.Project = Project;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public AnalyseRegionDetail [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(AnalyseRegionDetail [] Region) {
        this.Region = Region;
    }

    /**
     * Get Billing mode. 
     * @return PayMode Billing mode.
     */
    public AnalysePayModeDetail [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode.
     * @param PayMode Billing mode.
     */
    public void setPayMode(AnalysePayModeDetail [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Transaction type 
     * @return ActionType Transaction type
     */
    public AnalyseActionTypeDetail [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type
     * @param ActionType Transaction type
     */
    public void setActionType(AnalyseActionTypeDetail [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public AnalyseZoneDetail [] getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(AnalyseZoneDetail [] Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Resource owner Uin 
     * @return OwnerUin Resource owner Uin
     */
    public AnalyseOwnerUinDetail [] getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Resource owner Uin
     * @param OwnerUin Resource owner Uin
     */
    public void setOwnerUin(AnalyseOwnerUinDetail [] OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Fee type 
     * @return Amount Fee type
     */
    public AnalyseAmountDetail [] getAmount() {
        return this.Amount;
    }

    /**
     * Set Fee type
     * @param Amount Fee type
     */
    public void setAmount(AnalyseAmountDetail [] Amount) {
        this.Amount = Amount;
    }

    public AnalyseConditionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseConditionDetail(AnalyseConditionDetail source) {
        if (source.Business != null) {
            this.Business = new AnalyseBusinessDetail[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new AnalyseBusinessDetail(source.Business[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new AnalyseProjectDetail[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new AnalyseProjectDetail(source.Project[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new AnalyseRegionDetail[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new AnalyseRegionDetail(source.Region[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new AnalysePayModeDetail[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new AnalysePayModeDetail(source.PayMode[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new AnalyseActionTypeDetail[source.ActionType.length];
            for (int i = 0; i < source.ActionType.length; i++) {
                this.ActionType[i] = new AnalyseActionTypeDetail(source.ActionType[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new AnalyseZoneDetail[source.Zone.length];
            for (int i = 0; i < source.Zone.length; i++) {
                this.Zone[i] = new AnalyseZoneDetail(source.Zone[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new AnalyseOwnerUinDetail[source.OwnerUin.length];
            for (int i = 0; i < source.OwnerUin.length; i++) {
                this.OwnerUin[i] = new AnalyseOwnerUinDetail(source.OwnerUin[i]);
            }
        }
        if (source.Amount != null) {
            this.Amount = new AnalyseAmountDetail[source.Amount.length];
            for (int i = 0; i < source.Amount.length; i++) {
                this.Amount[i] = new AnalyseAmountDetail(source.Amount[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamArrayObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Region.", this.Region);
        this.setParamArrayObj(map, prefix + "PayMode.", this.PayMode);
        this.setParamArrayObj(map, prefix + "ActionType.", this.ActionType);
        this.setParamArrayObj(map, prefix + "Zone.", this.Zone);
        this.setParamArrayObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "Amount.", this.Amount);

    }
}

