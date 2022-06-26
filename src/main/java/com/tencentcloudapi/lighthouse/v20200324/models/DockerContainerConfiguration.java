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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerContainerConfiguration extends AbstractModel{

    /**
    * Container image address
    */
    @SerializedName("ContainerImage")
    @Expose
    private String ContainerImage;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * List of environment variables
    */
    @SerializedName("Envs")
    @Expose
    private ContainerEnv [] Envs;

    /**
    * List of mappings of container ports and host ports
    */
    @SerializedName("PublishPorts")
    @Expose
    private DockerContainerPublishPort [] PublishPorts;

    /**
    * List of container mount volumes
    */
    @SerializedName("Volumes")
    @Expose
    private DockerContainerVolume [] Volumes;

    /**
    * The command to run
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
     * Get Container image address 
     * @return ContainerImage Container image address
     */
    public String getContainerImage() {
        return this.ContainerImage;
    }

    /**
     * Set Container image address
     * @param ContainerImage Container image address
     */
    public void setContainerImage(String ContainerImage) {
        this.ContainerImage = ContainerImage;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get List of environment variables 
     * @return Envs List of environment variables
     */
    public ContainerEnv [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set List of environment variables
     * @param Envs List of environment variables
     */
    public void setEnvs(ContainerEnv [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get List of mappings of container ports and host ports 
     * @return PublishPorts List of mappings of container ports and host ports
     */
    public DockerContainerPublishPort [] getPublishPorts() {
        return this.PublishPorts;
    }

    /**
     * Set List of mappings of container ports and host ports
     * @param PublishPorts List of mappings of container ports and host ports
     */
    public void setPublishPorts(DockerContainerPublishPort [] PublishPorts) {
        this.PublishPorts = PublishPorts;
    }

    /**
     * Get List of container mount volumes 
     * @return Volumes List of container mount volumes
     */
    public DockerContainerVolume [] getVolumes() {
        return this.Volumes;
    }

    /**
     * Set List of container mount volumes
     * @param Volumes List of container mount volumes
     */
    public void setVolumes(DockerContainerVolume [] Volumes) {
        this.Volumes = Volumes;
    }

    /**
     * Get The command to run 
     * @return Command The command to run
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set The command to run
     * @param Command The command to run
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    public DockerContainerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerContainerConfiguration(DockerContainerConfiguration source) {
        if (source.ContainerImage != null) {
            this.ContainerImage = new String(source.ContainerImage);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Envs != null) {
            this.Envs = new ContainerEnv[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new ContainerEnv(source.Envs[i]);
            }
        }
        if (source.PublishPorts != null) {
            this.PublishPorts = new DockerContainerPublishPort[source.PublishPorts.length];
            for (int i = 0; i < source.PublishPorts.length; i++) {
                this.PublishPorts[i] = new DockerContainerPublishPort(source.PublishPorts[i]);
            }
        }
        if (source.Volumes != null) {
            this.Volumes = new DockerContainerVolume[source.Volumes.length];
            for (int i = 0; i < source.Volumes.length; i++) {
                this.Volumes[i] = new DockerContainerVolume(source.Volumes[i]);
            }
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerImage", this.ContainerImage);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "PublishPorts.", this.PublishPorts);
        this.setParamArrayObj(map, prefix + "Volumes.", this.Volumes);
        this.setParamSimple(map, prefix + "Command", this.Command);

    }
}

