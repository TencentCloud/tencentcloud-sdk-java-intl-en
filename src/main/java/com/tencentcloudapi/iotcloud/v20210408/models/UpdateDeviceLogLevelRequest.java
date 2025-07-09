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

public class UpdateDeviceLogLevelRequest extends AbstractModel {

    /**
    * Product ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Device name
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Log level. `0`: disable; `1`: error; `2`: warning; `3`: information; `4`: debugging
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
     * Get Product ID 
     * @return ProductId Product ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID
     * @param ProductId Product ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Device name 
     * @return DeviceName Device name
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name
     * @param DeviceName Device name
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Log level. `0`: disable; `1`: error; `2`: warning; `3`: information; `4`: debugging 
     * @return LogLevel Log level. `0`: disable; `1`: error; `2`: warning; `3`: information; `4`: debugging
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set Log level. `0`: disable; `1`: error; `2`: warning; `3`: information; `4`: debugging
     * @param LogLevel Log level. `0`: disable; `1`: error; `2`: warning; `3`: information; `4`: debugging
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    public UpdateDeviceLogLevelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceLogLevelRequest(UpdateDeviceLogLevelRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);

    }
}

