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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RulesItems extends AbstractModel {

    /**
    * Rule ID.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Uri
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Object bound to the real server.
    */
    @SerializedName("Targets")
    @Expose
    private LbRsTargets [] Targets;

    /**
     * Get Rule ID. 
     * @return LocationId Rule ID.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Rule ID.
     * @param LocationId Rule ID.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name. 
     * @return Domain Domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
     * @param Domain Domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Uri 
     * @return Url Uri
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Uri
     * @param Url Uri
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Object bound to the real server. 
     * @return Targets Object bound to the real server.
     */
    public LbRsTargets [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Object bound to the real server.
     * @param Targets Object bound to the real server.
     */
    public void setTargets(LbRsTargets [] Targets) {
        this.Targets = Targets;
    }

    public RulesItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulesItems(RulesItems source) {
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Targets != null) {
            this.Targets = new LbRsTargets[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new LbRsTargets(source.Targets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);

    }
}

