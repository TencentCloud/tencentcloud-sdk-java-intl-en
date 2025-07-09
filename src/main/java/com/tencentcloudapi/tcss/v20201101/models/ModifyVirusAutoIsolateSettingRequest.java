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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVirusAutoIsolateSettingRequest extends AbstractModel {

    /**
    * Automatic isolation switch. Valid values: `true` (on); `false` (off).
    */
    @SerializedName("AutoIsolateSwitch")
    @Expose
    private Boolean AutoIsolateSwitch;

    /**
    * Whether to interrupt the process associated with the isolated file. Valid values: `true` (yes); `false` (no).
    */
    @SerializedName("IsKillProgress")
    @Expose
    private Boolean IsKillProgress;

    /**
     * Get Automatic isolation switch. Valid values: `true` (on); `false` (off). 
     * @return AutoIsolateSwitch Automatic isolation switch. Valid values: `true` (on); `false` (off).
     */
    public Boolean getAutoIsolateSwitch() {
        return this.AutoIsolateSwitch;
    }

    /**
     * Set Automatic isolation switch. Valid values: `true` (on); `false` (off).
     * @param AutoIsolateSwitch Automatic isolation switch. Valid values: `true` (on); `false` (off).
     */
    public void setAutoIsolateSwitch(Boolean AutoIsolateSwitch) {
        this.AutoIsolateSwitch = AutoIsolateSwitch;
    }

    /**
     * Get Whether to interrupt the process associated with the isolated file. Valid values: `true` (yes); `false` (no). 
     * @return IsKillProgress Whether to interrupt the process associated with the isolated file. Valid values: `true` (yes); `false` (no).
     */
    public Boolean getIsKillProgress() {
        return this.IsKillProgress;
    }

    /**
     * Set Whether to interrupt the process associated with the isolated file. Valid values: `true` (yes); `false` (no).
     * @param IsKillProgress Whether to interrupt the process associated with the isolated file. Valid values: `true` (yes); `false` (no).
     */
    public void setIsKillProgress(Boolean IsKillProgress) {
        this.IsKillProgress = IsKillProgress;
    }

    public ModifyVirusAutoIsolateSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirusAutoIsolateSettingRequest(ModifyVirusAutoIsolateSettingRequest source) {
        if (source.AutoIsolateSwitch != null) {
            this.AutoIsolateSwitch = new Boolean(source.AutoIsolateSwitch);
        }
        if (source.IsKillProgress != null) {
            this.IsKillProgress = new Boolean(source.IsKillProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoIsolateSwitch", this.AutoIsolateSwitch);
        this.setParamSimple(map, prefix + "IsKillProgress", this.IsKillProgress);

    }
}

