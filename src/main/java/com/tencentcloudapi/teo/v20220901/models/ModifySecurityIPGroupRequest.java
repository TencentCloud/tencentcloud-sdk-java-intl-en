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

public class ModifySecurityIPGroupRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * IP group configuration.
    */
    @SerializedName("IPGroup")
    @Expose
    private IPGroup IPGroup;

    /**
    * Operation type. Valid values: 
<li>`append`: Add information of `Content` to `IPGroup`;</li>
<li>`remove`: Delete information of `Content` from `IPGroup`;</li>
<li>`update`: Replace all information of `IPGroup` and modify the IPGroup name.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

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
     * Get IP group configuration. 
     * @return IPGroup IP group configuration.
     */
    public IPGroup getIPGroup() {
        return this.IPGroup;
    }

    /**
     * Set IP group configuration.
     * @param IPGroup IP group configuration.
     */
    public void setIPGroup(IPGroup IPGroup) {
        this.IPGroup = IPGroup;
    }

    /**
     * Get Operation type. Valid values: 
<li>`append`: Add information of `Content` to `IPGroup`;</li>
<li>`remove`: Delete information of `Content` from `IPGroup`;</li>
<li>`update`: Replace all information of `IPGroup` and modify the IPGroup name.</li> 
     * @return Mode Operation type. Valid values: 
<li>`append`: Add information of `Content` to `IPGroup`;</li>
<li>`remove`: Delete information of `Content` from `IPGroup`;</li>
<li>`update`: Replace all information of `IPGroup` and modify the IPGroup name.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Operation type. Valid values: 
<li>`append`: Add information of `Content` to `IPGroup`;</li>
<li>`remove`: Delete information of `Content` from `IPGroup`;</li>
<li>`update`: Replace all information of `IPGroup` and modify the IPGroup name.</li>
     * @param Mode Operation type. Valid values: 
<li>`append`: Add information of `Content` to `IPGroup`;</li>
<li>`remove`: Delete information of `Content` from `IPGroup`;</li>
<li>`update`: Replace all information of `IPGroup` and modify the IPGroup name.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ModifySecurityIPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityIPGroupRequest(ModifySecurityIPGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IPGroup != null) {
            this.IPGroup = new IPGroup(source.IPGroup);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "IPGroup.", this.IPGroup);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

