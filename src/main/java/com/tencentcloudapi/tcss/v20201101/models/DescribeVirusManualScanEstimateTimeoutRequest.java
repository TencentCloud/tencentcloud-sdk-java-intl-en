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

public class DescribeVirusManualScanEstimateTimeoutRequest extends AbstractModel {

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
    * ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
    */
    @SerializedName("ScanIds")
    @Expose
    private String [] ScanIds;

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

    public DescribeVirusManualScanEstimateTimeoutRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusManualScanEstimateTimeoutRequest(DescribeVirusManualScanEstimateTimeoutRequest source) {
        if (source.ScanRangeType != null) {
            this.ScanRangeType = new Long(source.ScanRangeType);
        }
        if (source.ScanRangeAll != null) {
            this.ScanRangeAll = new Boolean(source.ScanRangeAll);
        }
        if (source.ScanIds != null) {
            this.ScanIds = new String[source.ScanIds.length];
            for (int i = 0; i < source.ScanIds.length; i++) {
                this.ScanIds[i] = new String(source.ScanIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamSimple(map, prefix + "ScanRangeAll", this.ScanRangeAll);
        this.setParamArraySimple(map, prefix + "ScanIds.", this.ScanIds);

    }
}

