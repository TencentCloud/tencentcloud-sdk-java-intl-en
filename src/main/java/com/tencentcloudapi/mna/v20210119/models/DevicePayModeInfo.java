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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicePayModeInfo extends AbstractModel {

    /**
    * device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Payment mode.
Prepaid Traffic Package
0: Pay-as-you-go by traffic
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Payment mode description.
    */
    @SerializedName("PayModeDesc")
    @Expose
    private String PayModeDesc;

    /**
    * Traffic package ID. Only available when the payment mode is package type.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get device ID 
     * @return DeviceId device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set device ID
     * @param DeviceId device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Payment mode.
Prepaid Traffic Package
0: Pay-as-you-go by traffic 
     * @return PayMode Payment mode.
Prepaid Traffic Package
0: Pay-as-you-go by traffic
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode.
Prepaid Traffic Package
0: Pay-as-you-go by traffic
     * @param PayMode Payment mode.
Prepaid Traffic Package
0: Pay-as-you-go by traffic
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Payment mode description. 
     * @return PayModeDesc Payment mode description.
     */
    public String getPayModeDesc() {
        return this.PayModeDesc;
    }

    /**
     * Set Payment mode description.
     * @param PayModeDesc Payment mode description.
     */
    public void setPayModeDesc(String PayModeDesc) {
        this.PayModeDesc = PayModeDesc;
    }

    /**
     * Get Traffic package ID. Only available when the payment mode is package type. 
     * @return ResourceId Traffic package ID. Only available when the payment mode is package type.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Traffic package ID. Only available when the payment mode is package type.
     * @param ResourceId Traffic package ID. Only available when the payment mode is package type.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DevicePayModeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DevicePayModeInfo(DevicePayModeInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PayModeDesc != null) {
            this.PayModeDesc = new String(source.PayModeDesc);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeDesc", this.PayModeDesc);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

