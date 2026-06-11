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

public class CreateVulScanTaskRequest extends AbstractModel {

    /**
    * <p>Local image scan range type</p><p>Enumeration value:</p><ul><li>ALL: All local images</li><li>NOT_SCAN: All authorized unscanned local images</li><li>IMAGEIDS: Selected local image IDs</li><li>CLUSTER: Cluster filtering</li></ul>
    */
    @SerializedName("LocalImageScanType")
    @Expose
    private String LocalImageScanType;

    /**
    * <p>Scan by authorized local image IDs, which takes precedence over scanning by authorized local images that meet the conditions.</p>
    */
    @SerializedName("LocalImageIDs")
    @Expose
    private String [] LocalImageIDs;

    /**
    * <p>Repository image scan range type. ALL: All repository images. NOT_SCAN: Total authorized unscanned repository images. IMAGEIDS: Selected repository image IDs.</p>
    */
    @SerializedName("RegistryImageScanType")
    @Expose
    private String RegistryImageScanType;

    /**
    * <p>Scan by authorized repository image IDs, which takes precedence over scanning by authorized repository images that meet the conditions.</p>
    */
    @SerializedName("RegistryImageIDs")
    @Expose
    private Long [] RegistryImageIDs;

    /**
    * <p>Task ID for local image re-vulnerability scanning</p>
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * <p>Task ID for repository image re-vulnerability scanning</p>
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
    * <p>Local image container runtime</p>
    */
    @SerializedName("LocalImageContainerRunning")
    @Expose
    private Boolean LocalImageContainerRunning;

    /**
    * <p>Image Container in repository is running</p>
    */
    @SerializedName("RegistryImageContainerRunning")
    @Expose
    private Boolean RegistryImageContainerRunning;

    /**
    * <p>Whether the repository image is the latest</p>
    */
    @SerializedName("IsLatest")
    @Expose
    private Boolean IsLatest;

    /**
    * <p>Local image id to remove</p>
    */
    @SerializedName("ExcludeLocalImageIDs")
    @Expose
    private String [] ExcludeLocalImageIDs;

    /**
    * <p>id of the repository image to remove</p>
    */
    @SerializedName("ExcludeRegistryImageIDs")
    @Expose
    private Long [] ExcludeRegistryImageIDs;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("LocalClusterIDs")
    @Expose
    private String [] LocalClusterIDs;

    /**
     * Get <p>Local image scan range type</p><p>Enumeration value:</p><ul><li>ALL: All local images</li><li>NOT_SCAN: All authorized unscanned local images</li><li>IMAGEIDS: Selected local image IDs</li><li>CLUSTER: Cluster filtering</li></ul> 
     * @return LocalImageScanType <p>Local image scan range type</p><p>Enumeration value:</p><ul><li>ALL: All local images</li><li>NOT_SCAN: All authorized unscanned local images</li><li>IMAGEIDS: Selected local image IDs</li><li>CLUSTER: Cluster filtering</li></ul>
     */
    public String getLocalImageScanType() {
        return this.LocalImageScanType;
    }

    /**
     * Set <p>Local image scan range type</p><p>Enumeration value:</p><ul><li>ALL: All local images</li><li>NOT_SCAN: All authorized unscanned local images</li><li>IMAGEIDS: Selected local image IDs</li><li>CLUSTER: Cluster filtering</li></ul>
     * @param LocalImageScanType <p>Local image scan range type</p><p>Enumeration value:</p><ul><li>ALL: All local images</li><li>NOT_SCAN: All authorized unscanned local images</li><li>IMAGEIDS: Selected local image IDs</li><li>CLUSTER: Cluster filtering</li></ul>
     */
    public void setLocalImageScanType(String LocalImageScanType) {
        this.LocalImageScanType = LocalImageScanType;
    }

    /**
     * Get <p>Scan by authorized local image IDs, which takes precedence over scanning by authorized local images that meet the conditions.</p> 
     * @return LocalImageIDs <p>Scan by authorized local image IDs, which takes precedence over scanning by authorized local images that meet the conditions.</p>
     */
    public String [] getLocalImageIDs() {
        return this.LocalImageIDs;
    }

    /**
     * Set <p>Scan by authorized local image IDs, which takes precedence over scanning by authorized local images that meet the conditions.</p>
     * @param LocalImageIDs <p>Scan by authorized local image IDs, which takes precedence over scanning by authorized local images that meet the conditions.</p>
     */
    public void setLocalImageIDs(String [] LocalImageIDs) {
        this.LocalImageIDs = LocalImageIDs;
    }

