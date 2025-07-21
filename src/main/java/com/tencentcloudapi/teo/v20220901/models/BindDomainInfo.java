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

public class BindDomainInfo extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Zone ID to which the domain belongs.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Binding status. valid values:. 
<li>`process`: binding in progress</li>
<li>`online`: binding succeeded.</li>
<Li>`fail`: binding failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get Zone ID to which the domain belongs. 
     * @return ZoneId Zone ID to which the domain belongs.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID to which the domain belongs.
     * @param ZoneId Zone ID to which the domain belongs.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Binding status. valid values:. 
<li>`process`: binding in progress</li>
<li>`online`: binding succeeded.</li>
<Li>`fail`: binding failed.</li> 
     * @return Status Binding status. valid values:. 
<li>`process`: binding in progress</li>
<li>`online`: binding succeeded.</li>
<Li>`fail`: binding failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Binding status. valid values:. 
<li>`process`: binding in progress</li>
<li>`online`: binding succeeded.</li>
<Li>`fail`: binding failed.</li>
     * @param Status Binding status. valid values:. 
<li>`process`: binding in progress</li>
<li>`online`: binding succeeded.</li>
<Li>`fail`: binding failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BindDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDomainInfo(BindDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

