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

public class PersistentVolume extends AbstractModel {

    /**
    * <p>CBS storage volume.</p>
    */
    @SerializedName("CBSVolumes")
    @Expose
    private CBSVolume [] CBSVolumes;

    /**
    * <p>CFS storage volume.</p>
    */
    @SerializedName("CFSVolumes")
    @Expose
    private CFSVolume [] CFSVolumes;

    /**
    * <p>COS storage volume.</p>
    */
    @SerializedName("COSVolumes")
    @Expose
    private COSVolume [] COSVolumes;

    /**
    * <p>Storage volume name (the YAML submission has no storage volume type).</p>
    */
    @SerializedName("StorageVolumeName")
    @Expose
    private String [] StorageVolumeName;

    /**
    * <p>Storage volume list.</p>
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * <p>Storage volume details.</p>
    */
    @SerializedName("StorageVolumeDetail")
    @Expose
    private StorageVolumeDetail [] StorageVolumeDetail;

    /**
    * <p>CFS Turbo storage volume.</p>
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
    * <p>GooseFS volume mount information.</p>
    */
    @SerializedName("GooseFSVolumes")
    @Expose
    private GooseFSVolume [] GooseFSVolumes;

    /**
     * Get <p>CBS storage volume.</p> 
     * @return CBSVolumes <p>CBS storage volume.</p>
     */
    public CBSVolume [] getCBSVolumes() {
        return this.CBSVolumes;
    }

    /**
     * Set <p>CBS storage volume.</p>
     * @param CBSVolumes <p>CBS storage volume.</p>
     */
    public void setCBSVolumes(CBSVolume [] CBSVolumes) {
        this.CBSVolumes = CBSVolumes;
    }

    /**
     * Get <p>CFS storage volume.</p> 
     * @return CFSVolumes <p>CFS storage volume.</p>
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>CFS storage volume.</p>
     * @param CFSVolumes <p>CFS storage volume.</p>
     */
    public void setCFSVolumes(CFSVolume [] CFSVolumes) {
        this.CFSVolumes = CFSVolumes;
    }

    /**
     * Get <p>COS storage volume.</p> 
     * @return COSVolumes <p>COS storage volume.</p>
     */
    public COSVolume [] getCOSVolumes() {
        return this.COSVolumes;
    }

    /**
     * Set <p>COS storage volume.</p>
     * @param COSVolumes <p>COS storage volume.</p>
     */
    public void setCOSVolumes(COSVolume [] COSVolumes) {
        this.COSVolumes = COSVolumes;
    }

    /**
     * Get <p>Storage volume name (the YAML submission has no storage volume type).</p> 
     * @return StorageVolumeName <p>Storage volume name (the YAML submission has no storage volume type).</p>
     */
    public String [] getStorageVolumeName() {
        return this.StorageVolumeName;
    }

    /**
     * Set <p>Storage volume name (the YAML submission has no storage volume type).</p>
     * @param StorageVolumeName <p>Storage volume name (the YAML submission has no storage volume type).</p>
     */
    public void setStorageVolumeName(String [] StorageVolumeName) {
        this.StorageVolumeName = StorageVolumeName;
    }

    /**
     * Get <p>Storage volume list.</p> 
     * @return VolumeMounts <p>Storage volume list.</p>
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>Storage volume list.</p>
     * @param VolumeMounts <p>Storage volume list.</p>
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get <p>Storage volume details.</p> 
     * @return StorageVolumeDetail <p>Storage volume details.</p>
     */
    public StorageVolumeDetail [] getStorageVolumeDetail() {
        return this.StorageVolumeDetail;
    }

    /**
     * Set <p>Storage volume details.</p>
     * @param StorageVolumeDetail <p>Storage volume details.</p>
     */
    public void setStorageVolumeDetail(StorageVolumeDetail [] StorageVolumeDetail) {
        this.StorageVolumeDetail = StorageVolumeDetail;
    }

    /**
     * Get <p>CFS Turbo storage volume.</p> 
     * @return CFSTurboVolumes <p>CFS Turbo storage volume.</p>
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>CFS Turbo storage volume.</p>
     * @param CFSTurboVolumes <p>CFS Turbo storage volume.</p>
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    /**
     * Get <p>GooseFS volume mount information.</p> 
     * @return GooseFSVolumes <p>GooseFS volume mount information.</p>
     */
    public GooseFSVolume [] getGooseFSVolumes() {
        return this.GooseFSVolumes;
    }

    /**
     * Set <p>GooseFS volume mount information.</p>
     * @param GooseFSVolumes <p>GooseFS volume mount information.</p>
     */
    public void setGooseFSVolumes(GooseFSVolume [] GooseFSVolumes) {
        this.GooseFSVolumes = GooseFSVolumes;
    }

    public PersistentVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersistentVolume(PersistentVolume source) {
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
        if (source.StorageVolumeName != null) {
            this.StorageVolumeName = new String[source.StorageVolumeName.length];
            for (int i = 0; i < source.StorageVolumeName.length; i++) {
                this.StorageVolumeName[i] = new String(source.StorageVolumeName[i]);
            }
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
        if (source.StorageVolumeDetail != null) {
            this.StorageVolumeDetail = new StorageVolumeDetail[source.StorageVolumeDetail.length];
            for (int i = 0; i < source.StorageVolumeDetail.length; i++) {
                this.StorageVolumeDetail[i] = new StorageVolumeDetail(source.StorageVolumeDetail[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CBSVolumes.", this.CBSVolumes);
        this.setParamArrayObj(map, prefix + "CFSVolumes.", this.CFSVolumes);
        this.setParamArrayObj(map, prefix + "COSVolumes.", this.COSVolumes);
        this.setParamArraySimple(map, prefix + "StorageVolumeName.", this.StorageVolumeName);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamArrayObj(map, prefix + "StorageVolumeDetail.", this.StorageVolumeDetail);
        this.setParamArrayObj(map, prefix + "CFSTurboVolumes.", this.CFSTurboVolumes);
        this.setParamArrayObj(map, prefix + "GooseFSVolumes.", this.GooseFSVolumes);

    }
}

