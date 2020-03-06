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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSyncJobsRequest extends AbstractModel{

    /**
    * Disaster recovery sync task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Disaster recovery sync task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Sort by field. Value range: JobId, Status, JobName, CreateTime
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting order. Value range: ASC (ascending), DESC (descending)
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of the returned instances. Value range: [1, 100]. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Disaster recovery sync task ID 
     * @return JobId Disaster recovery sync task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Disaster recovery sync task ID
     * @param JobId Disaster recovery sync task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Disaster recovery sync task name 
     * @return JobName Disaster recovery sync task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Disaster recovery sync task name
     * @param JobName Disaster recovery sync task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Sort by field. Value range: JobId, Status, JobName, CreateTime 
     * @return Order Sort by field. Value range: JobId, Status, JobName, CreateTime
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort by field. Value range: JobId, Status, JobName, CreateTime
     * @param Order Sort by field. Value range: JobId, Status, JobName, CreateTime
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting order. Value range: ASC (ascending), DESC (descending) 
     * @return OrderSeq Sorting order. Value range: ASC (ascending), DESC (descending)
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set Sorting order. Value range: ASC (ascending), DESC (descending)
     * @param OrderSeq Sorting order. Value range: ASC (ascending), DESC (descending)
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of the returned instances. Value range: [1, 100]. Default value: 20 
     * @return Limit Number of the returned instances. Value range: [1, 100]. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of the returned instances. Value range: [1, 100]. Default value: 20
     * @param Limit Number of the returned instances. Value range: [1, 100]. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

