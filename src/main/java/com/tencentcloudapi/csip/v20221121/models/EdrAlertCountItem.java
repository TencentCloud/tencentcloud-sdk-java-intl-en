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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertCountItem extends AbstractModel {

    /**
    * <p>Query instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Total number of alarms</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Number of viruses and trojans (VIRUS_TROJAN)</p>
    */
    @SerializedName("VirusTrojanCount")
    @Expose
    private Long VirusTrojanCount;

    /**
    * <p>Number of abnormal logins (ABNORMAL_LOGIN)</p>
    */
    @SerializedName("AbnormalLoginCount")
    @Expose
    private Long AbnormalLoginCount;

    /**
    * <p>Number of server behaviors (HOST_BEHAVIOR)</p>
    */
    @SerializedName("HostBehaviorCount")
    @Expose
    private Long HostBehaviorCount;

    /**
    * <p>Number of network behaviors (NETWORK_BEHAVIOR)</p>
    */
    @SerializedName("NetworkBehaviorCount")
    @Expose
    private Long NetworkBehaviorCount;

    /**
    * <p>Number of hosts with alarms (only available in GlobalCount mode)</p>
    */
    @SerializedName("InstancesCount")
    @Expose
    private Long InstancesCount;

    /**
     * Get <p>Query instance ID</p> 
     * @return InstanceId <p>Query instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Query instance ID</p>
     * @param InstanceId <p>Query instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Total number of alarms</p> 
     * @return TotalCount <p>Total number of alarms</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of alarms</p>
     * @param TotalCount <p>Total number of alarms</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Number of viruses and trojans (VIRUS_TROJAN)</p> 
     * @return VirusTrojanCount <p>Number of viruses and trojans (VIRUS_TROJAN)</p>
     */
    public Long getVirusTrojanCount() {
        return this.VirusTrojanCount;
    }

    /**
     * Set <p>Number of viruses and trojans (VIRUS_TROJAN)</p>
     * @param VirusTrojanCount <p>Number of viruses and trojans (VIRUS_TROJAN)</p>
     */
    public void setVirusTrojanCount(Long VirusTrojanCount) {
        this.VirusTrojanCount = VirusTrojanCount;
    }

    /**
     * Get <p>Number of abnormal logins (ABNORMAL_LOGIN)</p> 
     * @return AbnormalLoginCount <p>Number of abnormal logins (ABNORMAL_LOGIN)</p>
     */
    public Long getAbnormalLoginCount() {
        return this.AbnormalLoginCount;
    }

    /**
     * Set <p>Number of abnormal logins (ABNORMAL_LOGIN)</p>
     * @param AbnormalLoginCount <p>Number of abnormal logins (ABNORMAL_LOGIN)</p>
     */
    public void setAbnormalLoginCount(Long AbnormalLoginCount) {
        this.AbnormalLoginCount = AbnormalLoginCount;
    }

    /**
     * Get <p>Number of server behaviors (HOST_BEHAVIOR)</p> 
     * @return HostBehaviorCount <p>Number of server behaviors (HOST_BEHAVIOR)</p>
     */
    public Long getHostBehaviorCount() {
        return this.HostBehaviorCount;
    }

    /**
     * Set <p>Number of server behaviors (HOST_BEHAVIOR)</p>
     * @param HostBehaviorCount <p>Number of server behaviors (HOST_BEHAVIOR)</p>
     */
    public void setHostBehaviorCount(Long HostBehaviorCount) {
        this.HostBehaviorCount = HostBehaviorCount;
    }

    /**
     * Get <p>Number of network behaviors (NETWORK_BEHAVIOR)</p> 
     * @return NetworkBehaviorCount <p>Number of network behaviors (NETWORK_BEHAVIOR)</p>
     */
    public Long getNetworkBehaviorCount() {
        return this.NetworkBehaviorCount;
    }

    /**
     * Set <p>Number of network behaviors (NETWORK_BEHAVIOR)</p>
     * @param NetworkBehaviorCount <p>Number of network behaviors (NETWORK_BEHAVIOR)</p>
     */
    public void setNetworkBehaviorCount(Long NetworkBehaviorCount) {
        this.NetworkBehaviorCount = NetworkBehaviorCount;
    }

    /**
     * Get <p>Number of hosts with alarms (only available in GlobalCount mode)</p> 
     * @return InstancesCount <p>Number of hosts with alarms (only available in GlobalCount mode)</p>
     */
    public Long getInstancesCount() {
        return this.InstancesCount;
    }

    /**
     * Set <p>Number of hosts with alarms (only available in GlobalCount mode)</p>
     * @param InstancesCount <p>Number of hosts with alarms (only available in GlobalCount mode)</p>
     */
    public void setInstancesCount(Long InstancesCount) {
        this.InstancesCount = InstancesCount;
    }

    public EdrAlertCountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertCountItem(EdrAlertCountItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VirusTrojanCount != null) {
            this.VirusTrojanCount = new Long(source.VirusTrojanCount);
        }
        if (source.AbnormalLoginCount != null) {
            this.AbnormalLoginCount = new Long(source.AbnormalLoginCount);
        }
        if (source.HostBehaviorCount != null) {
            this.HostBehaviorCount = new Long(source.HostBehaviorCount);
        }
        if (source.NetworkBehaviorCount != null) {
            this.NetworkBehaviorCount = new Long(source.NetworkBehaviorCount);
        }
        if (source.InstancesCount != null) {
            this.InstancesCount = new Long(source.InstancesCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "VirusTrojanCount", this.VirusTrojanCount);
        this.setParamSimple(map, prefix + "AbnormalLoginCount", this.AbnormalLoginCount);
        this.setParamSimple(map, prefix + "HostBehaviorCount", this.HostBehaviorCount);
        this.setParamSimple(map, prefix + "NetworkBehaviorCount", this.NetworkBehaviorCount);
        this.setParamSimple(map, prefix + "InstancesCount", this.InstancesCount);

    }
}

