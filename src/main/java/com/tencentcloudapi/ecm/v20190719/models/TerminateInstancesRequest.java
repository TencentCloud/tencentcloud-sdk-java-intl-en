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

public class TerminateInstancesRequest extends AbstractModel{

    /**
    * List of IDs of the instances to be terminated.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Whether to enable scheduled termination. Default value: no.
    */
    @SerializedName("TerminateDelay")
    @Expose
    private Boolean TerminateDelay;

    /**
    * Scheduled termination time, such as `2019-08-05 12:01:30`. If you don't enable scheduled termination, you can ignore this parameter.
    */
    @SerializedName("TerminateTime")
    @Expose
    private String TerminateTime;

    /**
    * Whether to delete the bound ENI and EIP. Default value: true.
true: the ENI and EIP will also be deleted;
false: only the server will be terminated, while the ENI and EIP will be retained.
    */
    @SerializedName("AssociatedResourceDestroy")
    @Expose
    private Boolean AssociatedResourceDestroy;

    /**
     * Get List of IDs of the instances to be terminated. 
     * @return InstanceIdSet List of IDs of the instances to be terminated.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances to be terminated.
     * @param InstanceIdSet List of IDs of the instances to be terminated.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Whether to enable scheduled termination. Default value: no. 
     * @return TerminateDelay Whether to enable scheduled termination. Default value: no.
     */
    public Boolean getTerminateDelay() {
        return this.TerminateDelay;
    }

    /**
     * Set Whether to enable scheduled termination. Default value: no.
     * @param TerminateDelay Whether to enable scheduled termination. Default value: no.
     */
    public void setTerminateDelay(Boolean TerminateDelay) {
        this.TerminateDelay = TerminateDelay;
    }

    /**
     * Get Scheduled termination time, such as `2019-08-05 12:01:30`. If you don't enable scheduled termination, you can ignore this parameter. 
     * @return TerminateTime Scheduled termination time, such as `2019-08-05 12:01:30`. If you don't enable scheduled termination, you can ignore this parameter.
     */
    public String getTerminateTime() {
        return this.TerminateTime;
    }

    /**
     * Set Scheduled termination time, such as `2019-08-05 12:01:30`. If you don't enable scheduled termination, you can ignore this parameter.
     * @param TerminateTime Scheduled termination time, such as `2019-08-05 12:01:30`. If you don't enable scheduled termination, you can ignore this parameter.
     */
    public void setTerminateTime(String TerminateTime) {
        this.TerminateTime = TerminateTime;
    }

    /**
     * Get Whether to delete the bound ENI and EIP. Default value: true.
true: the ENI and EIP will also be deleted;
false: only the server will be terminated, while the ENI and EIP will be retained. 
     * @return AssociatedResourceDestroy Whether to delete the bound ENI and EIP. Default value: true.
true: the ENI and EIP will also be deleted;
false: only the server will be terminated, while the ENI and EIP will be retained.
     */
    public Boolean getAssociatedResourceDestroy() {
        return this.AssociatedResourceDestroy;
    }

    /**
     * Set Whether to delete the bound ENI and EIP. Default value: true.
true: the ENI and EIP will also be deleted;
false: only the server will be terminated, while the ENI and EIP will be retained.
     * @param AssociatedResourceDestroy Whether to delete the bound ENI and EIP. Default value: true.
true: the ENI and EIP will also be deleted;
false: only the server will be terminated, while the ENI and EIP will be retained.
     */
    public void setAssociatedResourceDestroy(Boolean AssociatedResourceDestroy) {
        this.AssociatedResourceDestroy = AssociatedResourceDestroy;
    }

    public TerminateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstancesRequest(TerminateInstancesRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.TerminateDelay != null) {
            this.TerminateDelay = new Boolean(source.TerminateDelay);
        }
        if (source.TerminateTime != null) {
            this.TerminateTime = new String(source.TerminateTime);
        }
        if (source.AssociatedResourceDestroy != null) {
            this.AssociatedResourceDestroy = new Boolean(source.AssociatedResourceDestroy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "TerminateDelay", this.TerminateDelay);
        this.setParamSimple(map, prefix + "TerminateTime", this.TerminateTime);
        this.setParamSimple(map, prefix + "AssociatedResourceDestroy", this.AssociatedResourceDestroy);

    }
}

