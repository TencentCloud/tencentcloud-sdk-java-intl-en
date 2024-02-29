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
    * Pause policy between batches. Default value: Automatic. Valid values: <br><li>FIRST_BATCH_PAUSE: Pause after the first batch update completes.</li> <li>BATCH_INTERVAL_PAUSE: Pause between each batch update.</li> <li>AUTOMATIC: No pauses.
    */
    @SerializedName("BatchPause")
    @Expose
    private String BatchPause;

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
     * Get Pause policy between batches. Default value: Automatic. Valid values: <br><li>FIRST_BATCH_PAUSE: Pause after the first batch update completes.</li> <li>BATCH_INTERVAL_PAUSE: Pause between each batch update.</li> <li>AUTOMATIC: No pauses. 
     * @return BatchPause Pause policy between batches. Default value: Automatic. Valid values: <br><li>FIRST_BATCH_PAUSE: Pause after the first batch update completes.</li> <li>BATCH_INTERVAL_PAUSE: Pause between each batch update.</li> <li>AUTOMATIC: No pauses.
     */
    public String getBatchPause() {
        return this.BatchPause;
    }

    /**
     * Set Pause policy between batches. Default value: Automatic. Valid values: <br><li>FIRST_BATCH_PAUSE: Pause after the first batch update completes.</li> <li>BATCH_INTERVAL_PAUSE: Pause between each batch update.</li> <li>AUTOMATIC: No pauses.
     * @param BatchPause Pause policy between batches. Default value: Automatic. Valid values: <br><li>FIRST_BATCH_PAUSE: Pause after the first batch update completes.</li> <li>BATCH_INTERVAL_PAUSE: Pause between each batch update.</li> <li>AUTOMATIC: No pauses.
     */
    public void setBatchPause(String BatchPause) {
        this.BatchPause = BatchPause;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchNumber", this.BatchNumber);
        this.setParamSimple(map, prefix + "BatchPause", this.BatchPause);

    }
}

