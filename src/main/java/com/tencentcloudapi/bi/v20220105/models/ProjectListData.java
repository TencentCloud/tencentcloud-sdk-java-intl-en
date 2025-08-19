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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectListData extends AbstractModel {

    /**
    * Array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("List")
    @Expose
    private Project [] List;

    /**
    * Total number.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
     * Get Array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return List Array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Project [] getList() {
        return this.List;
    }

    /**
     * Set Array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param List Array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setList(Project [] List) {
        this.List = List;
    }

    /**
     * Get Total number.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPages 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPages 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    public ProjectListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectListData(ProjectListData source) {
        if (source.List != null) {
            this.List = new Project[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new Project(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);

    }
}

