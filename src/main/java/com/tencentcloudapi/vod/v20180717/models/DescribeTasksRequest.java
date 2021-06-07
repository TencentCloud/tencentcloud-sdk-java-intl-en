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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Filter: file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Filter: task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * Filter: task end time.
    */
    @SerializedName("FinishTime")
    @Expose
    private TimeRange FinishTime;

    /**
    * (Not supported now)
Sort field. Valid values:
<li>`CreateTime`: task creation time</li>
<li>`FinishTime`: task end time</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed). 
     * @return Status Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
     * @param Status Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Filter: file ID. 
     * @return FileId Filter: file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Filter: file ID.
     * @param FileId Filter: file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Filter: task creation time. 
     * @return CreateTime Filter: task creation time.
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Filter: task creation time.
     * @param CreateTime Filter: task creation time.
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Filter: task end time. 
     * @return FinishTime Filter: task end time.
     */
    public TimeRange getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Filter: task end time.
     * @param FinishTime Filter: task end time.
     */
    public void setFinishTime(TimeRange FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get (Not supported now)
Sort field. Valid values:
<li>`CreateTime`: task creation time</li>
<li>`FinishTime`: task end time</li> 
     * @return Sort (Not supported now)
Sort field. Valid values:
<li>`CreateTime`: task creation time</li>
<li>`FinishTime`: task end time</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set (Not supported now)
Sort field. Valid values:
<li>`CreateTime`: task creation time</li>
<li>`FinishTime`: task end time</li>
     * @param Sort (Not supported now)
Sort field. Valid values:
<li>`CreateTime`: task creation time</li>
<li>`FinishTime`: task end time</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry. 
     * @return ScrollToken Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
     * @param ScrollToken Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new TimeRange(source.FinishTime);
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "FinishTime.", this.FinishTime);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

