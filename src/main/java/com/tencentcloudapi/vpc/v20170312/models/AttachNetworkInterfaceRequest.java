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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachNetworkInterfaceRequest extends AbstractModel {

    /**
    * The ID of the ENI instance, such as `eni-m6dyj72l`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * The ID of the CVM instance, such as `ins-r8hr2upy`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ENI mounting type. Valid values: `0` (standard); `1` (extension); default value: `0`
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
     * Get The ID of the ENI instance, such as `eni-m6dyj72l`. 
     * @return NetworkInterfaceId The ID of the ENI instance, such as `eni-m6dyj72l`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The ID of the ENI instance, such as `eni-m6dyj72l`.
     * @param NetworkInterfaceId The ID of the ENI instance, such as `eni-m6dyj72l`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get The ID of the CVM instance, such as `ins-r8hr2upy`. 
     * @return InstanceId The ID of the CVM instance, such as `ins-r8hr2upy`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ID of the CVM instance, such as `ins-r8hr2upy`.
     * @param InstanceId The ID of the CVM instance, such as `ins-r8hr2upy`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ENI mounting type. Valid values: `0` (standard); `1` (extension); default value: `0` 
     * @return AttachType ENI mounting type. Valid values: `0` (standard); `1` (extension); default value: `0`
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set ENI mounting type. Valid values: `0` (standard); `1` (extension); default value: `0`
     * @param AttachType ENI mounting type. Valid values: `0` (standard); `1` (extension); default value: `0`
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
    }

    public AttachNetworkInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachNetworkInterfaceRequest(AttachNetworkInterfaceRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AttachType != null) {
            this.AttachType = new Long(source.AttachType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AttachType", this.AttachType);

    }
}

