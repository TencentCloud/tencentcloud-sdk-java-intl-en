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

public class TraceWatermarkInput extends AbstractModel {

    /**
    * Whether to use digital watermarks. This parameter is required. Valid values:
<li>ON</li>
<li>OFF</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * This parameter has been deprecated.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get Whether to use digital watermarks. This parameter is required. Valid values:
<li>ON</li>
<li>OFF</li> 
     * @return Switch Whether to use digital watermarks. This parameter is required. Valid values:
<li>ON</li>
<li>OFF</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to use digital watermarks. This parameter is required. Valid values:
<li>ON</li>
<li>OFF</li>
     * @param Switch Whether to use digital watermarks. This parameter is required. Valid values:
<li>ON</li>
<li>OFF</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get This parameter has been deprecated. 
     * @return Definition This parameter has been deprecated.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set This parameter has been deprecated.
     * @param Definition This parameter has been deprecated.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public TraceWatermarkInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceWatermarkInput(TraceWatermarkInput source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

