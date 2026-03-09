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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskDAGBrief extends AbstractModel {

    /**
    * Task information collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerTasks")
    @Expose
    private TriggerTaskBrief [] TriggerTasks;

    /**
    * Task connection information collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerTaskLinks")
    @Expose
    private TriggerTaskLinkBrief [] TriggerTaskLinks;

    /**
     * Get Task information collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerTasks Task information collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TriggerTaskBrief [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set Task information collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerTasks Task information collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerTasks(TriggerTaskBrief [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get Task connection information collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerTaskLinks Task connection information collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TriggerTaskLinkBrief [] getTriggerTaskLinks() {
        return this.TriggerTaskLinks;
    }

    /**
     * Set Task connection information collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerTaskLinks Task connection information collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerTaskLinks(TriggerTaskLinkBrief [] TriggerTaskLinks) {
        this.TriggerTaskLinks = TriggerTaskLinks;
    }

    public TriggerTaskDAGBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskDAGBrief(TriggerTaskDAGBrief source) {
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new TriggerTaskBrief[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new TriggerTaskBrief(source.TriggerTasks[i]);
            }
        }
        if (source.TriggerTaskLinks != null) {
            this.TriggerTaskLinks = new TriggerTaskLinkBrief[source.TriggerTaskLinks.length];
            for (int i = 0; i < source.TriggerTaskLinks.length; i++) {
                this.TriggerTaskLinks[i] = new TriggerTaskLinkBrief(source.TriggerTaskLinks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamArrayObj(map, prefix + "TriggerTaskLinks.", this.TriggerTaskLinks);

    }
}

