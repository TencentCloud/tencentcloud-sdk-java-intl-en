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

public class CreateVirusScanTaskRequest extends AbstractModel{

    /**
    * Whether to scan all paths
    */
    @SerializedName("ScanPathAll")
    @Expose
    private Boolean ScanPathAll;

    /**
    * Scanning scope. Valid values: `0` (container); `1` (server).
    */
    @SerializedName("ScanRangeType")
    @Expose
    private Long ScanRangeType;

    /**
    * Valid values: `true` (all); `false` (specified).
    */
    @SerializedName("ScanRangeAll")
    @Expose
    private Boolean ScanRangeAll;

    /**
    * Timeout period in hours
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Valid when `ScanPathAll` is `false`. Valid values: `0` (scan the following paths); `1` (scan all paths except the following).
    */
    @SerializedName("ScanPathType")
    @Expose
    private Long ScanPathType;

    /**
    * ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
    */
    @SerializedName("ScanIds")
    @Expose
    private String [] ScanIds;

    /**
    * Specified path to be excluded or scanned
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
    * Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

    */
    @SerializedName("ScanPathMode")
    @Expose
    private String ScanPathMode;

    /**
     * Get Whether to scan all paths 
     * @return ScanPathAll Whether to scan all paths
     */
    public Boolean getScanPathAll() {
        return this.ScanPathAll;
    }

    /**
     * Set Whether to scan all paths
     * @param ScanPathAll Whether to scan all paths
     */
    public void setScanPathAll(Boolean ScanPathAll) {
        this.ScanPathAll = ScanPathAll;
    }

    /**
     * Get Scanning scope. Valid values: `0` (container); `1` (server). 
     * @return ScanRangeType Scanning scope. Valid values: `0` (container); `1` (server).
     */
    public Long getScanRangeType() {
        return this.ScanRangeType;
    }

    /**
     * Set Scanning scope. Valid values: `0` (container); `1` (server).
     * @param ScanRangeType Scanning scope. Valid values: `0` (container); `1` (server).
     */
    public void setScanRangeType(Long ScanRangeType) {
        this.ScanRangeType = ScanRangeType;
    }

    /**
     * Get Valid values: `true` (all); `false` (specified). 
     * @return ScanRangeAll Valid values: `true` (all); `false` (specified).
     */
    public Boolean getScanRangeAll() {
        return this.ScanRangeAll;
    }

    /**
     * Set Valid values: `true` (all); `false` (specified).
     * @param ScanRangeAll Valid values: `true` (all); `false` (specified).
     */
    public void setScanRangeAll(Boolean ScanRangeAll) {
        this.ScanRangeAll = ScanRangeAll;
    }

    /**
     * Get Timeout period in hours 
     * @return Timeout Timeout period in hours
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period in hours
     * @param Timeout Timeout period in hours
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Valid when `ScanPathAll` is `false`. Valid values: `0` (scan the following paths); `1` (scan all paths except the following). 
     * @return ScanPathType Valid when `ScanPathAll` is `false`. Valid values: `0` (scan the following paths); `1` (scan all paths except the following).
     */
    public Long getScanPathType() {
        return this.ScanPathType;
    }

    /**
     * Set Valid when `ScanPathAll` is `false`. Valid values: `0` (scan the following paths); `1` (scan all paths except the following).
     * @param ScanPathType Valid when `ScanPathAll` is `false`. Valid values: `0` (scan the following paths); `1` (scan all paths except the following).
     */
    public void setScanPathType(Long ScanPathType) {
        this.ScanPathType = ScanPathType;
    }

    /**
     * Get ID of the specified container or server to be scanned, which is based on `ScanRangeType`. 
     * @return ScanIds ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
     */
    public String [] getScanIds() {
        return this.ScanIds;
    }

    /**
     * Set ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
     * @param ScanIds ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
     */
    public void setScanIds(String [] ScanIds) {
        this.ScanIds = ScanIds;
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

    /**
     * Get Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path
 
     * @return ScanPathMode Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

     */
    public String getScanPathMode() {
        return this.ScanPathMode;
    }

    /**
     * Set Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

     * @param ScanPathMode Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

     */
    public void setScanPathMode(String ScanPathMode) {
        this.ScanPathMode = ScanPathMode;
    }

    public CreateVirusScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVirusScanTaskRequest(CreateVirusScanTaskRequest source) {
        if (source.ScanPathAll != null) {
            this.ScanPathAll = new Boolean(source.ScanPathAll);
        }
        if (source.ScanRangeType != null) {
            this.ScanRangeType = new Long(source.ScanRangeType);
        }
        if (source.ScanRangeAll != null) {
            this.ScanRangeAll = new Boolean(source.ScanRangeAll);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ScanPathType != null) {
            this.ScanPathType = new Long(source.ScanPathType);
        }
        if (source.ScanIds != null) {
            this.ScanIds = new String[source.ScanIds.length];
            for (int i = 0; i < source.ScanIds.length; i++) {
                this.ScanIds[i] = new String(source.ScanIds[i]);
            }
        }
        if (source.ScanPath != null) {
            this.ScanPath = new String[source.ScanPath.length];
            for (int i = 0; i < source.ScanPath.length; i++) {
                this.ScanPath[i] = new String(source.ScanPath[i]);
            }
        }
        if (source.ScanPathMode != null) {
            this.ScanPathMode = new String(source.ScanPathMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanPathAll", this.ScanPathAll);
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamSimple(map, prefix + "ScanRangeAll", this.ScanRangeAll);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ScanPathType", this.ScanPathType);
        this.setParamArraySimple(map, prefix + "ScanIds.", this.ScanIds);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);
        this.setParamSimple(map, prefix + "ScanPathMode", this.ScanPathMode);

    }
}

