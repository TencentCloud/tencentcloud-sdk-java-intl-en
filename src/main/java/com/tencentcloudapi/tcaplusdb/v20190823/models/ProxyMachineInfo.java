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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyMachineInfo extends AbstractModel {

    /**
    * Unique ID
    */
    @SerializedName("ProxyUid")
    @Expose
    private String ProxyUid;

    /**
    * Machine type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * The number of proxy resources to be assigned
    */
    @SerializedName("AvailableCount")
    @Expose
    private Long AvailableCount;

    /**
     * Get Unique ID 
     * @return ProxyUid Unique ID
     */
    public String getProxyUid() {
        return this.ProxyUid;
    }

    /**
     * Set Unique ID
     * @param ProxyUid Unique ID
     */
    public void setProxyUid(String ProxyUid) {
        this.ProxyUid = ProxyUid;
    }

    /**
     * Get Machine type 
     * @return MachineType Machine type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type
     * @param MachineType Machine type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get The number of proxy resources to be assigned 
     * @return AvailableCount The number of proxy resources to be assigned
     */
    public Long getAvailableCount() {
        return this.AvailableCount;
    }

    /**
     * Set The number of proxy resources to be assigned
     * @param AvailableCount The number of proxy resources to be assigned
     */
    public void setAvailableCount(Long AvailableCount) {
        this.AvailableCount = AvailableCount;
    }

    public ProxyMachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyMachineInfo(ProxyMachineInfo source) {
        if (source.ProxyUid != null) {
            this.ProxyUid = new String(source.ProxyUid);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.AvailableCount != null) {
            this.AvailableCount = new Long(source.AvailableCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyUid", this.ProxyUid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "AvailableCount", this.AvailableCount);

    }
}

