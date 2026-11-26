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

public class ModifyAccelerationDomainStatusesRequest extends AbstractModel {

    /**
    * Zone ID of the acceleration domain name.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of acceleration domain names for which to modify the execution status.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * Acceleration domain name status. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether to force suspension. When a domain name has associated resources (for example, alias domain names or traffic scheduling functions), whether to force suspension of that domain name. Valid values:
<li> true: disable that domain name and all associated resources;</li>
<li> false: When the acceleration domain name has associated resources, it cannot be disabled.</li>If not specified, the default value is false.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get Zone ID of the acceleration domain name. 
     * @return ZoneId Zone ID of the acceleration domain name.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID of the acceleration domain name.
     * @param ZoneId Zone ID of the acceleration domain name.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of acceleration domain names for which to modify the execution status. 
     * @return DomainNames List of acceleration domain names for which to modify the execution status.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set List of acceleration domain names for which to modify the execution status.
     * @param DomainNames List of acceleration domain names for which to modify the execution status.
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get Acceleration domain name status. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li> 
     * @return Status Acceleration domain name status. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Acceleration domain name status. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
     * @param Status Acceleration domain name status. Valid values:
<li>`online`: Enable;</li>
<li>offline: Disable.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to force suspension. When a domain name has associated resources (for example, alias domain names or traffic scheduling functions), whether to force suspension of that domain name. Valid values:
<li> true: disable that domain name and all associated resources;</li>
<li> false: When the acceleration domain name has associated resources, it cannot be disabled.</li>If not specified, the default value is false. 
     * @return Force Whether to force suspension. When a domain name has associated resources (for example, alias domain names or traffic scheduling functions), whether to force suspension of that domain name. Valid values:
<li> true: disable that domain name and all associated resources;</li>
<li> false: When the acceleration domain name has associated resources, it cannot be disabled.</li>If not specified, the default value is false.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to force suspension. When a domain name has associated resources (for example, alias domain names or traffic scheduling functions), whether to force suspension of that domain name. Valid values:
<li> true: disable that domain name and all associated resources;</li>
<li> false: When the acceleration domain name has associated resources, it cannot be disabled.</li>If not specified, the default value is false.
     * @param Force Whether to force suspension. When a domain name has associated resources (for example, alias domain names or traffic scheduling functions), whether to force suspension of that domain name. Valid values:
<li> true: disable that domain name and all associated resources;</li>
<li> false: When the acceleration domain name has associated resources, it cannot be disabled.</li>If not specified, the default value is false.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public ModifyAccelerationDomainStatusesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccelerationDomainStatusesRequest(ModifyAccelerationDomainStatusesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

