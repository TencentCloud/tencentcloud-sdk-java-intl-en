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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoScalingGroupFromInstanceRequest extends AbstractModel{

    /**
    * The scaling group name. It must be unique under your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 bytes.
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * The instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The maximum number of instances. Value range: 0-2000.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * The minimum number of instances. Value range: 0-2000.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * The desired capacity. Its value must be greater than the minimum and smaller than the maximum.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * Whether to inherit the instance tag. Default value: False
    */
    @SerializedName("InheritInstanceTag")
    @Expose
    private Boolean InheritInstanceTag;

    /**
     * Get The scaling group name. It must be unique under your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 bytes. 
     * @return AutoScalingGroupName The scaling group name. It must be unique under your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 bytes.
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set The scaling group name. It must be unique under your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 bytes.
     * @param AutoScalingGroupName The scaling group name. It must be unique under your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 bytes.
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get The instance ID. 
     * @return InstanceId The instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The instance ID.
     * @param InstanceId The instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The maximum number of instances. Value range: 0-2000. 
     * @return MinSize The maximum number of instances. Value range: 0-2000.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set The maximum number of instances. Value range: 0-2000.
     * @param MinSize The maximum number of instances. Value range: 0-2000.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get The minimum number of instances. Value range: 0-2000. 
     * @return MaxSize The minimum number of instances. Value range: 0-2000.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set The minimum number of instances. Value range: 0-2000.
     * @param MaxSize The minimum number of instances. Value range: 0-2000.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get The desired capacity. Its value must be greater than the minimum and smaller than the maximum. 
     * @return DesiredCapacity The desired capacity. Its value must be greater than the minimum and smaller than the maximum.
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set The desired capacity. Its value must be greater than the minimum and smaller than the maximum.
     * @param DesiredCapacity The desired capacity. Its value must be greater than the minimum and smaller than the maximum.
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get Whether to inherit the instance tag. Default value: False 
     * @return InheritInstanceTag Whether to inherit the instance tag. Default value: False
     */
    public Boolean getInheritInstanceTag() {
        return this.InheritInstanceTag;
    }

    /**
     * Set Whether to inherit the instance tag. Default value: False
     * @param InheritInstanceTag Whether to inherit the instance tag. Default value: False
     */
    public void setInheritInstanceTag(Boolean InheritInstanceTag) {
        this.InheritInstanceTag = InheritInstanceTag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "InheritInstanceTag", this.InheritInstanceTag);

    }
}

