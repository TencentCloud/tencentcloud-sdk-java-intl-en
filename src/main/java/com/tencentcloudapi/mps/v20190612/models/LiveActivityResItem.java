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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveActivityResItem extends AbstractModel {

    /**
    * The output of a live recording task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveRecordTask")
    @Expose
    private LiveScheduleLiveRecordTaskResult LiveRecordTask;

    /**
    * Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveQualityControlTask")
    @Expose
    private ScheduleQualityControlTaskResult LiveQualityControlTask;

    /**
     * Get The output of a live recording task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveRecordTask The output of a live recording task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveScheduleLiveRecordTaskResult getLiveRecordTask() {
        return this.LiveRecordTask;
    }

    /**
     * Set The output of a live recording task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveRecordTask The output of a live recording task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveRecordTask(LiveScheduleLiveRecordTaskResult LiveRecordTask) {
        this.LiveRecordTask = LiveRecordTask;
    }

    /**
     * Get Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveQualityControlTask Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleQualityControlTaskResult getLiveQualityControlTask() {
        return this.LiveQualityControlTask;
    }

    /**
     * Set Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveQualityControlTask Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveQualityControlTask(ScheduleQualityControlTaskResult LiveQualityControlTask) {
        this.LiveQualityControlTask = LiveQualityControlTask;
    }

    public LiveActivityResItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveActivityResItem(LiveActivityResItem source) {
        if (source.LiveRecordTask != null) {
            this.LiveRecordTask = new LiveScheduleLiveRecordTaskResult(source.LiveRecordTask);
        }
        if (source.LiveQualityControlTask != null) {
            this.LiveQualityControlTask = new ScheduleQualityControlTaskResult(source.LiveQualityControlTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LiveRecordTask.", this.LiveRecordTask);
        this.setParamObj(map, prefix + "LiveQualityControlTask.", this.LiveQualityControlTask);

    }
}

