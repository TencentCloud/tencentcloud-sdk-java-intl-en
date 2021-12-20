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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedCCRules extends AbstractModel{

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Detection duration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectionTime")
    @Expose
    private Long DetectionTime;

    /**
    * Detection frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FrequencyLimit")
    @Expose
    private Long FrequencyLimit;

    /**
    * Whether to enable IP penalty. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PunishmentSwitch")
    @Expose
    private String PunishmentSwitch;

    /**
    * IP penalty duration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PunishmentTime")
    @Expose
    private Long PunishmentTime;

    /**
    * Action. Valid values: `intercept` and `redirect`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * A redirection URL used when Action is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * Layer-7 rule configuration for CC frequency limiting
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Configure")
    @Expose
    private ScdnSevenLayerRules [] Configure;

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Detection duration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DetectionTime Detection duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDetectionTime() {
        return this.DetectionTime;
    }

    /**
     * Set Detection duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DetectionTime Detection duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDetectionTime(Long DetectionTime) {
        this.DetectionTime = DetectionTime;
    }

    /**
     * Get Detection frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FrequencyLimit Detection frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFrequencyLimit() {
        return this.FrequencyLimit;
    }

    /**
     * Set Detection frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FrequencyLimit Detection frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFrequencyLimit(Long FrequencyLimit) {
        this.FrequencyLimit = FrequencyLimit;
    }

    /**
     * Get Whether to enable IP penalty. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PunishmentSwitch Whether to enable IP penalty. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPunishmentSwitch() {
        return this.PunishmentSwitch;
    }

    /**
     * Set Whether to enable IP penalty. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PunishmentSwitch Whether to enable IP penalty. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPunishmentSwitch(String PunishmentSwitch) {
        this.PunishmentSwitch = PunishmentSwitch;
    }

    /**
     * Get IP penalty duration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PunishmentTime IP penalty duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPunishmentTime() {
        return this.PunishmentTime;
    }

    /**
     * Set IP penalty duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PunishmentTime IP penalty duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPunishmentTime(Long PunishmentTime) {
        this.PunishmentTime = PunishmentTime;
    }

    /**
     * Get Action. Valid values: `intercept` and `redirect`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Action Action. Valid values: `intercept` and `redirect`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values: `intercept` and `redirect`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Action Action. Valid values: `intercept` and `redirect`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get A redirection URL used when Action is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RedirectUrl A redirection URL used when Action is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set A redirection URL used when Action is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RedirectUrl A redirection URL used when Action is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get Layer-7 rule configuration for CC frequency limiting
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Configure Layer-7 rule configuration for CC frequency limiting
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnSevenLayerRules [] getConfigure() {
        return this.Configure;
    }

    /**
     * Set Layer-7 rule configuration for CC frequency limiting
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Configure Layer-7 rule configuration for CC frequency limiting
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConfigure(ScdnSevenLayerRules [] Configure) {
        this.Configure = Configure;
    }

    public AdvancedCCRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedCCRules(AdvancedCCRules source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.DetectionTime != null) {
            this.DetectionTime = new Long(source.DetectionTime);
        }
        if (source.FrequencyLimit != null) {
            this.FrequencyLimit = new Long(source.FrequencyLimit);
        }
        if (source.PunishmentSwitch != null) {
            this.PunishmentSwitch = new String(source.PunishmentSwitch);
        }
        if (source.PunishmentTime != null) {
            this.PunishmentTime = new Long(source.PunishmentTime);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.Configure != null) {
            this.Configure = new ScdnSevenLayerRules[source.Configure.length];
            for (int i = 0; i < source.Configure.length; i++) {
                this.Configure[i] = new ScdnSevenLayerRules(source.Configure[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "DetectionTime", this.DetectionTime);
        this.setParamSimple(map, prefix + "FrequencyLimit", this.FrequencyLimit);
        this.setParamSimple(map, prefix + "PunishmentSwitch", this.PunishmentSwitch);
        this.setParamSimple(map, prefix + "PunishmentTime", this.PunishmentTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamArrayObj(map, prefix + "Configure.", this.Configure);

    }
}

