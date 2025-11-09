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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCLSDeliveryRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log topic ID.
    */
    @SerializedName("CLSTopicIds")
    @Expose
    private String [] CLSTopicIds;

    /**
    * Log type.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Whether the maintenance time is in operation.
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log topic ID. 
     * @return CLSTopicIds Log topic ID.
     */
    public String [] getCLSTopicIds() {
        return this.CLSTopicIds;
    }

    /**
     * Set Log topic ID.
     * @param CLSTopicIds Log topic ID.
     */
    public void setCLSTopicIds(String [] CLSTopicIds) {
        this.CLSTopicIds = CLSTopicIds;
    }

    /**
     * Get Log type. 
     * @return LogType Log type.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type.
     * @param LogType Log type.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Whether the maintenance time is in operation. 
     * @return IsInMaintainPeriod Whether the maintenance time is in operation.
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Whether the maintenance time is in operation.
     * @param IsInMaintainPeriod Whether the maintenance time is in operation.
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public DeleteCLSDeliveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCLSDeliveryRequest(DeleteCLSDeliveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CLSTopicIds != null) {
            this.CLSTopicIds = new String[source.CLSTopicIds.length];
            for (int i = 0; i < source.CLSTopicIds.length; i++) {
                this.CLSTopicIds[i] = new String(source.CLSTopicIds[i]);
            }
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "CLSTopicIds.", this.CLSTopicIds);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}

