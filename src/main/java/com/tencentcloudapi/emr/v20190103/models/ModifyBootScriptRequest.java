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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBootScriptRequest extends AbstractModel {

    /**
    * EMR instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Bootstrap script type. Valid values: resourceAfter, clusterAfter, and clusterBefore.
    */
    @SerializedName("BootType")
    @Expose
    private String BootType;

    /**
    * Specific changes to the bootstrap script. If it is left empty, no bootstrap script is configured for the WhenRun timing.
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSetting [] PreExecutedFileSettings;

    /**
     * Get EMR instance ID. 
     * @return InstanceId EMR instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR instance ID.
     * @param InstanceId EMR instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Bootstrap script type. Valid values: resourceAfter, clusterAfter, and clusterBefore. 
     * @return BootType Bootstrap script type. Valid values: resourceAfter, clusterAfter, and clusterBefore.
     */
    public String getBootType() {
        return this.BootType;
    }

    /**
     * Set Bootstrap script type. Valid values: resourceAfter, clusterAfter, and clusterBefore.
     * @param BootType Bootstrap script type. Valid values: resourceAfter, clusterAfter, and clusterBefore.
     */
    public void setBootType(String BootType) {
        this.BootType = BootType;
    }

    /**
     * Get Specific changes to the bootstrap script. If it is left empty, no bootstrap script is configured for the WhenRun timing. 
     * @return PreExecutedFileSettings Specific changes to the bootstrap script. If it is left empty, no bootstrap script is configured for the WhenRun timing.
     */
    public PreExecuteFileSetting [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set Specific changes to the bootstrap script. If it is left empty, no bootstrap script is configured for the WhenRun timing.
     * @param PreExecutedFileSettings Specific changes to the bootstrap script. If it is left empty, no bootstrap script is configured for the WhenRun timing.
     */
    public void setPreExecutedFileSettings(PreExecuteFileSetting [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    public ModifyBootScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBootScriptRequest(ModifyBootScriptRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BootType != null) {
            this.BootType = new String(source.BootType);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSetting[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSetting(source.PreExecutedFileSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BootType", this.BootType);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);

    }
}

