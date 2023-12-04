/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeImageRegistryTimingScanTaskResponse extends AbstractModel {

    /**
    * Scheduled scan switch
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Scheduled scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Scheduled scan interval
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * Array of scan types
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * Scan of all images
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * Scan of specified images
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * ID of the specified image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * Whether to scan the latest image tag
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Latest")
    @Expose
    private Boolean Latest;

    /**
    * 
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * 
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * 
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * 
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Scheduled scan switch
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Scheduled scan switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Scheduled scan switch
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Scheduled scan switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Scheduled scan time 
     * @return ScanTime Scheduled scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scheduled scan time
     * @param ScanTime Scheduled scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Scheduled scan interval 
     * @return ScanPeriod Scheduled scan interval
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set Scheduled scan interval
     * @param ScanPeriod Scheduled scan interval
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get Array of scan types
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanType Array of scan types
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set Array of scan types
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanType Array of scan types
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get Scan of all images 
     * @return All Scan of all images
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Scan of all images
     * @param All Scan of all images
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get Scan of specified images
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Images Scan of specified images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set Scan of specified images
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Images Scan of specified images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get ID of the specified image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id ID of the specified image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set ID of the specified image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id ID of the specified image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get Whether to scan the latest image tag
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return Latest Whether to scan the latest image tag
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public Boolean getLatest() {
        return this.Latest;
    }

    /**
     * Set Whether to scan the latest image tag
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param Latest Whether to scan the latest image tag
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setLatest(Boolean Latest) {
        this.Latest = Latest;
    }

    /**
     * Get  
     * @return ScanEndTime 
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 
     * @param ScanEndTime 
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
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
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageRegistryTimingScanTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRegistryTimingScanTaskResponse(DescribeImageRegistryTimingScanTaskResponse source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Latest != null) {
            this.Latest = new Boolean(source.Latest);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String[source.RegistryType.length];
            for (int i = 0; i < source.RegistryType.length; i++) {
                this.RegistryType[i] = new String(source.RegistryType[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "Latest", this.Latest);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

