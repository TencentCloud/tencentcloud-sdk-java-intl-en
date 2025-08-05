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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * Site id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Whether to disable the site. valid values: <li>false: not disabled;</li>.
<li>true: disabled.</li>.
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
     * Get Site id. 
     * @return ZoneId Site id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site id.
     * @param ZoneId Site id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Site name. 
     * @return ZoneName Site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name.
     * @param ZoneName Site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Whether to disable the site. valid values: <li>false: not disabled;</li>.
<li>true: disabled.</li>. 
     * @return Paused Whether to disable the site. valid values: <li>false: not disabled;</li>.
<li>true: disabled.</li>.
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Whether to disable the site. valid values: <li>false: not disabled;</li>.
<li>true: disabled.</li>.
     * @param Paused Whether to disable the site. valid values: <li>false: not disabled;</li>.
<li>true: disabled.</li>.
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
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
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Paused", this.Paused);

    }
}

