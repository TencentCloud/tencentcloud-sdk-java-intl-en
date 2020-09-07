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

public class InstanceNameSettings extends AbstractModel{

    /**
    * CVM instance name.

The InstanceName cannot start or end with a period (.) or hyphen (-), and cannot contain consecutive periods and hyphens.

Other types (such as Linux) of instances: The name should be a combination of 2 to 40 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Type of CVM instance name. Valid values: "ORIGINAL" and "UNIQUE". Default value: "ORIGINAL".

ORIGINAL: Auto Scaling transfers the input parameter `InstanceName` to the CVM directly. The CVM may append a serial number to the `InstanceName`. The `InstanceName` of the instances within the auto scaling group may conflict.

UNIQUE: the input parameter `InstanceName` is the prefix of an instance name. Auto Scaling and CVM expand it. The `InstanceName` of an instance in the auto scaling group is unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceNameStyle")
    @Expose
    private String InstanceNameStyle;

    /**
     * Get CVM instance name.

The InstanceName cannot start or end with a period (.) or hyphen (-), and cannot contain consecutive periods and hyphens.

Other types (such as Linux) of instances: The name should be a combination of 2 to 40 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName CVM instance name.

The InstanceName cannot start or end with a period (.) or hyphen (-), and cannot contain consecutive periods and hyphens.

Other types (such as Linux) of instances: The name should be a combination of 2 to 40 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CVM instance name.

The InstanceName cannot start or end with a period (.) or hyphen (-), and cannot contain consecutive periods and hyphens.

Other types (such as Linux) of instances: The name should be a combination of 2 to 40 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceName CVM instance name.

The InstanceName cannot start or end with a period (.) or hyphen (-), and cannot contain consecutive periods and hyphens.

Other types (such as Linux) of instances: The name should be a combination of 2 to 40 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Type of CVM instance name. Valid values: "ORIGINAL" and "UNIQUE". Default value: "ORIGINAL".

ORIGINAL: Auto Scaling transfers the input parameter `InstanceName` to the CVM directly. The CVM may append a serial number to the `InstanceName`. The `InstanceName` of the instances within the auto scaling group may conflict.

UNIQUE: the input parameter `InstanceName` is the prefix of an instance name. Auto Scaling and CVM expand it. The `InstanceName` of an instance in the auto scaling group is unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceNameStyle Type of CVM instance name. Valid values: "ORIGINAL" and "UNIQUE". Default value: "ORIGINAL".

ORIGINAL: Auto Scaling transfers the input parameter `InstanceName` to the CVM directly. The CVM may append a serial number to the `InstanceName`. The `InstanceName` of the instances within the auto scaling group may conflict.

UNIQUE: the input parameter `InstanceName` is the prefix of an instance name. Auto Scaling and CVM expand it. The `InstanceName` of an instance in the auto scaling group is unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceNameStyle() {
        return this.InstanceNameStyle;
    }

    /**
     * Set Type of CVM instance name. Valid values: "ORIGINAL" and "UNIQUE". Default value: "ORIGINAL".

ORIGINAL: Auto Scaling transfers the input parameter `InstanceName` to the CVM directly. The CVM may append a serial number to the `InstanceName`. The `InstanceName` of the instances within the auto scaling group may conflict.

UNIQUE: the input parameter `InstanceName` is the prefix of an instance name. Auto Scaling and CVM expand it. The `InstanceName` of an instance in the auto scaling group is unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceNameStyle Type of CVM instance name. Valid values: "ORIGINAL" and "UNIQUE". Default value: "ORIGINAL".

ORIGINAL: Auto Scaling transfers the input parameter `InstanceName` to the CVM directly. The CVM may append a serial number to the `InstanceName`. The `InstanceName` of the instances within the auto scaling group may conflict.

UNIQUE: the input parameter `InstanceName` is the prefix of an instance name. Auto Scaling and CVM expand it. The `InstanceName` of an instance in the auto scaling group is unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceNameStyle(String InstanceNameStyle) {
        this.InstanceNameStyle = InstanceNameStyle;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceNameStyle", this.InstanceNameStyle);

    }
}

