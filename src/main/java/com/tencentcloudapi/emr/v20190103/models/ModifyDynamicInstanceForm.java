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

public class ModifyDynamicInstanceForm extends AbstractModel {

    /**
    * <p>Update scope:<br>1: Add a worker group (DynamicInstance level)<br>2: Update storage configuration (DynamicInstance level)<br>3: Update tag configuration (DynamicInstance level)<br>4: Update advanced configuration (DynamicInstance level)<br>5: Update PodCpu and PodMem (DynamicInstance-group level)<br>6: Update PodNum, MinPodNum, and MaxPodNum (DynamicInstance-group level)<br>7: Update storage configuration (DynamicInstance-group level)<br>8: Update tag configuration (DynamicInstance-group level)</p>
    */
    @SerializedName("ModifyScope")
    @Expose
    private Long ModifyScope;

    /**
    * <p>Added worker group information.</p>
    */
    @SerializedName("AddDynamicInstanceGroup")
    @Expose
    private DynamicInstanceGroup AddDynamicInstanceGroup;

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
    * <p>CFS storage volume list, excluding the CFS Turbo list.</p>
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
    * <p>Dependent external components.</p>
    */
    @SerializedName("DependServices")
    @Expose
    private DependService [] DependServices;

    /**
    * <p>Whether to generate a new token for authentication.</p>
    */
    @SerializedName("SupportNewToken")
    @Expose
    private Boolean SupportNewToken;

    /**
    * <p>Update information at the DynamicInstance-group level.</p>
    */
    @SerializedName("ModifyDynamicInstanceGroup")
    @Expose
    private DynamicInstanceGroup ModifyDynamicInstanceGroup;

    /**
    * <p>CFS Turbo mount list, excluding the standard edition.</p>
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
    * <p>Custom image.</p>
    */
    @SerializedName("CustomImage")
    @Expose
    private CustomImage CustomImage;

    /**
    * <p>Custom image.</p>
    */
    @SerializedName("ImageInfoV2")
    @Expose
    private ImageInfoV2 ImageInfoV2;

    /**
    * <p>GooseFS disk.</p>
    */
    @SerializedName("GooseFSVolumes")
    @Expose
    private GooseFSVolume [] GooseFSVolumes;

    /**
    * <p>Whether to enable log collection.</p>
    */
    @SerializedName("EnableHistoryServer")
    @Expose
    private Boolean EnableHistoryServer;

    /**
     * Get <p>Update scope:<br>1: Add a worker group (DynamicInstance level)<br>2: Update storage configuration (DynamicInstance level)<br>3: Update tag configuration (DynamicInstance level)<br>4: Update advanced configuration (DynamicInstance level)<br>5: Update PodCpu and PodMem (DynamicInstance-group level)<br>6: Update PodNum, MinPodNum, and MaxPodNum (DynamicInstance-group level)<br>7: Update storage configuration (DynamicInstance-group level)<br>8: Update tag configuration (DynamicInstance-group level)</p> 
     * @return ModifyScope <p>Update scope:<br>1: Add a worker group (DynamicInstance level)<br>2: Update storage configuration (DynamicInstance level)<br>3: Update tag configuration (DynamicInstance level)<br>4: Update advanced configuration (DynamicInstance level)<br>5: Update PodCpu and PodMem (DynamicInstance-group level)<br>6: Update PodNum, MinPodNum, and MaxPodNum (DynamicInstance-group level)<br>7: Update storage configuration (DynamicInstance-group level)<br>8: Update tag configuration (DynamicInstance-group level)</p>
     */
    public Long getModifyScope() {
        return this.ModifyScope;
    }

