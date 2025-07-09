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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckTemplateRule extends AbstractModel {

    /**
    * Health check item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of health check rules
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Fix action
    */
    @SerializedName("RepairAction")
    @Expose
    private String RepairAction;

    /**
    * Fix impact
    */
    @SerializedName("RepairEffect")
    @Expose
    private String RepairEffect;

    /**
    * Whether it is recommended to enable check
    */
    @SerializedName("ShouldEnable")
    @Expose
    private Boolean ShouldEnable;

    /**
    * Whether repair is suggested.
    */
    @SerializedName("ShouldRepair")
    @Expose
    private Boolean ShouldRepair;

    /**
    * Severity
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
     * Get Health check item name 
     * @return Name Health check item name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Health check item name
     * @param Name Health check item name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of health check rules 
     * @return Description Description of health check rules
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of health check rules
     * @param Description Description of health check rules
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Fix action 
     * @return RepairAction Fix action
     */
    public String getRepairAction() {
        return this.RepairAction;
    }

    /**
     * Set Fix action
     * @param RepairAction Fix action
     */
    public void setRepairAction(String RepairAction) {
        this.RepairAction = RepairAction;
    }

    /**
     * Get Fix impact 
     * @return RepairEffect Fix impact
     */
    public String getRepairEffect() {
        return this.RepairEffect;
    }

    /**
     * Set Fix impact
     * @param RepairEffect Fix impact
     */
    public void setRepairEffect(String RepairEffect) {
        this.RepairEffect = RepairEffect;
    }

    /**
     * Get Whether it is recommended to enable check 
     * @return ShouldEnable Whether it is recommended to enable check
     */
    public Boolean getShouldEnable() {
        return this.ShouldEnable;
    }

    /**
     * Set Whether it is recommended to enable check
     * @param ShouldEnable Whether it is recommended to enable check
     */
    public void setShouldEnable(Boolean ShouldEnable) {
        this.ShouldEnable = ShouldEnable;
    }

    /**
     * Get Whether repair is suggested. 
     * @return ShouldRepair Whether repair is suggested.
     */
    public Boolean getShouldRepair() {
        return this.ShouldRepair;
    }

    /**
     * Set Whether repair is suggested.
     * @param ShouldRepair Whether repair is suggested.
     */
    public void setShouldRepair(Boolean ShouldRepair) {
        this.ShouldRepair = ShouldRepair;
    }

    /**
     * Get Severity 
     * @return Severity Severity
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set Severity
     * @param Severity Severity
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    public HealthCheckTemplateRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckTemplateRule(HealthCheckTemplateRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RepairAction != null) {
            this.RepairAction = new String(source.RepairAction);
        }
        if (source.RepairEffect != null) {
            this.RepairEffect = new String(source.RepairEffect);
        }
        if (source.ShouldEnable != null) {
            this.ShouldEnable = new Boolean(source.ShouldEnable);
        }
        if (source.ShouldRepair != null) {
            this.ShouldRepair = new Boolean(source.ShouldRepair);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RepairAction", this.RepairAction);
        this.setParamSimple(map, prefix + "RepairEffect", this.RepairEffect);
        this.setParamSimple(map, prefix + "ShouldEnable", this.ShouldEnable);
        this.setParamSimple(map, prefix + "ShouldRepair", this.ShouldRepair);
        this.setParamSimple(map, prefix + "Severity", this.Severity);

    }
}

