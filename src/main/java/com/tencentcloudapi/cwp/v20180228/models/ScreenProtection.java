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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenProtection extends AbstractModel {

    /**
    * Type value: virus scanning, brute force cracking, vulnerability scan, baseline check
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Virus scanning: 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
Brute force cracking: 0: protection disabled (asset not paid); 1: automatic blocking enabled.
Vulnerability scan: 0: never scanned or asset not paid; 1: vulnerability found; 2: no risk found.
Baseline check: 0: never checked or asset not paid; 1: baseline risks found; 2: no risk found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Type value: virus scanning, brute force cracking, vulnerability scan, baseline check 
     * @return Name Type value: virus scanning, brute force cracking, vulnerability scan, baseline check
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Type value: virus scanning, brute force cracking, vulnerability scan, baseline check
     * @param Name Type value: virus scanning, brute force cracking, vulnerability scan, baseline check
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Virus scanning: 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
Brute force cracking: 0: protection disabled (asset not paid); 1: automatic blocking enabled.
Vulnerability scan: 0: never scanned or asset not paid; 1: vulnerability found; 2: no risk found.
Baseline check: 0: never checked or asset not paid; 1: baseline risks found; 2: no risk found. 
     * @return Status Virus scanning: 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
Brute force cracking: 0: protection disabled (asset not paid); 1: automatic blocking enabled.
Vulnerability scan: 0: never scanned or asset not paid; 1: vulnerability found; 2: no risk found.
Baseline check: 0: never checked or asset not paid; 1: baseline risks found; 2: no risk found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Virus scanning: 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
Brute force cracking: 0: protection disabled (asset not paid); 1: automatic blocking enabled.
Vulnerability scan: 0: never scanned or asset not paid; 1: vulnerability found; 2: no risk found.
Baseline check: 0: never checked or asset not paid; 1: baseline risks found; 2: no risk found.
     * @param Status Virus scanning: 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
Brute force cracking: 0: protection disabled (asset not paid); 1: automatic blocking enabled.
Vulnerability scan: 0: never scanned or asset not paid; 1: vulnerability found; 2: no risk found.
Baseline check: 0: never checked or asset not paid; 1: baseline risks found; 2: no risk found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ScreenProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenProtection(ScreenProtection source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

