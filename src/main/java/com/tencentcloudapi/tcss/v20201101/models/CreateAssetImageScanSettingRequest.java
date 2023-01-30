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

public class CreateAssetImageScanSettingRequest extends AbstractModel{

    /**
    * Switch
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Scan cycle
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * Trojan scan
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * Sensitive data scan
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * Vulnerability scan
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * All images
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * Custom image
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
     * Get Switch 
     * @return Enable Switch
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch
     * @param Enable Switch
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Scan time 
     * @return ScanTime Scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan time
     * @param ScanTime Scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Scan cycle 
     * @return ScanPeriod Scan cycle
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set Scan cycle
     * @param ScanPeriod Scan cycle
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get Trojan scan 
     * @return ScanVirus Trojan scan
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set Trojan scan
     * @param ScanVirus Trojan scan
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get Sensitive data scan 
     * @return ScanRisk Sensitive data scan
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set Sensitive data scan
     * @param ScanRisk Sensitive data scan
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get Vulnerability scan 
     * @return ScanVul Vulnerability scan
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set Vulnerability scan
     * @param ScanVul Vulnerability scan
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get All images 
     * @return All All images
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set All images
     * @param All All images
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get Custom image 
     * @return Images Custom image
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set Custom image
     * @param Images Custom image
     */
    public void setImages(String [] Images) {
        this.Images = Images;
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

    }
}

