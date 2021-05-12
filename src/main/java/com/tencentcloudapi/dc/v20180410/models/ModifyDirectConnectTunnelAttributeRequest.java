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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDirectConnectTunnelAttributeRequest extends AbstractModel{

    /**
    * Dedicated tunnel ID.
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * Dedicated tunnel name.
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * User-side BGP, including Asn and AuthKey.
    */
    @SerializedName("BgpPeer")
    @Expose
    private BgpPeer BgpPeer;

    /**
    * User-side IP range.
    */
    @SerializedName("RouteFilterPrefixes")
    @Expose
    private RouteFilterPrefix [] RouteFilterPrefixes;

    /**
    * Tencent-side IP address.
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * User-side IP address.
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * Bandwidth value of a dedicated tunnel in Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Tencent-side standby IP address
    */
    @SerializedName("TencentBackupAddress")
    @Expose
    private String TencentBackupAddress;

    /**
     * Get Dedicated tunnel ID. 
     * @return DirectConnectTunnelId Dedicated tunnel ID.
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * Set Dedicated tunnel ID.
     * @param DirectConnectTunnelId Dedicated tunnel ID.
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * Get Dedicated tunnel name. 
     * @return DirectConnectTunnelName Dedicated tunnel name.
     */
    public String getDirectConnectTunnelName() {
        return this.DirectConnectTunnelName;
    }

    /**
     * Set Dedicated tunnel name.
     * @param DirectConnectTunnelName Dedicated tunnel name.
     */
    public void setDirectConnectTunnelName(String DirectConnectTunnelName) {
        this.DirectConnectTunnelName = DirectConnectTunnelName;
    }

    /**
     * Get User-side BGP, including Asn and AuthKey. 
     * @return BgpPeer User-side BGP, including Asn and AuthKey.
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * Set User-side BGP, including Asn and AuthKey.
     * @param BgpPeer User-side BGP, including Asn and AuthKey.
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * Get User-side IP range. 
     * @return RouteFilterPrefixes User-side IP range.
     */
    public RouteFilterPrefix [] getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * Set User-side IP range.
     * @param RouteFilterPrefixes User-side IP range.
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix [] RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * Get Tencent-side IP address. 
     * @return TencentAddress Tencent-side IP address.
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set Tencent-side IP address.
     * @param TencentAddress Tencent-side IP address.
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get User-side IP address. 
     * @return CustomerAddress User-side IP address.
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set User-side IP address.
     * @param CustomerAddress User-side IP address.
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get Bandwidth value of a dedicated tunnel in Mbps. 
     * @return Bandwidth Bandwidth value of a dedicated tunnel in Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth value of a dedicated tunnel in Mbps.
     * @param Bandwidth Bandwidth value of a dedicated tunnel in Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Tencent-side standby IP address 
     * @return TencentBackupAddress Tencent-side standby IP address
     */
    public String getTencentBackupAddress() {
        return this.TencentBackupAddress;
    }

    /**
     * Set Tencent-side standby IP address
     * @param TencentBackupAddress Tencent-side standby IP address
     */
    public void setTencentBackupAddress(String TencentBackupAddress) {
        this.TencentBackupAddress = TencentBackupAddress;
    }

    public ModifyDirectConnectTunnelAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDirectConnectTunnelAttributeRequest(ModifyDirectConnectTunnelAttributeRequest source) {
        if (source.DirectConnectTunnelId != null) {
            this.DirectConnectTunnelId = new String(source.DirectConnectTunnelId);
        }
        if (source.DirectConnectTunnelName != null) {
            this.DirectConnectTunnelName = new String(source.DirectConnectTunnelName);
        }
        if (source.BgpPeer != null) {
            this.BgpPeer = new BgpPeer(source.BgpPeer);
        }
        if (source.RouteFilterPrefixes != null) {
            this.RouteFilterPrefixes = new RouteFilterPrefix[source.RouteFilterPrefixes.length];
            for (int i = 0; i < source.RouteFilterPrefixes.length; i++) {
                this.RouteFilterPrefixes[i] = new RouteFilterPrefix(source.RouteFilterPrefixes[i]);
            }
        }
        if (source.TencentAddress != null) {
            this.TencentAddress = new String(source.TencentAddress);
        }
        if (source.CustomerAddress != null) {
            this.CustomerAddress = new String(source.CustomerAddress);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.TencentBackupAddress != null) {
            this.TencentBackupAddress = new String(source.TencentBackupAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamArrayObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "TencentBackupAddress", this.TencentBackupAddress);

    }
}

