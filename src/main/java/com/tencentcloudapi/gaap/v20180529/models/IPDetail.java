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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPDetail extends AbstractModel {

    /**
    * IP string
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Network provider. `BGP`: Tencent Cloud BGP (default); `CMCC`: China Mobile; `CUCC`: China Unicom; `CTCC`: China Telecom.
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * Max bandwidth
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get IP string 
     * @return IP IP string
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP string
     * @param IP IP string
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Network provider. `BGP`: Tencent Cloud BGP (default); `CMCC`: China Mobile; `CUCC`: China Unicom; `CTCC`: China Telecom. 
     * @return Provider Network provider. `BGP`: Tencent Cloud BGP (default); `CMCC`: China Mobile; `CUCC`: China Unicom; `CTCC`: China Telecom.
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set Network provider. `BGP`: Tencent Cloud BGP (default); `CMCC`: China Mobile; `CUCC`: China Unicom; `CTCC`: China Telecom.
     * @param Provider Network provider. `BGP`: Tencent Cloud BGP (default); `CMCC`: China Mobile; `CUCC`: China Unicom; `CTCC`: China Telecom.
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get Max bandwidth 
     * @return Bandwidth Max bandwidth
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Max bandwidth
     * @param Bandwidth Max bandwidth
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public IPDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPDetail(IPDetail source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

