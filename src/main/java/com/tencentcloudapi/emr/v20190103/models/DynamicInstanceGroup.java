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

public class DynamicInstanceGroup extends AbstractModel {

    /**
    * <p>Resource group type.</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>Resource group name.</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>Number of Pod CPU cores.</p>
    */
    @SerializedName("PodCpu")
    @Expose
    private Long PodCpu;

    /**
    * <p>Pod memory size (GB).</p>
    */
    @SerializedName("PodMem")
    @Expose
    private Long PodMem;

    /**
    * <p>Pod GPU type.</p>
    */
    @SerializedName("PodGpuType")
    @Expose
    private String PodGpuType;

    /**
    * <p>Number of Pod GPUs.</p>
    */
    @SerializedName("PodGpu")
    @Expose
    private Long PodGpu;

    /**
    * <p>Number of Pods.</p>
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
    * <p>Minimum number of elastic Pods.</p>
    */
    @SerializedName("MinPodNum")
    @Expose
    private Long MinPodNum;

    /**
    * <p>Maximum number of elastic Pods. When MaxPodNum &gt; MinPodNum, auto scaling is enabled by default and scaling is performed within the range.</p>
    */
    @SerializedName("MaxPodNum")
    @Expose
    private Long MaxPodNum;

    /**
    * <p>Whether to support storage configuration.</p>
    */
    @SerializedName("SupportPV")
    @Expose
    private Boolean SupportPV;

    /**
    * <p>CBS storage volume list.</p>
    */
    @SerializedName("CBSVolumes")
    @Expose
    private CBSVolume [] CBSVolumes;

    /**
    * <p>CFS storage volume list.</p>
    */
    @SerializedName("CFSVolumes")
    @Expose
    private CFSVolume [] CFSVolumes;

    /**
    * <p>COS storage volume list.</p>
    */
    @SerializedName("COSVolumes")
    @Expose
    private COSVolume [] COSVolumes;

    /**
    * <p>Mount volume list.</p>
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * <p>Pod label.</p>
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * <p>Tolerations definition.</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>Environment variable.</p>
    */
    @SerializedName("Envs")
    @Expose
    private NameValue [] Envs;

    /**
    * <p>Node scheduling policy.</p>
    */
    @SerializedName("SchedulingPolicy")
    @Expose
    private String SchedulingPolicy;

    /**
    * <p>Resource label.</p>
    */
    @SerializedName("ResourceLabel")
    @Expose
    private String ResourceLabel;

    /**
    * <p>GPU resource vendor key.</p>
    */
    @SerializedName("PodGpuResourceKey")
    @Expose
    private String PodGpuResourceKey;

    /**
    * <p>CFS Turbo mount list.</p>
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
    * <p>GooseFS disk.</p>
    */
    @SerializedName("GooseFSVolumes")
    @Expose
    private GooseFSVolume [] GooseFSVolumes;

    /**
    * <p>Pre-start command.</p>
    */
    @SerializedName("PreStartCommand")
    @Expose
    private String PreStartCommand;

    /**
    * <p>Ray pre-start command.</p>
    */
    @SerializedName("RayStartParams")
    @Expose
    private String RayStartParams;

    /**
     * Get <p>Resource group type.</p> 
     * @return GroupType <p>Resource group type.</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>Resource group type.</p>
     * @param GroupType <p>Resource group type.</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>Resource group name.</p> 
     * @return GroupName <p>Resource group name.</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>Resource group name.</p>
     * @param GroupName <p>Resource group name.</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>Number of Pod CPU cores.</p> 
     * @return PodCpu <p>Number of Pod CPU cores.</p>
     */
    public Long getPodCpu() {
        return this.PodCpu;
    }

    /**
     * Set <p>Number of Pod CPU cores.</p>
     * @param PodCpu <p>Number of Pod CPU cores.</p>
     */
    public void setPodCpu(Long PodCpu) {
        this.PodCpu = PodCpu;
    }

    /**
     * Get <p>Pod memory size (GB).</p> 
     * @return PodMem <p>Pod memory size (GB).</p>
     */
    public Long getPodMem() {
        return this.PodMem;
    }

