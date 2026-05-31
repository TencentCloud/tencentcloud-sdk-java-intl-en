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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferClusterZoneRequest extends AbstractModel {

    /**
    * Source Cluster Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Target availability zone
    */
    @SerializedName("DstZone")
    @Expose
    private String DstZone;

    /**
    * Cross-AZ migration master-slave data delay verification threshold, milliseconds (ms)
    */
    @SerializedName("MaxLag")
    @Expose
    private Long MaxLag;

    /**
    * Immediate: Immediate execution, InMaintain: Time window execution
    */
    @SerializedName("TransferType")
    @Expose
    private String TransferType;

    /**
    * Multi-availability zone backup zone
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private String DstSlaveZone;

    /**
    * Target zone info for proxy migration
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get Source Cluster Id 
     * @return ClusterId Source Cluster Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Source Cluster Id
     * @param ClusterId Source Cluster Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Target availability zone 
     * @return DstZone Target availability zone
     */
    public String getDstZone() {
        return this.DstZone;
    }

    /**
     * Set Target availability zone
     * @param DstZone Target availability zone
     */
    public void setDstZone(String DstZone) {
        this.DstZone = DstZone;
    }

    /**
     * Get Cross-AZ migration master-slave data delay verification threshold, milliseconds (ms) 
     * @return MaxLag Cross-AZ migration master-slave data delay verification threshold, milliseconds (ms)
     */
    public Long getMaxLag() {
        return this.MaxLag;
    }

    /**
     * Set Cross-AZ migration master-slave data delay verification threshold, milliseconds (ms)
     * @param MaxLag Cross-AZ migration master-slave data delay verification threshold, milliseconds (ms)
     */
    public void setMaxLag(Long MaxLag) {
        this.MaxLag = MaxLag;
    }

    /**
     * Get Immediate: Immediate execution, InMaintain: Time window execution 
     * @return TransferType Immediate: Immediate execution, InMaintain: Time window execution
     */
    public String getTransferType() {
        return this.TransferType;
    }

    /**
     * Set Immediate: Immediate execution, InMaintain: Time window execution
     * @param TransferType Immediate: Immediate execution, InMaintain: Time window execution
     */
    public void setTransferType(String TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get Multi-availability zone backup zone 
     * @return DstSlaveZone Multi-availability zone backup zone
     */
    public String getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set Multi-availability zone backup zone
     * @param DstSlaveZone Multi-availability zone backup zone
     */
    public void setDstSlaveZone(String DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get Target zone info for proxy migration 
     * @return ProxyZones Target zone info for proxy migration
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set Target zone info for proxy migration
     * @param ProxyZones Target zone info for proxy migration
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public TransferClusterZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferClusterZoneRequest(TransferClusterZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DstZone != null) {
            this.DstZone = new String(source.DstZone);
        }
        if (source.MaxLag != null) {
            this.MaxLag = new Long(source.MaxLag);
        }
        if (source.TransferType != null) {
            this.TransferType = new String(source.TransferType);
        }
        if (source.DstSlaveZone != null) {
            this.DstSlaveZone = new String(source.DstSlaveZone);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DstZone", this.DstZone);
        this.setParamSimple(map, prefix + "MaxLag", this.MaxLag);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "DstSlaveZone", this.DstSlaveZone);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

