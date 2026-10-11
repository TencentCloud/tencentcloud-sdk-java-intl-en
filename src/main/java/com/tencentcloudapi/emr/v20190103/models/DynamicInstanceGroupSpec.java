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

public class DynamicInstanceGroupSpec extends AbstractModel {

    /**
    * <p>Group name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Number of Pods.</p>
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * <p>Minimum number of nodes.</p>
    */
    @SerializedName("MinNodes")
    @Expose
    private Long MinNodes;

    /**
    * <p>Maximum number of nodes.</p>
    */
    @SerializedName("MaxNodes")
    @Expose
    private Long MaxNodes;

    /**
    * <p>Whether to enable storage configuration.</p>
    */
    @SerializedName("StorageConfigEnabled")
    @Expose
    private Boolean StorageConfigEnabled;

    /**
    * <p>headGroup:head;<br>workerGroup:worker</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>Number of CPU cores.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory (GB).</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>GPU type.</p>
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>Number of GPU cores.</p>
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * <p>Resource label.</p>
    */
    @SerializedName("ResourceLabels")
    @Expose
    private String ResourceLabels;

    /**
    * <p>Environment variable.</p>
    */
    @SerializedName("Env")
    @Expose
    private NameValue [] Env;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Labels")
    @Expose
    private NameValue [] Labels;

    /**
    * <p>Tolerations.</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>Scheduling policy.</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>Volume directory.</p>
    */
    @SerializedName("PersistentVolume")
    @Expose
    private PersistentVolume PersistentVolume;

    /**
    * <p>Pre-start command.</p>
    */
    @SerializedName("PreStartCommand")
    @Expose
    private String PreStartCommand;

    /**
    * <p>RayStart startup parameters.</p>
    */
    @SerializedName("RayStartParams")
    @Expose
    private String RayStartParams;

    /**
     * Get <p>Group name.</p> 
     * @return Name <p>Group name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Group name.</p>
     * @param Name <p>Group name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Number of Pods.</p> 
     * @return PodCount <p>Number of Pods.</p>
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set <p>Number of Pods.</p>
     * @param PodCount <p>Number of Pods.</p>
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get <p>Minimum number of nodes.</p> 
     * @return MinNodes <p>Minimum number of nodes.</p>
     */
    public Long getMinNodes() {
        return this.MinNodes;
    }

    /**
     * Set <p>Minimum number of nodes.</p>
     * @param MinNodes <p>Minimum number of nodes.</p>
     */
    public void setMinNodes(Long MinNodes) {
        this.MinNodes = MinNodes;
    }

    /**
     * Get <p>Maximum number of nodes.</p> 
     * @return MaxNodes <p>Maximum number of nodes.</p>
     */
    public Long getMaxNodes() {
        return this.MaxNodes;
    }

    /**
     * Set <p>Maximum number of nodes.</p>
     * @param MaxNodes <p>Maximum number of nodes.</p>
     */
    public void setMaxNodes(Long MaxNodes) {
        this.MaxNodes = MaxNodes;
    }

    /**
     * Get <p>Whether to enable storage configuration.</p> 
     * @return StorageConfigEnabled <p>Whether to enable storage configuration.</p>
     */
    public Boolean getStorageConfigEnabled() {
        return this.StorageConfigEnabled;
    }

    /**
     * Set <p>Whether to enable storage configuration.</p>
     * @param StorageConfigEnabled <p>Whether to enable storage configuration.</p>
     */
    public void setStorageConfigEnabled(Boolean StorageConfigEnabled) {
        this.StorageConfigEnabled = StorageConfigEnabled;
    }

    /**
     * Get <p>headGroup:head;<br>workerGroup:worker</p> 
     * @return GroupType <p>headGroup:head;<br>workerGroup:worker</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>headGroup:head;<br>workerGroup:worker</p>
     * @param GroupType <p>headGroup:head;<br>workerGroup:worker</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>Number of CPU cores.</p> 
     * @return Cpu <p>Number of CPU cores.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Number of CPU cores.</p>
     * @param Cpu <p>Number of CPU cores.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory (GB).</p> 
     * @return MemSize <p>Memory (GB).</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory (GB).</p>
     * @param MemSize <p>Memory (GB).</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>GPU type.</p> 
     * @return GpuType <p>GPU type.</p>
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU type.</p>
     * @param GpuType <p>GPU type.</p>
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>Number of GPU cores.</p> 
     * @return Gpu <p>Number of GPU cores.</p>
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set <p>Number of GPU cores.</p>
     * @param Gpu <p>Number of GPU cores.</p>
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get <p>Resource label.</p> 
     * @return ResourceLabels <p>Resource label.</p>
     */
    public String getResourceLabels() {
        return this.ResourceLabels;
    }

