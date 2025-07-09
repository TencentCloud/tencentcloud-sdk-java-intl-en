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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeviceLicenseRequest extends AbstractModel {

    /**
    * Project id to which the target device belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Target device id.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get Project id to which the target device belongs. 
     * @return ProjectId Project id to which the target device belongs.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id to which the target device belongs.
     * @param ProjectId Project id to which the target device belongs.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Target device id. 
     * @return DeviceId Target device id.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Target device id.
     * @param DeviceId Target device id.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public GetDeviceLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeviceLicenseRequest(GetDeviceLicenseRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

