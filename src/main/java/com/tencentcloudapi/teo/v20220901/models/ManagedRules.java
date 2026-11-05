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

public class ManagedRules extends AbstractModel {

    /**
    * <p>Whether managed rules are enabled. Valid values: <li>on: enabled. All managed rules take effect as configured.</li><li>off: disabled. No managed rules take effect.</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>Whether evaluation mode is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. All managed rules take effect in observation mode.</li><li>off: disabled. All managed rules take effect as configured.</li></p>
    */
    @SerializedName("DetectionOnly")
    @Expose
    private String DetectionOnly;

    /**
    * <p>Whether the deep analysis option for managed rules is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. Requests are processed after deep analysis.</li><li>off: disabled. Requests are processed directly without deep analysis.</li> <br>This parameter is to be deprecated. The switch for deep analysis rules is migrated to the `SemanticAnalysisRules.Enabled` parameter.</p>
    */
    @SerializedName("SemanticAnalysis")
    @Expose
    private String SemanticAnalysis;

    /**
    * <p>Deep analysis configuration option. Identifies malicious behaviors in requests (such as SQL injection and XSS attacks), and logs and blocks malicious requests.</p>
    */
    @SerializedName("SemanticAnalysisRules")
    @Expose
    private SemanticAnalysisRules SemanticAnalysisRules;

    /**
    * <p>Auto-update option for managed rules.</p>
    */
    @SerializedName("AutoUpdate")
    @Expose
    private ManagedRuleAutoUpdate AutoUpdate;

    /**
    * <p>Configuration of managed rule groups. If an empty array is passed for this structure or `GroupId` is not included in the list, the default processing method is used.</p>
    */
    @SerializedName("ManagedRuleGroups")
    @Expose
    private ManagedRuleGroup [] ManagedRuleGroups;

    /**
    * <p>High-frequency scan protection configuration option. When a visitor's requests frequently trigger managed rules configured as block, all requests from this visitor are blocked for a period of time.</p>
    */
    @SerializedName("FrequentScanningProtection")
    @Expose
    private FrequentScanningProtection FrequentScanningProtection;

    /**
     * Get <p>Whether managed rules are enabled. Valid values: <li>on: enabled. All managed rules take effect as configured.</li><li>off: disabled. No managed rules take effect.</li></p> 
     * @return Enabled <p>Whether managed rules are enabled. Valid values: <li>on: enabled. All managed rules take effect as configured.</li><li>off: disabled. No managed rules take effect.</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether managed rules are enabled. Valid values: <li>on: enabled. All managed rules take effect as configured.</li><li>off: disabled. No managed rules take effect.</li></p>
     * @param Enabled <p>Whether managed rules are enabled. Valid values: <li>on: enabled. All managed rules take effect as configured.</li><li>off: disabled. No managed rules take effect.</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Whether evaluation mode is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. All managed rules take effect in observation mode.</li><li>off: disabled. All managed rules take effect as configured.</li></p> 
     * @return DetectionOnly <p>Whether evaluation mode is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. All managed rules take effect in observation mode.</li><li>off: disabled. All managed rules take effect as configured.</li></p>
     */
    public String getDetectionOnly() {
        return this.DetectionOnly;
    }

    /**
     * Set <p>Whether evaluation mode is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. All managed rules take effect in observation mode.</li><li>off: disabled. All managed rules take effect as configured.</li></p>
     * @param DetectionOnly <p>Whether evaluation mode is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. All managed rules take effect in observation mode.</li><li>off: disabled. All managed rules take effect as configured.</li></p>
     */
    public void setDetectionOnly(String DetectionOnly) {
        this.DetectionOnly = DetectionOnly;
    }

    /**
     * Get <p>Whether the deep analysis option for managed rules is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. Requests are processed after deep analysis.</li><li>off: disabled. Requests are processed directly without deep analysis.</li> <br>This parameter is to be deprecated. The switch for deep analysis rules is migrated to the `SemanticAnalysisRules.Enabled` parameter.</p> 
     * @return SemanticAnalysis <p>Whether the deep analysis option for managed rules is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. Requests are processed after deep analysis.</li><li>off: disabled. Requests are processed directly without deep analysis.</li> <br>This parameter is to be deprecated. The switch for deep analysis rules is migrated to the `SemanticAnalysisRules.Enabled` parameter.</p>
     */
    public String getSemanticAnalysis() {
        return this.SemanticAnalysis;
    }

    /**
     * Set <p>Whether the deep analysis option for managed rules is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. Requests are processed after deep analysis.</li><li>off: disabled. Requests are processed directly without deep analysis.</li> <br>This parameter is to be deprecated. The switch for deep analysis rules is migrated to the `SemanticAnalysisRules.Enabled` parameter.</p>
     * @param SemanticAnalysis <p>Whether the deep analysis option for managed rules is enabled. This parameter is valid only when the `Enabled` parameter is set to `on`. Valid values: <li>on: enabled. Requests are processed after deep analysis.</li><li>off: disabled. Requests are processed directly without deep analysis.</li> <br>This parameter is to be deprecated. The switch for deep analysis rules is migrated to the `SemanticAnalysisRules.Enabled` parameter.</p>
     */
    public void setSemanticAnalysis(String SemanticAnalysis) {
        this.SemanticAnalysis = SemanticAnalysis;
    }

