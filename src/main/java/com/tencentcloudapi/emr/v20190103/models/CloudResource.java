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

public class CloudResource extends AbstractModel {

    /**
    * <p>Component role name.</p>
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * <p>Number of Pod requests.</p>
    */
    @SerializedName("PodNumber")
    @Expose
    private Long PodNumber;

    /**
    * <p>Maximum number of CPU requests.</p>
    */
    @SerializedName("LimitCpu")
    @Expose
    private Long LimitCpu;

    /**
    * <p>Maximum number of memory requests.</p>
    */
    @SerializedName("LimitMemory")
    @Expose
    private Long LimitMemory;

    /**
    * <p>Service name, for example, HIVE.</p>
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>Data volume directory settings.</p>
    */
    @SerializedName("VolumeDir")
    @Expose
    private VolumeSetting VolumeDir;

    /**
    * <p>External access settings for the component.</p>
    */
    @SerializedName("ExternalAccess")
    @Expose
    private ExternalAccess ExternalAccess;

    /**
    * <p>Node affinity settings.</p>
    */
    @SerializedName("Affinity")
    @Expose
    private NodeAffinity Affinity;

    /**
    * <p>Selected data disk information.</p>
    */
    @SerializedName("Disks")
    @Expose
    private Disk [] Disks;

    /**
    * <p>Toleration.</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>Pod affinity.</p>
    */
    @SerializedName("PodAffinity")
    @Expose
    private PodAffinitySpec PodAffinity;

    /**
    * <p>Pod anti-affinity.</p>
    */
    @SerializedName("PodAntiAffinity")
    @Expose
    private PodAffinitySpec PodAntiAffinity;

    /**
    * <p>Topology distribution constraint.</p>
    */
    @SerializedName("TopologySpreadConstraints")
    @Expose
    private TopologySpreadConstraint [] TopologySpreadConstraints;

    /**
    * <p>Pod tag.</p>
    */
    @SerializedName("PodLabels")
    @Expose
    private StringMap [] PodLabels;

    /**
    * <p>Whether the default Ray cluster is created.</p>
    */
    @SerializedName("EnableDefaultRayCluster")
    @Expose
    private Boolean EnableDefaultRayCluster;

    /**
    * <p>Custom image.</p>
    */
    @SerializedName("ImageInfoV2")
    @Expose
    private ImageInfoV2 ImageInfoV2;

    /**
    * <p>Specifies the dynamic instance parameter to be created.</p>
    */
    @SerializedName("DynamicInstanceForm")
    @Expose
    private DynamicInstanceForm DynamicInstanceForm;

    /**
     * Get <p>Component role name.</p> 
     * @return ComponentName <p>Component role name.</p>
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set <p>Component role name.</p>
     * @param ComponentName <p>Component role name.</p>
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get <p>Number of Pod requests.</p> 
     * @return PodNumber <p>Number of Pod requests.</p>
     */
    public Long getPodNumber() {
        return this.PodNumber;
    }

    /**
     * Set <p>Number of Pod requests.</p>
     * @param PodNumber <p>Number of Pod requests.</p>
     */
    public void setPodNumber(Long PodNumber) {
        this.PodNumber = PodNumber;
    }

    /**
     * Get <p>Maximum number of CPU requests.</p> 
     * @return LimitCpu <p>Maximum number of CPU requests.</p>
     */
    public Long getLimitCpu() {
        return this.LimitCpu;
    }

    /**
     * Set <p>Maximum number of CPU requests.</p>
     * @param LimitCpu <p>Maximum number of CPU requests.</p>
     */
    public void setLimitCpu(Long LimitCpu) {
        this.LimitCpu = LimitCpu;
    }

    /**
     * Get <p>Maximum number of memory requests.</p> 
     * @return LimitMemory <p>Maximum number of memory requests.</p>
     */
    public Long getLimitMemory() {
        return this.LimitMemory;
    }

    /**
     * Set <p>Maximum number of memory requests.</p>
     * @param LimitMemory <p>Maximum number of memory requests.</p>
     */
    public void setLimitMemory(Long LimitMemory) {
        this.LimitMemory = LimitMemory;
    }

