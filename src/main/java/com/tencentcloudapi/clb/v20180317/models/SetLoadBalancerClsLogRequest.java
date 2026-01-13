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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetLoadBalancerClsLogRequest extends AbstractModel {

    /**
    * ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Log set ID of cloud log service (CLS).
<li>Specifies the logset ID that can be obtained by calling the [DescribeLogsets](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Specifies the log topic ID of cloud log service (CLS).
<li>Specifies the log topic ID can be obtained by calling the [DescribeTopics](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * Log type:
<li>`ACCESS`: access logs</li>
<li>`HEALTH`: health check logs</li>
Default: `ACCESS`
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID. 
     * @return LoadBalancerId ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
     * @param LoadBalancerId ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Log set ID of cloud log service (CLS).
<li>Specifies the logset ID that can be obtained by calling the [DescribeLogsets](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>. 
     * @return LogSetId Log set ID of cloud log service (CLS).
<li>Specifies the logset ID that can be obtained by calling the [DescribeLogsets](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Log set ID of cloud log service (CLS).
<li>Specifies the logset ID that can be obtained by calling the [DescribeLogsets](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
     * @param LogSetId Log set ID of cloud log service (CLS).
<li>Specifies the logset ID that can be obtained by calling the [DescribeLogsets](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Specifies the log topic ID of cloud log service (CLS).
<li>Specifies the log topic ID can be obtained by calling the [DescribeTopics](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>. 
     * @return LogTopicId Specifies the log topic ID of cloud log service (CLS).
<li>Specifies the log topic ID can be obtained by calling the [DescribeTopics](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Specifies the log topic ID of cloud log service (CLS).
<li>Specifies the log topic ID can be obtained by calling the [DescribeTopics](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
     * @param LogTopicId Specifies the log topic ID of cloud log service (CLS).
<li>Specifies the log topic ID can be obtained by calling the [DescribeTopics](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1) API when adding or updating a log topic.</li>.
<Li>When deleting a log topic, set this parameter to an empty string.</li>.
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get Log type:
<li>`ACCESS`: access logs</li>
<li>`HEALTH`: health check logs</li>
Default: `ACCESS` 
     * @return LogType Log type:
<li>`ACCESS`: access logs</li>
<li>`HEALTH`: health check logs</li>
Default: `ACCESS`
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type:
<li>`ACCESS`: access logs</li>
<li>`HEALTH`: health check logs</li>
Default: `ACCESS`
     * @param LogType Log type:
<li>`ACCESS`: access logs</li>
<li>`HEALTH`: health check logs</li>
Default: `ACCESS`
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public SetLoadBalancerClsLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetLoadBalancerClsLogRequest(SetLoadBalancerClsLogRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

