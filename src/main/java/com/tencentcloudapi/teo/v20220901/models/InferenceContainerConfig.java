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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceContainerConfig extends AbstractModel {

    /**
    * Image type. Valid values: <li>TCR: a Tencent Cloud container mirroring service image.</li>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * TCR image repository information. Required when ImageType is TCR.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("TcrRepositoryConfig")
    @Expose
    private InferenceTCRRepositoryConfig TcrRepositoryConfig;

    /**
    * Executed command at container startup. Uses the mirror's Entrypoint/CMD by default when left empty. Supports up to 1024 characters.
    */
    @SerializedName("StartupCommand")
    @Expose
    private String StartupCommand;

    /**
    * Environment variables of the container runtime. Supports up to 10 variables.
    */
    @SerializedName("EnvironmentVariables")
    @Expose
    private InferenceEnvironmentVariable [] EnvironmentVariables;

    /**
     * Get Image type. Valid values: <li>TCR: a Tencent Cloud container mirroring service image.</li> 
     * @return ImageType Image type. Valid values: <li>TCR: a Tencent Cloud container mirroring service image.</li>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image type. Valid values: <li>TCR: a Tencent Cloud container mirroring service image.</li>
     * @param ImageType Image type. Valid values: <li>TCR: a Tencent Cloud container mirroring service image.</li>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get TCR image repository information. Required when ImageType is TCR.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return TcrRepositoryConfig TCR image repository information. Required when ImageType is TCR.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public InferenceTCRRepositoryConfig getTcrRepositoryConfig() {
        return this.TcrRepositoryConfig;
    }

    /**
     * Set TCR image repository information. Required when ImageType is TCR.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param TcrRepositoryConfig TCR image repository information. Required when ImageType is TCR.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setTcrRepositoryConfig(InferenceTCRRepositoryConfig TcrRepositoryConfig) {
        this.TcrRepositoryConfig = TcrRepositoryConfig;
    }

    /**
     * Get Executed command at container startup. Uses the mirror's Entrypoint/CMD by default when left empty. Supports up to 1024 characters. 
     * @return StartupCommand Executed command at container startup. Uses the mirror's Entrypoint/CMD by default when left empty. Supports up to 1024 characters.
     */
    public String getStartupCommand() {
        return this.StartupCommand;
    }

    /**
     * Set Executed command at container startup. Uses the mirror's Entrypoint/CMD by default when left empty. Supports up to 1024 characters.
     * @param StartupCommand Executed command at container startup. Uses the mirror's Entrypoint/CMD by default when left empty. Supports up to 1024 characters.
     */
    public void setStartupCommand(String StartupCommand) {
        this.StartupCommand = StartupCommand;
    }

    /**
     * Get Environment variables of the container runtime. Supports up to 10 variables. 
     * @return EnvironmentVariables Environment variables of the container runtime. Supports up to 10 variables.
     */
    public InferenceEnvironmentVariable [] getEnvironmentVariables() {
        return this.EnvironmentVariables;
    }

    /**
     * Set Environment variables of the container runtime. Supports up to 10 variables.
     * @param EnvironmentVariables Environment variables of the container runtime. Supports up to 10 variables.
     */
    public void setEnvironmentVariables(InferenceEnvironmentVariable [] EnvironmentVariables) {
        this.EnvironmentVariables = EnvironmentVariables;
    }

    public InferenceContainerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceContainerConfig(InferenceContainerConfig source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.TcrRepositoryConfig != null) {
            this.TcrRepositoryConfig = new InferenceTCRRepositoryConfig(source.TcrRepositoryConfig);
        }
        if (source.StartupCommand != null) {
            this.StartupCommand = new String(source.StartupCommand);
        }
        if (source.EnvironmentVariables != null) {
            this.EnvironmentVariables = new InferenceEnvironmentVariable[source.EnvironmentVariables.length];
            for (int i = 0; i < source.EnvironmentVariables.length; i++) {
                this.EnvironmentVariables[i] = new InferenceEnvironmentVariable(source.EnvironmentVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamObj(map, prefix + "TcrRepositoryConfig.", this.TcrRepositoryConfig);
        this.setParamSimple(map, prefix + "StartupCommand", this.StartupCommand);
        this.setParamArrayObj(map, prefix + "EnvironmentVariables.", this.EnvironmentVariables);

    }
}

