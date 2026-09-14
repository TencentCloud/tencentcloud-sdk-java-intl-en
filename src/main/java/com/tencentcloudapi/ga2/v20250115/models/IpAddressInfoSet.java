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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpAddressInfoSet extends AbstractModel {

    /**
    * <p>IP address.</p>
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * <p>IP type.</p>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>Ddos type</p>
    */
    @SerializedName("DdosProtectionType")
    @Expose
    private String DdosProtectionType;

    /**
     * Get <p>IP address.</p> 
     * @return IpAddress <p>IP address.</p>
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set <p>IP address.</p>
     * @param IpAddress <p>IP address.</p>
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get <p>IP type.</p> 
     * @return IspType <p>IP type.</p>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>IP type.</p>
     * @param IspType <p>IP type.</p>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>Ddos type</p> 
     * @return DdosProtectionType <p>Ddos type</p>
     */
    public String getDdosProtectionType() {
        return this.DdosProtectionType;
    }

    /**
     * Set <p>Ddos type</p>
     * @param DdosProtectionType <p>Ddos type</p>
     */
    public void setDdosProtectionType(String DdosProtectionType) {
        this.DdosProtectionType = DdosProtectionType;
    }

    public IpAddressInfoSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpAddressInfoSet(IpAddressInfoSet source) {
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.IspType != null) {
            this.IspType = new String(source.IspType);
        }
        if (source.DdosProtectionType != null) {
            this.DdosProtectionType = new String(source.DdosProtectionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "DdosProtectionType", this.DdosProtectionType);

    }
}

