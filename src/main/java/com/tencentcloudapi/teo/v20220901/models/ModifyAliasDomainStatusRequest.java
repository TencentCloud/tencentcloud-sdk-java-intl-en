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

public class ModifyAliasDomainStatusRequest extends AbstractModel {

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Status of the alias domain name. Values:
<li>`false`: Enable the alias domain name.</li>
<li>`true`: Disable the alias domain name.</li>
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * The alias domain name you want to modify its status. If it is left empty, the modify operation is not performed.
    */
    @SerializedName("AliasNames")
    @Expose
    private String [] AliasNames;

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
     * Get Status of the alias domain name. Values:
<li>`false`: Enable the alias domain name.</li>
<li>`true`: Disable the alias domain name.</li> 
     * @return Paused Status of the alias domain name. Values:
<li>`false`: Enable the alias domain name.</li>
<li>`true`: Disable the alias domain name.</li>
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Status of the alias domain name. Values:
<li>`false`: Enable the alias domain name.</li>
<li>`true`: Disable the alias domain name.</li>
     * @param Paused Status of the alias domain name. Values:
<li>`false`: Enable the alias domain name.</li>
<li>`true`: Disable the alias domain name.</li>
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get The alias domain name you want to modify its status. If it is left empty, the modify operation is not performed. 
     * @return AliasNames The alias domain name you want to modify its status. If it is left empty, the modify operation is not performed.
     */
    public String [] getAliasNames() {
        return this.AliasNames;
    }

    /**
     * Set The alias domain name you want to modify its status. If it is left empty, the modify operation is not performed.
     * @param AliasNames The alias domain name you want to modify its status. If it is left empty, the modify operation is not performed.
     */
    public void setAliasNames(String [] AliasNames) {
        this.AliasNames = AliasNames;
    }

    public ModifyAliasDomainStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAliasDomainStatusRequest(ModifyAliasDomainStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.AliasNames != null) {
            this.AliasNames = new String[source.AliasNames.length];
            for (int i = 0; i < source.AliasNames.length; i++) {
                this.AliasNames[i] = new String(source.AliasNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamArraySimple(map, prefix + "AliasNames.", this.AliasNames);

    }
}

