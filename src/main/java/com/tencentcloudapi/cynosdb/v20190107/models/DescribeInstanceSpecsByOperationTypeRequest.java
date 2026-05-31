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

public class DescribeInstanceSpecsByOperationTypeRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Operation type.
Add new RO instance
modifyInstance: Modify configuration
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Instance ID, required when querying configuration modification specifications
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance Machine Type
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Operation type.
Add new RO instance
modifyInstance: Modify configuration 
     * @return OperationType Operation type.
Add new RO instance
modifyInstance: Modify configuration
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type.
Add new RO instance
modifyInstance: Modify configuration
     * @param OperationType Operation type.
Add new RO instance
modifyInstance: Modify configuration
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Instance ID, required when querying configuration modification specifications 
     * @return InstanceId Instance ID, required when querying configuration modification specifications
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, required when querying configuration modification specifications
     * @param InstanceId Instance ID, required when querying configuration modification specifications
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance Machine Type 
     * @return DeviceType Instance Machine Type
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance Machine Type
     * @param DeviceType Instance Machine Type
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public DescribeInstanceSpecsByOperationTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSpecsByOperationTypeRequest(DescribeInstanceSpecsByOperationTypeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