    /**
     * Get <p>Repository image scan range type. ALL: All repository images. NOT_SCAN: Total authorized unscanned repository images. IMAGEIDS: Selected repository image IDs.</p> 
     * @return RegistryImageScanType <p>Repository image scan range type. ALL: All repository images. NOT_SCAN: Total authorized unscanned repository images. IMAGEIDS: Selected repository image IDs.</p>
     */
    public String getRegistryImageScanType() {
        return this.RegistryImageScanType;
    }

    /**
     * Set <p>Repository image scan range type. ALL: All repository images. NOT_SCAN: Total authorized unscanned repository images. IMAGEIDS: Selected repository image IDs.</p>
     * @param RegistryImageScanType <p>Repository image scan range type. ALL: All repository images. NOT_SCAN: Total authorized unscanned repository images. IMAGEIDS: Selected repository image IDs.</p>
     */
    public void setRegistryImageScanType(String RegistryImageScanType) {
        this.RegistryImageScanType = RegistryImageScanType;
    }

    /**
     * Get <p>Scan by authorized repository image IDs, which takes precedence over scanning by authorized repository images that meet the conditions.</p> 
     * @return RegistryImageIDs <p>Scan by authorized repository image IDs, which takes precedence over scanning by authorized repository images that meet the conditions.</p>
     */
    public Long [] getRegistryImageIDs() {
        return this.RegistryImageIDs;
    }

    /**
     * Set <p>Scan by authorized repository image IDs, which takes precedence over scanning by authorized repository images that meet the conditions.</p>
     * @param RegistryImageIDs <p>Scan by authorized repository image IDs, which takes precedence over scanning by authorized repository images that meet the conditions.</p>
     */
    public void setRegistryImageIDs(Long [] RegistryImageIDs) {
        this.RegistryImageIDs = RegistryImageIDs;
    }

    /**
     * Get <p>Task ID for local image re-vulnerability scanning</p> 
     * @return LocalTaskID <p>Task ID for local image re-vulnerability scanning</p>
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set <p>Task ID for local image re-vulnerability scanning</p>
     * @param LocalTaskID <p>Task ID for local image re-vulnerability scanning</p>
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get <p>Task ID for repository image re-vulnerability scanning</p> 
     * @return RegistryTaskID <p>Task ID for repository image re-vulnerability scanning</p>
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set <p>Task ID for repository image re-vulnerability scanning</p>
     * @param RegistryTaskID <p>Task ID for repository image re-vulnerability scanning</p>
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    /**
     * Get <p>Local image container runtime</p> 
     * @return LocalImageContainerRunning <p>Local image container runtime</p>
     */
    public Boolean getLocalImageContainerRunning() {
        return this.LocalImageContainerRunning;
    }

    /**
     * Set <p>Local image container runtime</p>
     * @param LocalImageContainerRunning <p>Local image container runtime</p>
     */
    public void setLocalImageContainerRunning(Boolean LocalImageContainerRunning) {
        this.LocalImageContainerRunning = LocalImageContainerRunning;
    }

    /**
     * Get <p>Image Container in repository is running</p> 
     * @return RegistryImageContainerRunning <p>Image Container in repository is running</p>
     */
    public Boolean getRegistryImageContainerRunning() {
        return this.RegistryImageContainerRunning;
    }

    /**
     * Set <p>Image Container in repository is running</p>
     * @param RegistryImageContainerRunning <p>Image Container in repository is running</p>
     */
    public void setRegistryImageContainerRunning(Boolean RegistryImageContainerRunning) {
        this.RegistryImageContainerRunning = RegistryImageContainerRunning;
    }

    /**
     * Get <p>Whether the repository image is the latest</p> 
     * @return IsLatest <p>Whether the repository image is the latest</p>
     */
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    /**
     * Set <p>Whether the repository image is the latest</p>
     * @param IsLatest <p>Whether the repository image is the latest</p>
     */
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    /**
     * Get <p>Local image id to remove</p> 
     * @return ExcludeLocalImageIDs <p>Local image id to remove</p>
     */
    public String [] getExcludeLocalImageIDs() {
        return this.ExcludeLocalImageIDs;
    }

    /**
     * Set <p>Local image id to remove</p>
     * @param ExcludeLocalImageIDs <p>Local image id to remove</p>
     */
    public void setExcludeLocalImageIDs(String [] ExcludeLocalImageIDs) {
        this.ExcludeLocalImageIDs = ExcludeLocalImageIDs;
    }

