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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIpTableListRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name/layer-4 proxy.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * List of basic access control rules.
    */
    @SerializedName("IpTableRules")
    @Expose
    private IpTableRule [] IpTableRules;

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
     * Get The subdomain name/layer-4 proxy. 
     * @return Entity The subdomain name/layer-4 proxy.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name/layer-4 proxy.
     * @param Entity The subdomain name/layer-4 proxy.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get List of basic access control rules. 
     * @return IpTableRules List of basic access control rules.
     */
    public IpTableRule [] getIpTableRules() {
        return this.IpTableRules;
    }

    /**
     * Set List of basic access control rules.
     * @param IpTableRules List of basic access control rules.
     */
    public void setIpTableRules(IpTableRule [] IpTableRules) {
        this.IpTableRules = IpTableRules;
    }

    public CreateIpTableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIpTableListRequest(CreateIpTableListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.IpTableRules != null) {
            this.IpTableRules = new IpTableRule[source.IpTableRules.length];
            for (int i = 0; i < source.IpTableRules.length; i++) {
                this.IpTableRules[i] = new IpTableRule(source.IpTableRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamArrayObj(map, prefix + "IpTableRules.", this.IpTableRules);

    }
}

