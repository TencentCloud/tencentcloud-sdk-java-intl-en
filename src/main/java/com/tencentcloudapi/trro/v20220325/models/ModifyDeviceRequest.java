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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceRequest extends AbstractModel {

    /**
    * The target project id to modify the device's affiliated project.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The target device id to modify the device.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * The modified device name; if not filled in, no modification will be made.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * The modified device authentication password; if not filled in, no modification will be made.
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
     * Get The target project id to modify the device's affiliated project. 
     * @return ProjectId The target project id to modify the device's affiliated project.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The target project id to modify the device's affiliated project.
     * @param ProjectId The target project id to modify the device's affiliated project.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The target device id to modify the device. 
     * @return DeviceId The target device id to modify the device.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set The target device id to modify the device.
     * @param DeviceId The target device id to modify the device.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get The modified device name; if not filled in, no modification will be made. 
     * @return DeviceName The modified device name; if not filled in, no modification will be made.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set The modified device name; if not filled in, no modification will be made.
     * @param DeviceName The modified device name; if not filled in, no modification will be made.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get The modified device authentication password; if not filled in, no modification will be made. 
     * @return DeviceToken The modified device authentication password; if not filled in, no modification will be made.
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set The modified device authentication password; if not filled in, no modification will be made.
     * @param DeviceToken The modified device authentication password; if not filled in, no modification will be made.
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    public ModifyDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceRequest(ModifyDeviceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);

    }
}