    /**
     * Set <p>Update scope:<br>1: Add a worker group (DynamicInstance level)<br>2: Update storage configuration (DynamicInstance level)<br>3: Update tag configuration (DynamicInstance level)<br>4: Update advanced configuration (DynamicInstance level)<br>5: Update PodCpu and PodMem (DynamicInstance-group level)<br>6: Update PodNum, MinPodNum, and MaxPodNum (DynamicInstance-group level)<br>7: Update storage configuration (DynamicInstance-group level)<br>8: Update tag configuration (DynamicInstance-group level)</p>
     * @param ModifyScope <p>Update scope:<br>1: Add a worker group (DynamicInstance level)<br>2: Update storage configuration (DynamicInstance level)<br>3: Update tag configuration (DynamicInstance level)<br>4: Update advanced configuration (DynamicInstance level)<br>5: Update PodCpu and PodMem (DynamicInstance-group level)<br>6: Update PodNum, MinPodNum, and MaxPodNum (DynamicInstance-group level)<br>7: Update storage configuration (DynamicInstance-group level)<br>8: Update tag configuration (DynamicInstance-group level)</p>
     */
    public void setModifyScope(Long ModifyScope) {
        this.ModifyScope = ModifyScope;
    }

    /**
     * Get <p>Added worker group information.</p> 
     * @return AddDynamicInstanceGroup <p>Added worker group information.</p>
     */
    public DynamicInstanceGroup getAddDynamicInstanceGroup() {
        return this.AddDynamicInstanceGroup;
    }

