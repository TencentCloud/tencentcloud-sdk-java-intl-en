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

public class CapacityGlobalConfig extends AbstractModel {

    /**
    * Whether label-based scheduling is enabled.
    */
    @SerializedName("EnableLabel")
    @Expose
    private Boolean EnableLabel;

    /**
    * Path for tag information storage if label-based scheduling is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelDir")
    @Expose
    private String LabelDir;

    /**
    * Whether to overwrite the user-specified queue, wherein true indicates overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueMappingOverride")
    @Expose
    private Boolean QueueMappingOverride;

    /**
    * Advanced settings.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultSettings")
    @Expose
    private DefaultSetting [] DefaultSettings;

    /**
     * Get Whether label-based scheduling is enabled. 
     * @return EnableLabel Whether label-based scheduling is enabled.
     */
    public Boolean getEnableLabel() {
        return this.EnableLabel;
    }

    /**
     * Set Whether label-based scheduling is enabled.
     * @param EnableLabel Whether label-based scheduling is enabled.
     */
    public void setEnableLabel(Boolean EnableLabel) {
        this.EnableLabel = EnableLabel;
    }

    /**
     * Get Path for tag information storage if label-based scheduling is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LabelDir Path for tag information storage if label-based scheduling is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabelDir() {
        return this.LabelDir;
    }

    /**
     * Set Path for tag information storage if label-based scheduling is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LabelDir Path for tag information storage if label-based scheduling is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelDir(String LabelDir) {
        this.LabelDir = LabelDir;
    }

    /**
     * Get Whether to overwrite the user-specified queue, wherein true indicates overwrite.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueMappingOverride Whether to overwrite the user-specified queue, wherein true indicates overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getQueueMappingOverride() {
        return this.QueueMappingOverride;
    }

    /**
     * Set Whether to overwrite the user-specified queue, wherein true indicates overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueMappingOverride Whether to overwrite the user-specified queue, wherein true indicates overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueMappingOverride(Boolean QueueMappingOverride) {
        this.QueueMappingOverride = QueueMappingOverride;
    }

    /**
     * Get Advanced settings.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultSettings Advanced settings.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DefaultSetting [] getDefaultSettings() {
        return this.DefaultSettings;
    }

    /**
     * Set Advanced settings.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultSettings Advanced settings.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultSettings(DefaultSetting [] DefaultSettings) {
        this.DefaultSettings = DefaultSettings;
    }

    public CapacityGlobalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CapacityGlobalConfig(CapacityGlobalConfig source) {
        if (source.EnableLabel != null) {
            this.EnableLabel = new Boolean(source.EnableLabel);
        }
        if (source.LabelDir != null) {
            this.LabelDir = new String(source.LabelDir);
        }
        if (source.QueueMappingOverride != null) {
            this.QueueMappingOverride = new Boolean(source.QueueMappingOverride);
        }
        if (source.DefaultSettings != null) {
            this.DefaultSettings = new DefaultSetting[source.DefaultSettings.length];
            for (int i = 0; i < source.DefaultSettings.length; i++) {
                this.DefaultSettings[i] = new DefaultSetting(source.DefaultSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableLabel", this.EnableLabel);
        this.setParamSimple(map, prefix + "LabelDir", this.LabelDir);
        this.setParamSimple(map, prefix + "QueueMappingOverride", this.QueueMappingOverride);
        this.setParamArrayObj(map, prefix + "DefaultSettings.", this.DefaultSettings);

    }
}

