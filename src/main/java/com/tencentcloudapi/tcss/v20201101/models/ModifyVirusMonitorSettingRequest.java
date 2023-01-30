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

public class ModifyVirusMonitorSettingRequest extends AbstractModel{

    /**
    * Whether to enable scheduled scan
    */
    @SerializedName("EnableScan")
    @Expose
    private Boolean EnableScan;

    /**
    * Scan all paths
    */
    @SerializedName("ScanPathAll")
    @Expose
    private Boolean ScanPathAll;

    /**
    * Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following; the scope cannot be greater than `1`).
    */
    @SerializedName("ScanPathType")
    @Expose
    private Long ScanPathType;

    /**
    * Specified path to be excluded or scanned
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
     * Get Whether to enable scheduled scan 
     * @return EnableScan Whether to enable scheduled scan
     */
    public Boolean getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set Whether to enable scheduled scan
     * @param EnableScan Whether to enable scheduled scan
     */
    public void setEnableScan(Boolean EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get Scan all paths 
     * @return ScanPathAll Scan all paths
     */
    public Boolean getScanPathAll() {
        return this.ScanPathAll;
    }

    /**
     * Set Scan all paths
     * @param ScanPathAll Scan all paths
     */
    public void setScanPathAll(Boolean ScanPathAll) {
        this.ScanPathAll = ScanPathAll;
    }

    /**
     * Get Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following; the scope cannot be greater than `1`). 
     * @return ScanPathType Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following; the scope cannot be greater than `1`).
     */
    public Long getScanPathType() {
        return this.ScanPathType;
    }

    /**
     * Set Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following; the scope cannot be greater than `1`).
     * @param ScanPathType Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following; the scope cannot be greater than `1`).
     */
    public void setScanPathType(Long ScanPathType) {
        this.ScanPathType = ScanPathType;
    }

    /**
     * Get Specified path to be excluded or scanned 
     * @return ScanPath Specified path to be excluded or scanned
     */
    public String [] getScanPath() {
        return this.ScanPath;
    }

    /**
     * Set Specified path to be excluded or scanned
     * @param ScanPath Specified path to be excluded or scanned
     */
    public void setScanPath(String [] ScanPath) {
        this.ScanPath = ScanPath;
    }

    public ModifyVirusMonitorSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirusMonitorSettingRequest(ModifyVirusMonitorSettingRequest source) {
        if (source.EnableScan != null) {
            this.EnableScan = new Boolean(source.EnableScan);
        }
        if (source.ScanPathAll != null) {
            this.ScanPathAll = new Boolean(source.ScanPathAll);
        }
        if (source.ScanPathType != null) {
            this.ScanPathType = new Long(source.ScanPathType);
        }
        if (source.ScanPath != null) {
            this.ScanPath = new String[source.ScanPath.length];
            for (int i = 0; i < source.ScanPath.length; i++) {
                this.ScanPath[i] = new String(source.ScanPath[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamSimple(map, prefix + "ScanPathAll", this.ScanPathAll);
        this.setParamSimple(map, prefix + "ScanPathType", this.ScanPathType);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);

    }
}

