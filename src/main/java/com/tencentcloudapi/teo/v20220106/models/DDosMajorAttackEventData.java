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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosMajorAttackEventData extends AbstractModel{

    /**
    * `DDosMajorAttackEvent` DDoS attack event
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("List")
    @Expose
    private DDosMajorAttackEvent [] List;

    /**
    * Current page
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Number of items per page
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of pages
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * Total number of items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get `DDosMajorAttackEvent` DDoS attack event
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return List `DDosMajorAttackEvent` DDoS attack event
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDosMajorAttackEvent [] getList() {
        return this.List;
    }

    /**
     * Set `DDosMajorAttackEvent` DDoS attack event
Note: This field may return null, indicating that no valid values can be obtained.
     * @param List `DDosMajorAttackEvent` DDoS attack event
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setList(DDosMajorAttackEvent [] List) {
        this.List = List;
    }

    /**
     * Get Current page
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNo Current page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Current page
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNo Current page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Number of items per page
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageSize Number of items per page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageSize Number of items per page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of pages
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pages Total number of pages
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Total number of pages
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pages Total number of pages
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get Total number of items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize Total number of items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total number of items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalSize Total number of items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public DDosMajorAttackEventData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosMajorAttackEventData(DDosMajorAttackEventData source) {
        if (source.List != null) {
            this.List = new DDosMajorAttackEvent[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new DDosMajorAttackEvent(source.List[i]);
            }
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

