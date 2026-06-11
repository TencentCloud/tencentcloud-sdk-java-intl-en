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
    * Whether to scan all images
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * List of scanned images
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * Array of scan types
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * List of IDs of scanned images
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
    * 
    */
    @SerializedName("IsLatest")
    @Expose
    private Boolean IsLatest;

    /**
    * 
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * 
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * 
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
    * 
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * 
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get Whether to scan all images 
     * @return All Whether to scan all images
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to scan all images
     * @param All Whether to scan all images
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get List of scanned images 
     * @return Images List of scanned images
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set List of scanned images
     * @param Images List of scanned images
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get Array of scan types 
     * @return ScanType Array of scan types
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set Array of scan types
     * @param ScanType Array of scan types
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get List of IDs of scanned images 
     * @return Id List of IDs of scanned images
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set List of IDs of scanned images
     * @param Id List of IDs of scanned images
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
     * Get  
     * @return IsLatest 
     */
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    /**
     * Set 
     * @param IsLatest 
     */
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    /**
     * Get  
     * @return ScanScope 
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set 
     * @param ScanScope 
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get  
     * @return RegistryType 
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 
     * @param RegistryType 
     */
    public void setRegistryType(String [] RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get  
     * @return Namespace 
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 
     * @param Namespace 
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get  
     * @return ContainerRunning 
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set 
     * @param ContainerRunning 
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get  
     * @return Timeout 
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 
     * @param Timeout 
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

