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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopInstancesRequest extends AbstractModel {

    /**
    * Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * (Disused. Please use `StopType` instead.) Whether to forcibly shut down an instance after a normal shutdown fails. Valid values: <br><li>`TRUE`: yes;<br><li>`FALSE`: no<br><br>Default value: `FALSE`. 
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * Instance shutdown mode. Valid values: <br><li>SOFT_FIRST: perform a soft shutdown first, and force shut down the instance if the soft shutdown fails <br><li>HARD: force shut down the instance directly <br><li>SOFT: soft shutdown only <br>Default value: SOFT.
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
    * Billing method of a pay-as-you-go instance after shutdown.
Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown <br><li>STOP_CHARGING: billing stops after shutdown <br>Default value: KEEP_CHARGING.
This parameter is only valid for some pay-as-you-go instances using cloud disks. For more information, see [No charges when shut down for pay-as-you-go instances](https://intl.cloud.tencent.com/document/product/213/19918).
    */
    @SerializedName("StoppedMode")
    @Expose
    private String StoppedMode;

    /**
     * Get Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100. 
     * @return InstanceIds Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
     * @param InstanceIds Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get (Disused. Please use `StopType` instead.) Whether to forcibly shut down an instance after a normal shutdown fails. Valid values: <br><li>`TRUE`: yes;<br><li>`FALSE`: no<br><br>Default value: `FALSE`.  
     * @return ForceStop (Disused. Please use `StopType` instead.) Whether to forcibly shut down an instance after a normal shutdown fails. Valid values: <br><li>`TRUE`: yes;<br><li>`FALSE`: no<br><br>Default value: `FALSE`. 
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set (Disused. Please use `StopType` instead.) Whether to forcibly shut down an instance after a normal shutdown fails. Valid values: <br><li>`TRUE`: yes;<br><li>`FALSE`: no<br><br>Default value: `FALSE`. 
     * @param ForceStop (Disused. Please use `StopType` instead.) Whether to forcibly shut down an instance after a normal shutdown fails. Valid values: <br><li>`TRUE`: yes;<br><li>`FALSE`: no<br><br>Default value: `FALSE`. 
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get Instance shutdown mode. Valid values: <br><li>SOFT_FIRST: perform a soft shutdown first, and force shut down the instance if the soft shutdown fails <br><li>HARD: force shut down the instance directly <br><li>SOFT: soft shutdown only <br>Default value: SOFT. 
     * @return StopType Instance shutdown mode. Valid values: <br><li>SOFT_FIRST: perform a soft shutdown first, and force shut down the instance if the soft shutdown fails <br><li>HARD: force shut down the instance directly <br><li>SOFT: soft shutdown only <br>Default value: SOFT.
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set Instance shutdown mode. Valid values: <br><li>SOFT_FIRST: perform a soft shutdown first, and force shut down the instance if the soft shutdown fails <br><li>HARD: force shut down the instance directly <br><li>SOFT: soft shutdown only <br>Default value: SOFT.
     * @param StopType Instance shutdown mode. Valid values: <br><li>SOFT_FIRST: perform a soft shutdown first, and force shut down the instance if the soft shutdown fails <br><li>HARD: force shut down the instance directly <br><li>SOFT: soft shutdown only <br>Default value: SOFT.
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    /**
     * Get Billing method of a pay-as-you-go instance after shutdown.
Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown <br><li>STOP_CHARGING: billing stops after shutdown <br>Default value: KEEP_CHARGING.
This parameter is only valid for some pay-as-you-go instances using cloud disks. For more information, see [No charges when shut down for pay-as-you-go instances](https://intl.cloud.tencent.com/document/product/213/19918). 
     * @return StoppedMode Billing method of a pay-as-you-go instance after shutdown.
Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown <br><li>STOP_CHARGING: billing stops after shutdown <br>Default value: KEEP_CHARGING.
This parameter is only valid for some pay-as-you-go instances using cloud disks. For more information, see [No charges when shut down for pay-as-you-go instances](https://intl.cloud.tencent.com/document/product/213/19918).
     */
    public String getStoppedMode() {
        return this.StoppedMode;
    }

    /**
     * Set Billing method of a pay-as-you-go instance after shutdown.
Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown <br><li>STOP_CHARGING: billing stops after shutdown <br>Default value: KEEP_CHARGING.
This parameter is only valid for some pay-as-you-go instances using cloud disks. For more information, see [No charges when shut down for pay-as-you-go instances](https://intl.cloud.tencent.com/document/product/213/19918).
     * @param StoppedMode Billing method of a pay-as-you-go instance after shutdown.
Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown <br><li>STOP_CHARGING: billing stops after shutdown <br>Default value: KEEP_CHARGING.
This parameter is only valid for some pay-as-you-go instances using cloud disks. For more information, see [No charges when shut down for pay-as-you-go instances](https://intl.cloud.tencent.com/document/product/213/19918).
     */
    public void setStoppedMode(String StoppedMode) {
        this.StoppedMode = StoppedMode;
    }

    public StopInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopInstancesRequest(StopInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
        if (source.StoppedMode != null) {
            this.StoppedMode = new String(source.StoppedMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "StopType", this.StopType);
        this.setParamSimple(map, prefix + "StoppedMode", this.StoppedMode);

    }
}

