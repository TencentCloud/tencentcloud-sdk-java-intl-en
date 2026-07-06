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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageByNoResult extends AbstractModel {

    /**
    * Total data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Current page number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentPageNo")
    @Expose
    private Long CurrentPageNo;

    /**
    * [Deprecated] Whether it has reached the end.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

    /**
    * Whether it has traversed to the end.
    */
    @SerializedName("End")
    @Expose
    private Boolean End;

    /**
     * Get Total data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPage Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPage Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Current page number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentPageNo Current page number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentPageNo() {
        return this.CurrentPageNo;
    }

    /**
     * Set Current page number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentPageNo Current page number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentPageNo(Long CurrentPageNo) {
        this.CurrentPageNo = CurrentPageNo;
    }

    /**
     * Get [Deprecated] Whether it has reached the end.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsEnd [Deprecated] Whether it has reached the end.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set [Deprecated] Whether it has reached the end.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsEnd [Deprecated] Whether it has reached the end.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get Whether it has traversed to the end. 
     * @return End Whether it has traversed to the end.
     */
    public Boolean getEnd() {
        return this.End;
    }

    /**
     * Set Whether it has traversed to the end.
     * @param End Whether it has traversed to the end.
     */
    public void setEnd(Boolean End) {
        this.End = End;
    }

    public PageByNoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNoResult(PageByNoResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.CurrentPageNo != null) {
            this.CurrentPageNo = new Long(source.CurrentPageNo);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Boolean(source.IsEnd);
        }
        if (source.End != null) {
            this.End = new Boolean(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "CurrentPageNo", this.CurrentPageNo);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

