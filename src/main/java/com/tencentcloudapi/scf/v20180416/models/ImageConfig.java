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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageConfig extends AbstractModel {

    /**
    * Image repository type, which can be `personal` or `enterprise`
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * {domain}/{namespace}/{imageName}:{tag}@{digest}
    */
    @SerializedName("ImageUri")
    @Expose
    private String ImageUri;

    /**
    * The temp token that a TCR Enterprise instance uses to obtain an image. It’s required when `ImageType` is `enterprise`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Disused
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * The command to start up the container, such as `python`. If it’s not specified, Entrypoint in Dockerfile is used.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * The parameters to start up the container. Separate parameters with spaces, such as `u app.py`. If it’s not specified, `CMD in Dockerfile is used.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * Whether to enable image acceleration. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerImageAccelerate")
    @Expose
    private Boolean ContainerImageAccelerate;

    /**
    * Image function port settings
`-1`: No port-specific image functions
`0`: Default port (Port 9000)
Others: Special ports
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImagePort")
    @Expose
    private Long ImagePort;

    /**
     * Get Image repository type, which can be `personal` or `enterprise` 
     * @return ImageType Image repository type, which can be `personal` or `enterprise`
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image repository type, which can be `personal` or `enterprise`
     * @param ImageType Image repository type, which can be `personal` or `enterprise`
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get {domain}/{namespace}/{imageName}:{tag}@{digest} 
     * @return ImageUri {domain}/{namespace}/{imageName}:{tag}@{digest}
     */
    public String getImageUri() {
        return this.ImageUri;
    }

    /**
     * Set {domain}/{namespace}/{imageName}:{tag}@{digest}
     * @param ImageUri {domain}/{namespace}/{imageName}:{tag}@{digest}
     */
    public void setImageUri(String ImageUri) {
        this.ImageUri = ImageUri;
    }

    /**
     * Get The temp token that a TCR Enterprise instance uses to obtain an image. It’s required when `ImageType` is `enterprise`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RegistryId The temp token that a TCR Enterprise instance uses to obtain an image. It’s required when `ImageType` is `enterprise`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set The temp token that a TCR Enterprise instance uses to obtain an image. It’s required when `ImageType` is `enterprise`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RegistryId The temp token that a TCR Enterprise instance uses to obtain an image. It’s required when `ImageType` is `enterprise`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Disused
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EntryPoint Disused
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set Disused
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EntryPoint Disused
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get The command to start up the container, such as `python`. If it’s not specified, Entrypoint in Dockerfile is used.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Command The command to start up the container, such as `python`. If it’s not specified, Entrypoint in Dockerfile is used.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set The command to start up the container, such as `python`. If it’s not specified, Entrypoint in Dockerfile is used.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Command The command to start up the container, such as `python`. If it’s not specified, Entrypoint in Dockerfile is used.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get The parameters to start up the container. Separate parameters with spaces, such as `u app.py`. If it’s not specified, `CMD in Dockerfile is used.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Args The parameters to start up the container. Separate parameters with spaces, such as `u app.py`. If it’s not specified, `CMD in Dockerfile is used.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set The parameters to start up the container. Separate parameters with spaces, such as `u app.py`. If it’s not specified, `CMD in Dockerfile is used.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Args The parameters to start up the container. Separate parameters with spaces, such as `u app.py`. If it’s not specified, `CMD in Dockerfile is used.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get Whether to enable image acceleration. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ContainerImageAccelerate Whether to enable image acceleration. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getContainerImageAccelerate() {
        return this.ContainerImageAccelerate;
    }

    /**
     * Set Whether to enable image acceleration. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ContainerImageAccelerate Whether to enable image acceleration. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setContainerImageAccelerate(Boolean ContainerImageAccelerate) {
        this.ContainerImageAccelerate = ContainerImageAccelerate;
    }

    /**
     * Get Image function port settings
`-1`: No port-specific image functions
`0`: Default port (Port 9000)
Others: Special ports
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImagePort Image function port settings
`-1`: No port-specific image functions
`0`: Default port (Port 9000)
Others: Special ports
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getImagePort() {
        return this.ImagePort;
    }

    /**
     * Set Image function port settings
`-1`: No port-specific image functions
`0`: Default port (Port 9000)
Others: Special ports
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImagePort Image function port settings
`-1`: No port-specific image functions
`0`: Default port (Port 9000)
Others: Special ports
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImagePort(Long ImagePort) {
        this.ImagePort = ImagePort;
    }

    public ImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageConfig(ImageConfig source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageUri != null) {
            this.ImageUri = new String(source.ImageUri);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String(source.EntryPoint);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
        if (source.ContainerImageAccelerate != null) {
            this.ContainerImageAccelerate = new Boolean(source.ContainerImageAccelerate);
        }
        if (source.ImagePort != null) {
            this.ImagePort = new Long(source.ImagePort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageUri", this.ImageUri);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "EntryPoint", this.EntryPoint);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "ContainerImageAccelerate", this.ContainerImageAccelerate);
        this.setParamSimple(map, prefix + "ImagePort", this.ImagePort);

    }
}

