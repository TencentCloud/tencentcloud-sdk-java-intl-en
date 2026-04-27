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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrivateNetworkInstanceRequest extends AbstractModel {

    /**
    * New instance name
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * Availability zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The network address (host bits must be all 0s) must fall into one of the following RFC 1918 private ranges: `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`.
    */
    @SerializedName("Network")
    @Expose
    private String Network;

    /**
    * Mask digits. The upper limit is fixed at `28`, while the lower limit depends on the private segment it belongs to: `10.0.0.0/8` allows `8~28`, `172.16.0.0/12` allows `12~28`, `192.168.0.0/16` allows `16~28`. It must together form a valid network address with Network (host bits all set to 0).
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
     * Get New instance name 
     * @return NetworkInstanceName New instance name
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set New instance name
     * @param NetworkInstanceName New instance name
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get Availability zone ID. 
     * @return ZoneId Availability zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone ID.
     * @param ZoneId Availability zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The network address (host bits must be all 0s) must fall into one of the following RFC 1918 private ranges: `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`. 
     * @return Network The network address (host bits must be all 0s) must fall into one of the following RFC 1918 private ranges: `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`.
     */
    public String getNetwork() {
        return this.Network;
    }

    /**
     * Set The network address (host bits must be all 0s) must fall into one of the following RFC 1918 private ranges: `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`.
     * @param Network The network address (host bits must be all 0s) must fall into one of the following RFC 1918 private ranges: `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`.
     */
    public void setNetwork(String Network) {
        this.Network = Network;
    }

    /**
     * Get Mask digits. The upper limit is fixed at `28`, while the lower limit depends on the private segment it belongs to: `10.0.0.0/8` allows `8~28`, `172.16.0.0/12` allows `12~28`, `192.168.0.0/16` allows `16~28`. It must together form a valid network address with Network (host bits all set to 0). 
     * @return Mask Mask digits. The upper limit is fixed at `28`, while the lower limit depends on the private segment it belongs to: `10.0.0.0/8` allows `8~28`, `172.16.0.0/12` allows `12~28`, `192.168.0.0/16` allows `16~28`. It must together form a valid network address with Network (host bits all set to 0).
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set Mask digits. The upper limit is fixed at `28`, while the lower limit depends on the private segment it belongs to: `10.0.0.0/8` allows `8~28`, `172.16.0.0/12` allows `12~28`, `192.168.0.0/16` allows `16~28`. It must together form a valid network address with Network (host bits all set to 0).
     * @param Mask Mask digits. The upper limit is fixed at `28`, while the lower limit depends on the private segment it belongs to: `10.0.0.0/8` allows `8~28`, `172.16.0.0/12` allows `12~28`, `192.168.0.0/16` allows `16~28`. It must together form a valid network address with Network (host bits all set to 0).
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    public CreatePrivateNetworkInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateNetworkInstanceRequest(CreatePrivateNetworkInstanceRequest source) {
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Network != null) {
            this.Network = new String(source.Network);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}