    /**
     * Set <p>Resource label.</p>
     * @param ResourceLabels <p>Resource label.</p>
     */
    public void setResourceLabels(String ResourceLabels) {
        this.ResourceLabels = ResourceLabels;
    }

    /**
     * Get <p>Environment variable.</p> 
     * @return Env <p>Environment variable.</p>
     */
    public NameValue [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>Environment variable.</p>
     * @param Env <p>Environment variable.</p>
     */
    public void setEnv(NameValue [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Labels <p>Tag.</p>
     */
    public NameValue [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Tag.</p>
     * @param Labels <p>Tag.</p>
     */
    public void setLabels(NameValue [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Tolerations.</p> 
     * @return Tolerations <p>Tolerations.</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Tolerations.</p>
     * @param Tolerations <p>Tolerations.</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>Scheduling policy.</p> 
     * @return Scheduler <p>Scheduling policy.</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>Scheduling policy.</p>
     * @param Scheduler <p>Scheduling policy.</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>Volume directory.</p> 
     * @return PersistentVolume <p>Volume directory.</p>
     */
    public PersistentVolume getPersistentVolume() {
        return this.PersistentVolume;
    }

    /**
     * Set <p>Volume directory.</p>
     * @param PersistentVolume <p>Volume directory.</p>
     */
    public void setPersistentVolume(PersistentVolume PersistentVolume) {
        this.PersistentVolume = PersistentVolume;
    }

    /**
     * Get <p>Pre-start command.</p> 
     * @return PreStartCommand <p>Pre-start command.</p>
     */
    public String getPreStartCommand() {
        return this.PreStartCommand;
    }

    /**
     * Set <p>Pre-start command.</p>
     * @param PreStartCommand <p>Pre-start command.</p>
     */
    public void setPreStartCommand(String PreStartCommand) {
        this.PreStartCommand = PreStartCommand;
    }

    /**
     * Get <p>RayStart startup parameters.</p> 
     * @return RayStartParams <p>RayStart startup parameters.</p>
     */
    public String getRayStartParams() {
        return this.RayStartParams;
    }

    /**
     * Set <p>RayStart startup parameters.</p>
     * @param RayStartParams <p>RayStart startup parameters.</p>
     */
    public void setRayStartParams(String RayStartParams) {
        this.RayStartParams = RayStartParams;
    }

    public DynamicInstanceGroupSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicInstanceGroupSpec(DynamicInstanceGroupSpec source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.MinNodes != null) {
            this.MinNodes = new Long(source.MinNodes);
        }
        if (source.MaxNodes != null) {
            this.MaxNodes = new Long(source.MaxNodes);
        }
        if (source.StorageConfigEnabled != null) {
            this.StorageConfigEnabled = new Boolean(source.StorageConfigEnabled);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.ResourceLabels != null) {
            this.ResourceLabels = new String(source.ResourceLabels);
        }
        if (source.Env != null) {
            this.Env = new NameValue[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new NameValue(source.Env[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new NameValue[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new NameValue(source.Labels[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.PersistentVolume != null) {
            this.PersistentVolume = new PersistentVolume(source.PersistentVolume);
        }
        if (source.PreStartCommand != null) {
            this.PreStartCommand = new String(source.PreStartCommand);
        }
        if (source.RayStartParams != null) {
            this.RayStartParams = new String(source.RayStartParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "MinNodes", this.MinNodes);
        this.setParamSimple(map, prefix + "MaxNodes", this.MaxNodes);
        this.setParamSimple(map, prefix + "StorageConfigEnabled", this.StorageConfigEnabled);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "ResourceLabels", this.ResourceLabels);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamObj(map, prefix + "PersistentVolume.", this.PersistentVolume);
        this.setParamSimple(map, prefix + "PreStartCommand", this.PreStartCommand);
        this.setParamSimple(map, prefix + "RayStartParams", this.RayStartParams);

    }
}

