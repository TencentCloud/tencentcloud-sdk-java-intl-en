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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealServerStatus extends AbstractModel{

    /**
    * Origin server ID.
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 0: not bound, 1: bound to rule or listener.
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * ID of the connection bound to this origin server. This string is empty if they are not bound.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get Origin server ID. 
     * @return RealServerId Origin server ID.
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set Origin server ID.
     * @param RealServerId Origin server ID.
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 0: not bound, 1: bound to rule or listener. 
     * @return BindStatus 0: not bound, 1: bound to rule or listener.
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 0: not bound, 1: bound to rule or listener.
     * @param BindStatus 0: not bound, 1: bound to rule or listener.
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get ID of the connection bound to this origin server. This string is empty if they are not bound. 
     * @return ProxyId ID of the connection bound to this origin server. This string is empty if they are not bound.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set ID of the connection bound to this origin server. This string is empty if they are not bound.
     * @param ProxyId ID of the connection bound to this origin server. This string is empty if they are not bound.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    public RealServerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealServerStatus(RealServerStatus source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

