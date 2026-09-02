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

public class ModifyRiskScanCronConfigRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Plan enabled status</p>
    */
    @SerializedName("CronStatus")
    @Expose
    private Long CronStatus;

    /**
    * <p>Plan expression</p>
    */
    @SerializedName("CronPlanContent")
    @Expose
    private String CronPlanContent;

    /**
    * <p>Whether to automatically execute new rules</p>
    */
    @SerializedName("RuleAutoEnable")
    @Expose
    private Boolean RuleAutoEnable;

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
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Plan enabled status</p> 
     * @return CronStatus <p>Plan enabled status</p>
     */
    public Long getCronStatus() {
        return this.CronStatus;
    }

    /**
     * Set <p>Plan enabled status</p>
     * @param CronStatus <p>Plan enabled status</p>
     */
    public void setCronStatus(Long CronStatus) {
        this.CronStatus = CronStatus;
    }

    /**
     * Get <p>Plan expression</p> 
     * @return CronPlanContent <p>Plan expression</p>
     */
    public String getCronPlanContent() {
        return this.CronPlanContent;
    }

    /**
     * Set <p>Plan expression</p>
     * @param CronPlanContent <p>Plan expression</p>
     */
    public void setCronPlanContent(String CronPlanContent) {
        this.CronPlanContent = CronPlanContent;
    }

    /**
     * Get <p>Whether to automatically execute new rules</p> 
     * @return RuleAutoEnable <p>Whether to automatically execute new rules</p>
     */
    public Boolean getRuleAutoEnable() {
        return this.RuleAutoEnable;
    }

    /**
     * Set <p>Whether to automatically execute new rules</p>
     * @param RuleAutoEnable <p>Whether to automatically execute new rules</p>
     */
    public void setRuleAutoEnable(Boolean RuleAutoEnable) {
        this.RuleAutoEnable = RuleAutoEnable;
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

    public ModifyRiskScanCronConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskScanCronConfigRequest(ModifyRiskScanCronConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CronStatus != null) {
            this.CronStatus = new Long(source.CronStatus);
        }
        if (source.CronPlanContent != null) {
            this.CronPlanContent = new String(source.CronPlanContent);
        }
        if (source.RuleAutoEnable != null) {
            this.RuleAutoEnable = new Boolean(source.RuleAutoEnable);
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "CronStatus", this.CronStatus);
        this.setParamSimple(map, prefix + "CronPlanContent", this.CronPlanContent);
        this.setParamSimple(map, prefix + "RuleAutoEnable", this.RuleAutoEnable);
        this.setParamSimple(map, prefix + "ScanPlanTimezone", this.ScanPlanTimezone);
        this.setParamSimple(map, prefix + "IncrementAssetScanRisk", this.IncrementAssetScanRisk);

    }
}

