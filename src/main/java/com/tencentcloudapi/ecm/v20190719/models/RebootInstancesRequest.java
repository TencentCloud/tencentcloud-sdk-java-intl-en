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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootInstancesRequest extends AbstractModel {

    /**
    * List of IDs of the instances to be restarted. You can request up to 100 instances in a region at a time.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Whether to force restart the instance after it failed to be restarted normally. Valid values:
TRUE: yes;
FALSE: no;
Default value: FALSE.
    */
    @SerializedName("ForceReboot")
    @Expose
    private Boolean ForceReboot;

    /**
    * Shutdown type. Valid values:
SOFT: soft shutdown
HARD: hard shutdown
SOFT_FIRST: perform a soft shutdown first; if it fails, perform a hard shutdown

Default value: SOFT.
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get List of IDs of the instances to be restarted. You can request up to 100 instances in a region at a time. 
     * @return InstanceIdSet List of IDs of the instances to be restarted. You can request up to 100 instances in a region at a time.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances to be restarted. You can request up to 100 instances in a region at a time.
     * @param InstanceIdSet List of IDs of the instances to be restarted. You can request up to 100 instances in a region at a time.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Whether to force restart the instance after it failed to be restarted normally. Valid values:
TRUE: yes;
FALSE: no;
Default value: FALSE. 
     * @return ForceReboot Whether to force restart the instance after it failed to be restarted normally. Valid values:
TRUE: yes;
FALSE: no;
Default value: FALSE.
     */
    public Boolean getForceReboot() {
        return this.ForceReboot;
    }

    /**
     * Set Whether to force restart the instance after it failed to be restarted normally. Valid values:
TRUE: yes;
FALSE: no;
Default value: FALSE.
     * @param ForceReboot Whether to force restart the instance after it failed to be restarted normally. Valid values:
TRUE: yes;
FALSE: no;
Default value: FALSE.
     */
    public void setForceReboot(Boolean ForceReboot) {
        this.ForceReboot = ForceReboot;
    }

    /**
     * Get Shutdown type. Valid values:
SOFT: soft shutdown
HARD: hard shutdown
SOFT_FIRST: perform a soft shutdown first; if it fails, perform a hard shutdown

Default value: SOFT. 
     * @return StopType Shutdown type. Valid values:
SOFT: soft shutdown
HARD: hard shutdown
SOFT_FIRST: perform a soft shutdown first; if it fails, perform a hard shutdown

Default value: SOFT.
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set Shutdown type. Valid values:
SOFT: soft shutdown
HARD: hard shutdown
SOFT_FIRST: perform a soft shutdown first; if it fails, perform a hard shutdown

Default value: SOFT.
     * @param StopType Shutdown type. Valid values:
SOFT: soft shutdown
HARD: hard shutdown
SOFT_FIRST: perform a soft shutdown first; if it fails, perform a hard shutdown

Default value: SOFT.
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public RebootInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebootInstancesRequest(RebootInstancesRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.ForceReboot != null) {
            this.ForceReboot = new Boolean(source.ForceReboot);
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
        this.setParamSimple(map, prefix + "ForceReboot", this.ForceReboot);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

