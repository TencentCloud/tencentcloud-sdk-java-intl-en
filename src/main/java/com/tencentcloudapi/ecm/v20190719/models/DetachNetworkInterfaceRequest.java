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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachNetworkInterfaceRequest extends AbstractModel {

    /**
    * ENI instance ID, such as `eni-m6dyj72l`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * Instance ID, such as `ein-hcs7jkg4`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ECM region, such as `ap-xian-ecm`.
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get ENI instance ID, such as `eni-m6dyj72l`. 
     * @return NetworkInterfaceId ENI instance ID, such as `eni-m6dyj72l`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ENI instance ID, such as `eni-m6dyj72l`.
     * @param NetworkInterfaceId ENI instance ID, such as `eni-m6dyj72l`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get Instance ID, such as `ein-hcs7jkg4`. 
     * @return InstanceId Instance ID, such as `ein-hcs7jkg4`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as `ein-hcs7jkg4`.
     * @param InstanceId Instance ID, such as `ein-hcs7jkg4`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ECM region, such as `ap-xian-ecm`. 
     * @return EcmRegion ECM region, such as `ap-xian-ecm`.
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region, such as `ap-xian-ecm`.
     * @param EcmRegion ECM region, such as `ap-xian-ecm`.
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public DetachNetworkInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachNetworkInterfaceRequest(DetachNetworkInterfaceRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

