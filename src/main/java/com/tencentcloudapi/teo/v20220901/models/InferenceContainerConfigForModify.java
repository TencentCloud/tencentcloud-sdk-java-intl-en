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

public class InferenceContainerConfigForModify extends AbstractModel {

    /**
    * <p>Image type. Valid values: <li>TCR: an image from Tencent Cloud container mirroring service.</li></p>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * <p>TCR image repository info. Required when ImageType is TCR.</p>
    */
    @SerializedName("TcrRepositoryConfig")
    @Expose
    private InferenceTCRRepositoryConfig TcrRepositoryConfig;

    /**
    * <p>Command executed at container startup. If left empty, the image's Entrypoint/CMD is used by default. Supports up to 1024 characters.</p>
    */
    @SerializedName("StartupCommand")
    @Expose
    private String StartupCommand;

    /**
    * <p>Environment variables of the container runtime. Supports up to 10 variables.</p>
    */
    @SerializedName("EnvironmentVariables")
    @Expose
    private InferenceEnvironmentVariable [] EnvironmentVariables;

    /**
     * Get <p>Image type. Valid values: <li>TCR: an image from Tencent Cloud container mirroring service.</li></p> 
     * @return ImageType <p>Image type. Valid values: <li>TCR: an image from Tencent Cloud container mirroring service.</li></p>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set <p>Image type. Valid values: <li>TCR: an image from Tencent Cloud container mirroring service.</li></p>
     * @param ImageType <p>Image type. Valid values: <li>TCR: an image from Tencent Cloud container mirroring service.</li></p>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get <p>TCR image repository info. Required when ImageType is TCR.</p> 
     * @return TcrRepositoryConfig <p>TCR image repository info. Required when ImageType is TCR.</p>
     */
    public InferenceTCRRepositoryConfig getTcrRepositoryConfig() {
        return this.TcrRepositoryConfig;
    }

    /**
     * Set <p>TCR image repository info. Required when ImageType is TCR.</p>
     * @param TcrRepositoryConfig <p>TCR image repository info. Required when ImageType is TCR.</p>
     */
    public void setTcrRepositoryConfig(InferenceTCRRepositoryConfig TcrRepositoryConfig) {
        this.TcrRepositoryConfig = TcrRepositoryConfig;
    }

    /**
     * Get <p>Command executed at container startup. If left empty, the image's Entrypoint/CMD is used by default. Supports up to 1024 characters.</p> 
     * @return StartupCommand <p>Command executed at container startup. If left empty, the image's Entrypoint/CMD is used by default. Supports up to 1024 characters.</p>
     */
    public String getStartupCommand() {
        return this.StartupCommand;
    }

    /**
     * Set <p>Command executed at container startup. If left empty, the image's Entrypoint/CMD is used by default. Supports up to 1024 characters.</p>
     * @param StartupCommand <p>Command executed at container startup. If left empty, the image's Entrypoint/CMD is used by default. Supports up to 1024 characters.</p>
     */
    public void setStartupCommand(String StartupCommand) {
        this.StartupCommand = StartupCommand;
    }

    /**
     * Get <p>Environment variables of the container runtime. Supports up to 10 variables.</p> 
     * @return EnvironmentVariables <p>Environment variables of the container runtime. Supports up to 10 variables.</p>
     */
    public InferenceEnvironmentVariable [] getEnvironmentVariables() {
        return this.EnvironmentVariables;
    }

    /**
     * Set <p>Environment variables of the container runtime. Supports up to 10 variables.</p>
     * @param EnvironmentVariables <p>Environment variables of the container runtime. Supports up to 10 variables.</p>
     */
    public void setEnvironmentVariables(InferenceEnvironmentVariable [] EnvironmentVariables) {
        this.EnvironmentVariables = EnvironmentVariables;
    }

    public InferenceContainerConfigForModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceContainerConfigForModify(InferenceContainerConfigForModify source) {
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

