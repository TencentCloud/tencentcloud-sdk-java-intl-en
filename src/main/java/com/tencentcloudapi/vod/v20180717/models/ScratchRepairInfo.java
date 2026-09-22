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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScratchRepairInfo extends AbstractModel {

    /**
    * Scratch control switch. Available values:
<li>ON: turn on scratch removal;</li>
<li>OFF: Turn off scratch removal.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Scratch removal strength. Valid only when the scratch control switch is ON. Value range: 0.0–1.0.
Default: 0.0.
    */
    @SerializedName("Intensity")
    @Expose
    private Float Intensity;

    /**
    * Scratch removal type. Valid only when the scratch control switch is ON. Available values:
<li>normal: normal scratch removal;</li>
Default value: normal.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Scratch control switch. Available values:
<li>ON: turn on scratch removal;</li>
<li>OFF: Turn off scratch removal.</li> 
     * @return Switch Scratch control switch. Available values:
<li>ON: turn on scratch removal;</li>
<li>OFF: Turn off scratch removal.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Scratch control switch. Available values:
<li>ON: turn on scratch removal;</li>
<li>OFF: Turn off scratch removal.</li>
     * @param Switch Scratch control switch. Available values:
<li>ON: turn on scratch removal;</li>
<li>OFF: Turn off scratch removal.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Scratch removal strength. Valid only when the scratch control switch is ON. Value range: 0.0–1.0.
Default: 0.0. 
     * @return Intensity Scratch removal strength. Valid only when the scratch control switch is ON. Value range: 0.0–1.0.
Default: 0.0.
     */
    public Float getIntensity() {
        return this.Intensity;
    }

    /**
     * Set Scratch removal strength. Valid only when the scratch control switch is ON. Value range: 0.0–1.0.
Default: 0.0.
     * @param Intensity Scratch removal strength. Valid only when the scratch control switch is ON. Value range: 0.0–1.0.
Default: 0.0.
     */
    public void setIntensity(Float Intensity) {
        this.Intensity = Intensity;
    }

    /**
     * Get Scratch removal type. Valid only when the scratch control switch is ON. Available values:
<li>normal: normal scratch removal;</li>
Default value: normal. 
     * @return Type Scratch removal type. Valid only when the scratch control switch is ON. Available values:
<li>normal: normal scratch removal;</li>
Default value: normal.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Scratch removal type. Valid only when the scratch control switch is ON. Available values:
<li>normal: normal scratch removal;</li>
Default value: normal.
     * @param Type Scratch removal type. Valid only when the scratch control switch is ON. Available values:
<li>normal: normal scratch removal;</li>
Default value: normal.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ScratchRepairInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScratchRepairInfo(ScratchRepairInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Intensity != null) {
            this.Intensity = new Float(source.Intensity);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Intensity", this.Intensity);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

