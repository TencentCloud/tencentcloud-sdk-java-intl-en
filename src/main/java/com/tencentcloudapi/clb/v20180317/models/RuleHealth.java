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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleHealth extends AbstractModel{

    /**
    * Forwarding rule ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule Url
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Health check status of the real server bound to this rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Targets")
    @Expose
    private TargetHealth [] Targets;

    /**
     * Get Forwarding rule ID 
     * @return LocationId Forwarding rule ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID
     * @param LocationId Forwarding rule ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule Url
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Forwarding rule Url
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding rule Url
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Forwarding rule Url
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Health check status of the real server bound to this rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Targets Health check status of the real server bound to this rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TargetHealth [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Health check status of the real server bound to this rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Targets Health check status of the real server bound to this rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargets(TargetHealth [] Targets) {
        this.Targets = Targets;
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

