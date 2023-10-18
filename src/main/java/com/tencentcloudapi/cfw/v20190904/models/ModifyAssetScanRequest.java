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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssetScanRequest extends AbstractModel {

    /**
    * Scan range. 1: port; 2: port + vulnerability scan
    */
    @SerializedName("ScanRange")
    @Expose
    private Long ScanRange;

    /**
    * Scan mode: 'heavy', 'medium', 'light'
    */
    @SerializedName("ScanDeep")
    @Expose
    private String ScanDeep;

    /**
    * Scan type. 1: scan now; 2: periodic scan
    */
    @SerializedName("RangeType")
    @Expose
    private Long RangeType;

    /**
    * Scheduled task time, required when RangeType is 2
    */
    @SerializedName("ScanPeriod")
    @Expose
    private String ScanPeriod;

    /**
    * Scans this field now and passes the filtered IPs
    */
    @SerializedName("ScanFilterIp")
    @Expose
    private String [] ScanFilterIp;

    /**
    * 1: all; 2: single
    */
    @SerializedName("ScanType")
    @Expose
    private Long ScanType;

    /**
     * Get Scan range. 1: port; 2: port + vulnerability scan 
     * @return ScanRange Scan range. 1: port; 2: port + vulnerability scan
     */
    public Long getScanRange() {
        return this.ScanRange;
    }

    /**
     * Set Scan range. 1: port; 2: port + vulnerability scan
     * @param ScanRange Scan range. 1: port; 2: port + vulnerability scan
     */
    public void setScanRange(Long ScanRange) {
        this.ScanRange = ScanRange;
    }

    /**
     * Get Scan mode: 'heavy', 'medium', 'light' 
     * @return ScanDeep Scan mode: 'heavy', 'medium', 'light'
     */
    public String getScanDeep() {
        return this.ScanDeep;
    }

    /**
     * Set Scan mode: 'heavy', 'medium', 'light'
     * @param ScanDeep Scan mode: 'heavy', 'medium', 'light'
     */
    public void setScanDeep(String ScanDeep) {
        this.ScanDeep = ScanDeep;
    }

    /**
     * Get Scan type. 1: scan now; 2: periodic scan 
     * @return RangeType Scan type. 1: scan now; 2: periodic scan
     */
    public Long getRangeType() {
        return this.RangeType;
    }

    /**
     * Set Scan type. 1: scan now; 2: periodic scan
     * @param RangeType Scan type. 1: scan now; 2: periodic scan
     */
    public void setRangeType(Long RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get Scheduled task time, required when RangeType is 2 
     * @return ScanPeriod Scheduled task time, required when RangeType is 2
     */
    public String getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set Scheduled task time, required when RangeType is 2
     * @param ScanPeriod Scheduled task time, required when RangeType is 2
     */
    public void setScanPeriod(String ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get Scans this field now and passes the filtered IPs 
     * @return ScanFilterIp Scans this field now and passes the filtered IPs
     */
    public String [] getScanFilterIp() {
        return this.ScanFilterIp;
    }

    /**
     * Set Scans this field now and passes the filtered IPs
     * @param ScanFilterIp Scans this field now and passes the filtered IPs
     */
    public void setScanFilterIp(String [] ScanFilterIp) {
        this.ScanFilterIp = ScanFilterIp;
    }

    /**
     * Get 1: all; 2: single 
     * @return ScanType 1: all; 2: single
     */
    public Long getScanType() {
        return this.ScanType;
    }

    /**
     * Set 1: all; 2: single
     * @param ScanType 1: all; 2: single
     */
    public void setScanType(Long ScanType) {
        this.ScanType = ScanType;
    }

    public ModifyAssetScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetScanRequest(ModifyAssetScanRequest source) {
        if (source.ScanRange != null) {
            this.ScanRange = new Long(source.ScanRange);
        }
        if (source.ScanDeep != null) {
            this.ScanDeep = new String(source.ScanDeep);
        }
        if (source.RangeType != null) {
            this.RangeType = new Long(source.RangeType);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new String(source.ScanPeriod);
        }
        if (source.ScanFilterIp != null) {
            this.ScanFilterIp = new String[source.ScanFilterIp.length];
            for (int i = 0; i < source.ScanFilterIp.length; i++) {
                this.ScanFilterIp[i] = new String(source.ScanFilterIp[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new Long(source.ScanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanRange", this.ScanRange);
        this.setParamSimple(map, prefix + "ScanDeep", this.ScanDeep);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamArraySimple(map, prefix + "ScanFilterIp.", this.ScanFilterIp);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);

    }
}

