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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameRateWithDenConfig extends AbstractModel {

    /**
    * Capability configuration switch. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("FpsNum")
    @Expose
    private Long FpsNum;

    /**
    * 
    */
    @SerializedName("FpsDen")
    @Expose
    private Long FpsDen;

    /**
     * Get Capability configuration switch. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON. 
     * @return Switch Capability configuration switch. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Capability configuration switch. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
     * @param Switch Capability configuration switch. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return FpsNum 
     */
    public Long getFpsNum() {
        return this.FpsNum;
    }

    /**
     * Set 
     * @param FpsNum 
     */
    public void setFpsNum(Long FpsNum) {
        this.FpsNum = FpsNum;
    }

    /**
     * Get  
     * @return FpsDen 
     */
    public Long getFpsDen() {
        return this.FpsDen;
    }

    /**
     * Set 
     * @param FpsDen 
     */
    public void setFpsDen(Long FpsDen) {
        this.FpsDen = FpsDen;
    }

    public FrameRateWithDenConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameRateWithDenConfig(FrameRateWithDenConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FpsNum != null) {
            this.FpsNum = new Long(source.FpsNum);
        }
        if (source.FpsDen != null) {
            this.FpsDen = new Long(source.FpsDen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FpsNum", this.FpsNum);
        this.setParamSimple(map, prefix + "FpsDen", this.FpsDen);

    }
}

