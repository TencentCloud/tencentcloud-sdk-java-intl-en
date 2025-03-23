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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRules extends AbstractModel {

    /**
    * The managed rule status. Values: <li>`on`: enabled, all managed rules take effect as configured;</li> <li>`off`: disabled, all managed rules do not take effect.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Evaluation mode is enabled or not, it is valid only when the `Enabled` parameter is set to `on`. Values: <li>`on`: enabled, all managed rules take effect in `observe` mode.</li> <li>off: disabled, all managed rules take effect according to the specified configuration.</li>.
    */
    @SerializedName("DetectionOnly")
    @Expose
    private String DetectionOnly;

    /**
    * Managed rule semantic analysis is enabled or not, it is valid only when the `Enabled` parameter is `on`. Values: <li>`on`: enabled, perform semantic analysis  before processing requests;</li> <li>`off`: disabled, process requests directly without semantic analysis.</li> <br/>The default value is `off`.
    */
    @SerializedName("SemanticAnalysis")
    @Expose
    private String SemanticAnalysis;

    /**
    * Managed rule automatic update option.
    */
    @SerializedName("AutoUpdate")
    @Expose
    private ManagedRuleAutoUpdate AutoUpdate;

    /**
    * Configuration of the managed rule group. If this structure is passed as an empty array or the GroupId is not included in the array, it will be processed based by default.
    */
    @SerializedName("ManagedRuleGroups")
    @Expose
    private ManagedRuleGroup [] ManagedRuleGroups;

    /**
     * Get The managed rule status. Values: <li>`on`: enabled, all managed rules take effect as configured;</li> <li>`off`: disabled, all managed rules do not take effect.</li>. 
     * @return Enabled The managed rule status. Values: <li>`on`: enabled, all managed rules take effect as configured;</li> <li>`off`: disabled, all managed rules do not take effect.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set The managed rule status. Values: <li>`on`: enabled, all managed rules take effect as configured;</li> <li>`off`: disabled, all managed rules do not take effect.</li>.
     * @param Enabled The managed rule status. Values: <li>`on`: enabled, all managed rules take effect as configured;</li> <li>`off`: disabled, all managed rules do not take effect.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Evaluation mode is enabled or not, it is valid only when the `Enabled` parameter is set to `on`. Values: <li>`on`: enabled, all managed rules take effect in `observe` mode.</li> <li>off: disabled, all managed rules take effect according to the specified configuration.</li>. 
     * @return DetectionOnly Evaluation mode is enabled or not, it is valid only when the `Enabled` parameter is set to `on`. Values: <li>`on`: enabled, all managed rules take effect in `observe` mode.</li> <li>off: disabled, all managed rules take effect according to the specified configuration.</li>.
     */
    public String getDetectionOnly() {
        return this.DetectionOnly;
    }

    /**
     * Set Evaluation mode is enabled or not, it is valid only when the `Enabled` parameter is set to `on`. Values: <li>`on`: enabled, all managed rules take effect in `observe` mode.</li> <li>off: disabled, all managed rules take effect according to the specified configuration.</li>.
     * @param DetectionOnly Evaluation mode is enabled or not, it is valid only when the `Enabled` parameter is set to `on`. Values: <li>`on`: enabled, all managed rules take effect in `observe` mode.</li> <li>off: disabled, all managed rules take effect according to the specified configuration.</li>.
     */
    public void setDetectionOnly(String DetectionOnly) {
        this.DetectionOnly = DetectionOnly;
    }

    /**
     * Get Managed rule semantic analysis is enabled or not, it is valid only when the `Enabled` parameter is `on`. Values: <li>`on`: enabled, perform semantic analysis  before processing requests;</li> <li>`off`: disabled, process requests directly without semantic analysis.</li> <br/>The default value is `off`. 
     * @return SemanticAnalysis Managed rule semantic analysis is enabled or not, it is valid only when the `Enabled` parameter is `on`. Values: <li>`on`: enabled, perform semantic analysis  before processing requests;</li> <li>`off`: disabled, process requests directly without semantic analysis.</li> <br/>The default value is `off`.
     */
    public String getSemanticAnalysis() {
        return this.SemanticAnalysis;
    }

    /**
     * Set Managed rule semantic analysis is enabled or not, it is valid only when the `Enabled` parameter is `on`. Values: <li>`on`: enabled, perform semantic analysis  before processing requests;</li> <li>`off`: disabled, process requests directly without semantic analysis.</li> <br/>The default value is `off`.
     * @param SemanticAnalysis Managed rule semantic analysis is enabled or not, it is valid only when the `Enabled` parameter is `on`. Values: <li>`on`: enabled, perform semantic analysis  before processing requests;</li> <li>`off`: disabled, process requests directly without semantic analysis.</li> <br/>The default value is `off`.
     */
    public void setSemanticAnalysis(String SemanticAnalysis) {
        this.SemanticAnalysis = SemanticAnalysis;
    }

    /**
     * Get Managed rule automatic update option. 
     * @return AutoUpdate Managed rule automatic update option.
     */
    public ManagedRuleAutoUpdate getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set Managed rule automatic update option.
     * @param AutoUpdate Managed rule automatic update option.
     */
    public void setAutoUpdate(ManagedRuleAutoUpdate AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get Configuration of the managed rule group. If this structure is passed as an empty array or the GroupId is not included in the array, it will be processed based by default. 
     * @return ManagedRuleGroups Configuration of the managed rule group. If this structure is passed as an empty array or the GroupId is not included in the array, it will be processed based by default.
     */
    public ManagedRuleGroup [] getManagedRuleGroups() {
        return this.ManagedRuleGroups;
    }

    /**
     * Set Configuration of the managed rule group. If this structure is passed as an empty array or the GroupId is not included in the array, it will be processed based by default.
     * @param ManagedRuleGroups Configuration of the managed rule group. If this structure is passed as an empty array or the GroupId is not included in the array, it will be processed based by default.
     */
    public void setManagedRuleGroups(ManagedRuleGroup [] ManagedRuleGroups) {
        this.ManagedRuleGroups = ManagedRuleGroups;
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
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new ManagedRuleAutoUpdate(source.AutoUpdate);
        }
        if (source.ManagedRuleGroups != null) {
            this.ManagedRuleGroups = new ManagedRuleGroup[source.ManagedRuleGroups.length];
            for (int i = 0; i < source.ManagedRuleGroups.length; i++) {
                this.ManagedRuleGroups[i] = new ManagedRuleGroup(source.ManagedRuleGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DetectionOnly", this.DetectionOnly);
        this.setParamSimple(map, prefix + "SemanticAnalysis", this.SemanticAnalysis);
        this.setParamObj(map, prefix + "AutoUpdate.", this.AutoUpdate);
        this.setParamArrayObj(map, prefix + "ManagedRuleGroups.", this.ManagedRuleGroups);

    }
}

