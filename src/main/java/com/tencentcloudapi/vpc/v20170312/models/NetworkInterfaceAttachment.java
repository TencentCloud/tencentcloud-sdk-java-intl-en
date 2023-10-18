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

public class NetworkInterfaceAttachment extends AbstractModel {

    /**
    * CVM instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The serial number of ENI in the CVM instance.
    */
    @SerializedName("DeviceIndex")
    @Expose
    private Long DeviceIndex;

    /**
    * The account information of the CVM owner.
    */
    @SerializedName("InstanceAccountId")
    @Expose
    private String InstanceAccountId;

    /**
    * Binding time
    */
    @SerializedName("AttachTime")
    @Expose
    private String AttachTime;

    /**
     * Get CVM instance ID. 
     * @return InstanceId CVM instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM instance ID.
     * @param InstanceId CVM instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The serial number of ENI in the CVM instance. 
     * @return DeviceIndex The serial number of ENI in the CVM instance.
     */
    public Long getDeviceIndex() {
        return this.DeviceIndex;
    }

    /**
     * Set The serial number of ENI in the CVM instance.
     * @param DeviceIndex The serial number of ENI in the CVM instance.
     */
    public void setDeviceIndex(Long DeviceIndex) {
        this.DeviceIndex = DeviceIndex;
    }

    /**
     * Get The account information of the CVM owner. 
     * @return InstanceAccountId The account information of the CVM owner.
     */
    public String getInstanceAccountId() {
        return this.InstanceAccountId;
    }

    /**
     * Set The account information of the CVM owner.
     * @param InstanceAccountId The account information of the CVM owner.
     */
    public void setInstanceAccountId(String InstanceAccountId) {
        this.InstanceAccountId = InstanceAccountId;
    }

    /**
     * Get Binding time 
     * @return AttachTime Binding time
     */
    public String getAttachTime() {
        return this.AttachTime;
    }

    /**
     * Set Binding time
     * @param AttachTime Binding time
     */
    public void setAttachTime(String AttachTime) {
        this.AttachTime = AttachTime;
    }

    public NetworkInterfaceAttachment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInterfaceAttachment(NetworkInterfaceAttachment source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceIndex != null) {
            this.DeviceIndex = new Long(source.DeviceIndex);
        }
        if (source.InstanceAccountId != null) {
            this.InstanceAccountId = new String(source.InstanceAccountId);
        }
        if (source.AttachTime != null) {
            this.AttachTime = new String(source.AttachTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceIndex", this.DeviceIndex);
        this.setParamSimple(map, prefix + "InstanceAccountId", this.InstanceAccountId);
        this.setParamSimple(map, prefix + "AttachTime", this.AttachTime);

    }
}

