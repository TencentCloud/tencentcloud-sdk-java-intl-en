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

public class ReferenceHolder extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Instance type. Valid values:
<li>acceleration-domain: Acceleration domain name;</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance information that is cited or referencing.
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Instance type. Valid values:
<li>acceleration-domain: Acceleration domain name;</li> 
     * @return Type Instance type. Valid values:
<li>acceleration-domain: Acceleration domain name;</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type. Valid values:
<li>acceleration-domain: Acceleration domain name;</li>
     * @param Type Instance type. Valid values:
<li>acceleration-domain: Acceleration domain name;</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance information that is cited or referencing. 
     * @return Instance Instance information that is cited or referencing.
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set Instance information that is cited or referencing.
     * @param Instance Instance information that is cited or referencing.
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    public ReferenceHolder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferenceHolder(ReferenceHolder source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Instance", this.Instance);

    }
}

