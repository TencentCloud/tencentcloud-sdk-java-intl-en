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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupConfig extends AbstractModel {

    /**
    * Target group list.
    */
    @SerializedName("TargetGroups")
    @Expose
    private TargetGroupTuple [] TargetGroups;

    /**
    * Session persistence between target groups
    */
    @SerializedName("TargetGroupStickySession")
    @Expose
    private TargetGroupStickySession TargetGroupStickySession;

    /**
     * Get Target group list. 
     * @return TargetGroups Target group list.
     */
    public TargetGroupTuple [] getTargetGroups() {
        return this.TargetGroups;
    }

    /**
     * Set Target group list.
     * @param TargetGroups Target group list.
     */
    public void setTargetGroups(TargetGroupTuple [] TargetGroups) {
        this.TargetGroups = TargetGroups;
    }

    /**
     * Get Session persistence between target groups 
     * @return TargetGroupStickySession Session persistence between target groups
     */
    public TargetGroupStickySession getTargetGroupStickySession() {
        return this.TargetGroupStickySession;
    }

    /**
     * Set Session persistence between target groups
     * @param TargetGroupStickySession Session persistence between target groups
     */
    public void setTargetGroupStickySession(TargetGroupStickySession TargetGroupStickySession) {
        this.TargetGroupStickySession = TargetGroupStickySession;
    }

    public TargetGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupConfig(TargetGroupConfig source) {
        if (source.TargetGroups != null) {
            this.TargetGroups = new TargetGroupTuple[source.TargetGroups.length];
            for (int i = 0; i < source.TargetGroups.length; i++) {
                this.TargetGroups[i] = new TargetGroupTuple(source.TargetGroups[i]);
            }
        }
        if (source.TargetGroupStickySession != null) {
            this.TargetGroupStickySession = new TargetGroupStickySession(source.TargetGroupStickySession);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TargetGroups.", this.TargetGroups);
        this.setParamObj(map, prefix + "TargetGroupStickySession.", this.TargetGroupStickySession);

    }
}

