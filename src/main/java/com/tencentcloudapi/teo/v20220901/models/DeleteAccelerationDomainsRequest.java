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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccelerationDomainsRequest extends AbstractModel {

    /**
    * ID of the site related with the accelerated domain name.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of accelerated domain names to be deleted.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * Whether to forcibly delete a domain name if it is associated with resources (such as alias domain names and traffic scheduling policies). 
<li>`true`: Delete the domain name and all associated resources.</li>
<li>`false`: Do not delete the domain name and all associated resources.</li>If it’s not specified, the default value `false` is used.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get ID of the site related with the accelerated domain name. 
     * @return ZoneId ID of the site related with the accelerated domain name.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site related with the accelerated domain name.
     * @param ZoneId ID of the site related with the accelerated domain name.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of accelerated domain names to be deleted. 
     * @return DomainNames List of accelerated domain names to be deleted.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set List of accelerated domain names to be deleted.
     * @param DomainNames List of accelerated domain names to be deleted.
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get Whether to forcibly delete a domain name if it is associated with resources (such as alias domain names and traffic scheduling policies). 
<li>`true`: Delete the domain name and all associated resources.</li>
<li>`false`: Do not delete the domain name and all associated resources.</li>If it’s not specified, the default value `false` is used. 
     * @return Force Whether to forcibly delete a domain name if it is associated with resources (such as alias domain names and traffic scheduling policies). 
<li>`true`: Delete the domain name and all associated resources.</li>
<li>`false`: Do not delete the domain name and all associated resources.</li>If it’s not specified, the default value `false` is used.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to forcibly delete a domain name if it is associated with resources (such as alias domain names and traffic scheduling policies). 
<li>`true`: Delete the domain name and all associated resources.</li>
<li>`false`: Do not delete the domain name and all associated resources.</li>If it’s not specified, the default value `false` is used.
     * @param Force Whether to forcibly delete a domain name if it is associated with resources (such as alias domain names and traffic scheduling policies). 
<li>`true`: Delete the domain name and all associated resources.</li>
<li>`false`: Do not delete the domain name and all associated resources.</li>If it’s not specified, the default value `false` is used.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteAccelerationDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccelerationDomainsRequest(DeleteAccelerationDomainsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

