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

public class DescribeBatchOperateTaskPage extends AbstractModel {

    /**
    * Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * ContentNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private DescribeBatchOperateTaskDTO [] Items;

    /**
    * Total count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PageCount Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PageCount Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get ContentNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Items ContentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public DescribeBatchOperateTaskDTO [] getItems() {
        return this.Items;
    }

    /**
     * Set ContentNote: This field may return null, indicating that no valid value can be obtained.
     * @param Items ContentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItems(DescribeBatchOperateTaskDTO [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DescribeBatchOperateTaskPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchOperateTaskPage(DescribeBatchOperateTaskPage source) {
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.Items != null) {
            this.Items = new DescribeBatchOperateTaskDTO[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DescribeBatchOperateTaskDTO(source.Items[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

