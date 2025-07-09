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

public class ModifyRansomDefenseEventsStatusRequest extends AbstractModel {

    /**
    * An array of event IDs that need to be modified, and batch operation is supported.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Operations. 0: Pending; 1: Processed; 2: Trusted; 9: Delete Record
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether to update all events with the same path.
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
     * Get An array of event IDs that need to be modified, and batch operation is supported. 
     * @return Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set An array of event IDs that need to be modified, and batch operation is supported.
     * @param Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Operations. 0: Pending; 1: Processed; 2: Trusted; 9: Delete Record 
     * @return Status Operations. 0: Pending; 1: Processed; 2: Trusted; 9: Delete Record
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Operations. 0: Pending; 1: Processed; 2: Trusted; 9: Delete Record
     * @param Status Operations. 0: Pending; 1: Processed; 2: Trusted; 9: Delete Record
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to update all events with the same path. 
     * @return All Whether to update all events with the same path.
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to update all events with the same path.
     * @param All Whether to update all events with the same path.
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    public ModifyRansomDefenseEventsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRansomDefenseEventsStatusRequest(ModifyRansomDefenseEventsStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "All", this.All);

    }
}

