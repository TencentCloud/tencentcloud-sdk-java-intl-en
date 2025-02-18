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

public class CreateDeviceRequest extends AbstractModel {

    /**
    * Create the project id to which the device belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Create a device id, which must be unique within the project, consisting of lowercase english letters, numbers, and underscores, with a length not exceeding 18.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Create a device name, with a length of less than 24, which can include chinese, numbers, english letters, and underscores.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Device type, field for on-site device (controlled device), remote for remote device (control device), default is field if not specified.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Device authentication password, consisting of uppercase and lowercase english letters and digits, must be 16 characters.
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
     * Get Create the project id to which the device belongs. 
     * @return ProjectId Create the project id to which the device belongs.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Create the project id to which the device belongs.
     * @param ProjectId Create the project id to which the device belongs.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Create a device id, which must be unique within the project, consisting of lowercase english letters, numbers, and underscores, with a length not exceeding 18. 
     * @return DeviceId Create a device id, which must be unique within the project, consisting of lowercase english letters, numbers, and underscores, with a length not exceeding 18.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Create a device id, which must be unique within the project, consisting of lowercase english letters, numbers, and underscores, with a length not exceeding 18.
     * @param DeviceId Create a device id, which must be unique within the project, consisting of lowercase english letters, numbers, and underscores, with a length not exceeding 18.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Create a device name, with a length of less than 24, which can include chinese, numbers, english letters, and underscores. 
     * @return DeviceName Create a device name, with a length of less than 24, which can include chinese, numbers, english letters, and underscores.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Create a device name, with a length of less than 24, which can include chinese, numbers, english letters, and underscores.
     * @param DeviceName Create a device name, with a length of less than 24, which can include chinese, numbers, english letters, and underscores.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Device type, field for on-site device (controlled device), remote for remote device (control device), default is field if not specified. 
     * @return DeviceType Device type, field for on-site device (controlled device), remote for remote device (control device), default is field if not specified.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type, field for on-site device (controlled device), remote for remote device (control device), default is field if not specified.
     * @param DeviceType Device type, field for on-site device (controlled device), remote for remote device (control device), default is field if not specified.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Device authentication password, consisting of uppercase and lowercase english letters and digits, must be 16 characters. 
     * @return DeviceToken Device authentication password, consisting of uppercase and lowercase english letters and digits, must be 16 characters.
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set Device authentication password, consisting of uppercase and lowercase english letters and digits, must be 16 characters.
     * @param DeviceToken Device authentication password, consisting of uppercase and lowercase english letters and digits, must be 16 characters.
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    public CreateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceRequest(CreateDeviceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
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
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);

    }
}

