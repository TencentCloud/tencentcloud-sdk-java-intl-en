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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Autoscaler extends AbstractModel{

    /**
    * Minimum number of instances in a scaling group
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * Maximum number of instances in a scaling group
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Policy of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HorizontalAutoscaler")
    @Expose
    private HorizontalAutoscaler [] HorizontalAutoscaler;

    /**
    * Scheduled auto-scaler policy
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CronHorizontalAutoscaler")
    @Expose
    private CronHorizontalAutoscaler [] CronHorizontalAutoscaler;

    /**
    * Scaling rule ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoscalerId")
    @Expose
    private String AutoscalerId;

    /**
    * Scaling rule name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoscalerName")
    @Expose
    private String AutoscalerName;

    /**
    * Description of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * Start Time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableDate")
    @Expose
    private String EnableDate;

    /**
    * Whether it is enabled
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get Minimum number of instances in a scaling group 
     * @return MinReplicas Minimum number of instances in a scaling group
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set Minimum number of instances in a scaling group
     * @param MinReplicas Minimum number of instances in a scaling group
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get Maximum number of instances in a scaling group 
     * @return MaxReplicas Maximum number of instances in a scaling group
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set Maximum number of instances in a scaling group
     * @param MaxReplicas Maximum number of instances in a scaling group
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Policy of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return HorizontalAutoscaler Policy of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public HorizontalAutoscaler [] getHorizontalAutoscaler() {
        return this.HorizontalAutoscaler;
    }

    /**
     * Set Policy of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param HorizontalAutoscaler Policy of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHorizontalAutoscaler(HorizontalAutoscaler [] HorizontalAutoscaler) {
        this.HorizontalAutoscaler = HorizontalAutoscaler;
    }

    /**
     * Get Scheduled auto-scaler policy
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CronHorizontalAutoscaler Scheduled auto-scaler policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public CronHorizontalAutoscaler [] getCronHorizontalAutoscaler() {
        return this.CronHorizontalAutoscaler;
    }

    /**
     * Set Scheduled auto-scaler policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CronHorizontalAutoscaler Scheduled auto-scaler policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCronHorizontalAutoscaler(CronHorizontalAutoscaler [] CronHorizontalAutoscaler) {
        this.CronHorizontalAutoscaler = CronHorizontalAutoscaler;
    }

    /**
     * Get Scaling rule ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoscalerId Scaling rule ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAutoscalerId() {
        return this.AutoscalerId;
    }

    /**
     * Set Scaling rule ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AutoscalerId Scaling rule ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoscalerId(String AutoscalerId) {
        this.AutoscalerId = AutoscalerId;
    }

    /**
     * Get Scaling rule name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoscalerName Scaling rule name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAutoscalerName() {
        return this.AutoscalerName;
    }

    /**
     * Set Scaling rule name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AutoscalerName Scaling rule name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoscalerName(String AutoscalerName) {
        this.AutoscalerName = AutoscalerName;
    }

    /**
     * Get Description of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Description Description of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Description Description of the scaling rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateDate Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateDate Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get Modification time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ModifyDate Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ModifyDate Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get Start Time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnableDate Start Time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEnableDate() {
        return this.EnableDate;
    }

    /**
     * Set Start Time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnableDate Start Time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnableDate(String EnableDate) {
        this.EnableDate = EnableDate;
    }

    /**
     * Get Whether it is enabled
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Enabled Whether it is enabled
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether it is enabled
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Enabled Whether it is enabled
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public Autoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Autoscaler(Autoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.HorizontalAutoscaler != null) {
            this.HorizontalAutoscaler = new HorizontalAutoscaler[source.HorizontalAutoscaler.length];
            for (int i = 0; i < source.HorizontalAutoscaler.length; i++) {
                this.HorizontalAutoscaler[i] = new HorizontalAutoscaler(source.HorizontalAutoscaler[i]);
            }
        }
        if (source.CronHorizontalAutoscaler != null) {
            this.CronHorizontalAutoscaler = new CronHorizontalAutoscaler[source.CronHorizontalAutoscaler.length];
            for (int i = 0; i < source.CronHorizontalAutoscaler.length; i++) {
                this.CronHorizontalAutoscaler[i] = new CronHorizontalAutoscaler(source.CronHorizontalAutoscaler[i]);
            }
        }
        if (source.AutoscalerId != null) {
            this.AutoscalerId = new String(source.AutoscalerId);
        }
        if (source.AutoscalerName != null) {
            this.AutoscalerName = new String(source.AutoscalerName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.EnableDate != null) {
            this.EnableDate = new String(source.EnableDate);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "HorizontalAutoscaler.", this.HorizontalAutoscaler);
        this.setParamArrayObj(map, prefix + "CronHorizontalAutoscaler.", this.CronHorizontalAutoscaler);
        this.setParamSimple(map, prefix + "AutoscalerId", this.AutoscalerId);
        this.setParamSimple(map, prefix + "AutoscalerName", this.AutoscalerName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "EnableDate", this.EnableDate);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

