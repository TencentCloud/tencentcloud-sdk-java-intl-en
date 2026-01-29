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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessKeyAlarmInfo extends AbstractModel {

    /**
    * Alarm type/risktype.
Alarm type:.
Abnormal calls.
Leakage detection.
2 custom.

Risk type:.
Configuration risk.
Custom risk.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Alarm count/number of risks.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Alarm type/risktype.
Alarm type:.
Abnormal calls.
Leakage detection.
2 custom.

Risk type:.
Configuration risk.
Custom risk. 
     * @return Type Alarm type/risktype.
Alarm type:.
Abnormal calls.
Leakage detection.
2 custom.

Risk type:.
Configuration risk.
Custom risk.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Alarm type/risktype.
Alarm type:.
Abnormal calls.
Leakage detection.
2 custom.

Risk type:.
Configuration risk.
Custom risk.
     * @param Type Alarm type/risktype.
Alarm type:.
Abnormal calls.
Leakage detection.
2 custom.

Risk type:.
Configuration risk.
Custom risk.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm count/number of risks. 
     * @return Count Alarm count/number of risks.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Alarm count/number of risks.
     * @param Count Alarm count/number of risks.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public AccessKeyAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAlarmInfo(AccessKeyAlarmInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

