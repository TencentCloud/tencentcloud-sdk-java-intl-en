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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixStream extends AbstractModel {

    /**
    * Whether stream mixing is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Whether audio stream mixing is disabled
    */
    @SerializedName("DisableAudio")
    @Expose
    private Boolean DisableAudio;

    /**
    * ID of the embedded mixed stream layout template. Valid values: 1 and 2. For more information on the differences of both values, see the sample embedded mixed stream layout template.
If the Custom field is not specified, ModelId is required.
    */
    @SerializedName("ModelId")
    @Expose
    private Long ModelId;

    /**
    * ID of a teacher account
This field is valid only when ModelId is specified.
If you specify TeacherID for a user, the user's video stream will be displayed in the first image of the embedded template.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * Custom mixed stream layout parameter
If this parameter is available, the ModelId and TeacherId fields will be ignored.
    */
    @SerializedName("Custom")
    @Expose
    private CustomLayout Custom;

    /**
     * Get Whether stream mixing is enabled 
     * @return Enabled Whether stream mixing is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether stream mixing is enabled
     * @param Enabled Whether stream mixing is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Whether audio stream mixing is disabled 
     * @return DisableAudio Whether audio stream mixing is disabled
     */
    public Boolean getDisableAudio() {
        return this.DisableAudio;
    }

    /**
     * Set Whether audio stream mixing is disabled
     * @param DisableAudio Whether audio stream mixing is disabled
     */
    public void setDisableAudio(Boolean DisableAudio) {
        this.DisableAudio = DisableAudio;
    }

    /**
     * Get ID of the embedded mixed stream layout template. Valid values: 1 and 2. For more information on the differences of both values, see the sample embedded mixed stream layout template.
If the Custom field is not specified, ModelId is required. 
     * @return ModelId ID of the embedded mixed stream layout template. Valid values: 1 and 2. For more information on the differences of both values, see the sample embedded mixed stream layout template.
If the Custom field is not specified, ModelId is required.
     */
    public Long getModelId() {
        return this.ModelId;
    }

    /**
     * Set ID of the embedded mixed stream layout template. Valid values: 1 and 2. For more information on the differences of both values, see the sample embedded mixed stream layout template.
If the Custom field is not specified, ModelId is required.
     * @param ModelId ID of the embedded mixed stream layout template. Valid values: 1 and 2. For more information on the differences of both values, see the sample embedded mixed stream layout template.
If the Custom field is not specified, ModelId is required.
     */
    public void setModelId(Long ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get ID of a teacher account
This field is valid only when ModelId is specified.
If you specify TeacherID for a user, the user's video stream will be displayed in the first image of the embedded template. 
     * @return TeacherId ID of a teacher account
This field is valid only when ModelId is specified.
If you specify TeacherID for a user, the user's video stream will be displayed in the first image of the embedded template.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set ID of a teacher account
This field is valid only when ModelId is specified.
If you specify TeacherID for a user, the user's video stream will be displayed in the first image of the embedded template.
     * @param TeacherId ID of a teacher account
This field is valid only when ModelId is specified.
If you specify TeacherID for a user, the user's video stream will be displayed in the first image of the embedded template.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get Custom mixed stream layout parameter
If this parameter is available, the ModelId and TeacherId fields will be ignored. 
     * @return Custom Custom mixed stream layout parameter
If this parameter is available, the ModelId and TeacherId fields will be ignored.
     */
    public CustomLayout getCustom() {
        return this.Custom;
    }

    /**
     * Set Custom mixed stream layout parameter
If this parameter is available, the ModelId and TeacherId fields will be ignored.
     * @param Custom Custom mixed stream layout parameter
If this parameter is available, the ModelId and TeacherId fields will be ignored.
     */
    public void setCustom(CustomLayout Custom) {
        this.Custom = Custom;
    }

    public MixStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixStream(MixStream source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.DisableAudio != null) {
            this.DisableAudio = new Boolean(source.DisableAudio);
        }
        if (source.ModelId != null) {
            this.ModelId = new Long(source.ModelId);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.Custom != null) {
            this.Custom = new CustomLayout(source.Custom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DisableAudio", this.DisableAudio);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamObj(map, prefix + "Custom.", this.Custom);

    }
}

