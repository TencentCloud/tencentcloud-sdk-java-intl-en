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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneStatusRequest extends AbstractModel {

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The site status. Values:
<li>`false`: Disabled</li>
<li>`true`: Enabled</li>
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The site status. Values:
<li>`false`: Disabled</li>
<li>`true`: Enabled</li> 
     * @return Paused The site status. Values:
<li>`false`: Disabled</li>
<li>`true`: Enabled</li>
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set The site status. Values:
<li>`false`: Disabled</li>
<li>`true`: Enabled</li>
     * @param Paused The site status. Values:
<li>`false`: Disabled</li>
<li>`true`: Enabled</li>
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    public ModifyZoneStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneStatusRequest(ModifyZoneStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Paused", this.Paused);

    }
}

