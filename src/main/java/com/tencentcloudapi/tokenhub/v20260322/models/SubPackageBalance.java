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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubPackageBalance extends AbstractModel {

    /**
    * Dedicated limit. Units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private String ExclusiveQuota;

    /**
    * Used amount of the dedicated limit. The measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
    */
    @SerializedName("ExclusiveUsed")
    @Expose
    private String ExclusiveUsed;

    /**
    * Remaining exclusive quota. Units are as follows:
-Package type: professional. Measurement unit: point.
-Package type: lite package. Measurement unit: token.
    */
    @SerializedName("ExclusiveRemain")
    @Expose
    private String ExclusiveRemain;

    /**
    * Shared credit limit. -1 means unlimited. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
    */
    @SerializedName("SharedQuota")
    @Expose
    private String SharedQuota;

    /**
    * Used amount of the shared quota. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
    */
    @SerializedName("SharedUsed")
    @Expose
    private String SharedUsed;

    /**
    * Remaining shared quota. Units are described as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
    */
    @SerializedName("SharedRemain")
    @Expose
    private String SharedRemain;

    /**
    * API Key package status. Valid values: 0 (normal), 1 (exhausted).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Dedicated limit. Units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token. 
     * @return ExclusiveQuota Dedicated limit. Units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public String getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set Dedicated limit. Units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     * @param ExclusiveQuota Dedicated limit. Units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public void setExclusiveQuota(String ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get Used amount of the dedicated limit. The measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token. 
     * @return ExclusiveUsed Used amount of the dedicated limit. The measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public String getExclusiveUsed() {
        return this.ExclusiveUsed;
    }

    /**
     * Set Used amount of the dedicated limit. The measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     * @param ExclusiveUsed Used amount of the dedicated limit. The measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public void setExclusiveUsed(String ExclusiveUsed) {
        this.ExclusiveUsed = ExclusiveUsed;
    }

    /**
     * Get Remaining exclusive quota. Units are as follows:
-Package type: professional. Measurement unit: point.
-Package type: lite package. Measurement unit: token. 
     * @return ExclusiveRemain Remaining exclusive quota. Units are as follows:
-Package type: professional. Measurement unit: point.
-Package type: lite package. Measurement unit: token.
     */
    public String getExclusiveRemain() {
        return this.ExclusiveRemain;
    }

    /**
     * Set Remaining exclusive quota. Units are as follows:
-Package type: professional. Measurement unit: point.
-Package type: lite package. Measurement unit: token.
     * @param ExclusiveRemain Remaining exclusive quota. Units are as follows:
-Package type: professional. Measurement unit: point.
-Package type: lite package. Measurement unit: token.
     */
    public void setExclusiveRemain(String ExclusiveRemain) {
        this.ExclusiveRemain = ExclusiveRemain;
    }

    /**
     * Get Shared credit limit. -1 means unlimited. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token. 
     * @return SharedQuota Shared credit limit. -1 means unlimited. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     */
    public String getSharedQuota() {
        return this.SharedQuota;
    }

    /**
     * Set Shared credit limit. -1 means unlimited. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     * @param SharedQuota Shared credit limit. -1 means unlimited. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     */
    public void setSharedQuota(String SharedQuota) {
        this.SharedQuota = SharedQuota;
    }

    /**
     * Get Used amount of the shared quota. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token. 
     * @return SharedUsed Used amount of the shared quota. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     */
    public String getSharedUsed() {
        return this.SharedUsed;
    }

    /**
     * Set Used amount of the shared quota. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     * @param SharedUsed Used amount of the shared quota. Measurement units are as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     */
    public void setSharedUsed(String SharedUsed) {
        this.SharedUsed = SharedUsed;
    }

    /**
     * Get Remaining shared quota. Units are described as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token. 
     * @return SharedRemain Remaining shared quota. Units are described as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     */
    public String getSharedRemain() {
        return this.SharedRemain;
    }

    /**
     * Set Remaining shared quota. Units are described as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     * @param SharedRemain Remaining shared quota. Units are described as follows:
-Package type is professional package, measurement unit value is point;
-Package type: lite package. Measurement unit: token.
     */
    public void setSharedRemain(String SharedRemain) {
        this.SharedRemain = SharedRemain;
    }

    /**
     * Get API Key package status. Valid values: 0 (normal), 1 (exhausted). 
     * @return Status API Key package status. Valid values: 0 (normal), 1 (exhausted).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API Key package status. Valid values: 0 (normal), 1 (exhausted).
     * @param Status API Key package status. Valid values: 0 (normal), 1 (exhausted).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SubPackageBalance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubPackageBalance(SubPackageBalance source) {
        if (source.ExclusiveQuota != null) {
            this.ExclusiveQuota = new String(source.ExclusiveQuota);
        }
        if (source.ExclusiveUsed != null) {
            this.ExclusiveUsed = new String(source.ExclusiveUsed);
        }
        if (source.ExclusiveRemain != null) {
            this.ExclusiveRemain = new String(source.ExclusiveRemain);
        }
        if (source.SharedQuota != null) {
            this.SharedQuota = new String(source.SharedQuota);
        }
        if (source.SharedUsed != null) {
            this.SharedUsed = new String(source.SharedUsed);
        }
        if (source.SharedRemain != null) {
            this.SharedRemain = new String(source.SharedRemain);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExclusiveQuota", this.ExclusiveQuota);
        this.setParamSimple(map, prefix + "ExclusiveUsed", this.ExclusiveUsed);
        this.setParamSimple(map, prefix + "ExclusiveRemain", this.ExclusiveRemain);
        this.setParamSimple(map, prefix + "SharedQuota", this.SharedQuota);
        this.setParamSimple(map, prefix + "SharedUsed", this.SharedUsed);
        this.setParamSimple(map, prefix + "SharedRemain", this.SharedRemain);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

