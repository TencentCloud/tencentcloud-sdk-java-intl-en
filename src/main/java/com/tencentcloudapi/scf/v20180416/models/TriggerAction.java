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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerAction extends AbstractModel {

    /**
    * Scheduled action name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Target provisioned concurrency of the scheduled scaling action 
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerProvisionedConcurrencyNum")
    @Expose
    private Long TriggerProvisionedConcurrencyNum;

    /**
    * Trigger time of the scheduled action in Cron expression. Seven fields are required and should be separated with a space.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerCronConfig")
    @Expose
    private String TriggerCronConfig;

    /**
    * The provision type. Value: `Default`
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProvisionedType")
    @Expose
    private String ProvisionedType;

    /**
     * Get Scheduled action name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TriggerName Scheduled action name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Scheduled action name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TriggerName Scheduled action name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Target provisioned concurrency of the scheduled scaling action 
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TriggerProvisionedConcurrencyNum Target provisioned concurrency of the scheduled scaling action 
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTriggerProvisionedConcurrencyNum() {
        return this.TriggerProvisionedConcurrencyNum;
    }

    /**
     * Set Target provisioned concurrency of the scheduled scaling action 
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TriggerProvisionedConcurrencyNum Target provisioned concurrency of the scheduled scaling action 
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTriggerProvisionedConcurrencyNum(Long TriggerProvisionedConcurrencyNum) {
        this.TriggerProvisionedConcurrencyNum = TriggerProvisionedConcurrencyNum;
    }

    /**
     * Get Trigger time of the scheduled action in Cron expression. Seven fields are required and should be separated with a space.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TriggerCronConfig Trigger time of the scheduled action in Cron expression. Seven fields are required and should be separated with a space.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTriggerCronConfig() {
        return this.TriggerCronConfig;
    }

    /**
     * Set Trigger time of the scheduled action in Cron expression. Seven fields are required and should be separated with a space.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TriggerCronConfig Trigger time of the scheduled action in Cron expression. Seven fields are required and should be separated with a space.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTriggerCronConfig(String TriggerCronConfig) {
        this.TriggerCronConfig = TriggerCronConfig;
    }

    /**
     * Get The provision type. Value: `Default`
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ProvisionedType The provision type. Value: `Default`
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getProvisionedType() {
        return this.ProvisionedType;
    }

    /**
     * Set The provision type. Value: `Default`
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ProvisionedType The provision type. Value: `Default`
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setProvisionedType(String ProvisionedType) {
        this.ProvisionedType = ProvisionedType;
    }

    public TriggerAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerAction(TriggerAction source) {
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.TriggerProvisionedConcurrencyNum != null) {
            this.TriggerProvisionedConcurrencyNum = new Long(source.TriggerProvisionedConcurrencyNum);
        }
        if (source.TriggerCronConfig != null) {
            this.TriggerCronConfig = new String(source.TriggerCronConfig);
        }
        if (source.ProvisionedType != null) {
            this.ProvisionedType = new String(source.ProvisionedType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "TriggerProvisionedConcurrencyNum", this.TriggerProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "TriggerCronConfig", this.TriggerCronConfig);
        this.setParamSimple(map, prefix + "ProvisionedType", this.ProvisionedType);

    }
}