    /**
     * Set <p>Pod memory size (GB).</p>
     * @param PodMem <p>Pod memory size (GB).</p>
     */
    public void setPodMem(Long PodMem) {
        this.PodMem = PodMem;
    }

    /**
     * Get <p>Pod GPU type.</p> 
     * @return PodGpuType <p>Pod GPU type.</p>
     */
    public String getPodGpuType() {
        return this.PodGpuType;
    }

    /**
     * Set <p>Pod GPU type.</p>
     * @param PodGpuType <p>Pod GPU type.</p>
     */
    public void setPodGpuType(String PodGpuType) {
        this.PodGpuType = PodGpuType;
    }

    /**
     * Get <p>Number of Pod GPUs.</p> 
     * @return PodGpu <p>Number of Pod GPUs.</p>
     */
    public Long getPodGpu() {
        return this.PodGpu;
    }

    /**
     * Set <p>Number of Pod GPUs.</p>
     * @param PodGpu <p>Number of Pod GPUs.</p>
     */
    public void setPodGpu(Long PodGpu) {
        this.PodGpu = PodGpu;
    }

    /**
     * Get <p>Number of Pods.</p> 
     * @return PodNum <p>Number of Pods.</p>
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set <p>Number of Pods.</p>
     * @param PodNum <p>Number of Pods.</p>
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    /**
     * Get <p>Minimum number of elastic Pods.</p> 
     * @return MinPodNum <p>Minimum number of elastic Pods.</p>
     */
    public Long getMinPodNum() {
        return this.MinPodNum;
    }

    /**
     * Set <p>Minimum number of elastic Pods.</p>
     * @param MinPodNum <p>Minimum number of elastic Pods.</p>
     */
    public void setMinPodNum(Long MinPodNum) {
        this.MinPodNum = MinPodNum;
    }

    /**
     * Get <p>Maximum number of elastic Pods. When MaxPodNum &gt; MinPodNum, auto scaling is enabled by default and scaling is performed within the range.</p> 
     * @return MaxPodNum <p>Maximum number of elastic Pods. When MaxPodNum &gt; MinPodNum, auto scaling is enabled by default and scaling is performed within the range.</p>
     */
    public Long getMaxPodNum() {
        return this.MaxPodNum;
    }

    /**
     * Set <p>Maximum number of elastic Pods. When MaxPodNum &gt; MinPodNum, auto scaling is enabled by default and scaling is performed within the range.</p>
     * @param MaxPodNum <p>Maximum number of elastic Pods. When MaxPodNum &gt; MinPodNum, auto scaling is enabled by default and scaling is performed within the range.</p>
     */
    public void setMaxPodNum(Long MaxPodNum) {
        this.MaxPodNum = MaxPodNum;
    }

    /**
     * Get <p>Whether to support storage configuration.</p> 
     * @return SupportPV <p>Whether to support storage configuration.</p>
     */
    public Boolean getSupportPV() {
        return this.SupportPV;
    }

    /**
     * Set <p>Whether to support storage configuration.</p>
     * @param SupportPV <p>Whether to support storage configuration.</p>
     */
    public void setSupportPV(Boolean SupportPV) {
        this.SupportPV = SupportPV;
    }

    /**
     * Get <p>CBS storage volume list.</p> 
     * @return CBSVolumes <p>CBS storage volume list.</p>
     */
    public CBSVolume [] getCBSVolumes() {
        return this.CBSVolumes;
    }

    /**
     * Set <p>CBS storage volume list.</p>
     * @param CBSVolumes <p>CBS storage volume list.</p>
     */
    public void setCBSVolumes(CBSVolume [] CBSVolumes) {
        this.CBSVolumes = CBSVolumes;
    }

    /**
     * Get <p>CFS storage volume list.</p> 
     * @return CFSVolumes <p>CFS storage volume list.</p>
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>CFS storage volume list.</p>
     * @param CFSVolumes <p>CFS storage volume list.</p>
     */
    public void setCFSVolumes(CFSVolume [] CFSVolumes) {
        this.CFSVolumes = CFSVolumes;
    }

