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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveActivityResult extends AbstractModel {

    /**
    * Atomic task type.
<li>LiveRecord: live recording.</li>
<li>AiQualityControl: media quality inspection.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * The task output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveActivityResItem")
    @Expose
    private LiveActivityResItem LiveActivityResItem;

    /**
     * Get Atomic task type.
<li>LiveRecord: live recording.</li>
<li>AiQualityControl: media quality inspection.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActivityType Atomic task type.
<li>LiveRecord: live recording.</li>
<li>AiQualityControl: media quality inspection.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set Atomic task type.
<li>LiveRecord: live recording.</li>
<li>AiQualityControl: media quality inspection.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActivityType Atomic task type.
<li>LiveRecord: live recording.</li>
<li>AiQualityControl: media quality inspection.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get The task output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveActivityResItem The task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveActivityResItem getLiveActivityResItem() {
        return this.LiveActivityResItem;
    }

    /**
     * Set The task output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveActivityResItem The task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveActivityResItem(LiveActivityResItem LiveActivityResItem) {
        this.LiveActivityResItem = LiveActivityResItem;
    }

    public LiveActivityResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveActivityResult(LiveActivityResult source) {
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.LiveActivityResItem != null) {
            this.LiveActivityResItem = new LiveActivityResItem(source.LiveActivityResItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamObj(map, prefix + "LiveActivityResItem.", this.LiveActivityResItem);

    }
}

