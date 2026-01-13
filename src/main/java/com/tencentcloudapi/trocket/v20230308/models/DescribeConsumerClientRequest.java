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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerClientRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Client ID. It can be obtained from the output parameters of [ConsumerClient](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumerClient) of the API [DescribeConsumerClientList](https://www.tencentcloud.com/document/api/1493/120140?from_cn_redirect=1).
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Filtering condition list. See the description of the API using this parameter for the usage method.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Starting position of the query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of queried results. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Client ID. It can be obtained from the output parameters of [ConsumerClient](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumerClient) of the API [DescribeConsumerClientList](https://www.tencentcloud.com/document/api/1493/120140?from_cn_redirect=1). 
     * @return ClientId Client ID. It can be obtained from the output parameters of [ConsumerClient](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumerClient) of the API [DescribeConsumerClientList](https://www.tencentcloud.com/document/api/1493/120140?from_cn_redirect=1).
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID. It can be obtained from the output parameters of [ConsumerClient](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumerClient) of the API [DescribeConsumerClientList](https://www.tencentcloud.com/document/api/1493/120140?from_cn_redirect=1).
     * @param ClientId Client ID. It can be obtained from the output parameters of [ConsumerClient](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumerClient) of the API [DescribeConsumerClientList](https://www.tencentcloud.com/document/api/1493/120140?from_cn_redirect=1).
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Filtering condition list. See the description of the API using this parameter for the usage method. 
     * @return Filters Filtering condition list. See the description of the API using this parameter for the usage method.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering condition list. See the description of the API using this parameter for the usage method.
     * @param Filters Filtering condition list. See the description of the API using this parameter for the usage method.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Starting position of the query. Default value: 0. 
     * @return Offset Starting position of the query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting position of the query. Default value: 0.
     * @param Offset Starting position of the query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of queried results. Default value: 20. 
     * @return Limit Maximum number of queried results. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of queried results. Default value: 20.
     * @param Limit Maximum number of queried results. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console. 
     * @return ConsumerGroup Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
     * @param ConsumerGroup Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    public DescribeConsumerClientRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerClientRequest(DescribeConsumerClientRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);

    }
}

