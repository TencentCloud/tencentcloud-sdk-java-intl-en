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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessPolicyRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Route ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * <p>Public Network IP Whitelist Configuration</p><p>Default if not passed: delete all</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private IpWhitelistDTO [] IpWhitelist;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Route ID</p> 
     * @return RouteId <p>Route ID</p>
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>Route ID</p>
     * @param RouteId <p>Route ID</p>
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>Public Network IP Whitelist Configuration</p><p>Default if not passed: delete all</p> 
     * @return IpWhitelist <p>Public Network IP Whitelist Configuration</p><p>Default if not passed: delete all</p>
     */
    public IpWhitelistDTO [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>Public Network IP Whitelist Configuration</p><p>Default if not passed: delete all</p>
     * @param IpWhitelist <p>Public Network IP Whitelist Configuration</p><p>Default if not passed: delete all</p>
     */
    public void setIpWhitelist(IpWhitelistDTO [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    public ModifyAccessPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessPolicyRequest(ModifyAccessPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new IpWhitelistDTO[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new IpWhitelistDTO(source.IpWhitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamArrayObj(map, prefix + "IpWhitelist.", this.IpWhitelist);

    }
}

