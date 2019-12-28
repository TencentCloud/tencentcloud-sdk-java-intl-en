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

public class RuleTargets extends AbstractModel{

    /**
    * Forwarding rule ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the forwarding rule
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule path.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Real server information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Targets")
    @Expose
    private Backend [] Targets;

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
     * @return Domain Domain name of the forwarding rule
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule
     * @param Domain Domain name of the forwarding rule
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule path. 
     * @return Url Forwarding rule path.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding rule path.
     * @param Url Forwarding rule path.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Real server information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Targets Real server information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Backend [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Real server information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Targets Real server information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargets(Backend [] Targets) {
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

