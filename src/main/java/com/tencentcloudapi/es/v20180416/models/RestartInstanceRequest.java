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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether to force restart <li>true: Yes </li><li>false: No </li>Default value: false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * Restart mode. `0`: rolling restart; `1`: full restart
    */
    @SerializedName("RestartMode")
    @Expose
    private Long RestartMode;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether to force restart <li>true: Yes </li><li>false: No </li>Default value: false 
     * @return ForceRestart Whether to force restart <li>true: Yes </li><li>false: No </li>Default value: false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart <li>true: Yes </li><li>false: No </li>Default value: false
     * @param ForceRestart Whether to force restart <li>true: Yes </li><li>false: No </li>Default value: false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get Restart mode. `0`: rolling restart; `1`: full restart 
     * @return RestartMode Restart mode. `0`: rolling restart; `1`: full restart
     */
    public Long getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set Restart mode. `0`: rolling restart; `1`: full restart
     * @param RestartMode Restart mode. `0`: rolling restart; `1`: full restart
     */
    public void setRestartMode(Long RestartMode) {
        this.RestartMode = RestartMode;
    }

    public RestartInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartInstanceRequest(RestartInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.RestartMode != null) {
            this.RestartMode = new Long(source.RestartMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamSimple(map, prefix + "RestartMode", this.RestartMode);

    }
}

