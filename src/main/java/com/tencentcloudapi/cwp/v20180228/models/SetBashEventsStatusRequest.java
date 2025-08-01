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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetBashEventsStatusRequest extends AbstractModel {

    /**
    * ID array (The maximum number of IDs is 100)
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * New status (0 - pending; 1 - high-risk; 2 - normal)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get ID array (The maximum number of IDs is 100) 
     * @return Ids ID array (The maximum number of IDs is 100)
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set ID array (The maximum number of IDs is 100)
     * @param Ids ID array (The maximum number of IDs is 100)
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get New status (0 - pending; 1 - high-risk; 2 - normal) 
     * @return Status New status (0 - pending; 1 - high-risk; 2 - normal)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set New status (0 - pending; 1 - high-risk; 2 - normal)
     * @param Status New status (0 - pending; 1 - high-risk; 2 - normal)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SetBashEventsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetBashEventsStatusRequest(SetBashEventsStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

