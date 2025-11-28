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

public class CreateConsumerGroupRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Maximum number of retries. Value range: 0 to 1000.
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * Whether to enable consumption.
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * Specifies whether to use ordered delivery. valid values: true.
Concurrent delivery: false.
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.comom/document/api/1493/101535?from_cn_redirect=1) or from the console.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Remarks. Up to 128 characters are allowed.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Tag list
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Maximum number of retries. Value range: 0 to 1000. 
     * @return MaxRetryTimes Maximum number of retries. Value range: 0 to 1000.
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set Maximum number of retries. Value range: 0 to 1000.
     * @param MaxRetryTimes Maximum number of retries. Value range: 0 to 1000.
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get Whether to enable consumption. 
     * @return ConsumeEnable Whether to enable consumption.
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set Whether to enable consumption.
     * @param ConsumeEnable Whether to enable consumption.
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get Specifies whether to use ordered delivery. valid values: true.
Concurrent delivery: false. 
     * @return ConsumeMessageOrderly Specifies whether to use ordered delivery. valid values: true.
Concurrent delivery: false.
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set Specifies whether to use ordered delivery. valid values: true.
Concurrent delivery: false.
     * @param ConsumeMessageOrderly Specifies whether to use ordered delivery. valid values: true.
Concurrent delivery: false.
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.comom/document/api/1493/101535?from_cn_redirect=1) or from the console. 
     * @return ConsumerGroup Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.comom/document/api/1493/101535?from_cn_redirect=1) or from the console.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.comom/document/api/1493/101535?from_cn_redirect=1) or from the console.
     * @param ConsumerGroup Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.comom/document/api/1493/101535?from_cn_redirect=1) or from the console.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Remarks. Up to 128 characters are allowed. 
     * @return Remark Remarks. Up to 128 characters are allowed.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks. Up to 128 characters are allowed.
     * @param Remark Remarks. Up to 128 characters are allowed.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Tag list 
     * @return TagList Tag list
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag list
     * @param TagList Tag list
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerGroupRequest(CreateConsumerGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

