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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubAppIdStatusRequest extends AbstractModel{

    /**
    * Subapplication ID.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Subapplication status. Valid strings include:
<li>On: to enable the subapplication.</li>
<li>Off: to disable the subapplication.</li>
<li>Destroyed: to terminate the subapplication. </li>
You cannot enable a subapplication when its status is “Destroying”. You can enable it after it was terminated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Subapplication ID. 
     * @return SubAppId Subapplication ID.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set Subapplication ID.
     * @param SubAppId Subapplication ID.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Subapplication status. Valid strings include:
<li>On: to enable the subapplication.</li>
<li>Off: to disable the subapplication.</li>
<li>Destroyed: to terminate the subapplication. </li>
You cannot enable a subapplication when its status is “Destroying”. You can enable it after it was terminated. 
     * @return Status Subapplication status. Valid strings include:
<li>On: to enable the subapplication.</li>
<li>Off: to disable the subapplication.</li>
<li>Destroyed: to terminate the subapplication. </li>
You cannot enable a subapplication when its status is “Destroying”. You can enable it after it was terminated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Subapplication status. Valid strings include:
<li>On: to enable the subapplication.</li>
<li>Off: to disable the subapplication.</li>
<li>Destroyed: to terminate the subapplication. </li>
You cannot enable a subapplication when its status is “Destroying”. You can enable it after it was terminated.
     * @param Status Subapplication status. Valid strings include:
<li>On: to enable the subapplication.</li>
<li>Off: to disable the subapplication.</li>
<li>Destroyed: to terminate the subapplication. </li>
You cannot enable a subapplication when its status is “Destroying”. You can enable it after it was terminated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