    /**
     * Set <p>Added worker group information.</p>
     * @param AddDynamicInstanceGroup <p>Added worker group information.</p>
     */
    public void setAddDynamicInstanceGroup(DynamicInstanceGroup AddDynamicInstanceGroup) {
        this.AddDynamicInstanceGroup = AddDynamicInstanceGroup;
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
     * Get <p>CFS storage volume list, excluding the CFS Turbo list.</p> 
     * @return CFSVolumes <p>CFS storage volume list, excluding the CFS Turbo list.</p>
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>CFS storage volume list, excluding the CFS Turbo list.</p>
     * @param CFSVolumes <p>CFS storage volume list, excluding the CFS Turbo list.</p>
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
     * Get <p>Dependent external components.</p> 
     * @return DependServices <p>Dependent external components.</p>
     */
    public DependService [] getDependServices() {
        return this.DependServices;
    }

    /**
     * Set <p>Dependent external components.</p>
     * @param DependServices <p>Dependent external components.</p>
     */
    public void setDependServices(DependService [] DependServices) {
        this.DependServices = DependServices;
    }

    /**
     * Get <p>Whether to generate a new token for authentication.</p> 
     * @return SupportNewToken <p>Whether to generate a new token for authentication.</p>
     */
    public Boolean getSupportNewToken() {
        return this.SupportNewToken;
    }

    /**
     * Set <p>Whether to generate a new token for authentication.</p>
     * @param SupportNewToken <p>Whether to generate a new token for authentication.</p>
     */
    public void setSupportNewToken(Boolean SupportNewToken) {
        this.SupportNewToken = SupportNewToken;
    }

    /**
     * Get <p>Update information at the DynamicInstance-group level.</p> 
     * @return ModifyDynamicInstanceGroup <p>Update information at the DynamicInstance-group level.</p>
     */
    public DynamicInstanceGroup getModifyDynamicInstanceGroup() {
        return this.ModifyDynamicInstanceGroup;
    }

    /**
     * Set <p>Update information at the DynamicInstance-group level.</p>
     * @param ModifyDynamicInstanceGroup <p>Update information at the DynamicInstance-group level.</p>
     */
    public void setModifyDynamicInstanceGroup(DynamicInstanceGroup ModifyDynamicInstanceGroup) {
        this.ModifyDynamicInstanceGroup = ModifyDynamicInstanceGroup;
    }

    /**
     * Get <p>CFS Turbo mount list, excluding the standard edition.</p> 
     * @return CFSTurboVolumes <p>CFS Turbo mount list, excluding the standard edition.</p>
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>CFS Turbo mount list, excluding the standard edition.</p>
     * @param CFSTurboVolumes <p>CFS Turbo mount list, excluding the standard edition.</p>
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    /**
     * Get <p>Custom image.</p> 
     * @return CustomImage <p>Custom image.</p>
     */
    public CustomImage getCustomImage() {
        return this.CustomImage;
    }

    /**
     * Set <p>Custom image.</p>
     * @param CustomImage <p>Custom image.</p>
     */
    public void setCustomImage(CustomImage CustomImage) {
        this.CustomImage = CustomImage;
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
     * Get <p>Whether to enable log collection.</p> 
     * @return EnableHistoryServer <p>Whether to enable log collection.</p>
     */
    public Boolean getEnableHistoryServer() {
        return this.EnableHistoryServer;
    }

    /**
     * Set <p>Whether to enable log collection.</p>
     * @param EnableHistoryServer <p>Whether to enable log collection.</p>
     */
    public void setEnableHistoryServer(Boolean EnableHistoryServer) {
        this.EnableHistoryServer = EnableHistoryServer;
    }

    public ModifyDynamicInstanceForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDynamicInstanceForm(ModifyDynamicInstanceForm source) {
        if (source.ModifyScope != null) {
            this.ModifyScope = new Long(source.ModifyScope);
        }
        if (source.AddDynamicInstanceGroup != null) {
            this.AddDynamicInstanceGroup = new DynamicInstanceGroup(source.AddDynamicInstanceGroup);
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
        if (source.DependServices != null) {
            this.DependServices = new DependService[source.DependServices.length];
            for (int i = 0; i < source.DependServices.length; i++) {
                this.DependServices[i] = new DependService(source.DependServices[i]);
            }
        }
        if (source.SupportNewToken != null) {
            this.SupportNewToken = new Boolean(source.SupportNewToken);
        }
        if (source.ModifyDynamicInstanceGroup != null) {
            this.ModifyDynamicInstanceGroup = new DynamicInstanceGroup(source.ModifyDynamicInstanceGroup);
        }
        if (source.CFSTurboVolumes != null) {
            this.CFSTurboVolumes = new CFSTurboVolume[source.CFSTurboVolumes.length];
            for (int i = 0; i < source.CFSTurboVolumes.length; i++) {
                this.CFSTurboVolumes[i] = new CFSTurboVolume(source.CFSTurboVolumes[i]);
            }
        }
        if (source.CustomImage != null) {
            this.CustomImage = new CustomImage(source.CustomImage);
        }
        if (source.ImageInfoV2 != null) {
            this.ImageInfoV2 = new ImageInfoV2(source.ImageInfoV2);
        }
        if (source.GooseFSVolumes != null) {
            this.GooseFSVolumes = new GooseFSVolume[source.GooseFSVolumes.length];
            for (int i = 0; i < source.GooseFSVolumes.length; i++) {
                this.GooseFSVolumes[i] = new GooseFSVolume(source.GooseFSVolumes[i]);
            }
        }
        if (source.EnableHistoryServer != null) {
            this.EnableHistoryServer = new Boolean(source.EnableHistoryServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyScope", this.ModifyScope);
        this.setParamObj(map, prefix + "AddDynamicInstanceGroup.", this.AddDynamicInstanceGroup);
        this.setParamSimple(map, prefix + "SupportPV", this.SupportPV);
        this.setParamArrayObj(map, prefix + "CBSVolumes.", this.CBSVolumes);
        this.setParamArrayObj(map, prefix + "CFSVolumes.", this.CFSVolumes);
        this.setParamArrayObj(map, prefix + "COSVolumes.", this.COSVolumes);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "DependServices.", this.DependServices);
        this.setParamSimple(map, prefix + "SupportNewToken", this.SupportNewToken);
        this.setParamObj(map, prefix + "ModifyDynamicInstanceGroup.", this.ModifyDynamicInstanceGroup);
        this.setParamArrayObj(map, prefix + "CFSTurboVolumes.", this.CFSTurboVolumes);
        this.setParamObj(map, prefix + "CustomImage.", this.CustomImage);
        this.setParamObj(map, prefix + "ImageInfoV2.", this.ImageInfoV2);
        this.setParamArrayObj(map, prefix + "GooseFSVolumes.", this.GooseFSVolumes);
        this.setParamSimple(map, prefix + "EnableHistoryServer", this.EnableHistoryServer);

    }
}

