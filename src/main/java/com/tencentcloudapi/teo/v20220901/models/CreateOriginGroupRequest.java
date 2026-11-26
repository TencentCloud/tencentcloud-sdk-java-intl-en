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

public class CreateOriginGroupRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Origin server record information. This parameter is required.
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
    * Origin group name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Origin server group type. This parameter is required. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, general load balancer, and HTTP-specific load balancer;</li>
<li>HTTP: HTTP-specific origin server group. It supports adding IP/domain name and COS origin server as the origin server. It cannot be referenced by Layer-4 proxy. It can only be referenced by add acceleration domain name, rule engine - modify origin, and HTTP-specific load balancer.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin-pull Host Header. It takes effect only when it is input and Type is HTTP. The rule engine modification of the Host Header configuration has a higher priority than the Host Header of the origin server group.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

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
     * Get Origin server record information. This parameter is required. 
     * @return Records Origin server record information. This parameter is required.
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set Origin server record information. This parameter is required.
     * @param Records Origin server record information. This parameter is required.
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    /**
     * Get Origin group name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-). 
     * @return Name Origin group name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Origin group name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
     * @param Name Origin group name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Origin server group type. This parameter is required. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, general load balancer, and HTTP-specific load balancer;</li>
<li>HTTP: HTTP-specific origin server group. It supports adding IP/domain name and COS origin server as the origin server. It cannot be referenced by Layer-4 proxy. It can only be referenced by add acceleration domain name, rule engine - modify origin, and HTTP-specific load balancer.</li> 
     * @return Type Origin server group type. This parameter is required. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, general load balancer, and HTTP-specific load balancer;</li>
<li>HTTP: HTTP-specific origin server group. It supports adding IP/domain name and COS origin server as the origin server. It cannot be referenced by Layer-4 proxy. It can only be referenced by add acceleration domain name, rule engine - modify origin, and HTTP-specific load balancer.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin server group type. This parameter is required. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, general load balancer, and HTTP-specific load balancer;</li>
<li>HTTP: HTTP-specific origin server group. It supports adding IP/domain name and COS origin server as the origin server. It cannot be referenced by Layer-4 proxy. It can only be referenced by add acceleration domain name, rule engine - modify origin, and HTTP-specific load balancer.</li>
     * @param Type Origin server group type. This parameter is required. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, general load balancer, and HTTP-specific load balancer;</li>
<li>HTTP: HTTP-specific origin server group. It supports adding IP/domain name and COS origin server as the origin server. It cannot be referenced by Layer-4 proxy. It can only be referenced by add acceleration domain name, rule engine - modify origin, and HTTP-specific load balancer.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin-pull Host Header. It takes effect only when it is input and Type is HTTP. The rule engine modification of the Host Header configuration has a higher priority than the Host Header of the origin server group. 
     * @return HostHeader Origin-pull Host Header. It takes effect only when it is input and Type is HTTP. The rule engine modification of the Host Header configuration has a higher priority than the Host Header of the origin server group.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set Origin-pull Host Header. It takes effect only when it is input and Type is HTTP. The rule engine modification of the Host Header configuration has a higher priority than the Host Header of the origin server group.
     * @param HostHeader Origin-pull Host Header. It takes effect only when it is input and Type is HTTP. The rule engine modification of the Host Header configuration has a higher priority than the Host Header of the origin server group.
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    public CreateOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOriginGroupRequest(CreateOriginGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Records != null) {
            this.Records = new OriginRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new OriginRecord(source.Records[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);

    }
}

