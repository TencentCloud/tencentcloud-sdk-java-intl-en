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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShieldArea extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * The type of protected resources. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The layer-7 site name.
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * The layer-7 subdomain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSHosts")
    @Expose
    private DDoSHost [] DDoSHosts;

    /**
    * Number of layer-4 TCP forwarding rules
    */
    @SerializedName("TcpNum")
    @Expose
    private Long TcpNum;

    /**
    * Number of layer-4 UDP forwarding rules
    */
    @SerializedName("UdpNum")
    @Expose
    private Long UdpNum;

    /**
    * Name of the protected resource
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The policy ID. 
     * @return PolicyId The policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The policy ID.
     * @param PolicyId The policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get The type of protected resources. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy</li> 
     * @return Type The type of protected resources. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type of protected resources. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy</li>
     * @param Type The type of protected resources. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The layer-7 site name. 
     * @return EntityName The layer-7 site name.
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set The layer-7 site name.
     * @param EntityName The layer-7 site name.
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get The layer-7 subdomain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSHosts The layer-7 subdomain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSHost [] getDDoSHosts() {
        return this.DDoSHosts;
    }

    /**
     * Set The layer-7 subdomain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSHosts The layer-7 subdomain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSHosts(DDoSHost [] DDoSHosts) {
        this.DDoSHosts = DDoSHosts;
    }

    /**
     * Get Number of layer-4 TCP forwarding rules 
     * @return TcpNum Number of layer-4 TCP forwarding rules
     */
    public Long getTcpNum() {
        return this.TcpNum;
    }

    /**
     * Set Number of layer-4 TCP forwarding rules
     * @param TcpNum Number of layer-4 TCP forwarding rules
     */
    public void setTcpNum(Long TcpNum) {
        this.TcpNum = TcpNum;
    }

    /**
     * Get Number of layer-4 UDP forwarding rules 
     * @return UdpNum Number of layer-4 UDP forwarding rules
     */
    public Long getUdpNum() {
        return this.UdpNum;
    }

    /**
     * Set Number of layer-4 UDP forwarding rules
     * @param UdpNum Number of layer-4 UDP forwarding rules
     */
    public void setUdpNum(Long UdpNum) {
        this.UdpNum = UdpNum;
    }

    /**
     * Get Name of the protected resource 
     * @return Entity Name of the protected resource
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Name of the protected resource
     * @param Entity Name of the protected resource
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public ShieldArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShieldArea(ShieldArea source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.DDoSHosts != null) {
            this.DDoSHosts = new DDoSHost[source.DDoSHosts.length];
            for (int i = 0; i < source.DDoSHosts.length; i++) {
                this.DDoSHosts[i] = new DDoSHost(source.DDoSHosts[i]);
            }
        }
        if (source.TcpNum != null) {
            this.TcpNum = new Long(source.TcpNum);
        }
        if (source.UdpNum != null) {
            this.UdpNum = new Long(source.UdpNum);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamArrayObj(map, prefix + "DDoSHosts.", this.DDoSHosts);
        this.setParamSimple(map, prefix + "TcpNum", this.TcpNum);
        this.setParamSimple(map, prefix + "UdpNum", this.UdpNum);
        this.setParamSimple(map, prefix + "Entity", this.Entity);

    }
}

