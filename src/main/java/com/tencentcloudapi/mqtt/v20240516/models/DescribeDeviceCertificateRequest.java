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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceCertificateRequest extends AbstractModel {

    /**
    * The SN serial number of the device certificate is used for unique identification of a device certificate.
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
    * The instance ID of the TDMQ MQTT can be obtained from the DescribeInstanceList API or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get The SN serial number of the device certificate is used for unique identification of a device certificate. 
     * @return DeviceCertificateSn The SN serial number of the device certificate is used for unique identification of a device certificate.
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set The SN serial number of the device certificate is used for unique identification of a device certificate.
     * @param DeviceCertificateSn The SN serial number of the device certificate is used for unique identification of a device certificate.
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    /**
     * Get The instance ID of the TDMQ MQTT can be obtained from the DescribeInstanceList API or the console. 
     * @return InstanceId The instance ID of the TDMQ MQTT can be obtained from the DescribeInstanceList API or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The instance ID of the TDMQ MQTT can be obtained from the DescribeInstanceList API or the console.
     * @param InstanceId The instance ID of the TDMQ MQTT can be obtained from the DescribeInstanceList API or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeDeviceCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCertificateRequest(DescribeDeviceCertificateRequest source) {
        if (source.DeviceCertificateSn != null) {
            this.DeviceCertificateSn = new String(source.DeviceCertificateSn);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceCertificateSn", this.DeviceCertificateSn);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