    /**
     * Get <p>Deep analysis configuration option. Identifies malicious behaviors in requests (such as SQL injection and XSS attacks), and logs and blocks malicious requests.</p> 
     * @return SemanticAnalysisRules <p>Deep analysis configuration option. Identifies malicious behaviors in requests (such as SQL injection and XSS attacks), and logs and blocks malicious requests.</p>
     */
    public SemanticAnalysisRules getSemanticAnalysisRules() {
        return this.SemanticAnalysisRules;
    }

    /**
     * Set <p>Deep analysis configuration option. Identifies malicious behaviors in requests (such as SQL injection and XSS attacks), and logs and blocks malicious requests.</p>
     * @param SemanticAnalysisRules <p>Deep analysis configuration option. Identifies malicious behaviors in requests (such as SQL injection and XSS attacks), and logs and blocks malicious requests.</p>
     */
    public void setSemanticAnalysisRules(SemanticAnalysisRules SemanticAnalysisRules) {
        this.SemanticAnalysisRules = SemanticAnalysisRules;
    }

    /**
     * Get <p>Auto-update option for managed rules.</p> 
     * @return AutoUpdate <p>Auto-update option for managed rules.</p>
     */
    public ManagedRuleAutoUpdate getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set <p>Auto-update option for managed rules.</p>
     * @param AutoUpdate <p>Auto-update option for managed rules.</p>
     */
    public void setAutoUpdate(ManagedRuleAutoUpdate AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get <p>Configuration of managed rule groups. If an empty array is passed for this structure or `GroupId` is not included in the list, the default processing method is used.</p> 
     * @return ManagedRuleGroups <p>Configuration of managed rule groups. If an empty array is passed for this structure or `GroupId` is not included in the list, the default processing method is used.</p>
     */
    public ManagedRuleGroup [] getManagedRuleGroups() {
        return this.ManagedRuleGroups;
    }

    /**
     * Set <p>Configuration of managed rule groups. If an empty array is passed for this structure or `GroupId` is not included in the list, the default processing method is used.</p>
     * @param ManagedRuleGroups <p>Configuration of managed rule groups. If an empty array is passed for this structure or `GroupId` is not included in the list, the default processing method is used.</p>
     */
    public void setManagedRuleGroups(ManagedRuleGroup [] ManagedRuleGroups) {
        this.ManagedRuleGroups = ManagedRuleGroups;
    }

    /**
     * Get <p>High-frequency scan protection configuration option. When a visitor's requests frequently trigger managed rules configured as block, all requests from this visitor are blocked for a period of time.</p> 
     * @return FrequentScanningProtection <p>High-frequency scan protection configuration option. When a visitor's requests frequently trigger managed rules configured as block, all requests from this visitor are blocked for a period of time.</p>
     */
    public FrequentScanningProtection getFrequentScanningProtection() {
        return this.FrequentScanningProtection;
    }

    /**
     * Set <p>High-frequency scan protection configuration option. When a visitor's requests frequently trigger managed rules configured as block, all requests from this visitor are blocked for a period of time.</p>
     * @param FrequentScanningProtection <p>High-frequency scan protection configuration option. When a visitor's requests frequently trigger managed rules configured as block, all requests from this visitor are blocked for a period of time.</p>
     */
    public void setFrequentScanningProtection(FrequentScanningProtection FrequentScanningProtection) {
        this.FrequentScanningProtection = FrequentScanningProtection;
    }

    public ManagedRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRules(ManagedRules source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.DetectionOnly != null) {
            this.DetectionOnly = new String(source.DetectionOnly);
        }
        if (source.SemanticAnalysis != null) {
            this.SemanticAnalysis = new String(source.SemanticAnalysis);
        }
        if (source.SemanticAnalysisRules != null) {
            this.SemanticAnalysisRules = new SemanticAnalysisRules(source.SemanticAnalysisRules);
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new ManagedRuleAutoUpdate(source.AutoUpdate);
        }
        if (source.ManagedRuleGroups != null) {
            this.ManagedRuleGroups = new ManagedRuleGroup[source.ManagedRuleGroups.length];
            for (int i = 0; i < source.ManagedRuleGroups.length; i++) {
                this.ManagedRuleGroups[i] = new ManagedRuleGroup(source.ManagedRuleGroups[i]);
            }
        }
        if (source.FrequentScanningProtection != null) {
            this.FrequentScanningProtection = new FrequentScanningProtection(source.FrequentScanningProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DetectionOnly", this.DetectionOnly);
        this.setParamSimple(map, prefix + "SemanticAnalysis", this.SemanticAnalysis);
        this.setParamObj(map, prefix + "SemanticAnalysisRules.", this.SemanticAnalysisRules);
        this.setParamObj(map, prefix + "AutoUpdate.", this.AutoUpdate);
        this.setParamArrayObj(map, prefix + "ManagedRuleGroups.", this.ManagedRuleGroups);
        this.setParamObj(map, prefix + "FrequentScanningProtection.", this.FrequentScanningProtection);

    }
}

