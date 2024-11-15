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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupInLoadBalancer extends AbstractModel {

    /**
    * Priority, in the format of "priority_" + "number". The highest priority is "priority_1". Reference values:
<li>priority_1: first priority.</li>
<li>priority_2: second priority.</li>
<li>priority_3: third priority.</li> You can increase numbers for other priorities, up to "priority_10".
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * Origin server group ID.
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
     * Get Priority, in the format of "priority_" + "number". The highest priority is "priority_1". Reference values:
<li>priority_1: first priority.</li>
<li>priority_2: second priority.</li>
<li>priority_3: third priority.</li> You can increase numbers for other priorities, up to "priority_10". 
     * @return Priority Priority, in the format of "priority_" + "number". The highest priority is "priority_1". Reference values:
<li>priority_1: first priority.</li>
<li>priority_2: second priority.</li>
<li>priority_3: third priority.</li> You can increase numbers for other priorities, up to "priority_10".
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority, in the format of "priority_" + "number". The highest priority is "priority_1". Reference values:
<li>priority_1: first priority.</li>
<li>priority_2: second priority.</li>
<li>priority_3: third priority.</li> You can increase numbers for other priorities, up to "priority_10".
     * @param Priority Priority, in the format of "priority_" + "number". The highest priority is "priority_1". Reference values:
<li>priority_1: first priority.</li>
<li>priority_2: second priority.</li>
<li>priority_3: third priority.</li> You can increase numbers for other priorities, up to "priority_10".
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Origin server group ID. 
     * @return OriginGroupId Origin server group ID.
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set Origin server group ID.
     * @param OriginGroupId Origin server group ID.
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    public OriginGroupInLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupInLoadBalancer(OriginGroupInLoadBalancer source) {
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);

    }
}

