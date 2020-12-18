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

public class ScdnCCRules extends AbstractModel{

    /**
    * Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for web homepages and root directories.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Rule value (blocking condition)
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * IP access limit rule
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Detection granularity
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectionTime")
    @Expose
    private Long DetectionTime;

    /**
    * Frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FrequencyLimit")
    @Expose
    private Long FrequencyLimit;

    /**
    * Whether to block or redirect requests from suspicious IPs. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PunishmentSwitch")
    @Expose
    private String PunishmentSwitch;

    /**
    * Suspicious IP restriction duration
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
    * The redirection target URL used when the `Action` is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for web homepages and root directories. 
     * @return RuleType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for web homepages and root directories.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for web homepages and root directories.
     * @param RuleType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for web homepages and root directories.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Rule value (blocking condition) 
     * @return RuleValue Rule value (blocking condition)
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set Rule value (blocking condition)
     * @param RuleValue Rule value (blocking condition)
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get IP access limit rule 
     * @return Qps IP access limit rule
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set IP access limit rule
     * @param Qps IP access limit rule
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Detection granularity
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DetectionTime Detection granularity
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDetectionTime() {
        return this.DetectionTime;
    }

    /**
     * Set Detection granularity
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DetectionTime Detection granularity
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDetectionTime(Long DetectionTime) {
        this.DetectionTime = DetectionTime;
    }

    /**
     * Get Frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FrequencyLimit Frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFrequencyLimit() {
        return this.FrequencyLimit;
    }

    /**
     * Set Frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FrequencyLimit Frequency threshold
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFrequencyLimit(Long FrequencyLimit) {
        this.FrequencyLimit = FrequencyLimit;
    }

    /**
     * Get Whether to block or redirect requests from suspicious IPs. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PunishmentSwitch Whether to block or redirect requests from suspicious IPs. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPunishmentSwitch() {
        return this.PunishmentSwitch;
    }

    /**
     * Set Whether to block or redirect requests from suspicious IPs. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PunishmentSwitch Whether to block or redirect requests from suspicious IPs. Valid values: `on` and `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPunishmentSwitch(String PunishmentSwitch) {
        this.PunishmentSwitch = PunishmentSwitch;
    }

    /**
     * Get Suspicious IP restriction duration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PunishmentTime Suspicious IP restriction duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPunishmentTime() {
        return this.PunishmentTime;
    }

    /**
     * Set Suspicious IP restriction duration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PunishmentTime Suspicious IP restriction duration
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
     * Get The redirection target URL used when the `Action` is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RedirectUrl The redirection target URL used when the `Action` is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set The redirection target URL used when the `Action` is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RedirectUrl The redirection target URL used when the `Action` is `redirect`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "DetectionTime", this.DetectionTime);
        this.setParamSimple(map, prefix + "FrequencyLimit", this.FrequencyLimit);
        this.setParamSimple(map, prefix + "PunishmentSwitch", this.PunishmentSwitch);
        this.setParamSimple(map, prefix + "PunishmentTime", this.PunishmentTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

