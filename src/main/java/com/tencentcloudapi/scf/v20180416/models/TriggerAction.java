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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerAction extends AbstractModel{

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "TriggerProvisionedConcurrencyNum", this.TriggerProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "TriggerCronConfig", this.TriggerCronConfig);

    }
}

