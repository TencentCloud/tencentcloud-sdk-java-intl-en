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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDeviceStatusRequest extends AbstractModel {

    /**
    * Device ID (obtain from the ListDevices API for getting device list)
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Disable enable status code (2: enable, 3: disable)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Device ID (obtain from the ListDevices API for getting device list) 
     * @return DeviceId Device ID (obtain from the ListDevices API for getting device list)
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID (obtain from the ListDevices API for getting device list)
     * @param DeviceId Device ID (obtain from the ListDevices API for getting device list)
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Disable enable status code (2: enable, 3: disable) 
     * @return Status Disable enable status code (2: enable, 3: disable)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Disable enable status code (2: enable, 3: disable)
     * @param Status Disable enable status code (2: enable, 3: disable)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateDeviceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceStatusRequest(UpdateDeviceStatusRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

