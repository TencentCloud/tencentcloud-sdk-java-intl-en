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

public class CreateClusterAsGroupRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The pass-through parameters for scaling group creation, in the format of a JSON string. For more information, see the [CreateAutoScalingGroup](https://cloud.tencent.com/document/api/377/20440) API. The **LaunchConfigurationId** is created with the LaunchConfigurePara parameter, which does not support data entry.
    */
    @SerializedName("AutoScalingGroupPara")
    @Expose
    private String AutoScalingGroupPara;

    /**
    * The pass-through parameters for launch configuration creation, in the format of a JSON string. For more information, see the [CreateLaunchConfiguration](https://cloud.tencent.com/document/api/377/20447) API. **ImageId** is not required as it is already included in the cluster dimension. **UserData** is not required as it's set through the **UserScript**.
    */
    @SerializedName("LaunchConfigurePara")
    @Expose
    private String LaunchConfigurePara;

    /**
    * Advanced configuration information of the node
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * Node label array
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

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
     * Get The pass-through parameters for scaling group creation, in the format of a JSON string. For more information, see the [CreateAutoScalingGroup](https://cloud.tencent.com/document/api/377/20440) API. The **LaunchConfigurationId** is created with the LaunchConfigurePara parameter, which does not support data entry. 
     * @return AutoScalingGroupPara The pass-through parameters for scaling group creation, in the format of a JSON string. For more information, see the [CreateAutoScalingGroup](https://cloud.tencent.com/document/api/377/20440) API. The **LaunchConfigurationId** is created with the LaunchConfigurePara parameter, which does not support data entry.
     */
    public String getAutoScalingGroupPara() {
        return this.AutoScalingGroupPara;
    }

    /**
     * Set The pass-through parameters for scaling group creation, in the format of a JSON string. For more information, see the [CreateAutoScalingGroup](https://cloud.tencent.com/document/api/377/20440) API. The **LaunchConfigurationId** is created with the LaunchConfigurePara parameter, which does not support data entry.
     * @param AutoScalingGroupPara The pass-through parameters for scaling group creation, in the format of a JSON string. For more information, see the [CreateAutoScalingGroup](https://cloud.tencent.com/document/api/377/20440) API. The **LaunchConfigurationId** is created with the LaunchConfigurePara parameter, which does not support data entry.
     */
    public void setAutoScalingGroupPara(String AutoScalingGroupPara) {
        this.AutoScalingGroupPara = AutoScalingGroupPara;
    }

    /**
     * Get The pass-through parameters for launch configuration creation, in the format of a JSON string. For more information, see the [CreateLaunchConfiguration](https://cloud.tencent.com/document/api/377/20447) API. **ImageId** is not required as it is already included in the cluster dimension. **UserData** is not required as it's set through the **UserScript**. 
     * @return LaunchConfigurePara The pass-through parameters for launch configuration creation, in the format of a JSON string. For more information, see the [CreateLaunchConfiguration](https://cloud.tencent.com/document/api/377/20447) API. **ImageId** is not required as it is already included in the cluster dimension. **UserData** is not required as it's set through the **UserScript**.
     */
    public String getLaunchConfigurePara() {
        return this.LaunchConfigurePara;
    }

    /**
     * Set The pass-through parameters for launch configuration creation, in the format of a JSON string. For more information, see the [CreateLaunchConfiguration](https://cloud.tencent.com/document/api/377/20447) API. **ImageId** is not required as it is already included in the cluster dimension. **UserData** is not required as it's set through the **UserScript**.
     * @param LaunchConfigurePara The pass-through parameters for launch configuration creation, in the format of a JSON string. For more information, see the [CreateLaunchConfiguration](https://cloud.tencent.com/document/api/377/20447) API. **ImageId** is not required as it is already included in the cluster dimension. **UserData** is not required as it's set through the **UserScript**.
     */
    public void setLaunchConfigurePara(String LaunchConfigurePara) {
        this.LaunchConfigurePara = LaunchConfigurePara;
    }

    /**
     * Get Advanced configuration information of the node 
     * @return InstanceAdvancedSettings Advanced configuration information of the node
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Advanced configuration information of the node
     * @param InstanceAdvancedSettings Advanced configuration information of the node
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get Node label array 
     * @return Labels Node label array
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Node label array
     * @param Labels Node label array
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoScalingGroupPara", this.AutoScalingGroupPara);
        this.setParamSimple(map, prefix + "LaunchConfigurePara", this.LaunchConfigurePara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

