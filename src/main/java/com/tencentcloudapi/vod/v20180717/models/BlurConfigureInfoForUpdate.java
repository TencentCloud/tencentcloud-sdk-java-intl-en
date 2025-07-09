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

public class BlurConfigureInfoForUpdate extends AbstractModel {

    /**
    * Video screen blur detection switch, optional values:
<li>ON: turn on;</li>
<li>OFF: turn off. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Video screen blur detection switch, optional values:
<li>ON: turn on;</li>
<li>OFF: turn off. </li> 
     * @return Switch Video screen blur detection switch, optional values:
<li>ON: turn on;</li>
<li>OFF: turn off. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Video screen blur detection switch, optional values:
<li>ON: turn on;</li>
<li>OFF: turn off. </li>
     * @param Switch Video screen blur detection switch, optional values:
<li>ON: turn on;</li>
<li>OFF: turn off. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public BlurConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlurConfigureInfoForUpdate(BlurConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

