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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyAllocation extends AbstractModel {

    /**
    * Proxy node region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ of proxy node region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Proxy instance allocation
    */
    @SerializedName("ProxyInstance")
    @Expose
    private ProxyInst [] ProxyInstance;

    /**
     * Get Proxy node region 
     * @return Region Proxy node region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Proxy node region
     * @param Region Proxy node region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ of proxy node region 
     * @return Zone AZ of proxy node region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ of proxy node region
     * @param Zone AZ of proxy node region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Proxy instance allocation 
     * @return ProxyInstance Proxy instance allocation
     */
    public ProxyInst [] getProxyInstance() {
        return this.ProxyInstance;
    }

    /**
     * Set Proxy instance allocation
     * @param ProxyInstance Proxy instance allocation
     */
    public void setProxyInstance(ProxyInst [] ProxyInstance) {
        this.ProxyInstance = ProxyInstance;
    }

    public ProxyAllocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyAllocation(ProxyAllocation source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProxyInstance != null) {
            this.ProxyInstance = new ProxyInst[source.ProxyInstance.length];
            for (int i = 0; i < source.ProxyInstance.length; i++) {
                this.ProxyInstance[i] = new ProxyInst(source.ProxyInstance[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "ProxyInstance.", this.ProxyInstance);

    }
}

