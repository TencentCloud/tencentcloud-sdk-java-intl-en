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

public class ModifyJavaMemShellsStatusRequest extends AbstractModel {

    /**
    * Target Processing Status: 0 - Pending, 1 - Allowlisted, 2 - Deleted, 3 - Ignored, 4 - Manually Processed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Event ID Array
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Whether to update all statuses. This parameter takes effect only when the statuses are Ignored, Processed, and Deleted.
    */
    @SerializedName("UpdateAll")
    @Expose
    private Boolean UpdateAll;

    /**
     * Get Target Processing Status: 0 - Pending, 1 - Allowlisted, 2 - Deleted, 3 - Ignored, 4 - Manually Processed 
     * @return Status Target Processing Status: 0 - Pending, 1 - Allowlisted, 2 - Deleted, 3 - Ignored, 4 - Manually Processed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Target Processing Status: 0 - Pending, 1 - Allowlisted, 2 - Deleted, 3 - Ignored, 4 - Manually Processed
     * @param Status Target Processing Status: 0 - Pending, 1 - Allowlisted, 2 - Deleted, 3 - Ignored, 4 - Manually Processed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Event ID Array 
     * @return Ids Event ID Array
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set Event ID Array
     * @param Ids Event ID Array
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Whether to update all statuses. This parameter takes effect only when the statuses are Ignored, Processed, and Deleted. 
     * @return UpdateAll Whether to update all statuses. This parameter takes effect only when the statuses are Ignored, Processed, and Deleted.
     */
    public Boolean getUpdateAll() {
        return this.UpdateAll;
    }

    /**
     * Set Whether to update all statuses. This parameter takes effect only when the statuses are Ignored, Processed, and Deleted.
     * @param UpdateAll Whether to update all statuses. This parameter takes effect only when the statuses are Ignored, Processed, and Deleted.
     */
    public void setUpdateAll(Boolean UpdateAll) {
        this.UpdateAll = UpdateAll;
    }

    public ModifyJavaMemShellsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJavaMemShellsStatusRequest(ModifyJavaMemShellsStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.UpdateAll != null) {
            this.UpdateAll = new Boolean(source.UpdateAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "UpdateAll", this.UpdateAll);

    }
}

