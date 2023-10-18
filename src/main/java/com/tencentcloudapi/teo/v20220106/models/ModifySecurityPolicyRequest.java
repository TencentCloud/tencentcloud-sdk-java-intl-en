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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityPolicyRequest extends AbstractModel {

    /**
    * Top-level domain name
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Subdomain name/layer-4 proxy
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Security configuration
    */
    @SerializedName("Config")
    @Expose
    private SecurityConfig Config;

    /**
     * Get Top-level domain name 
     * @return ZoneId Top-level domain name
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Top-level domain name
     * @param ZoneId Top-level domain name
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Subdomain name/layer-4 proxy 
     * @return Entity Subdomain name/layer-4 proxy
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Subdomain name/layer-4 proxy
     * @param Entity Subdomain name/layer-4 proxy
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Security configuration 
     * @return Config Security configuration
     */
    public SecurityConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Security configuration
     * @param Config Security configuration
     */
    public void setConfig(SecurityConfig Config) {
        this.Config = Config;
    }

    public ModifySecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyRequest(ModifySecurityPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Config != null) {
            this.Config = new SecurityConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

