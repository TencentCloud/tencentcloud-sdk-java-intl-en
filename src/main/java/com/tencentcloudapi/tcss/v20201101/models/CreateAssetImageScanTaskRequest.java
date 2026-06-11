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

public class CreateAssetImageScanTaskRequest extends AbstractModel {

    /**
    * <p>Whether to scan all images; select one from all images, image list, and filter by condition.</p>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>List of images to scan; choose one from all images, image list, and filter by condition.</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>Scan vulnerabilities; select one from vulnerability, Trojan, and risk.</p>
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * <p>Scan for trojans; select either vulnerability, Trojan or risk.</p>
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * <p>Scan risk; select one from vulnerability, Trojan, and risk.</p>
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * <p>Filter images by conditions; select one from all images, image list, and filter by condition.</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>Filter images by conditions and exclude individual images</p>
    */
    @SerializedName("ExcludeImageIds")
    @Expose
    private String [] ExcludeImageIds;

    /**
    * <p>Whether the image has running containers</p>
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * <p>Scan range 0 all authorized images, 1 selected images, 2 recommended scan, 3 cluster scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * <p>Task timeout duration unit seconds, default 1 hour.</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>One-click scan task. Default false indicates non-one-click scan, true one-click scan.</p>
    */
    @SerializedName("IsOneClickScanningTask")
    @Expose
    private Boolean IsOneClickScanningTask;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
     * Get <p>Whether to scan all images; select one from all images, image list, and filter by condition.</p> 
     * @return All <p>Whether to scan all images; select one from all images, image list, and filter by condition.</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>Whether to scan all images; select one from all images, image list, and filter by condition.</p>
     * @param All <p>Whether to scan all images; select one from all images, image list, and filter by condition.</p>
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>List of images to scan; choose one from all images, image list, and filter by condition.</p> 
     * @return Images <p>List of images to scan; choose one from all images, image list, and filter by condition.</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>List of images to scan; choose one from all images, image list, and filter by condition.</p>
     * @param Images <p>List of images to scan; choose one from all images, image list, and filter by condition.</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Scan vulnerabilities; select one from vulnerability, Trojan, and risk.</p> 
     * @return ScanVul <p>Scan vulnerabilities; select one from vulnerability, Trojan, and risk.</p>
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set <p>Scan vulnerabilities; select one from vulnerability, Trojan, and risk.</p>
     * @param ScanVul <p>Scan vulnerabilities; select one from vulnerability, Trojan, and risk.</p>
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get <p>Scan for trojans; select either vulnerability, Trojan or risk.</p> 
     * @return ScanVirus <p>Scan for trojans; select either vulnerability, Trojan or risk.</p>
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set <p>Scan for trojans; select either vulnerability, Trojan or risk.</p>
     * @param ScanVirus <p>Scan for trojans; select either vulnerability, Trojan or risk.</p>
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get <p>Scan risk; select one from vulnerability, Trojan, and risk.</p> 
     * @return ScanRisk <p>Scan risk; select one from vulnerability, Trojan, and risk.</p>
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set <p>Scan risk; select one from vulnerability, Trojan, and risk.</p>
     * @param ScanRisk <p>Scan risk; select one from vulnerability, Trojan, and risk.</p>
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get <p>Filter images by conditions; select one from all images, image list, and filter by condition.</p> 
     * @return Filters <p>Filter images by conditions; select one from all images, image list, and filter by condition.</p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter images by conditions; select one from all images, image list, and filter by condition.</p>
     * @param Filters <p>Filter images by conditions; select one from all images, image list, and filter by condition.</p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Filter images by conditions and exclude individual images</p> 
     * @return ExcludeImageIds <p>Filter images by conditions and exclude individual images</p>
     */
    public String [] getExcludeImageIds() {
        return this.ExcludeImageIds;
    }

    /**
     * Set <p>Filter images by conditions and exclude individual images</p>
     * @param ExcludeImageIds <p>Filter images by conditions and exclude individual images</p>
     */
    public void setExcludeImageIds(String [] ExcludeImageIds) {
        this.ExcludeImageIds = ExcludeImageIds;
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
     * Get <p>Scan range 0 all authorized images, 1 selected images, 2 recommended scan, 3 cluster scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p> 
     * @return ScanScope <p>Scan range 0 all authorized images, 1 selected images, 2 recommended scan, 3 cluster scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set <p>Scan range 0 all authorized images, 1 selected images, 2 recommended scan, 3 cluster scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
     * @param ScanScope <p>Scan range 0 all authorized images, 1 selected images, 2 recommended scan, 3 cluster scan</p><p>Value ranges from 0 to 3</p><p>Default value: 0</p>
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get <p>Task timeout duration unit seconds, default 1 hour.</p> 
     * @return Timeout <p>Task timeout duration unit seconds, default 1 hour.</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Task timeout duration unit seconds, default 1 hour.</p>
     * @param Timeout <p>Task timeout duration unit seconds, default 1 hour.</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>One-click scan task. Default false indicates non-one-click scan, true one-click scan.</p> 
     * @return IsOneClickScanningTask <p>One-click scan task. Default false indicates non-one-click scan, true one-click scan.</p>
     */
    public Boolean getIsOneClickScanningTask() {
        return this.IsOneClickScanningTask;
    }

    /**
     * Set <p>One-click scan task. Default false indicates non-one-click scan, true one-click scan.</p>
     * @param IsOneClickScanningTask <p>One-click scan task. Default false indicates non-one-click scan, true one-click scan.</p>
     */
    public void setIsOneClickScanningTask(Boolean IsOneClickScanningTask) {
        this.IsOneClickScanningTask = IsOneClickScanningTask;
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

    public CreateAssetImageScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageScanTaskRequest(CreateAssetImageScanTaskRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageIds != null) {
            this.ExcludeImageIds = new String[source.ExcludeImageIds.length];
            for (int i = 0; i < source.ExcludeImageIds.length; i++) {
                this.ExcludeImageIds[i] = new String(source.ExcludeImageIds[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.IsOneClickScanningTask != null) {
            this.IsOneClickScanningTask = new Boolean(source.IsOneClickScanningTask);
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
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeImageIds.", this.ExcludeImageIds);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "IsOneClickScanningTask", this.IsOneClickScanningTask);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);

    }
}

