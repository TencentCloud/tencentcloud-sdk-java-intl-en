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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigResponse extends AbstractModel {

    /**
    * Execution status. Ignore this parameter.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * New subnet ID of the instance
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * New VPC ID of the instance
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * New private IPv4 address of the instance
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Task ID. Obtain **taskId** and query the task execution status through the API [DescribeTaskInfo](https://intl.cloud.tencent.com/document/product/239/30601?from_cn_redirect=1).
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Execution status. Ignore this parameter. 
     * @return Status Execution status. Ignore this parameter.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Execution status. Ignore this parameter.
     * @param Status Execution status. Ignore this parameter.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get New subnet ID of the instance 
     * @return SubnetId New subnet ID of the instance
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set New subnet ID of the instance
     * @param SubnetId New subnet ID of the instance
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get New VPC ID of the instance 
     * @return VpcId New VPC ID of the instance
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set New VPC ID of the instance
     * @param VpcId New VPC ID of the instance
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get New private IPv4 address of the instance 
     * @return Vip New private IPv4 address of the instance
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set New private IPv4 address of the instance
     * @param Vip New private IPv4 address of the instance
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Task ID. Obtain **taskId** and query the task execution status through the API [DescribeTaskInfo](https://intl.cloud.tencent.com/document/product/239/30601?from_cn_redirect=1). 
     * @return TaskId Task ID. Obtain **taskId** and query the task execution status through the API [DescribeTaskInfo](https://intl.cloud.tencent.com/document/product/239/30601?from_cn_redirect=1).
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID. Obtain **taskId** and query the task execution status through the API [DescribeTaskInfo](https://intl.cloud.tencent.com/document/product/239/30601?from_cn_redirect=1).
     * @param TaskId Task ID. Obtain **taskId** and query the task execution status through the API [DescribeTaskInfo](https://intl.cloud.tencent.com/document/product/239/30601?from_cn_redirect=1).
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyNetworkConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkConfigResponse(ModifyNetworkConfigResponse source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

