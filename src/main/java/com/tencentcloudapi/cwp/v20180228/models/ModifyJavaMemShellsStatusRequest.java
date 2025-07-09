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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

