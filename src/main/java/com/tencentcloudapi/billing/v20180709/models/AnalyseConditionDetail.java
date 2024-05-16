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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseConditionDetail extends AbstractModel {

    /**
    * ProductNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private AnalyseBusinessDetail [] Business;

    /**
    * ItemNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Project")
    @Expose
    private AnalyseProjectDetail [] Project;

    /**
    * RegionNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private AnalyseRegionDetail [] Region;

    /**
    * Billing modeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private AnalysePayModeDetail [] PayMode;

    /**
    * Transaction typeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionType")
    @Expose
    private AnalyseActionTypeDetail [] ActionType;

    /**
    * Availability zoneNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private AnalyseZoneDetail [] Zone;

    /**
    * Resource owner UINNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private AnalyseOwnerUinDetail [] OwnerUin;

    /**
    * Fee typeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Amount")
    @Expose
    private AnalyseAmountDetail [] Amount;

    /**
     * Get ProductNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Business ProductNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseBusinessDetail [] getBusiness() {
        return this.Business;
    }

    /**
     * Set ProductNote: This field may return null, indicating that no valid values can be obtained.
     * @param Business ProductNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusiness(AnalyseBusinessDetail [] Business) {
        this.Business = Business;
    }

    /**
     * Get ItemNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Project ItemNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseProjectDetail [] getProject() {
        return this.Project;
    }

    /**
     * Set ItemNote: This field may return null, indicating that no valid values can be obtained.
     * @param Project ItemNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProject(AnalyseProjectDetail [] Project) {
        this.Project = Project;
    }

    /**
     * Get RegionNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Region RegionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseRegionDetail [] getRegion() {
        return this.Region;
    }

    /**
     * Set RegionNote: This field may return null, indicating that no valid values can be obtained.
     * @param Region RegionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(AnalyseRegionDetail [] Region) {
        this.Region = Region;
    }

    /**
     * Get Billing modeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Billing modeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalysePayModeDetail [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing modeNote: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Billing modeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(AnalysePayModeDetail [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Transaction typeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionType Transaction typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseActionTypeDetail [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction typeNote: This field may return null, indicating that no valid values can be obtained.
     * @param ActionType Transaction typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionType(AnalyseActionTypeDetail [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Availability zoneNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability zoneNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseZoneDetail [] getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zoneNote: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability zoneNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(AnalyseZoneDetail [] Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Resource owner UINNote: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin Resource owner UINNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseOwnerUinDetail [] getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Resource owner UINNote: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin Resource owner UINNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(AnalyseOwnerUinDetail [] OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Fee typeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Amount Fee typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseAmountDetail [] getAmount() {
        return this.Amount;
    }

    /**
     * Set Fee typeNote: This field may return null, indicating that no valid values can be obtained.
     * @param Amount Fee typeNote: This field may return null, indicating that no valid values can be obtained.
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

