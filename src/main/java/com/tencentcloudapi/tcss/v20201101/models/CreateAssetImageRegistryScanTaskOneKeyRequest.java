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

public class CreateAssetImageRegistryScanTaskOneKeyRequest extends AbstractModel {

    /**
    * Scan All Images (Deprecated)
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * Scanned Image List
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * Type Array for scanning
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * Scanned Image List ID
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * List of image IDs excluded from scanning.
    */
    @SerializedName("ExcludeIDs")
    @Expose
    private Long [] ExcludeIDs;

    /**
    * Whether the Latest Image
    */
    @SerializedName("IsLatest")
    @Expose
    private Boolean IsLatest;

    /**
    * Scan Scope. 0: All Images; 1: Custom Images; 2: Recommended Scan Images
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * Repository type
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
    * Whether There Are Running Containers
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * Task Timeout Duration Unit (s)
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get Scan All Images (Deprecated) 
     * @return All Scan All Images (Deprecated)
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Scan All Images (Deprecated)
     * @param All Scan All Images (Deprecated)
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get Scanned Image List 
     * @return Images Scanned Image List
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set Scanned Image List
     * @param Images Scanned Image List
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get Type Array for scanning 
     * @return ScanType Type Array for scanning
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set Type Array for scanning
     * @param ScanType Type Array for scanning
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get Scanned Image List ID 
     * @return Id Scanned Image List ID
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set Scanned Image List ID
     * @param Id Scanned Image List ID
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get List of image IDs excluded from scanning. 
     * @return ExcludeIDs List of image IDs excluded from scanning.
     */
    public Long [] getExcludeIDs() {
        return this.ExcludeIDs;
    }

    /**
     * Set List of image IDs excluded from scanning.
     * @param ExcludeIDs List of image IDs excluded from scanning.
     */
    public void setExcludeIDs(Long [] ExcludeIDs) {
        this.ExcludeIDs = ExcludeIDs;
    }

    /**
     * Get Whether the Latest Image 
     * @return IsLatest Whether the Latest Image
     */
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    /**
     * Set Whether the Latest Image
     * @param IsLatest Whether the Latest Image
     */
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    /**
     * Get Scan Scope. 0: All Images; 1: Custom Images; 2: Recommended Scan Images 
     * @return ScanScope Scan Scope. 0: All Images; 1: Custom Images; 2: Recommended Scan Images
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set Scan Scope. 0: All Images; 1: Custom Images; 2: Recommended Scan Images
     * @param ScanScope Scan Scope. 0: All Images; 1: Custom Images; 2: Recommended Scan Images
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get Repository type 
     * @return RegistryType Repository type
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository type
     * @param RegistryType Repository type
     */
    public void setRegistryType(String [] RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Whether There Are Running Containers 
     * @return ContainerRunning Whether There Are Running Containers
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set Whether There Are Running Containers
     * @param ContainerRunning Whether There Are Running Containers
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get Task Timeout Duration Unit (s) 
     * @return Timeout Task Timeout Duration Unit (s)
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Task Timeout Duration Unit (s)
     * @param Timeout Task Timeout Duration Unit (s)
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateAssetImageRegistryScanTaskOneKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageRegistryScanTaskOneKeyRequest(CreateAssetImageRegistryScanTaskOneKeyRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.ExcludeIDs != null) {
            this.ExcludeIDs = new Long[source.ExcludeIDs.length];
            for (int i = 0; i < source.ExcludeIDs.length; i++) {
                this.ExcludeIDs[i] = new Long(source.ExcludeIDs[i]);
            }
        }
        if (source.IsLatest != null) {
            this.IsLatest = new Boolean(source.IsLatest);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String[source.RegistryType.length];
            for (int i = 0; i < source.RegistryType.length; i++) {
                this.RegistryType[i] = new String(source.RegistryType[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArraySimple(map, prefix + "ExcludeIDs.", this.ExcludeIDs);
        this.setParamSimple(map, prefix + "IsLatest", this.IsLatest);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

