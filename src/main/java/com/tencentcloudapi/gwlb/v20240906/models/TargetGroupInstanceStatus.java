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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInstanceStatus extends AbstractModel {

    /**
    * IP of backend RS
    */
    @SerializedName("InstanceIp")
    @Expose
    private String InstanceIp;

    /**
    * Health check status, with parameter values and meanings as follows:● on: indicates being under detection.● off: indicates that the health check is disabled.● health: indicates being healthy.● unhealth: indicates being abnormal.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get IP of backend RS 
     * @return InstanceIp IP of backend RS
     */
    public String getInstanceIp() {
        return this.InstanceIp;
    }

    /**
     * Set IP of backend RS
     * @param InstanceIp IP of backend RS
     */
    public void setInstanceIp(String InstanceIp) {
        this.InstanceIp = InstanceIp;
    }

    /**
     * Get Health check status, with parameter values and meanings as follows:● on: indicates being under detection.● off: indicates that the health check is disabled.● health: indicates being healthy.● unhealth: indicates being abnormal. 
     * @return Status Health check status, with parameter values and meanings as follows:● on: indicates being under detection.● off: indicates that the health check is disabled.● health: indicates being healthy.● unhealth: indicates being abnormal.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Health check status, with parameter values and meanings as follows:● on: indicates being under detection.● off: indicates that the health check is disabled.● health: indicates being healthy.● unhealth: indicates being abnormal.
     * @param Status Health check status, with parameter values and meanings as follows:● on: indicates being under detection.● off: indicates that the health check is disabled.● health: indicates being healthy.● unhealth: indicates being abnormal.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public TargetGroupInstanceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupInstanceStatus(TargetGroupInstanceStatus source) {
        if (source.InstanceIp != null) {
            this.InstanceIp = new String(source.InstanceIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceIp", this.InstanceIp);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

