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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShieldArea extends AbstractModel {

    /**
    * ID of the site (top-level domain name)
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Type of protected resource. Values: `domain` and `application`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Layer-4 proxy name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * Layer-7 domain name parameters
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Application")
    @Expose
    private DDoSApplication [] Application;

    /**
    * Number of layer-4 TCP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TcpNum")
    @Expose
    private Long TcpNum;

    /**
    * Number of layer-4 UDP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UdpNum")
    @Expose
    private Long UdpNum;

    /**
    * Name of the protected resource
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Whether the shared resource is used. Values: `true` (yes) and `false` (no). The proxy mode cannot be switched when the shared resource is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Share")
    @Expose
    private Boolean Share;

    /**
     * Get ID of the site (top-level domain name) 
     * @return ZoneId ID of the site (top-level domain name)
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site (top-level domain name)
     * @param ZoneId ID of the site (top-level domain name)
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Type of protected resource. Values: `domain` and `application`. 
     * @return Type Type of protected resource. Values: `domain` and `application`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of protected resource. Values: `domain` and `application`.
     * @param Type Type of protected resource. Values: `domain` and `application`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Layer-4 proxy name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EntityName Layer-4 proxy name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set Layer-4 proxy name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EntityName Layer-4 proxy name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get Layer-7 domain name parameters
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Application Layer-7 domain name parameters
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DDoSApplication [] getApplication() {
        return this.Application;
    }

    /**
     * Set Layer-7 domain name parameters
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Application Layer-7 domain name parameters
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setApplication(DDoSApplication [] Application) {
        this.Application = Application;
    }

    /**
     * Get Number of layer-4 TCP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TcpNum Number of layer-4 TCP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTcpNum() {
        return this.TcpNum;
    }

    /**
     * Set Number of layer-4 TCP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TcpNum Number of layer-4 TCP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTcpNum(Long TcpNum) {
        this.TcpNum = TcpNum;
    }

    /**
     * Get Number of layer-4 UDP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UdpNum Number of layer-4 UDP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getUdpNum() {
        return this.UdpNum;
    }

    /**
     * Set Number of layer-4 UDP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UdpNum Number of layer-4 UDP forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUdpNum(Long UdpNum) {
        this.UdpNum = UdpNum;
    }

    /**
     * Get Name of the protected resource
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Entity Name of the protected resource
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Name of the protected resource
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Entity Name of the protected resource
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Whether the shared resource is used. Values: `true` (yes) and `false` (no). The proxy mode cannot be switched when the shared resource is used.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Share Whether the shared resource is used. Values: `true` (yes) and `false` (no). The proxy mode cannot be switched when the shared resource is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getShare() {
        return this.Share;
    }

    /**
     * Set Whether the shared resource is used. Values: `true` (yes) and `false` (no). The proxy mode cannot be switched when the shared resource is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Share Whether the shared resource is used. Values: `true` (yes) and `false` (no). The proxy mode cannot be switched when the shared resource is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setShare(Boolean Share) {
        this.Share = Share;
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
        if (source.Application != null) {
            this.Application = new DDoSApplication[source.Application.length];
            for (int i = 0; i < source.Application.length; i++) {
                this.Application[i] = new DDoSApplication(source.Application[i]);
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
        if (source.Share != null) {
            this.Share = new Boolean(source.Share);
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
        this.setParamArrayObj(map, prefix + "Application.", this.Application);
        this.setParamSimple(map, prefix + "TcpNum", this.TcpNum);
        this.setParamSimple(map, prefix + "UdpNum", this.UdpNum);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Share", this.Share);

    }
}

