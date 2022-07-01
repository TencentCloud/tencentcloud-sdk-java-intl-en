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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationProxyRequest extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Layer-4 proxy ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Layer-4 proxy name
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * This parameter is disused.
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * This parameter is disused.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * Session persistence time. Value range: 30-3600 (in seconds).
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Specifies how a layer-4 proxy is created.
`hostname`: Subdomain name
`instance`: Instance
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Layer-4 proxy ID 
     * @return ProxyId Layer-4 proxy ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer-4 proxy ID
     * @param ProxyId Layer-4 proxy ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Layer-4 proxy name 
     * @return ProxyName Layer-4 proxy name
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Layer-4 proxy name
     * @param ProxyName Layer-4 proxy name
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get This parameter is disused. 
     * @return ForwardClientIp This parameter is disused.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set This parameter is disused.
     * @param ForwardClientIp This parameter is disused.
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get This parameter is disused. 
     * @return SessionPersist This parameter is disused.
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set This parameter is disused.
     * @param SessionPersist This parameter is disused.
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Session persistence time. Value range: 30-3600 (in seconds). 
     * @return SessionPersistTime Session persistence time. Value range: 30-3600 (in seconds).
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Session persistence time. Value range: 30-3600 (in seconds).
     * @param SessionPersistTime Session persistence time. Value range: 30-3600 (in seconds).
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Specifies how a layer-4 proxy is created.
`hostname`: Subdomain name
`instance`: Instance 
     * @return ProxyType Specifies how a layer-4 proxy is created.
`hostname`: Subdomain name
`instance`: Instance
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set Specifies how a layer-4 proxy is created.
`hostname`: Subdomain name
`instance`: Instance
     * @param ProxyType Specifies how a layer-4 proxy is created.
`hostname`: Subdomain name
`instance`: Instance
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    public ModifyApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationProxyRequest(ModifyApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);

    }
}