    /**
     * Get <p>COS storage volume list.</p> 
     * @return COSVolumes <p>COS storage volume list.</p>
     */
    public COSVolume [] getCOSVolumes() {
        return this.COSVolumes;
    }

    /**
     * Set <p>COS storage volume list.</p>
     * @param COSVolumes <p>COS storage volume list.</p>
     */
    public void setCOSVolumes(COSVolume [] COSVolumes) {
        this.COSVolumes = COSVolumes;
    }

    /**
     * Get <p>Mount volume list.</p> 
     * @return VolumeMounts <p>Mount volume list.</p>
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>Mount volume list.</p>
     * @param VolumeMounts <p>Mount volume list.</p>
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get <p>Pod label.</p> 
     * @return Labels <p>Pod label.</p>
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Pod label.</p>
     * @param Labels <p>Pod label.</p>
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Tolerations definition.</p> 
     * @return Tolerations <p>Tolerations definition.</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Tolerations definition.</p>
     * @param Tolerations <p>Tolerations definition.</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>Environment variable.</p> 
     * @return Envs <p>Environment variable.</p>
     */
    public NameValue [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>Environment variable.</p>
     * @param Envs <p>Environment variable.</p>
     */
    public void setEnvs(NameValue [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>Node scheduling policy.</p> 
     * @return SchedulingPolicy <p>Node scheduling policy.</p>
     */
    public String getSchedulingPolicy() {
        return this.SchedulingPolicy;
    }

    /**
     * Set <p>Node scheduling policy.</p>
     * @param SchedulingPolicy <p>Node scheduling policy.</p>
     */
    public void setSchedulingPolicy(String SchedulingPolicy) {
        this.SchedulingPolicy = SchedulingPolicy;
    }

    /**
     * Get <p>Resource label.</p> 
     * @return ResourceLabel <p>Resource label.</p>
     */
    public String getResourceLabel() {
        return this.ResourceLabel;
    }

    /**
     * Set <p>Resource label.</p>
     * @param ResourceLabel <p>Resource label.</p>
     */
    public void setResourceLabel(String ResourceLabel) {
        this.ResourceLabel = ResourceLabel;
    }

    /**
     * Get <p>GPU resource vendor key.</p> 
     * @return PodGpuResourceKey <p>GPU resource vendor key.</p>
     */
    public String getPodGpuResourceKey() {
        return this.PodGpuResourceKey;
    }

    /**
     * Set <p>GPU resource vendor key.</p>
     * @param PodGpuResourceKey <p>GPU resource vendor key.</p>
     */
    public void setPodGpuResourceKey(String PodGpuResourceKey) {
        this.PodGpuResourceKey = PodGpuResourceKey;
    }

    /**
     * Get <p>CFS Turbo mount list.</p> 
     * @return CFSTurboVolumes <p>CFS Turbo mount list.</p>
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>CFS Turbo mount list.</p>
     * @param CFSTurboVolumes <p>CFS Turbo mount list.</p>
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    /**
     * Get <p>GooseFS disk.</p> 
     * @return GooseFSVolumes <p>GooseFS disk.</p>
     */
    public GooseFSVolume [] getGooseFSVolumes() {
        return this.GooseFSVolumes;
    }

    /**
     * Set <p>GooseFS disk.</p>
     * @param GooseFSVolumes <p>GooseFS disk.</p>
     */
    public void setGooseFSVolumes(GooseFSVolume [] GooseFSVolumes) {
        this.GooseFSVolumes = GooseFSVolumes;
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
     * Get <p>Ray pre-start command.</p> 
     * @return RayStartParams <p>Ray pre-start command.</p>
     */
    public String getRayStartParams() {
        return this.RayStartParams;
    }

    /**
     * Set <p>Ray pre-start command.</p>
     * @param RayStartParams <p>Ray pre-start command.</p>
     */
    public void setRayStartParams(String RayStartParams) {
        this.RayStartParams = RayStartParams;
    }

    public DynamicInstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicInstanceGroup(DynamicInstanceGroup source) {
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PodCpu != null) {
            this.PodCpu = new Long(source.PodCpu);
        }
        if (source.PodMem != null) {
            this.PodMem = new Long(source.PodMem);
        }
        if (source.PodGpuType != null) {
            this.PodGpuType = new String(source.PodGpuType);
        }
        if (source.PodGpu != null) {
            this.PodGpu = new Long(source.PodGpu);
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
        if (source.MinPodNum != null) {
            this.MinPodNum = new Long(source.MinPodNum);
        }
        if (source.MaxPodNum != null) {
            this.MaxPodNum = new Long(source.MaxPodNum);
        }
        if (source.SupportPV != null) {
            this.SupportPV = new Boolean(source.SupportPV);
        }
        if (source.CBSVolumes != null) {
            this.CBSVolumes = new CBSVolume[source.CBSVolumes.length];
            for (int i = 0; i < source.CBSVolumes.length; i++) {
                this.CBSVolumes[i] = new CBSVolume(source.CBSVolumes[i]);
            }
        }
        if (source.CFSVolumes != null) {
            this.CFSVolumes = new CFSVolume[source.CFSVolumes.length];
            for (int i = 0; i < source.CFSVolumes.length; i++) {
                this.CFSVolumes[i] = new CFSVolume(source.CFSVolumes[i]);
            }
        }
        if (source.COSVolumes != null) {
            this.COSVolumes = new COSVolume[source.COSVolumes.length];
            for (int i = 0; i < source.COSVolumes.length; i++) {
                this.COSVolumes[i] = new COSVolume(source.COSVolumes[i]);
            }
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new TkeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TkeLabel(source.Labels[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.Envs != null) {
            this.Envs = new NameValue[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new NameValue(source.Envs[i]);
            }
        }
        if (source.SchedulingPolicy != null) {
            this.SchedulingPolicy = new String(source.SchedulingPolicy);
        }
        if (source.ResourceLabel != null) {
            this.ResourceLabel = new String(source.ResourceLabel);
        }
        if (source.PodGpuResourceKey != null) {
            this.PodGpuResourceKey = new String(source.PodGpuResourceKey);
        }
        if (source.CFSTurboVolumes != null) {
            this.CFSTurboVolumes = new CFSTurboVolume[source.CFSTurboVolumes.length];
            for (int i = 0; i < source.CFSTurboVolumes.length; i++) {
                this.CFSTurboVolumes[i] = new CFSTurboVolume(source.CFSTurboVolumes[i]);
            }
        }
        if (source.GooseFSVolumes != null) {
            this.GooseFSVolumes = new GooseFSVolume[source.GooseFSVolumes.length];
            for (int i = 0; i < source.GooseFSVolumes.length; i++) {
                this.GooseFSVolumes[i] = new GooseFSVolume(source.GooseFSVolumes[i]);
            }
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
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "PodCpu", this.PodCpu);
        this.setParamSimple(map, prefix + "PodMem", this.PodMem);
        this.setParamSimple(map, prefix + "PodGpuType", this.PodGpuType);
        this.setParamSimple(map, prefix + "PodGpu", this.PodGpu);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);
        this.setParamSimple(map, prefix + "MinPodNum", this.MinPodNum);
        this.setParamSimple(map, prefix + "MaxPodNum", this.MaxPodNum);
        this.setParamSimple(map, prefix + "SupportPV", this.SupportPV);
        this.setParamArrayObj(map, prefix + "CBSVolumes.", this.CBSVolumes);
        this.setParamArrayObj(map, prefix + "CFSVolumes.", this.CFSVolumes);
        this.setParamArrayObj(map, prefix + "COSVolumes.", this.COSVolumes);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "SchedulingPolicy", this.SchedulingPolicy);
        this.setParamSimple(map, prefix + "ResourceLabel", this.ResourceLabel);
        this.setParamSimple(map, prefix + "PodGpuResourceKey", this.PodGpuResourceKey);
        this.setParamArrayObj(map, prefix + "CFSTurboVolumes.", this.CFSTurboVolumes);
        this.setParamArrayObj(map, prefix + "GooseFSVolumes.", this.GooseFSVolumes);
        this.setParamSimple(map, prefix + "PreStartCommand", this.PreStartCommand);
        this.setParamSimple(map, prefix + "RayStartParams", this.RayStartParams);

    }
}

