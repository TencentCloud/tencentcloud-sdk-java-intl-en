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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentStatus extends AbstractModel {

    /**
    * Running Quantity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * Number of Anomalies
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Abnormal")
    @Expose
    private Long Abnormal;

    /**
    * Operating Quantity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InOperation")
    @Expose
    private Long InOperation;

    /**
     * Get Running Quantity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Running Running Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set Running Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Running Running Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunning(Long Running) {
        this.Running = Running;
    }

    /**
     * Get Number of Anomalies
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Abnormal Number of Anomalies
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAbnormal() {
        return this.Abnormal;
    }

    /**
     * Set Number of Anomalies
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Abnormal Number of Anomalies
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAbnormal(Long Abnormal) {
        this.Abnormal = Abnormal;
    }

    /**
     * Get Operating Quantity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InOperation Operating Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInOperation() {
        return this.InOperation;
    }

    /**
     * Set Operating Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InOperation Operating Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInOperation(Long InOperation) {
        this.InOperation = InOperation;
    }

    public AgentStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentStatus(AgentStatus source) {
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.Abnormal != null) {
            this.Abnormal = new Long(source.Abnormal);
        }
        if (source.InOperation != null) {
            this.InOperation = new Long(source.InOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "Abnormal", this.Abnormal);
        this.setParamSimple(map, prefix + "InOperation", this.InOperation);

    }
}

