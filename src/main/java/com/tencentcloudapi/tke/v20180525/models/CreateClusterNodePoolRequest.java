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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterNodePoolRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * AS group parameters
    */
    @SerializedName("AutoScalingGroupPara")
    @Expose
    private String AutoScalingGroupPara;

    /**
    * Running parameters
    */
    @SerializedName("LaunchConfigurePara")
    @Expose
    private String LaunchConfigurePara;

    /**
    * Sample parameters
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * Indicates whether to enable auto scaling
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Labels
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Taints
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get AS group parameters 
     * @return AutoScalingGroupPara AS group parameters
     */
    public String getAutoScalingGroupPara() {
        return this.AutoScalingGroupPara;
    }

    /**
     * Set AS group parameters
     * @param AutoScalingGroupPara AS group parameters
     */
    public void setAutoScalingGroupPara(String AutoScalingGroupPara) {
        this.AutoScalingGroupPara = AutoScalingGroupPara;
    }

    /**
     * Get Running parameters 
     * @return LaunchConfigurePara Running parameters
     */
    public String getLaunchConfigurePara() {
        return this.LaunchConfigurePara;
    }

    /**
     * Set Running parameters
     * @param LaunchConfigurePara Running parameters
     */
    public void setLaunchConfigurePara(String LaunchConfigurePara) {
        this.LaunchConfigurePara = LaunchConfigurePara;
    }

    /**
     * Get Sample parameters 
     * @return InstanceAdvancedSettings Sample parameters
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Sample parameters
     * @param InstanceAdvancedSettings Sample parameters
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get Indicates whether to enable auto scaling 
     * @return EnableAutoscale Indicates whether to enable auto scaling
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set Indicates whether to enable auto scaling
     * @param EnableAutoscale Indicates whether to enable auto scaling
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
    }

    /**
     * Get Node pool name 
     * @return Name Node pool name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node pool name
     * @param Name Node pool name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Labels 
     * @return Labels Labels
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Labels
     * @param Labels Labels
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Taints 
     * @return Taints Taints
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Taints
     * @param Taints Taints
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoScalingGroupPara", this.AutoScalingGroupPara);
        this.setParamSimple(map, prefix + "LaunchConfigurePara", this.LaunchConfigurePara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);

    }
}

