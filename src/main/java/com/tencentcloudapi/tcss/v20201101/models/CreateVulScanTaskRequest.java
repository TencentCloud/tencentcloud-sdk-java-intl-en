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

public class CreateVulScanTaskRequest extends AbstractModel {

    /**
    * Local image scan scope. Valid values: `ALL` (all local images); `NOT_SCAN` (all licensed but not scanned local images); `IMAGEIDS` (IDs of specified local images).
    */
    @SerializedName("LocalImageScanType")
    @Expose
    private String LocalImageScanType;

    /**
    * Scan by licensed local image ID, with a higher priority than scan by licensed local image that meets the condition.
    */
    @SerializedName("LocalImageIDs")
    @Expose
    private String [] LocalImageIDs;

    /**
    * Repository image scan scope. Valid values: `ALL` (all repository images); `NOT_SCAN` (all licensed but not scanned repository images); `IMAGEIDS` (IDs of specified repository images).
    */
    @SerializedName("RegistryImageScanType")
    @Expose
    private String RegistryImageScanType;

    /**
    * Scan by licensed repository image ID, with a higher priority than scan by licensed repository image that meets the condition.
    */
    @SerializedName("RegistryImageIDs")
    @Expose
    private Long [] RegistryImageIDs;

    /**
    * ID of the task to scan local images again for vulnerabilities
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * ID of the task to scan repository images again for vulnerabilities
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
     * Get Local image scan scope. Valid values: `ALL` (all local images); `NOT_SCAN` (all licensed but not scanned local images); `IMAGEIDS` (IDs of specified local images). 
     * @return LocalImageScanType Local image scan scope. Valid values: `ALL` (all local images); `NOT_SCAN` (all licensed but not scanned local images); `IMAGEIDS` (IDs of specified local images).
     */
    public String getLocalImageScanType() {
        return this.LocalImageScanType;
    }

    /**
     * Set Local image scan scope. Valid values: `ALL` (all local images); `NOT_SCAN` (all licensed but not scanned local images); `IMAGEIDS` (IDs of specified local images).
     * @param LocalImageScanType Local image scan scope. Valid values: `ALL` (all local images); `NOT_SCAN` (all licensed but not scanned local images); `IMAGEIDS` (IDs of specified local images).
     */
    public void setLocalImageScanType(String LocalImageScanType) {
        this.LocalImageScanType = LocalImageScanType;
    }

    /**
     * Get Scan by licensed local image ID, with a higher priority than scan by licensed local image that meets the condition. 
     * @return LocalImageIDs Scan by licensed local image ID, with a higher priority than scan by licensed local image that meets the condition.
     */
    public String [] getLocalImageIDs() {
        return this.LocalImageIDs;
    }

    /**
     * Set Scan by licensed local image ID, with a higher priority than scan by licensed local image that meets the condition.
     * @param LocalImageIDs Scan by licensed local image ID, with a higher priority than scan by licensed local image that meets the condition.
     */
    public void setLocalImageIDs(String [] LocalImageIDs) {
        this.LocalImageIDs = LocalImageIDs;
    }

    /**
     * Get Repository image scan scope. Valid values: `ALL` (all repository images); `NOT_SCAN` (all licensed but not scanned repository images); `IMAGEIDS` (IDs of specified repository images). 
     * @return RegistryImageScanType Repository image scan scope. Valid values: `ALL` (all repository images); `NOT_SCAN` (all licensed but not scanned repository images); `IMAGEIDS` (IDs of specified repository images).
     */
    public String getRegistryImageScanType() {
        return this.RegistryImageScanType;
    }

    /**
     * Set Repository image scan scope. Valid values: `ALL` (all repository images); `NOT_SCAN` (all licensed but not scanned repository images); `IMAGEIDS` (IDs of specified repository images).
     * @param RegistryImageScanType Repository image scan scope. Valid values: `ALL` (all repository images); `NOT_SCAN` (all licensed but not scanned repository images); `IMAGEIDS` (IDs of specified repository images).
     */
    public void setRegistryImageScanType(String RegistryImageScanType) {
        this.RegistryImageScanType = RegistryImageScanType;
    }

    /**
     * Get Scan by licensed repository image ID, with a higher priority than scan by licensed repository image that meets the condition. 
     * @return RegistryImageIDs Scan by licensed repository image ID, with a higher priority than scan by licensed repository image that meets the condition.
     */
    public Long [] getRegistryImageIDs() {
        return this.RegistryImageIDs;
    }

    /**
     * Set Scan by licensed repository image ID, with a higher priority than scan by licensed repository image that meets the condition.
     * @param RegistryImageIDs Scan by licensed repository image ID, with a higher priority than scan by licensed repository image that meets the condition.
     */
    public void setRegistryImageIDs(Long [] RegistryImageIDs) {
        this.RegistryImageIDs = RegistryImageIDs;
    }

    /**
     * Get ID of the task to scan local images again for vulnerabilities 
     * @return LocalTaskID ID of the task to scan local images again for vulnerabilities
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set ID of the task to scan local images again for vulnerabilities
     * @param LocalTaskID ID of the task to scan local images again for vulnerabilities
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get ID of the task to scan repository images again for vulnerabilities 
     * @return RegistryTaskID ID of the task to scan repository images again for vulnerabilities
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set ID of the task to scan repository images again for vulnerabilities
     * @param RegistryTaskID ID of the task to scan repository images again for vulnerabilities
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
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

    }
}

