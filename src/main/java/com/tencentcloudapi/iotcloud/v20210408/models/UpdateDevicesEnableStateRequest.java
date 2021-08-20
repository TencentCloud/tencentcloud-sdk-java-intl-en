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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDevicesEnableStateRequest extends AbstractModel{

    /**
    * ID of the product to which the device belongs
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Device names
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * New status of the devices. `0`: disabled; `1`: enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get ID of the product to which the device belongs 
     * @return ProductId ID of the product to which the device belongs
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set ID of the product to which the device belongs
     * @param ProductId ID of the product to which the device belongs
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Device names 
     * @return DeviceNames Device names
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set Device names
     * @param DeviceNames Device names
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get New status of the devices. `0`: disabled; `1`: enabled 
     * @return Status New status of the devices. `0`: disabled; `1`: enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set New status of the devices. `0`: disabled; `1`: enabled
     * @param Status New status of the devices. `0`: disabled; `1`: enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateDevicesEnableStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDevicesEnableStateRequest(UpdateDevicesEnableStateRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

