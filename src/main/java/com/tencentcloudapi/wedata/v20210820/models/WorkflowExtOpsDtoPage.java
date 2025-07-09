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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowExtOpsDtoPage extends AbstractModel {

    /**
    * Total Record Count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Record List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private WorkflowExtOpsDto [] Items;

    /**
     * Get Total Record Count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total Record Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total Record Count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total Record Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Record List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Items Record List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WorkflowExtOpsDto [] getItems() {
        return this.Items;
    }

    /**
     * Set Record List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Items Record List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItems(WorkflowExtOpsDto [] Items) {
        this.Items = Items;
    }

    public WorkflowExtOpsDtoPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowExtOpsDtoPage(WorkflowExtOpsDtoPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new WorkflowExtOpsDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkflowExtOpsDto(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

