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

public class ModifyDDoSProtectionRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Exclusive DDoS protection configuration.
    */
    @SerializedName("DDoSProtection")
    @Expose
    private DDoSProtection DDoSProtection;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Exclusive DDoS protection configuration. 
     * @return DDoSProtection Exclusive DDoS protection configuration.
     */
    public DDoSProtection getDDoSProtection() {
        return this.DDoSProtection;
    }

    /**
     * Set Exclusive DDoS protection configuration.
     * @param DDoSProtection Exclusive DDoS protection configuration.
     */
    public void setDDoSProtection(DDoSProtection DDoSProtection) {
        this.DDoSProtection = DDoSProtection;
    }

    public ModifyDDoSProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSProtectionRequest(ModifyDDoSProtectionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DDoSProtection != null) {
            this.DDoSProtection = new DDoSProtection(source.DDoSProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "DDoSProtection.", this.DDoSProtection);

    }
}

