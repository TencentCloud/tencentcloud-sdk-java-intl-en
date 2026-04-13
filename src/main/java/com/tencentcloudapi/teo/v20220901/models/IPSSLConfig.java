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
    * Domain name associated with IP SSL. If the Status value is unbound, this field is empty.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("AssociatedDomain")
    @Expose
    private String AssociatedDomain;

    /**
    * Association status. Values as follows:
<li>bound: The IP SSL configuration is bound</li>
<li>Binding: IP SSL configuration binding in progress</li>
<li>unbinding: IP SSL configuration is being unbound</li>
<li>unbound: IP SSL configuration not bound to</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Domain name associated with IP SSL. If the Status value is unbound, this field is empty.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return AssociatedDomain Domain name associated with IP SSL. If the Status value is unbound, this field is empty.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getAssociatedDomain() {
        return this.AssociatedDomain;
    }

    /**
     * Set Domain name associated with IP SSL. If the Status value is unbound, this field is empty.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param AssociatedDomain Domain name associated with IP SSL. If the Status value is unbound, this field is empty.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setAssociatedDomain(String AssociatedDomain) {
        this.AssociatedDomain = AssociatedDomain;
    }

    /**
     * Get Association status. Values as follows:
<li>bound: The IP SSL configuration is bound</li>
<li>Binding: IP SSL configuration binding in progress</li>
<li>unbinding: IP SSL configuration is being unbound</li>
<li>unbound: IP SSL configuration not bound to</li> 
     * @return Status Association status. Values as follows:
<li>bound: The IP SSL configuration is bound</li>
<li>Binding: IP SSL configuration binding in progress</li>
<li>unbinding: IP SSL configuration is being unbound</li>
<li>unbound: IP SSL configuration not bound to</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Association status. Values as follows:
<li>bound: The IP SSL configuration is bound</li>
<li>Binding: IP SSL configuration binding in progress</li>
<li>unbinding: IP SSL configuration is being unbound</li>
<li>unbound: IP SSL configuration not bound to</li>
     * @param Status Association status. Values as follows:
<li>bound: The IP SSL configuration is bound</li>
<li>Binding: IP SSL configuration binding in progress</li>
<li>unbinding: IP SSL configuration is being unbound</li>
<li>unbound: IP SSL configuration not bound to</li>
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
        this.setParamSimple(map, prefix + "AssociatedDomain", this.AssociatedDomain);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

