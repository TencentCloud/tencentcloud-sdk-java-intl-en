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

public class ModifyL4ProxyStatusRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Layer 4 Proxy Instance ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Status of the Layer 4 proxy instance. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get Layer 4 Proxy Instance ID. 
     * @return ProxyId Layer 4 Proxy Instance ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer 4 Proxy Instance ID.
     * @param ProxyId Layer 4 Proxy Instance ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Status of the Layer 4 proxy instance. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li> 
     * @return Status Status of the Layer 4 proxy instance. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the Layer 4 proxy instance. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
     * @param Status Status of the Layer 4 proxy instance. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyL4ProxyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyL4ProxyStatusRequest(ModifyL4ProxyStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
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
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

