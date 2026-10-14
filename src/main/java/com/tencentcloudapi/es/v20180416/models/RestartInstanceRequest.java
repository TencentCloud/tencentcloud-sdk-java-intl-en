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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartInstanceRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Whether to force restart<li>true: force restart</li><li>false: do not force restart</li>Default value: false</p>
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * <p>Restart mode: 0 rolling restart; 1 full restart</p>
    */
    @SerializedName("RestartMode")
    @Expose
    private Long RestartMode;

    /**
    * <p>Select whether to upgrade the kernel patch version upon restart</p>
    */
    @SerializedName("UpgradeKernel")
    @Expose
    private Boolean UpgradeKernel;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Whether to force restart<li>true: force restart</li><li>false: do not force restart</li>Default value: false</p> 
     * @return ForceRestart <p>Whether to force restart<li>true: force restart</li><li>false: do not force restart</li>Default value: false</p>
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set <p>Whether to force restart<li>true: force restart</li><li>false: do not force restart</li>Default value: false</p>
     * @param ForceRestart <p>Whether to force restart<li>true: force restart</li><li>false: do not force restart</li>Default value: false</p>
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get <p>Restart mode: 0 rolling restart; 1 full restart</p> 
     * @return RestartMode <p>Restart mode: 0 rolling restart; 1 full restart</p>
     */
    public Long getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set <p>Restart mode: 0 rolling restart; 1 full restart</p>
     * @param RestartMode <p>Restart mode: 0 rolling restart; 1 full restart</p>
     */
    public void setRestartMode(Long RestartMode) {
        this.RestartMode = RestartMode;
    }

    /**
     * Get <p>Select whether to upgrade the kernel patch version upon restart</p> 
     * @return UpgradeKernel <p>Select whether to upgrade the kernel patch version upon restart</p>
     */
    public Boolean getUpgradeKernel() {
        return this.UpgradeKernel;
    }

    /**
     * Set <p>Select whether to upgrade the kernel patch version upon restart</p>
     * @param UpgradeKernel <p>Select whether to upgrade the kernel patch version upon restart</p>
     */
    public void setUpgradeKernel(Boolean UpgradeKernel) {
        this.UpgradeKernel = UpgradeKernel;
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
        if (source.UpgradeKernel != null) {
            this.UpgradeKernel = new Boolean(source.UpgradeKernel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamSimple(map, prefix + "RestartMode", this.RestartMode);
        this.setParamSimple(map, prefix + "UpgradeKernel", this.UpgradeKernel);

    }
}

