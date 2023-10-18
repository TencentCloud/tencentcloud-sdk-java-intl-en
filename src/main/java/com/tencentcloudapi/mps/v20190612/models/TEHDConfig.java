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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TEHDConfig extends AbstractModel {

    /**
    * TESHD type. Valid values:
<li>TEHD-100: TESHD-100.</li>
If this parameter is left empty, TESHD will not be enabled.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Maximum bitrate, which is valid when `Type` is `TESHD`.
If this parameter is left empty or 0 is entered, there will be no upper limit for bitrate.
    */
    @SerializedName("MaxVideoBitrate")
    @Expose
    private Long MaxVideoBitrate;

    /**
     * Get TESHD type. Valid values:
<li>TEHD-100: TESHD-100.</li>
If this parameter is left empty, TESHD will not be enabled. 
     * @return Type TESHD type. Valid values:
<li>TEHD-100: TESHD-100.</li>
If this parameter is left empty, TESHD will not be enabled.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set TESHD type. Valid values:
<li>TEHD-100: TESHD-100.</li>
If this parameter is left empty, TESHD will not be enabled.
     * @param Type TESHD type. Valid values:
<li>TEHD-100: TESHD-100.</li>
If this parameter is left empty, TESHD will not be enabled.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Maximum bitrate, which is valid when `Type` is `TESHD`.
If this parameter is left empty or 0 is entered, there will be no upper limit for bitrate. 
     * @return MaxVideoBitrate Maximum bitrate, which is valid when `Type` is `TESHD`.
If this parameter is left empty or 0 is entered, there will be no upper limit for bitrate.
     */
    public Long getMaxVideoBitrate() {
        return this.MaxVideoBitrate;
    }

    /**
     * Set Maximum bitrate, which is valid when `Type` is `TESHD`.
If this parameter is left empty or 0 is entered, there will be no upper limit for bitrate.
     * @param MaxVideoBitrate Maximum bitrate, which is valid when `Type` is `TESHD`.
If this parameter is left empty or 0 is entered, there will be no upper limit for bitrate.
     */
    public void setMaxVideoBitrate(Long MaxVideoBitrate) {
        this.MaxVideoBitrate = MaxVideoBitrate;
    }

    public TEHDConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TEHDConfig(TEHDConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MaxVideoBitrate != null) {
            this.MaxVideoBitrate = new Long(source.MaxVideoBitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MaxVideoBitrate", this.MaxVideoBitrate);

    }
}

