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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnGatewayQuota extends AbstractModel {

    /**
    * The bandwidth quota.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * The bandwidth quota name in Chinese.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * The bandwidth quota name in English.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get The bandwidth quota. 
     * @return Bandwidth The bandwidth quota.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set The bandwidth quota.
     * @param Bandwidth The bandwidth quota.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get The bandwidth quota name in Chinese. 
     * @return Cname The bandwidth quota name in Chinese.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set The bandwidth quota name in Chinese.
     * @param Cname The bandwidth quota name in Chinese.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get The bandwidth quota name in English. 
     * @return Name The bandwidth quota name in English.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The bandwidth quota name in English.
     * @param Name The bandwidth quota name in English.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public VpnGatewayQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnGatewayQuota(VpnGatewayQuota source) {
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

