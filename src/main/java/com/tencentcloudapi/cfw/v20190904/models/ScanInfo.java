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

public class ScanInfo extends AbstractModel {

    /**
    * Scanning result information
    */
    @SerializedName("ScanResultInfo")
    @Expose
    private ScanResultInfo ScanResultInfo;

    /**
    * Scanning status. 0: scanning; 1: completed; 2: auto scanning unselected
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * Progress
    */
    @SerializedName("ScanPercent")
    @Expose
    private Float ScanPercent;

    /**
    * Estimated completion time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get Scanning result information 
     * @return ScanResultInfo Scanning result information
     */
    public ScanResultInfo getScanResultInfo() {
        return this.ScanResultInfo;
    }

    /**
     * Set Scanning result information
     * @param ScanResultInfo Scanning result information
     */
    public void setScanResultInfo(ScanResultInfo ScanResultInfo) {
        this.ScanResultInfo = ScanResultInfo;
    }

    /**
     * Get Scanning status. 0: scanning; 1: completed; 2: auto scanning unselected 
     * @return ScanStatus Scanning status. 0: scanning; 1: completed; 2: auto scanning unselected
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scanning status. 0: scanning; 1: completed; 2: auto scanning unselected
     * @param ScanStatus Scanning status. 0: scanning; 1: completed; 2: auto scanning unselected
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Progress 
     * @return ScanPercent Progress
     */
    public Float getScanPercent() {
        return this.ScanPercent;
    }

    /**
     * Set Progress
     * @param ScanPercent Progress
     */
    public void setScanPercent(Float ScanPercent) {
        this.ScanPercent = ScanPercent;
    }

    /**
     * Get Estimated completion time 
     * @return ScanTime Estimated completion time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Estimated completion time
     * @param ScanTime Estimated completion time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    public ScanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanInfo(ScanInfo source) {
        if (source.ScanResultInfo != null) {
            this.ScanResultInfo = new ScanResultInfo(source.ScanResultInfo);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.ScanPercent != null) {
            this.ScanPercent = new Float(source.ScanPercent);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScanResultInfo.", this.ScanResultInfo);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanPercent", this.ScanPercent);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);

    }
}

