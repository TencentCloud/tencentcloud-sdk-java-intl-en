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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDeviceRequest extends AbstractModel {

    /**
    * ID of the product to which the device belongs
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Name of the device to delete
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Skey, which is required to delete a LoRa device or LoRa gateway device
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

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
     * Get Name of the device to delete 
     * @return DeviceName Name of the device to delete
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Name of the device to delete
     * @param DeviceName Name of the device to delete
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Skey, which is required to delete a LoRa device or LoRa gateway device 
     * @return Skey Skey, which is required to delete a LoRa device or LoRa gateway device
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set Skey, which is required to delete a LoRa device or LoRa gateway device
     * @param Skey Skey, which is required to delete a LoRa device or LoRa gateway device
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    public DeleteDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDeviceRequest(DeleteDeviceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Skey", this.Skey);

    }
}

