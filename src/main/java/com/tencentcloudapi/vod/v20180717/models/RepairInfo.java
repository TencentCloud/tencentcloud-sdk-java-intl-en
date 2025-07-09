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

public class RepairInfo extends AbstractModel {

    /**
    * Whether to enable video quality remastering. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The video quality remastering type. This parameter is valid only if `Switch` is `ON`.
<li>`weak`</li>
<li>`normal`</li>
<li>`strong`</li>
Default value: `weak`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Whether to enable video quality remastering. Valid values:
<li>`ON`</li>
<li>`OFF`</li> 
     * @return Switch Whether to enable video quality remastering. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable video quality remastering. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     * @param Switch Whether to enable video quality remastering. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The video quality remastering type. This parameter is valid only if `Switch` is `ON`.
<li>`weak`</li>
<li>`normal`</li>
<li>`strong`</li>
Default value: `weak`. 
     * @return Type The video quality remastering type. This parameter is valid only if `Switch` is `ON`.
<li>`weak`</li>
<li>`normal`</li>
<li>`strong`</li>
Default value: `weak`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The video quality remastering type. This parameter is valid only if `Switch` is `ON`.
<li>`weak`</li>
<li>`normal`</li>
<li>`strong`</li>
Default value: `weak`.
     * @param Type The video quality remastering type. This parameter is valid only if `Switch` is `ON`.
<li>`weak`</li>
<li>`normal`</li>
<li>`strong`</li>
Default value: `weak`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RepairInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepairInfo(RepairInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