    /**
     * Get <p>id of the repository image to remove</p> 
     * @return ExcludeRegistryImageIDs <p>id of the repository image to remove</p>
     */
    public Long [] getExcludeRegistryImageIDs() {
        return this.ExcludeRegistryImageIDs;
    }

    /**
     * Set <p>id of the repository image to remove</p>
     * @param ExcludeRegistryImageIDs <p>id of the repository image to remove</p>
     */
    public void setExcludeRegistryImageIDs(Long [] ExcludeRegistryImageIDs) {
        this.ExcludeRegistryImageIDs = ExcludeRegistryImageIDs;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return LocalClusterIDs <p>Cluster ID.</p>
     */
    public String [] getLocalClusterIDs() {
        return this.LocalClusterIDs;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param LocalClusterIDs <p>Cluster ID.</p>
     */
    public void setLocalClusterIDs(String [] LocalClusterIDs) {
        this.LocalClusterIDs = LocalClusterIDs;
    }

    public CreateVulScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulScanTaskRequest(CreateVulScanTaskRequest source) {
        if (source.LocalImageScanType != null) {
            this.LocalImageScanType = new String(source.LocalImageScanType);
        }
        if (source.LocalImageIDs != null) {
            this.LocalImageIDs = new String[source.LocalImageIDs.length];
            for (int i = 0; i < source.LocalImageIDs.length; i++) {
                this.LocalImageIDs[i] = new String(source.LocalImageIDs[i]);
            }
        }
        if (source.RegistryImageScanType != null) {
            this.RegistryImageScanType = new String(source.RegistryImageScanType);
        }
        if (source.RegistryImageIDs != null) {
            this.RegistryImageIDs = new Long[source.RegistryImageIDs.length];
            for (int i = 0; i < source.RegistryImageIDs.length; i++) {
                this.RegistryImageIDs[i] = new Long(source.RegistryImageIDs[i]);
            }
        }
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
        if (source.LocalImageContainerRunning != null) {
            this.LocalImageContainerRunning = new Boolean(source.LocalImageContainerRunning);
        }
        if (source.RegistryImageContainerRunning != null) {
            this.RegistryImageContainerRunning = new Boolean(source.RegistryImageContainerRunning);
        }
        if (source.IsLatest != null) {
            this.IsLatest = new Boolean(source.IsLatest);
        }
        if (source.ExcludeLocalImageIDs != null) {
            this.ExcludeLocalImageIDs = new String[source.ExcludeLocalImageIDs.length];
            for (int i = 0; i < source.ExcludeLocalImageIDs.length; i++) {
                this.ExcludeLocalImageIDs[i] = new String(source.ExcludeLocalImageIDs[i]);
            }
        }
        if (source.ExcludeRegistryImageIDs != null) {
            this.ExcludeRegistryImageIDs = new Long[source.ExcludeRegistryImageIDs.length];
            for (int i = 0; i < source.ExcludeRegistryImageIDs.length; i++) {
                this.ExcludeRegistryImageIDs[i] = new Long(source.ExcludeRegistryImageIDs[i]);
            }
        }
        if (source.LocalClusterIDs != null) {
            this.LocalClusterIDs = new String[source.LocalClusterIDs.length];
            for (int i = 0; i < source.LocalClusterIDs.length; i++) {
                this.LocalClusterIDs[i] = new String(source.LocalClusterIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalImageScanType", this.LocalImageScanType);
        this.setParamArraySimple(map, prefix + "LocalImageIDs.", this.LocalImageIDs);
        this.setParamSimple(map, prefix + "RegistryImageScanType", this.RegistryImageScanType);
        this.setParamArraySimple(map, prefix + "RegistryImageIDs.", this.RegistryImageIDs);
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);
        this.setParamSimple(map, prefix + "LocalImageContainerRunning", this.LocalImageContainerRunning);
        this.setParamSimple(map, prefix + "RegistryImageContainerRunning", this.RegistryImageContainerRunning);
        this.setParamSimple(map, prefix + "IsLatest", this.IsLatest);
        this.setParamArraySimple(map, prefix + "ExcludeLocalImageIDs.", this.ExcludeLocalImageIDs);
        this.setParamArraySimple(map, prefix + "ExcludeRegistryImageIDs.", this.ExcludeRegistryImageIDs);
        this.setParamArraySimple(map, prefix + "LocalClusterIDs.", this.LocalClusterIDs);

    }
}

