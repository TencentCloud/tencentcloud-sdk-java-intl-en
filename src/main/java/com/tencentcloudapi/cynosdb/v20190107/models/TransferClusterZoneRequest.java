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
    * Source cluster Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Target zone
    */
    @SerializedName("DstZone")
    @Expose
    private String DstZone;

    /**
    * Threshold for primary-secondary data latency verification during cross-AZ migration, in milliseconds (ms).
    */
    @SerializedName("MaxLag")
    @Expose
    private Long MaxLag;

    /**
    * Immediate: immediate execution. InMaintain: execute within the time window.
    */
    @SerializedName("TransferType")
    @Expose
    private String TransferType;

    /**
    * Secondary AZ in a multi-availability zone
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
     * Get Source cluster Id 
     * @return ClusterId Source cluster Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Source cluster Id
     * @param ClusterId Source cluster Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Target zone 
     * @return DstZone Target zone
     */
    public String getDstZone() {
        return this.DstZone;
    }

    /**
     * Set Target zone
     * @param DstZone Target zone
     */
    public void setDstZone(String DstZone) {
        this.DstZone = DstZone;
    }

    /**
     * Get Threshold for primary-secondary data latency verification during cross-AZ migration, in milliseconds (ms). 
     * @return MaxLag Threshold for primary-secondary data latency verification during cross-AZ migration, in milliseconds (ms).
     */
    public Long getMaxLag() {
        return this.MaxLag;
    }

    /**
     * Set Threshold for primary-secondary data latency verification during cross-AZ migration, in milliseconds (ms).
     * @param MaxLag Threshold for primary-secondary data latency verification during cross-AZ migration, in milliseconds (ms).
     */
    public void setMaxLag(Long MaxLag) {
        this.MaxLag = MaxLag;
    }

    /**
     * Get Immediate: immediate execution. InMaintain: execute within the time window. 
     * @return TransferType Immediate: immediate execution. InMaintain: execute within the time window.
     */
    public String getTransferType() {
        return this.TransferType;
    }

    /**
     * Set Immediate: immediate execution. InMaintain: execute within the time window.
     * @param TransferType Immediate: immediate execution. InMaintain: execute within the time window.
     */
    public void setTransferType(String TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get Secondary AZ in a multi-availability zone 
     * @return DstSlaveZone Secondary AZ in a multi-availability zone
     */
    public String getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set Secondary AZ in a multi-availability zone
     * @param DstSlaveZone Secondary AZ in a multi-availability zone
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

