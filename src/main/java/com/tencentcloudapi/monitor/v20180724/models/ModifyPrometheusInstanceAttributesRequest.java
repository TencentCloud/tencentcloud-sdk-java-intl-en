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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrometheusInstanceAttributesRequest extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Data retention period (in days). The limit value is one of 15, 30, 45, 90, 180, 365, 730</p>
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * <p>Flag for special attributes of a prom instance</p><p>Archive storage duration (days):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
    */
    @SerializedName("InstanceAttributes")
    @Expose
    private PrometheusRuleKV [] InstanceAttributes;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Data retention period (in days). The limit value is one of 15, 30, 45, 90, 180, 365, 730</p> 
     * @return DataRetentionTime <p>Data retention period (in days). The limit value is one of 15, 30, 45, 90, 180, 365, 730</p>
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set <p>Data retention period (in days). The limit value is one of 15, 30, 45, 90, 180, 365, 730</p>
     * @param DataRetentionTime <p>Data retention period (in days). The limit value is one of 15, 30, 45, 90, 180, 365, 730</p>
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get <p>Flag for special attributes of a prom instance</p><p>Archive storage duration (days):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p> 
     * @return InstanceAttributes <p>Flag for special attributes of a prom instance</p><p>Archive storage duration (days):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
     */
    public PrometheusRuleKV [] getInstanceAttributes() {
        return this.InstanceAttributes;
    }

    /**
     * Set <p>Flag for special attributes of a prom instance</p><p>Archive storage duration (days):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
     * @param InstanceAttributes <p>Flag for special attributes of a prom instance</p><p>Archive storage duration (days):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
     */
    public void setInstanceAttributes(PrometheusRuleKV [] InstanceAttributes) {
        this.InstanceAttributes = InstanceAttributes;
    }

    public ModifyPrometheusInstanceAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrometheusInstanceAttributesRequest(ModifyPrometheusInstanceAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.InstanceAttributes != null) {
            this.InstanceAttributes = new PrometheusRuleKV[source.InstanceAttributes.length];
            for (int i = 0; i < source.InstanceAttributes.length; i++) {
                this.InstanceAttributes[i] = new PrometheusRuleKV(source.InstanceAttributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamArrayObj(map, prefix + "InstanceAttributes.", this.InstanceAttributes);

    }
}

