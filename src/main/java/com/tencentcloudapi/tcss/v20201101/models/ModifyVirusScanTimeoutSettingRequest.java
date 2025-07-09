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

public class ModifyVirusScanTimeoutSettingRequest extends AbstractModel {

    /**
    * Timeout period in hours. Value range: 5-24.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Scan type. Valid values: `0` (quick scan); `1` (scheduled scan).
    */
    @SerializedName("ScanType")
    @Expose
    private Long ScanType;

    /**
     * Get Timeout period in hours. Value range: 5-24. 
     * @return Timeout Timeout period in hours. Value range: 5-24.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period in hours. Value range: 5-24.
     * @param Timeout Timeout period in hours. Value range: 5-24.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Scan type. Valid values: `0` (quick scan); `1` (scheduled scan). 
     * @return ScanType Scan type. Valid values: `0` (quick scan); `1` (scheduled scan).
     */
    public Long getScanType() {
        return this.ScanType;
    }

    /**
     * Set Scan type. Valid values: `0` (quick scan); `1` (scheduled scan).
     * @param ScanType Scan type. Valid values: `0` (quick scan); `1` (scheduled scan).
     */
    public void setScanType(Long ScanType) {
        this.ScanType = ScanType;
    }

    public ModifyVirusScanTimeoutSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirusScanTimeoutSettingRequest(ModifyVirusScanTimeoutSettingRequest source) {
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ScanType != null) {
            this.ScanType = new Long(source.ScanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);

    }
}

