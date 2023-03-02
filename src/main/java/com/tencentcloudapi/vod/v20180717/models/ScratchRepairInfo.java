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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScratchRepairInfo extends AbstractModel{

    /**
    * Whether to enable banding removal. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The banding removal strength. Value range: 0.0 – 1.0. This parameter is valid only if `Switch` is `ON`.
Default value: `0.0`.
    */
    @SerializedName("Intensity")
    @Expose
    private Float Intensity;

    /**
    * The banding removal type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`normal`</li>
Default value: `normal`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Whether to enable banding removal. Valid values:
<li>`ON`</li>
<li>`OFF`</li> 
     * @return Switch Whether to enable banding removal. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable banding removal. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     * @param Switch Whether to enable banding removal. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The banding removal strength. Value range: 0.0 – 1.0. This parameter is valid only if `Switch` is `ON`.
Default value: `0.0`. 
     * @return Intensity The banding removal strength. Value range: 0.0 – 1.0. This parameter is valid only if `Switch` is `ON`.
Default value: `0.0`.
     */
    public Float getIntensity() {
        return this.Intensity;
    }

    /**
     * Set The banding removal strength. Value range: 0.0 – 1.0. This parameter is valid only if `Switch` is `ON`.
Default value: `0.0`.
     * @param Intensity The banding removal strength. Value range: 0.0 – 1.0. This parameter is valid only if `Switch` is `ON`.
Default value: `0.0`.
     */
    public void setIntensity(Float Intensity) {
        this.Intensity = Intensity;
    }

    /**
     * Get The banding removal type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`normal`</li>
Default value: `normal`. 
     * @return Type The banding removal type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`normal`</li>
Default value: `normal`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The banding removal type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`normal`</li>
Default value: `normal`.
     * @param Type The banding removal type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`normal`</li>
Default value: `normal`.
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

