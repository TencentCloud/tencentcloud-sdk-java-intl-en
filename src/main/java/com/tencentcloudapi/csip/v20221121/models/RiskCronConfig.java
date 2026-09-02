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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskCronConfig extends AbstractModel {

    /**
    * <p>appid of the periodic task creator.</p>
    */
    @SerializedName("CreateAppID")
    @Expose
    private Long CreateAppID;

    /**
    * <p>Periodic schedule</p>
    */
    @SerializedName("PlanContent")
    @Expose
    private String PlanContent;

    /**
    * <p>Period scanning enabled status</p>
    */
    @SerializedName("CronStatus")
    @Expose
    private Long CronStatus;

    /**
    * <p>Whether to automatically join the scan for new rules</p>
    */
    @SerializedName("AddRuleEnableStatus")
    @Expose
    private Boolean AddRuleEnableStatus;

    /**
    * <p>Time zone</p>
    */
    @SerializedName("ScanPlanTimezone")
    @Expose
    private String ScanPlanTimezone;

    /**
    * <p>Enable risk scan for incremental assets</p>
    */
    @SerializedName("IncrementAssetScanRisk")
    @Expose
    private Boolean IncrementAssetScanRisk;

    /**
     * Get <p>appid of the periodic task creator.</p> 
     * @return CreateAppID <p>appid of the periodic task creator.</p>
     */
    public Long getCreateAppID() {
        return this.CreateAppID;
    }

    /**
     * Set <p>appid of the periodic task creator.</p>
     * @param CreateAppID <p>appid of the periodic task creator.</p>
     */
    public void setCreateAppID(Long CreateAppID) {
        this.CreateAppID = CreateAppID;
    }

    /**
     * Get <p>Periodic schedule</p> 
     * @return PlanContent <p>Periodic schedule</p>
     */
    public String getPlanContent() {
        return this.PlanContent;
    }

    /**
     * Set <p>Periodic schedule</p>
     * @param PlanContent <p>Periodic schedule</p>
     */
    public void setPlanContent(String PlanContent) {
        this.PlanContent = PlanContent;
    }

    /**
     * Get <p>Period scanning enabled status</p> 
     * @return CronStatus <p>Period scanning enabled status</p>
     */
    public Long getCronStatus() {
        return this.CronStatus;
    }

    /**
     * Set <p>Period scanning enabled status</p>
     * @param CronStatus <p>Period scanning enabled status</p>
     */
    public void setCronStatus(Long CronStatus) {
        this.CronStatus = CronStatus;
    }

    /**
     * Get <p>Whether to automatically join the scan for new rules</p> 
     * @return AddRuleEnableStatus <p>Whether to automatically join the scan for new rules</p>
     */
    public Boolean getAddRuleEnableStatus() {
        return this.AddRuleEnableStatus;
    }

    /**
     * Set <p>Whether to automatically join the scan for new rules</p>
     * @param AddRuleEnableStatus <p>Whether to automatically join the scan for new rules</p>
     */
    public void setAddRuleEnableStatus(Boolean AddRuleEnableStatus) {
        this.AddRuleEnableStatus = AddRuleEnableStatus;
    }

    /**
     * Get <p>Time zone</p> 
     * @return ScanPlanTimezone <p>Time zone</p>
     */
    public String getScanPlanTimezone() {
        return this.ScanPlanTimezone;
    }

    /**
     * Set <p>Time zone</p>
     * @param ScanPlanTimezone <p>Time zone</p>
     */
    public void setScanPlanTimezone(String ScanPlanTimezone) {
        this.ScanPlanTimezone = ScanPlanTimezone;
    }

    /**
     * Get <p>Enable risk scan for incremental assets</p> 
     * @return IncrementAssetScanRisk <p>Enable risk scan for incremental assets</p>
     */
    public Boolean getIncrementAssetScanRisk() {
        return this.IncrementAssetScanRisk;
    }

    /**
     * Set <p>Enable risk scan for incremental assets</p>
     * @param IncrementAssetScanRisk <p>Enable risk scan for incremental assets</p>
     */
    public void setIncrementAssetScanRisk(Boolean IncrementAssetScanRisk) {
        this.IncrementAssetScanRisk = IncrementAssetScanRisk;
    }

    public RiskCronConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCronConfig(RiskCronConfig source) {
        if (source.CreateAppID != null) {
            this.CreateAppID = new Long(source.CreateAppID);
        }
        if (source.PlanContent != null) {
            this.PlanContent = new String(source.PlanContent);
        }
        if (source.CronStatus != null) {
            this.CronStatus = new Long(source.CronStatus);
        }
        if (source.AddRuleEnableStatus != null) {
            this.AddRuleEnableStatus = new Boolean(source.AddRuleEnableStatus);
        }
        if (source.ScanPlanTimezone != null) {
            this.ScanPlanTimezone = new String(source.ScanPlanTimezone);
        }
        if (source.IncrementAssetScanRisk != null) {
            this.IncrementAssetScanRisk = new Boolean(source.IncrementAssetScanRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateAppID", this.CreateAppID);
        this.setParamSimple(map, prefix + "PlanContent", this.PlanContent);
        this.setParamSimple(map, prefix + "CronStatus", this.CronStatus);
        this.setParamSimple(map, prefix + "AddRuleEnableStatus", this.AddRuleEnableStatus);
        this.setParamSimple(map, prefix + "ScanPlanTimezone", this.ScanPlanTimezone);
        this.setParamSimple(map, prefix + "IncrementAssetScanRisk", this.IncrementAssetScanRisk);

    }
}

