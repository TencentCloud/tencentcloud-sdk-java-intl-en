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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopInstancesRequest extends AbstractModel {

    /**
    * List of IDs of the instances to be shut down. You can request up to 100 instances in a region at a time.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Whether to force shut down the instance after it failed to be shut down normally. Default value: false: no.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * Instance shutdown mode. Valid values:
SOFT_FIRST: perform a forced shutdown in case of a failure of the normal shutdown;
HARD: forced shutdown;
SOFT: Soft shutdown;
Default value: SOFT.
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get List of IDs of the instances to be shut down. You can request up to 100 instances in a region at a time. 
     * @return InstanceIdSet List of IDs of the instances to be shut down. You can request up to 100 instances in a region at a time.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances to be shut down. You can request up to 100 instances in a region at a time.
     * @param InstanceIdSet List of IDs of the instances to be shut down. You can request up to 100 instances in a region at a time.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Whether to force shut down the instance after it failed to be shut down normally. Default value: false: no. 
     * @return ForceStop Whether to force shut down the instance after it failed to be shut down normally. Default value: false: no.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set Whether to force shut down the instance after it failed to be shut down normally. Default value: false: no.
     * @param ForceStop Whether to force shut down the instance after it failed to be shut down normally. Default value: false: no.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get Instance shutdown mode. Valid values:
SOFT_FIRST: perform a forced shutdown in case of a failure of the normal shutdown;
HARD: forced shutdown;
SOFT: Soft shutdown;
Default value: SOFT. 
     * @return StopType Instance shutdown mode. Valid values:
SOFT_FIRST: perform a forced shutdown in case of a failure of the normal shutdown;
HARD: forced shutdown;
SOFT: Soft shutdown;
Default value: SOFT.
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set Instance shutdown mode. Valid values:
SOFT_FIRST: perform a forced shutdown in case of a failure of the normal shutdown;
HARD: forced shutdown;
SOFT: Soft shutdown;
Default value: SOFT.
     * @param StopType Instance shutdown mode. Valid values:
SOFT_FIRST: perform a forced shutdown in case of a failure of the normal shutdown;
HARD: forced shutdown;
SOFT: Soft shutdown;
Default value: SOFT.
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public StopInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopInstancesRequest(StopInstancesRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

