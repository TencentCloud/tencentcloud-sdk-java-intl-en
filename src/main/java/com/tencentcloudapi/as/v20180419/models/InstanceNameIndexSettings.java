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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNameIndexSettings extends AbstractModel {

    /**
    * Whether to enable instance creation sequencing, which is disabled by default. Valid values: <li>TRUE: Indicates that instance creation sequencing is enabled. <li>FALSE: Indicates that instance creation sequencing is disabled.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Initial sequence number, with a value range of [0, 99,999,999]. When the sequence number exceeds this range after incrementing, scale-out activities will fail. <li>Upon the first enabling of instance name sequencing: The default value is 0. <li>Upon the enabling of instance name sequencing (not for the first time): If this parameter is not specified, the historical sequence number will be carried forward. Lowering the initial sequence number may result in duplicate instance name sequences within the scaling group.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BeginIndex")
    @Expose
    private Long BeginIndex;

    /**
     * Get Whether to enable instance creation sequencing, which is disabled by default. Valid values: <li>TRUE: Indicates that instance creation sequencing is enabled. <li>FALSE: Indicates that instance creation sequencing is disabled.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Enabled Whether to enable instance creation sequencing, which is disabled by default. Valid values: <li>TRUE: Indicates that instance creation sequencing is enabled. <li>FALSE: Indicates that instance creation sequencing is disabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable instance creation sequencing, which is disabled by default. Valid values: <li>TRUE: Indicates that instance creation sequencing is enabled. <li>FALSE: Indicates that instance creation sequencing is disabled.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Enabled Whether to enable instance creation sequencing, which is disabled by default. Valid values: <li>TRUE: Indicates that instance creation sequencing is enabled. <li>FALSE: Indicates that instance creation sequencing is disabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Initial sequence number, with a value range of [0, 99,999,999]. When the sequence number exceeds this range after incrementing, scale-out activities will fail. <li>Upon the first enabling of instance name sequencing: The default value is 0. <li>Upon the enabling of instance name sequencing (not for the first time): If this parameter is not specified, the historical sequence number will be carried forward. Lowering the initial sequence number may result in duplicate instance name sequences within the scaling group.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BeginIndex Initial sequence number, with a value range of [0, 99,999,999]. When the sequence number exceeds this range after incrementing, scale-out activities will fail. <li>Upon the first enabling of instance name sequencing: The default value is 0. <li>Upon the enabling of instance name sequencing (not for the first time): If this parameter is not specified, the historical sequence number will be carried forward. Lowering the initial sequence number may result in duplicate instance name sequences within the scaling group.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set Initial sequence number, with a value range of [0, 99,999,999]. When the sequence number exceeds this range after incrementing, scale-out activities will fail. <li>Upon the first enabling of instance name sequencing: The default value is 0. <li>Upon the enabling of instance name sequencing (not for the first time): If this parameter is not specified, the historical sequence number will be carried forward. Lowering the initial sequence number may result in duplicate instance name sequences within the scaling group.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BeginIndex Initial sequence number, with a value range of [0, 99,999,999]. When the sequence number exceeds this range after incrementing, scale-out activities will fail. <li>Upon the first enabling of instance name sequencing: The default value is 0. <li>Upon the enabling of instance name sequencing (not for the first time): If this parameter is not specified, the historical sequence number will be carried forward. Lowering the initial sequence number may result in duplicate instance name sequences within the scaling group.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBeginIndex(Long BeginIndex) {
        this.BeginIndex = BeginIndex;
    }

    public InstanceNameIndexSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNameIndexSettings(InstanceNameIndexSettings source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.BeginIndex != null) {
            this.BeginIndex = new Long(source.BeginIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "BeginIndex", this.BeginIndex);

    }
}

