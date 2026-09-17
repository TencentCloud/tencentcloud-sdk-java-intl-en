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
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 
    */
    @SerializedName("FinishTime")
    @Expose
    private TimeRange FinishTime;

    /**
    * 
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return FinishTime 
     */
    public TimeRange getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 
     * @param FinishTime 
     */
    public void setFinishTime(TimeRange FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get  
     * @return Sort 
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 
     * @param Sort 
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get  
     * @return Limit 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 
     * @param Limit 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get  
     * @return ScrollToken 
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 
     * @param ScrollToken 
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

