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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailOverSettings extends AbstractModel{

    /**
    * ID of the backup input
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SecondaryInputId")
    @Expose
    private String SecondaryInputId;

    /**
    * The wait time (ms) for triggering failover after the primary input becomes unavailable. Value range: [1000, 86400000]. Default value: `3000`
    */
    @SerializedName("LossThreshold")
    @Expose
    private Long LossThreshold;

    /**
    * Failover policy. Valid values: `CURRENT_PREFERRED` (default), `PRIMARY_PREFERRED`
    */
    @SerializedName("RecoverBehavior")
    @Expose
    private String RecoverBehavior;

    /**
     * Get ID of the backup input
Note: this field may return `null`, indicating that no valid value was found. 
     * @return SecondaryInputId ID of the backup input
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getSecondaryInputId() {
        return this.SecondaryInputId;
    }

    /**
     * Set ID of the backup input
Note: this field may return `null`, indicating that no valid value was found.
     * @param SecondaryInputId ID of the backup input
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setSecondaryInputId(String SecondaryInputId) {
        this.SecondaryInputId = SecondaryInputId;
    }

    /**
     * Get The wait time (ms) for triggering failover after the primary input becomes unavailable. Value range: [1000, 86400000]. Default value: `3000` 
     * @return LossThreshold The wait time (ms) for triggering failover after the primary input becomes unavailable. Value range: [1000, 86400000]. Default value: `3000`
     */
    public Long getLossThreshold() {
        return this.LossThreshold;
    }

    /**
     * Set The wait time (ms) for triggering failover after the primary input becomes unavailable. Value range: [1000, 86400000]. Default value: `3000`
     * @param LossThreshold The wait time (ms) for triggering failover after the primary input becomes unavailable. Value range: [1000, 86400000]. Default value: `3000`
     */
    public void setLossThreshold(Long LossThreshold) {
        this.LossThreshold = LossThreshold;
    }

    /**
     * Get Failover policy. Valid values: `CURRENT_PREFERRED` (default), `PRIMARY_PREFERRED` 
     * @return RecoverBehavior Failover policy. Valid values: `CURRENT_PREFERRED` (default), `PRIMARY_PREFERRED`
     */
    public String getRecoverBehavior() {
        return this.RecoverBehavior;
    }

    /**
     * Set Failover policy. Valid values: `CURRENT_PREFERRED` (default), `PRIMARY_PREFERRED`
     * @param RecoverBehavior Failover policy. Valid values: `CURRENT_PREFERRED` (default), `PRIMARY_PREFERRED`
     */
    public void setRecoverBehavior(String RecoverBehavior) {
        this.RecoverBehavior = RecoverBehavior;
    }

    public FailOverSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailOverSettings(FailOverSettings source) {
        if (source.SecondaryInputId != null) {
            this.SecondaryInputId = new String(source.SecondaryInputId);
        }
        if (source.LossThreshold != null) {
            this.LossThreshold = new Long(source.LossThreshold);
        }
        if (source.RecoverBehavior != null) {
            this.RecoverBehavior = new String(source.RecoverBehavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecondaryInputId", this.SecondaryInputId);
        this.setParamSimple(map, prefix + "LossThreshold", this.LossThreshold);
        this.setParamSimple(map, prefix + "RecoverBehavior", this.RecoverBehavior);

    }
}

