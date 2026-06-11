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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAssetImageScanSettingRequest extends AbstractModel {

    /**
    * <p>Switch.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Scan start time<br>01:00 Time Division</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>Scan cycle</p>
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * <p>Scan for trojans</p>
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * <p>Scan sensitive information</p>
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * <p>Scan for vulnerabilities</p>
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * <p>All images</p>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>Custom Image</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>Whether the image has running containers</p>
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * <p>Scan range 0 all authorized images, 1 select mirror, 2 recommended scan, 3 cluster filtering scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * <p>Scan end time<br>02:00 Time Division</p>
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * <p>Exclude mirror scan</p>
    */
    @SerializedName("ExcludeImages")
    @Expose
    private String [] ExcludeImages;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
     * Get <p>Switch.</p> 
     * @return Enable <p>Switch.</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Switch.</p>
     * @param Enable <p>Switch.</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Scan start time<br>01:00 Time Division</p> 
     * @return ScanTime <p>Scan start time<br>01:00 Time Division</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>Scan start time<br>01:00 Time Division</p>
     * @param ScanTime <p>Scan start time<br>01:00 Time Division</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>Scan cycle</p> 
     * @return ScanPeriod <p>Scan cycle</p>
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set <p>Scan cycle</p>
     * @param ScanPeriod <p>Scan cycle</p>
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get <p>Scan for trojans</p> 
     * @return ScanVirus <p>Scan for trojans</p>
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set <p>Scan for trojans</p>
     * @param ScanVirus <p>Scan for trojans</p>
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get <p>Scan sensitive information</p> 
     * @return ScanRisk <p>Scan sensitive information</p>
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set <p>Scan sensitive information</p>
     * @param ScanRisk <p>Scan sensitive information</p>
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get <p>Scan for vulnerabilities</p> 
     * @return ScanVul <p>Scan for vulnerabilities</p>
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set <p>Scan for vulnerabilities</p>
     * @param ScanVul <p>Scan for vulnerabilities</p>
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get <p>All images</p> 
     * @return All <p>All images</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>All images</p>
     * @param All <p>All images</p>
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>Custom Image</p> 
     * @return Images <p>Custom Image</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>Custom Image</p>
     * @param Images <p>Custom Image</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Whether the image has running containers</p> 
     * @return ContainerRunning <p>Whether the image has running containers</p>
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set <p>Whether the image has running containers</p>
     * @param ContainerRunning <p>Whether the image has running containers</p>
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get <p>Scan range 0 all authorized images, 1 select mirror, 2 recommended scan, 3 cluster filtering scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p> 
     * @return ScanScope <p>Scan range 0 all authorized images, 1 select mirror, 2 recommended scan, 3 cluster filtering scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set <p>Scan range 0 all authorized images, 1 select mirror, 2 recommended scan, 3 cluster filtering scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
     * @param ScanScope <p>Scan range 0 all authorized images, 1 select mirror, 2 recommended scan, 3 cluster filtering scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get <p>Scan end time<br>02:00 Time Division</p> 
     * @return ScanEndTime <p>Scan end time<br>02:00 Time Division</p>
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set <p>Scan end time<br>02:00 Time Division</p>
     * @param ScanEndTime <p>Scan end time<br>02:00 Time Division</p>
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get <p>Exclude mirror scan</p> 
     * @return ExcludeImages <p>Exclude mirror scan</p>
     */
    public String [] getExcludeImages() {
        return this.ExcludeImages;
    }

    /**
     * Set <p>Exclude mirror scan</p>
     * @param ExcludeImages <p>Exclude mirror scan</p>
     */
    public void setExcludeImages(String [] ExcludeImages) {
        this.ExcludeImages = ExcludeImages;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterIDs <p>Cluster ID.</p>
     */
    public String [] getClusterIDs() {
        return this.ClusterIDs;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterIDs <p>Cluster ID.</p>
     */
    public void setClusterIDs(String [] ClusterIDs) {
        this.ClusterIDs = ClusterIDs;
    }

    public CreateAssetImageScanSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageScanSettingRequest(CreateAssetImageScanSettingRequest source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.ExcludeImages != null) {
            this.ExcludeImages = new String[source.ExcludeImages.length];
            for (int i = 0; i < source.ExcludeImages.length; i++) {
                this.ExcludeImages[i] = new String(source.ExcludeImages[i]);
            }
        }
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamArraySimple(map, prefix + "ExcludeImages.", this.ExcludeImages);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);

    }
}

