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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSyncJobsRequest extends AbstractModel {

    /**
    * Sync task ID, such as `sync-werwfs23`.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Sync task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Sort by field, such as `CreateTime`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting order. Valid values: `ASC`, `DESC`. Default value: `DESC` by `CreateTime`.
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of sync task instances to be returned. Value range: [1,100]. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The set of status values, such as `Initialized,CheckPass,Running,ResumableErr,Stopped`.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Running mode. Valid values: `Immediate`, `Timed`.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * Task type, such as `mysql2mysql` (sync from MySQL to MySQL).
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Billing mode. Valid values: `PrePay` (prepaid); `PostPay` (postpaid).
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * tag
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get Sync task ID, such as `sync-werwfs23`. 
     * @return JobId Sync task ID, such as `sync-werwfs23`.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Sync task ID, such as `sync-werwfs23`.
     * @param JobId Sync task ID, such as `sync-werwfs23`.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Sync task name 
     * @return JobName Sync task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Sync task name
     * @param JobName Sync task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Sort by field, such as `CreateTime`. 
     * @return Order Sort by field, such as `CreateTime`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort by field, such as `CreateTime`.
     * @param Order Sort by field, such as `CreateTime`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting order. Valid values: `ASC`, `DESC`. Default value: `DESC` by `CreateTime`. 
     * @return OrderSeq Sorting order. Valid values: `ASC`, `DESC`. Default value: `DESC` by `CreateTime`.
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set Sorting order. Valid values: `ASC`, `DESC`. Default value: `DESC` by `CreateTime`.
     * @param OrderSeq Sorting order. Valid values: `ASC`, `DESC`. Default value: `DESC` by `CreateTime`.
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of sync task instances to be returned. Value range: [1,100]. Default value: `20`. 
     * @return Limit Number of sync task instances to be returned. Value range: [1,100]. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of sync task instances to be returned. Value range: [1,100]. Default value: `20`.
     * @param Limit Number of sync task instances to be returned. Value range: [1,100]. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The set of status values, such as `Initialized,CheckPass,Running,ResumableErr,Stopped`. 
     * @return Status The set of status values, such as `Initialized,CheckPass,Running,ResumableErr,Stopped`.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set The set of status values, such as `Initialized,CheckPass,Running,ResumableErr,Stopped`.
     * @param Status The set of status values, such as `Initialized,CheckPass,Running,ResumableErr,Stopped`.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Running mode. Valid values: `Immediate`, `Timed`. 
     * @return RunMode Running mode. Valid values: `Immediate`, `Timed`.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Running mode. Valid values: `Immediate`, `Timed`.
     * @param RunMode Running mode. Valid values: `Immediate`, `Timed`.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Task type, such as `mysql2mysql` (sync from MySQL to MySQL). 
     * @return JobType Task type, such as `mysql2mysql` (sync from MySQL to MySQL).
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Task type, such as `mysql2mysql` (sync from MySQL to MySQL).
     * @param JobType Task type, such as `mysql2mysql` (sync from MySQL to MySQL).
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get Billing mode. Valid values: `PrePay` (prepaid); `PostPay` (postpaid). 
     * @return PayMode Billing mode. Valid values: `PrePay` (prepaid); `PostPay` (postpaid).
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Valid values: `PrePay` (prepaid); `PostPay` (postpaid).
     * @param PayMode Billing mode. Valid values: `PrePay` (prepaid); `PostPay` (postpaid).
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get tag 
     * @return TagFilters tag
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set tag
     * @param TagFilters tag
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeSyncJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncJobsRequest(DescribeSyncJobsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderSeq != null) {
            this.OrderSeq = new String(source.OrderSeq);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderSeq", this.OrderSeq);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

