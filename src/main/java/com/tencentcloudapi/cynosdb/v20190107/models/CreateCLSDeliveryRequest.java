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

public class CreateCLSDeliveryRequest extends AbstractModel {

    /**
    * Intance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log shipping configuration.
    */
    @SerializedName("CLSInfoList")
    @Expose
    private CLSInfo [] CLSInfoList;

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
     * Get Intance ID. 
     * @return InstanceId Intance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Intance ID.
     * @param InstanceId Intance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log shipping configuration. 
     * @return CLSInfoList Log shipping configuration.
     */
    public CLSInfo [] getCLSInfoList() {
        return this.CLSInfoList;
    }

    /**
     * Set Log shipping configuration.
     * @param CLSInfoList Log shipping configuration.
     */
    public void setCLSInfoList(CLSInfo [] CLSInfoList) {
        this.CLSInfoList = CLSInfoList;
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

    public CreateCLSDeliveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCLSDeliveryRequest(CreateCLSDeliveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CLSInfoList != null) {
            this.CLSInfoList = new CLSInfo[source.CLSInfoList.length];
            for (int i = 0; i < source.CLSInfoList.length; i++) {
                this.CLSInfoList[i] = new CLSInfo(source.CLSInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "CLSInfoList.", this.CLSInfoList);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}