    /**
     * Get <p>Service name, for example, HIVE.</p> 
     * @return Service <p>Service name, for example, HIVE.</p>
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>Service name, for example, HIVE.</p>
     * @param Service <p>Service name, for example, HIVE.</p>
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>Data volume directory settings.</p> 
     * @return VolumeDir <p>Data volume directory settings.</p>
     */
    public VolumeSetting getVolumeDir() {
        return this.VolumeDir;
    }

    /**
     * Set <p>Data volume directory settings.</p>
     * @param VolumeDir <p>Data volume directory settings.</p>
     */
    public void setVolumeDir(VolumeSetting VolumeDir) {
        this.VolumeDir = VolumeDir;
    }

    /**
     * Get <p>External access settings for the component.</p> 
     * @return ExternalAccess <p>External access settings for the component.</p>
     */
    public ExternalAccess getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set <p>External access settings for the component.</p>
     * @param ExternalAccess <p>External access settings for the component.</p>
     */
    public void setExternalAccess(ExternalAccess ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    /**
     * Get <p>Node affinity settings.</p> 
     * @return Affinity <p>Node affinity settings.</p>
     */
    public NodeAffinity getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>Node affinity settings.</p>
     * @param Affinity <p>Node affinity settings.</p>
     */
    public void setAffinity(NodeAffinity Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get <p>Selected data disk information.</p> 
     * @return Disks <p>Selected data disk information.</p>
     */
    public Disk [] getDisks() {
        return this.Disks;
    }

    /**
     * Set <p>Selected data disk information.</p>
     * @param Disks <p>Selected data disk information.</p>
     */
    public void setDisks(Disk [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get <p>Toleration.</p> 
     * @return Tolerations <p>Toleration.</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Toleration.</p>
     * @param Tolerations <p>Toleration.</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>Pod affinity.</p> 
     * @return PodAffinity <p>Pod affinity.</p>
     */
    public PodAffinitySpec getPodAffinity() {
        return this.PodAffinity;
    }

    /**
     * Set <p>Pod affinity.</p>
     * @param PodAffinity <p>Pod affinity.</p>
     */
    public void setPodAffinity(PodAffinitySpec PodAffinity) {
        this.PodAffinity = PodAffinity;
    }

    /**
     * Get <p>Pod anti-affinity.</p> 
     * @return PodAntiAffinity <p>Pod anti-affinity.</p>
     */
    public PodAffinitySpec getPodAntiAffinity() {
        return this.PodAntiAffinity;
    }

    /**
     * Set <p>Pod anti-affinity.</p>
     * @param PodAntiAffinity <p>Pod anti-affinity.</p>
     */
    public void setPodAntiAffinity(PodAffinitySpec PodAntiAffinity) {
        this.PodAntiAffinity = PodAntiAffinity;
    }

    /**
     * Get <p>Topology distribution constraint.</p> 
     * @return TopologySpreadConstraints <p>Topology distribution constraint.</p>
     */
    public TopologySpreadConstraint [] getTopologySpreadConstraints() {
        return this.TopologySpreadConstraints;
    }

    /**
     * Set <p>Topology distribution constraint.</p>
     * @param TopologySpreadConstraints <p>Topology distribution constraint.</p>
     */
    public void setTopologySpreadConstraints(TopologySpreadConstraint [] TopologySpreadConstraints) {
        this.TopologySpreadConstraints = TopologySpreadConstraints;
    }

    /**
     * Get <p>Pod tag.</p> 
     * @return PodLabels <p>Pod tag.</p>
     */
    public StringMap [] getPodLabels() {
        return this.PodLabels;
    }

    /**
     * Set <p>Pod tag.</p>
     * @param PodLabels <p>Pod tag.</p>
     */
    public void setPodLabels(StringMap [] PodLabels) {
        this.PodLabels = PodLabels;
    }

    /**
     * Get <p>Whether the default Ray cluster is created.</p> 
     * @return EnableDefaultRayCluster <p>Whether the default Ray cluster is created.</p>
     */
    public Boolean getEnableDefaultRayCluster() {
        return this.EnableDefaultRayCluster;
    }

    /**
     * Set <p>Whether the default Ray cluster is created.</p>
     * @param EnableDefaultRayCluster <p>Whether the default Ray cluster is created.</p>
     */
    public void setEnableDefaultRayCluster(Boolean EnableDefaultRayCluster) {
        this.EnableDefaultRayCluster = EnableDefaultRayCluster;
    }

    /**
     * Get <p>Custom image.</p> 
     * @return ImageInfoV2 <p>Custom image.</p>
     */
    public ImageInfoV2 getImageInfoV2() {
        return this.ImageInfoV2;
    }

    /**
     * Set <p>Custom image.</p>
     * @param ImageInfoV2 <p>Custom image.</p>
     */
    public void setImageInfoV2(ImageInfoV2 ImageInfoV2) {
        this.ImageInfoV2 = ImageInfoV2;
    }

    /**
     * Get <p>Specifies the dynamic instance parameter to be created.</p> 
     * @return DynamicInstanceForm <p>Specifies the dynamic instance parameter to be created.</p>
     */
    public DynamicInstanceForm getDynamicInstanceForm() {
        return this.DynamicInstanceForm;
    }

    /**
     * Set <p>Specifies the dynamic instance parameter to be created.</p>
     * @param DynamicInstanceForm <p>Specifies the dynamic instance parameter to be created.</p>
     */
    public void setDynamicInstanceForm(DynamicInstanceForm DynamicInstanceForm) {
        this.DynamicInstanceForm = DynamicInstanceForm;
    }

    public CloudResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudResource(CloudResource source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.PodNumber != null) {
            this.PodNumber = new Long(source.PodNumber);
        }
        if (source.LimitCpu != null) {
            this.LimitCpu = new Long(source.LimitCpu);
        }
        if (source.LimitMemory != null) {
            this.LimitMemory = new Long(source.LimitMemory);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.VolumeDir != null) {
            this.VolumeDir = new VolumeSetting(source.VolumeDir);
        }
        if (source.ExternalAccess != null) {
            this.ExternalAccess = new ExternalAccess(source.ExternalAccess);
        }
        if (source.Affinity != null) {
            this.Affinity = new NodeAffinity(source.Affinity);
        }
        if (source.Disks != null) {
            this.Disks = new Disk[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new Disk(source.Disks[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.PodAffinity != null) {
            this.PodAffinity = new PodAffinitySpec(source.PodAffinity);
        }
        if (source.PodAntiAffinity != null) {
            this.PodAntiAffinity = new PodAffinitySpec(source.PodAntiAffinity);
        }
        if (source.TopologySpreadConstraints != null) {
            this.TopologySpreadConstraints = new TopologySpreadConstraint[source.TopologySpreadConstraints.length];
            for (int i = 0; i < source.TopologySpreadConstraints.length; i++) {
                this.TopologySpreadConstraints[i] = new TopologySpreadConstraint(source.TopologySpreadConstraints[i]);
            }
        }
        if (source.PodLabels != null) {
            this.PodLabels = new StringMap[source.PodLabels.length];
            for (int i = 0; i < source.PodLabels.length; i++) {
                this.PodLabels[i] = new StringMap(source.PodLabels[i]);
            }
        }
        if (source.EnableDefaultRayCluster != null) {
            this.EnableDefaultRayCluster = new Boolean(source.EnableDefaultRayCluster);
        }
        if (source.ImageInfoV2 != null) {
            this.ImageInfoV2 = new ImageInfoV2(source.ImageInfoV2);
        }
        if (source.DynamicInstanceForm != null) {
            this.DynamicInstanceForm = new DynamicInstanceForm(source.DynamicInstanceForm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "PodNumber", this.PodNumber);
        this.setParamSimple(map, prefix + "LimitCpu", this.LimitCpu);
        this.setParamSimple(map, prefix + "LimitMemory", this.LimitMemory);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamObj(map, prefix + "VolumeDir.", this.VolumeDir);
        this.setParamObj(map, prefix + "ExternalAccess.", this.ExternalAccess);
        this.setParamObj(map, prefix + "Affinity.", this.Affinity);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamObj(map, prefix + "PodAffinity.", this.PodAffinity);
        this.setParamObj(map, prefix + "PodAntiAffinity.", this.PodAntiAffinity);
        this.setParamArrayObj(map, prefix + "TopologySpreadConstraints.", this.TopologySpreadConstraints);
        this.setParamArrayObj(map, prefix + "PodLabels.", this.PodLabels);
        this.setParamSimple(map, prefix + "EnableDefaultRayCluster", this.EnableDefaultRayCluster);
        this.setParamObj(map, prefix + "ImageInfoV2.", this.ImageInfoV2);
        this.setParamObj(map, prefix + "DynamicInstanceForm.", this.DynamicInstanceForm);

    }
}

