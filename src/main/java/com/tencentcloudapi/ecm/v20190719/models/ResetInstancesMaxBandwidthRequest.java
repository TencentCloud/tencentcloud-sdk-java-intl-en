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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesMaxBandwidthRequest extends AbstractModel{

    /**
    * List of IDs of the instances for which to reset the bandwidth cap. You can request up to 100 instances in a region at a time.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Modified outbound bandwidth cap.
    */
    @SerializedName("MaxBandwidthOut")
    @Expose
    private Long MaxBandwidthOut;

    /**
    * Modified inbound bandwidth cap.
    */
    @SerializedName("MaxBandwidthIn")
    @Expose
    private Long MaxBandwidthIn;

    /**
     * Get List of IDs of the instances for which to reset the bandwidth cap. You can request up to 100 instances in a region at a time. 
     * @return InstanceIdSet List of IDs of the instances for which to reset the bandwidth cap. You can request up to 100 instances in a region at a time.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances for which to reset the bandwidth cap. You can request up to 100 instances in a region at a time.
     * @param InstanceIdSet List of IDs of the instances for which to reset the bandwidth cap. You can request up to 100 instances in a region at a time.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Modified outbound bandwidth cap. 
     * @return MaxBandwidthOut Modified outbound bandwidth cap.
     */
    public Long getMaxBandwidthOut() {
        return this.MaxBandwidthOut;
    }

    /**
     * Set Modified outbound bandwidth cap.
     * @param MaxBandwidthOut Modified outbound bandwidth cap.
     */
    public void setMaxBandwidthOut(Long MaxBandwidthOut) {
        this.MaxBandwidthOut = MaxBandwidthOut;
    }

    /**
     * Get Modified inbound bandwidth cap. 
     * @return MaxBandwidthIn Modified inbound bandwidth cap.
     */
    public Long getMaxBandwidthIn() {
        return this.MaxBandwidthIn;
    }

    /**
     * Set Modified inbound bandwidth cap.
     * @param MaxBandwidthIn Modified inbound bandwidth cap.
     */
    public void setMaxBandwidthIn(Long MaxBandwidthIn) {
        this.MaxBandwidthIn = MaxBandwidthIn;
    }

    public ResetInstancesMaxBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstancesMaxBandwidthRequest(ResetInstancesMaxBandwidthRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.MaxBandwidthOut != null) {
            this.MaxBandwidthOut = new Long(source.MaxBandwidthOut);
        }
        if (source.MaxBandwidthIn != null) {
            this.MaxBandwidthIn = new Long(source.MaxBandwidthIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "MaxBandwidthOut", this.MaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxBandwidthIn", this.MaxBandwidthIn);

    }
}

