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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootInstancesRequest extends AbstractModel{

    /**
    * Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether to force restart an instance after a normal restart fails. Valid values: <br><li>TRUE: force restart an instance after a normal restart fails <br><li>FALSE: do not force restart an instance after a normal restart fails <br><br>Default value: FALSE.
    */
    @SerializedName("ForceReboot")
    @Expose
    private Boolean ForceReboot;

    /**
    * Shutdown type. Valid values: <br><li>SOFT: soft shutdown<br><li>HARD: hard shutdown<br><li>SOFT_FIRST: perform a soft shutdown first, and perform a hard shutdown if the soft shutdown fails<br><br>Default value: SOFT.
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request. 
     * @return InstanceIds Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
     * @param InstanceIds Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether to force restart an instance after a normal restart fails. Valid values: <br><li>TRUE: force restart an instance after a normal restart fails <br><li>FALSE: do not force restart an instance after a normal restart fails <br><br>Default value: FALSE. 
     * @return ForceReboot Whether to force restart an instance after a normal restart fails. Valid values: <br><li>TRUE: force restart an instance after a normal restart fails <br><li>FALSE: do not force restart an instance after a normal restart fails <br><br>Default value: FALSE.
     */
    public Boolean getForceReboot() {
        return this.ForceReboot;
    }

    /**
     * Set Whether to force restart an instance after a normal restart fails. Valid values: <br><li>TRUE: force restart an instance after a normal restart fails <br><li>FALSE: do not force restart an instance after a normal restart fails <br><br>Default value: FALSE.
     * @param ForceReboot Whether to force restart an instance after a normal restart fails. Valid values: <br><li>TRUE: force restart an instance after a normal restart fails <br><li>FALSE: do not force restart an instance after a normal restart fails <br><br>Default value: FALSE.
     */
    public void setForceReboot(Boolean ForceReboot) {
        this.ForceReboot = ForceReboot;
    }

    /**
     * Get Shutdown type. Valid values: <br><li>SOFT: soft shutdown<br><li>HARD: hard shutdown<br><li>SOFT_FIRST: perform a soft shutdown first, and perform a hard shutdown if the soft shutdown fails<br><br>Default value: SOFT. 
     * @return StopType Shutdown type. Valid values: <br><li>SOFT: soft shutdown<br><li>HARD: hard shutdown<br><li>SOFT_FIRST: perform a soft shutdown first, and perform a hard shutdown if the soft shutdown fails<br><br>Default value: SOFT.
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set Shutdown type. Valid values: <br><li>SOFT: soft shutdown<br><li>HARD: hard shutdown<br><li>SOFT_FIRST: perform a soft shutdown first, and perform a hard shutdown if the soft shutdown fails<br><br>Default value: SOFT.
     * @param StopType Shutdown type. Valid values: <br><li>SOFT: soft shutdown<br><li>HARD: hard shutdown<br><li>SOFT_FIRST: perform a soft shutdown first, and perform a hard shutdown if the soft shutdown fails<br><br>Default value: SOFT.
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForceReboot", this.ForceReboot);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

