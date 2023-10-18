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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrometheusInstanceAttributesRequest extends AbstractModel {

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Storage period. Valid values: 15, 30, 45. This parameter is not applicable to monthly subscribed instances.
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Storage period. Valid values: 15, 30, 45. This parameter is not applicable to monthly subscribed instances. 
     * @return DataRetentionTime Storage period. Valid values: 15, 30, 45. This parameter is not applicable to monthly subscribed instances.
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set Storage period. Valid values: 15, 30, 45. This parameter is not applicable to monthly subscribed instances.
     * @param DataRetentionTime Storage period. Valid values: 15, 30, 45. This parameter is not applicable to monthly subscribed instances.
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    public ModifyPrometheusInstanceAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrometheusInstanceAttributesRequest(ModifyPrometheusInstanceAttributesRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);

    }
}

