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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanIgnoreVul extends AbstractModel{

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability CVE ID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Number of ignored repository images
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether to ignore all images. Valid values: `0` (no); `1` (yes).
    */
    @SerializedName("IsIgnoreAll")
    @Expose
    private Long IsIgnoreAll;

    /**
    * Number of ignored local images
    */
    @SerializedName("LocalImageCount")
    @Expose
    private Long LocalImageCount;

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability CVE ID 
     * @return CVEID Vulnerability CVE ID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set Vulnerability CVE ID
     * @param CVEID Vulnerability CVE ID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Number of ignored repository images 
     * @return RegistryImageCount Number of ignored repository images
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set Number of ignored repository images
     * @param RegistryImageCount Number of ignored repository images
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether to ignore all images. Valid values: `0` (no); `1` (yes). 
     * @return IsIgnoreAll Whether to ignore all images. Valid values: `0` (no); `1` (yes).
     */
    public Long getIsIgnoreAll() {
        return this.IsIgnoreAll;
    }

    /**
     * Set Whether to ignore all images. Valid values: `0` (no); `1` (yes).
     * @param IsIgnoreAll Whether to ignore all images. Valid values: `0` (no); `1` (yes).
     */
    public void setIsIgnoreAll(Long IsIgnoreAll) {
        this.IsIgnoreAll = IsIgnoreAll;
    }

    /**
     * Get Number of ignored local images 
     * @return LocalImageCount Number of ignored local images
     */
    public Long getLocalImageCount() {
        return this.LocalImageCount;
    }

    /**
     * Set Number of ignored local images
     * @param LocalImageCount Number of ignored local images
     */
    public void setLocalImageCount(Long LocalImageCount) {
        this.LocalImageCount = LocalImageCount;
    }

    public ScanIgnoreVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanIgnoreVul(ScanIgnoreVul source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.RegistryImageCount != null) {
            this.RegistryImageCount = new Long(source.RegistryImageCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsIgnoreAll != null) {
            this.IsIgnoreAll = new Long(source.IsIgnoreAll);
        }
        if (source.LocalImageCount != null) {
            this.LocalImageCount = new Long(source.LocalImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "RegistryImageCount", this.RegistryImageCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsIgnoreAll", this.IsIgnoreAll);
        this.setParamSimple(map, prefix + "LocalImageCount", this.LocalImageCount);

    }
}

