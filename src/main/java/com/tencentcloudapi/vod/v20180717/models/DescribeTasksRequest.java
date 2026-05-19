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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Filter condition: Task status. Available values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Filter criteria: file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Filter condition: Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * Filter condition: Task end time.
    */
    @SerializedName("FinishTime")
    @Expose
    private TimeRange FinishTime;

    /**
    * Sorting method. Selectable fields for Sort.Field:
<li> CreateTime Task creation time.</li>
<li>FinishTime Task end time.</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination identifier, used for batch pulling: When a single request cannot retrieve all data, the interface will return ScrollToken. Carry over in next request, will start obtaining from the next record.
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Filter condition: Task status. Available values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed). 
     * @return Status Filter condition: Task status. Available values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Filter condition: Task status. Available values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed).
     * @param Status Filter condition: Task status. Available values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Filter criteria: file ID. 
     * @return FileId Filter criteria: file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Filter criteria: file ID.
     * @param FileId Filter criteria: file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Filter condition: Task creation time. 
     * @return CreateTime Filter condition: Task creation time.
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Filter condition: Task creation time.
     * @param CreateTime Filter condition: Task creation time.
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Filter condition: Task end time. 
     * @return FinishTime Filter condition: Task end time.
     */
    public TimeRange getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Filter condition: Task end time.
     * @param FinishTime Filter condition: Task end time.
     */
    public void setFinishTime(TimeRange FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Sorting method. Selectable fields for Sort.Field:
<li> CreateTime Task creation time.</li>
<li>FinishTime Task end time.</li> 
     * @return Sort Sorting method. Selectable fields for Sort.Field:
<li> CreateTime Task creation time.</li>
<li>FinishTime Task end time.</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting method. Selectable fields for Sort.Field:
<li> CreateTime Task creation time.</li>
<li>FinishTime Task end time.</li>
     * @param Sort Sorting method. Selectable fields for Sort.Field:
<li> CreateTime Task creation time.</li>
<li>FinishTime Task end time.</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination identifier, used for batch pulling: When a single request cannot retrieve all data, the interface will return ScrollToken. Carry over in next request, will start obtaining from the next record. 
     * @return ScrollToken Pagination identifier, used for batch pulling: When a single request cannot retrieve all data, the interface will return ScrollToken. Carry over in next request, will start obtaining from the next record.
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set Pagination identifier, used for batch pulling: When a single request cannot retrieve all data, the interface will return ScrollToken. Carry over in next request, will start obtaining from the next record.
     * @param ScrollToken Pagination identifier, used for batch pulling: When a single request cannot retrieve all data, the interface will return ScrollToken. Carry over in next request, will start obtaining from the next record.
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "FinishTime.", this.FinishTime);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);

    }
}

