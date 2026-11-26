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
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Alias domain name status. Valid values:
<li> false: enable alias domain name;</li>
<li> true: Disable the alias domain name.</li>
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * Alias domain name in pending modification status. If it is empty, the modification status operation will not be performed.
    */
    @SerializedName("AliasNames")
    @Expose
    private String [] AliasNames;

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
     * Get Alias domain name status. Valid values:
<li> false: enable alias domain name;</li>
<li> true: Disable the alias domain name.</li> 
     * @return Paused Alias domain name status. Valid values:
<li> false: enable alias domain name;</li>
<li> true: Disable the alias domain name.</li>
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Alias domain name status. Valid values:
<li> false: enable alias domain name;</li>
<li> true: Disable the alias domain name.</li>
     * @param Paused Alias domain name status. Valid values:
<li> false: enable alias domain name;</li>
<li> true: Disable the alias domain name.</li>
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get Alias domain name in pending modification status. If it is empty, the modification status operation will not be performed. 
     * @return AliasNames Alias domain name in pending modification status. If it is empty, the modification status operation will not be performed.
     */
    public String [] getAliasNames() {
        return this.AliasNames;
    }

    /**
     * Set Alias domain name in pending modification status. If it is empty, the modification status operation will not be performed.
     * @param AliasNames Alias domain name in pending modification status. If it is empty, the modification status operation will not be performed.
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

