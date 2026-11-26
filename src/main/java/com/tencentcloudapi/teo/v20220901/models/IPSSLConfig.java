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

public class IPSSLConfig extends AbstractModel {

    /**
    * <p>ID of the site associated with the IP SSL domain name. If the Status value is unbound, this field is empty.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>The domain name associated with the IP SSL. If the Status value is unbound, this field is empty.</p>
    */
    @SerializedName("AssociatedDomain")
    @Expose
    private String AssociatedDomain;

    /**
    * <p>Association status. Values as follows:</p><li>bound: IP SSL configuration bound</li><li>binding: IP SSL configuration binding</li><li>unbinding: IP SSL configuration unbinding</li><li>unbound: IP SSL configuration not bound</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>ID of the site associated with the IP SSL domain name. If the Status value is unbound, this field is empty.</p> 
     * @return ZoneId <p>ID of the site associated with the IP SSL domain name. If the Status value is unbound, this field is empty.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>ID of the site associated with the IP SSL domain name. If the Status value is unbound, this field is empty.</p>
     * @param ZoneId <p>ID of the site associated with the IP SSL domain name. If the Status value is unbound, this field is empty.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>The domain name associated with the IP SSL. If the Status value is unbound, this field is empty.</p> 
     * @return AssociatedDomain <p>The domain name associated with the IP SSL. If the Status value is unbound, this field is empty.</p>
     */
    public String getAssociatedDomain() {
        return this.AssociatedDomain;
    }

    /**
     * Set <p>The domain name associated with the IP SSL. If the Status value is unbound, this field is empty.</p>
     * @param AssociatedDomain <p>The domain name associated with the IP SSL. If the Status value is unbound, this field is empty.</p>
     */
    public void setAssociatedDomain(String AssociatedDomain) {
        this.AssociatedDomain = AssociatedDomain;
    }

    /**
     * Get <p>Association status. Values as follows:</p><li>bound: IP SSL configuration bound</li><li>binding: IP SSL configuration binding</li><li>unbinding: IP SSL configuration unbinding</li><li>unbound: IP SSL configuration not bound</li> 
     * @return Status <p>Association status. Values as follows:</p><li>bound: IP SSL configuration bound</li><li>binding: IP SSL configuration binding</li><li>unbinding: IP SSL configuration unbinding</li><li>unbound: IP SSL configuration not bound</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Association status. Values as follows:</p><li>bound: IP SSL configuration bound</li><li>binding: IP SSL configuration binding</li><li>unbinding: IP SSL configuration unbinding</li><li>unbound: IP SSL configuration not bound</li>
     * @param Status <p>Association status. Values as follows:</p><li>bound: IP SSL configuration bound</li><li>binding: IP SSL configuration binding</li><li>unbinding: IP SSL configuration unbinding</li><li>unbound: IP SSL configuration not bound</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public IPSSLConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPSSLConfig(IPSSLConfig source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.AssociatedDomain != null) {
            this.AssociatedDomain = new String(source.AssociatedDomain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AssociatedDomain", this.AssociatedDomain);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

