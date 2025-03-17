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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCronJobsRequest extends AbstractModel {

    /**
    * Array of Project ID.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Offset. Default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Array of CronJob ID.
    */
    @SerializedName("CronJobIds")
    @Expose
    private String [] CronJobIds;

    /**
    * CronJob name, fuzzy query.
    */
    @SerializedName("CronJobName")
    @Expose
    private String CronJobName;

    /**
    * Array of CronJob status.
    */
    @SerializedName("CronJobStatus")
    @Expose
    private Long [] CronJobStatus;

    /**
    * Column for sorting.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Whether in ascending order.
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
     * Get Array of Project ID. 
     * @return ProjectIds Array of Project ID.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of Project ID.
     * @param ProjectIds Array of Project ID.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Offset. Default value is 0. 
     * @return Offset Offset. Default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value is 0.
     * @param Offset Offset. Default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns. 
     * @return Limit Number of returns.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns.
     * @param Limit Number of returns.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Array of CronJob ID. 
     * @return CronJobIds Array of CronJob ID.
     */
    public String [] getCronJobIds() {
        return this.CronJobIds;
    }

    /**
     * Set Array of CronJob ID.
     * @param CronJobIds Array of CronJob ID.
     */
    public void setCronJobIds(String [] CronJobIds) {
        this.CronJobIds = CronJobIds;
    }

    /**
     * Get CronJob name, fuzzy query. 
     * @return CronJobName CronJob name, fuzzy query.
     */
    public String getCronJobName() {
        return this.CronJobName;
    }

    /**
     * Set CronJob name, fuzzy query.
     * @param CronJobName CronJob name, fuzzy query.
     */
    public void setCronJobName(String CronJobName) {
        this.CronJobName = CronJobName;
    }

    /**
     * Get Array of CronJob status. 
     * @return CronJobStatus Array of CronJob status.
     */
    public Long [] getCronJobStatus() {
        return this.CronJobStatus;
    }

    /**
     * Set Array of CronJob status.
     * @param CronJobStatus Array of CronJob status.
     */
    public void setCronJobStatus(Long [] CronJobStatus) {
        this.CronJobStatus = CronJobStatus;
    }

    /**
     * Get Column for sorting. 
     * @return OrderBy Column for sorting.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Column for sorting.
     * @param OrderBy Column for sorting.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Whether in ascending order. 
     * @return Ascend Whether in ascending order.
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set Whether in ascending order.
     * @param Ascend Whether in ascending order.
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    public DescribeCronJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCronJobsRequest(DescribeCronJobsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CronJobIds != null) {
            this.CronJobIds = new String[source.CronJobIds.length];
            for (int i = 0; i < source.CronJobIds.length; i++) {
                this.CronJobIds[i] = new String(source.CronJobIds[i]);
            }
        }
        if (source.CronJobName != null) {
            this.CronJobName = new String(source.CronJobName);
        }
        if (source.CronJobStatus != null) {
            this.CronJobStatus = new Long[source.CronJobStatus.length];
            for (int i = 0; i < source.CronJobStatus.length; i++) {
                this.CronJobStatus[i] = new Long(source.CronJobStatus[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "CronJobIds.", this.CronJobIds);
        this.setParamSimple(map, prefix + "CronJobName", this.CronJobName);
        this.setParamArraySimple(map, prefix + "CronJobStatus.", this.CronJobStatus);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);

    }
}

