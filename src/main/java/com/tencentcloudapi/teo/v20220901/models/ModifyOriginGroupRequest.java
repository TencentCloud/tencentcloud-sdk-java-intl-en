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

public class ModifyOriginGroupRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Origin group ID. This parameter is required.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Origin server group name. The original configuration applies if this field is not specified. It can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Origin server group type. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, and general load balancer;</li>
<li>HTTP: HTTP-specific origin group. It supports adding IP/domain name and COS origin servers, with the incapability of being referenced by Layer-4 proxy.</li>Leave it blank to retain the original configuration.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin server record information. If this field is not specified, the original configuration will be retained.
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
    * Origin-pull Host Header. This parameter is valid only when Type = HTTP. No configuration or fill in the blank indicates no origin-pull Host is configured. The rule engine modification of Host Header configuration has a higher priority than the Host Header of the origin server group.
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
     * Get Origin group ID. This parameter is required. 
     * @return GroupId Origin group ID. This parameter is required.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Origin group ID. This parameter is required.
     * @param GroupId Origin group ID. This parameter is required.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Origin server group name. The original configuration applies if this field is not specified. It can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).	 
     * @return Name Origin server group name. The original configuration applies if this field is not specified. It can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Origin server group name. The original configuration applies if this field is not specified. It can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).	
     * @param Name Origin server group name. The original configuration applies if this field is not specified. It can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Origin server group type. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, and general load balancer;</li>
<li>HTTP: HTTP-specific origin group. It supports adding IP/domain name and COS origin servers, with the incapability of being referenced by Layer-4 proxy.</li>Leave it blank to retain the original configuration. 
     * @return Type Origin server group type. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, and general load balancer;</li>
<li>HTTP: HTTP-specific origin group. It supports adding IP/domain name and COS origin servers, with the incapability of being referenced by Layer-4 proxy.</li>Leave it blank to retain the original configuration.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin server group type. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, and general load balancer;</li>
<li>HTTP: HTTP-specific origin group. It supports adding IP/domain name and COS origin servers, with the incapability of being referenced by Layer-4 proxy.</li>Leave it blank to retain the original configuration.
     * @param Type Origin server group type. Valid values:
<li>GENERAL: general origin group, only supports adding IP/domain origin servers, and can be referenced by DNS, rule engine, Layer 4 proxy, and general load balancer;</li>
<li>HTTP: HTTP-specific origin group. It supports adding IP/domain name and COS origin servers, with the incapability of being referenced by Layer-4 proxy.</li>Leave it blank to retain the original configuration.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin server record information. If this field is not specified, the original configuration will be retained. 
     * @return Records Origin server record information. If this field is not specified, the original configuration will be retained.
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set Origin server record information. If this field is not specified, the original configuration will be retained.
     * @param Records Origin server record information. If this field is not specified, the original configuration will be retained.
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    /**
     * Get Origin-pull Host Header. This parameter is valid only when Type = HTTP. No configuration or fill in the blank indicates no origin-pull Host is configured. The rule engine modification of Host Header configuration has a higher priority than the Host Header of the origin server group. 
     * @return HostHeader Origin-pull Host Header. This parameter is valid only when Type = HTTP. No configuration or fill in the blank indicates no origin-pull Host is configured. The rule engine modification of Host Header configuration has a higher priority than the Host Header of the origin server group.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set Origin-pull Host Header. This parameter is valid only when Type = HTTP. No configuration or fill in the blank indicates no origin-pull Host is configured. The rule engine modification of Host Header configuration has a higher priority than the Host Header of the origin server group.
     * @param HostHeader Origin-pull Host Header. This parameter is valid only when Type = HTTP. No configuration or fill in the blank indicates no origin-pull Host is configured. The rule engine modification of Host Header configuration has a higher priority than the Host Header of the origin server group.
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    public ModifyOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginGroupRequest(ModifyOriginGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Records != null) {
            this.Records = new OriginRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new OriginRecord(source.Records[i]);
            }
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);

    }
}

