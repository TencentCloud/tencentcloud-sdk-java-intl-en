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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQUserResponse extends AbstractModel {

    /**
    * Returned number of users
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The list of the created TDMQ for RabbitMQ users
    */
    @SerializedName("RabbitMQUserList")
    @Expose
    private RabbitMQUser [] RabbitMQUserList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returned number of users 
     * @return TotalCount Returned number of users
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Returned number of users
     * @param TotalCount Returned number of users
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The list of the created TDMQ for RabbitMQ users 
     * @return RabbitMQUserList The list of the created TDMQ for RabbitMQ users
     */
    public RabbitMQUser [] getRabbitMQUserList() {
        return this.RabbitMQUserList;
    }

    /**
     * Set The list of the created TDMQ for RabbitMQ users
     * @param RabbitMQUserList The list of the created TDMQ for RabbitMQ users
     */
    public void setRabbitMQUserList(RabbitMQUser [] RabbitMQUserList) {
        this.RabbitMQUserList = RabbitMQUserList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRabbitMQUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQUserResponse(DescribeRabbitMQUserResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RabbitMQUserList != null) {
            this.RabbitMQUserList = new RabbitMQUser[source.RabbitMQUserList.length];
            for (int i = 0; i < source.RabbitMQUserList.length; i++) {
                this.RabbitMQUserList[i] = new RabbitMQUser(source.RabbitMQUserList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RabbitMQUserList.", this.RabbitMQUserList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

