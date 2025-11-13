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
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Frame rate numerator. Value range: non-negative number, which should be less than 120 when divided by the denominator, and in the unit of Hz. The default value is 0. Note: For transcoding, this parameter will overwrite the Fps in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FpsNum")
    @Expose
    private Long FpsNum;

    /**
    * Frame rate denominator.Value range: numbers equal to or greater than 1. The default value is 1. Note: For transcoding, this parameter will overwrite the FpsDenominator in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FpsDen")
    @Expose
    private Long FpsDen;

    /**
     * Get Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON. 
     * @return Switch Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
     * @param Switch Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Frame rate numerator. Value range: non-negative number, which should be less than 120 when divided by the denominator, and in the unit of Hz. The default value is 0. Note: For transcoding, this parameter will overwrite the Fps in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FpsNum Frame rate numerator. Value range: non-negative number, which should be less than 120 when divided by the denominator, and in the unit of Hz. The default value is 0. Note: For transcoding, this parameter will overwrite the Fps in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFpsNum() {
        return this.FpsNum;
    }

    /**
     * Set Frame rate numerator. Value range: non-negative number, which should be less than 120 when divided by the denominator, and in the unit of Hz. The default value is 0. Note: For transcoding, this parameter will overwrite the Fps in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FpsNum Frame rate numerator. Value range: non-negative number, which should be less than 120 when divided by the denominator, and in the unit of Hz. The default value is 0. Note: For transcoding, this parameter will overwrite the Fps in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFpsNum(Long FpsNum) {
        this.FpsNum = FpsNum;
    }

    /**
     * Get Frame rate denominator.Value range: numbers equal to or greater than 1. The default value is 1. Note: For transcoding, this parameter will overwrite the FpsDenominator in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FpsDen Frame rate denominator.Value range: numbers equal to or greater than 1. The default value is 1. Note: For transcoding, this parameter will overwrite the FpsDenominator in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFpsDen() {
        return this.FpsDen;
    }

    /**
     * Set Frame rate denominator.Value range: numbers equal to or greater than 1. The default value is 1. Note: For transcoding, this parameter will overwrite the FpsDenominator in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FpsDen Frame rate denominator.Value range: numbers equal to or greater than 1. The default value is 1. Note: For transcoding, this parameter will overwrite the FpsDenominator in the VideoTemplate.
Note: This field may return null, indicating that no valid values can be obtained.
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

