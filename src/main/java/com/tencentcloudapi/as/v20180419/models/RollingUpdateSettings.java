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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollingUpdateSettings extends AbstractModel {

    /**
    * Batch quantity. The batch quantity should be a positive integer greater than 0, but cannot exceed the total number of instances pending refresh.
    */
    @SerializedName("BatchNumber")
    @Expose
    private Long BatchNumber;

    /**
    * Pause policy between batches. Default value: Automatic. Valid values:
<li>FIRST_BATCH_PAUSE: Pause after the first batch of updates is completed.</li>
<li>BATCH_INTERVAL_PAUSE: Pause between batches.</li>
<li>AUTOMATIC: Do not pause.</li>
    */
    @SerializedName("BatchPause")
    @Expose
    private String BatchPause;

    /**
    * The maximum additional quantity of instances. After this parameter is set, create a batch of additional pay-as-you-go instances according to the launch configuration before the rolling update starts. After the rolling update is completed, the additional instances will be terminated.This parameter is used to ensure a certain number of instances available during the rolling update. The maximum additional quantity of instances cannot exceed the number of refreshing instances in a single batch of the rolling update. The rollback process does not support this parameter currently.
    */
    @SerializedName("MaxSurge")
    @Expose
    private Long MaxSurge;

    /**
     * Get Batch quantity. The batch quantity should be a positive integer greater than 0, but cannot exceed the total number of instances pending refresh. 
     * @return BatchNumber Batch quantity. The batch quantity should be a positive integer greater than 0, but cannot exceed the total number of instances pending refresh.
     */
    public Long getBatchNumber() {
        return this.BatchNumber;
    }

    /**
     * Set Batch quantity. The batch quantity should be a positive integer greater than 0, but cannot exceed the total number of instances pending refresh.
     * @param BatchNumber Batch quantity. The batch quantity should be a positive integer greater than 0, but cannot exceed the total number of instances pending refresh.
     */
    public void setBatchNumber(Long BatchNumber) {
        this.BatchNumber = BatchNumber;
    }

    /**
     * Get Pause policy between batches. Default value: Automatic. Valid values:
<li>FIRST_BATCH_PAUSE: Pause after the first batch of updates is completed.</li>
<li>BATCH_INTERVAL_PAUSE: Pause between batches.</li>
<li>AUTOMATIC: Do not pause.</li> 
     * @return BatchPause Pause policy between batches. Default value: Automatic. Valid values:
<li>FIRST_BATCH_PAUSE: Pause after the first batch of updates is completed.</li>
<li>BATCH_INTERVAL_PAUSE: Pause between batches.</li>
<li>AUTOMATIC: Do not pause.</li>
     */
    public String getBatchPause() {
        return this.BatchPause;
    }

    /**
     * Set Pause policy between batches. Default value: Automatic. Valid values:
<li>FIRST_BATCH_PAUSE: Pause after the first batch of updates is completed.</li>
<li>BATCH_INTERVAL_PAUSE: Pause between batches.</li>
<li>AUTOMATIC: Do not pause.</li>
     * @param BatchPause Pause policy between batches. Default value: Automatic. Valid values:
<li>FIRST_BATCH_PAUSE: Pause after the first batch of updates is completed.</li>
<li>BATCH_INTERVAL_PAUSE: Pause between batches.</li>
<li>AUTOMATIC: Do not pause.</li>
     */
    public void setBatchPause(String BatchPause) {
        this.BatchPause = BatchPause;
    }

    /**
     * Get The maximum additional quantity of instances. After this parameter is set, create a batch of additional pay-as-you-go instances according to the launch configuration before the rolling update starts. After the rolling update is completed, the additional instances will be terminated.This parameter is used to ensure a certain number of instances available during the rolling update. The maximum additional quantity of instances cannot exceed the number of refreshing instances in a single batch of the rolling update. The rollback process does not support this parameter currently. 
     * @return MaxSurge The maximum additional quantity of instances. After this parameter is set, create a batch of additional pay-as-you-go instances according to the launch configuration before the rolling update starts. After the rolling update is completed, the additional instances will be terminated.This parameter is used to ensure a certain number of instances available during the rolling update. The maximum additional quantity of instances cannot exceed the number of refreshing instances in a single batch of the rolling update. The rollback process does not support this parameter currently.
     */
    public Long getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set The maximum additional quantity of instances. After this parameter is set, create a batch of additional pay-as-you-go instances according to the launch configuration before the rolling update starts. After the rolling update is completed, the additional instances will be terminated.This parameter is used to ensure a certain number of instances available during the rolling update. The maximum additional quantity of instances cannot exceed the number of refreshing instances in a single batch of the rolling update. The rollback process does not support this parameter currently.
     * @param MaxSurge The maximum additional quantity of instances. After this parameter is set, create a batch of additional pay-as-you-go instances according to the launch configuration before the rolling update starts. After the rolling update is completed, the additional instances will be terminated.This parameter is used to ensure a certain number of instances available during the rolling update. The maximum additional quantity of instances cannot exceed the number of refreshing instances in a single batch of the rolling update. The rollback process does not support this parameter currently.
     */
    public void setMaxSurge(Long MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    public RollingUpdateSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollingUpdateSettings(RollingUpdateSettings source) {
        if (source.BatchNumber != null) {
            this.BatchNumber = new Long(source.BatchNumber);
        }
        if (source.BatchPause != null) {
            this.BatchPause = new String(source.BatchPause);
        }
        if (source.MaxSurge != null) {
            this.MaxSurge = new Long(source.MaxSurge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchNumber", this.BatchNumber);
        this.setParamSimple(map, prefix + "BatchPause", this.BatchPause);
        this.setParamSimple(map, prefix + "MaxSurge", this.MaxSurge);

    }
}

