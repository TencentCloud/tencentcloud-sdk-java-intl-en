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

public class DeletePrometheusAlertPolicyRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of alerting rule IDs
    */
    @SerializedName("AlertIds")
    @Expose
    private String [] AlertIds;

    /**
    * Alerting rule name
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

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
     * Get List of alerting rule IDs 
     * @return AlertIds List of alerting rule IDs
     */
    public String [] getAlertIds() {
        return this.AlertIds;
    }

    /**
     * Set List of alerting rule IDs
     * @param AlertIds List of alerting rule IDs
     */
    public void setAlertIds(String [] AlertIds) {
        this.AlertIds = AlertIds;
    }

    /**
     * Get Alerting rule name 
     * @return Names Alerting rule name
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Alerting rule name
     * @param Names Alerting rule name
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    public DeletePrometheusAlertPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusAlertPolicyRequest(DeletePrometheusAlertPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AlertIds != null) {
            this.AlertIds = new String[source.AlertIds.length];
            for (int i = 0; i < source.AlertIds.length; i++) {
                this.AlertIds[i] = new String(source.AlertIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "AlertIds.", this.AlertIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);

    }
}

