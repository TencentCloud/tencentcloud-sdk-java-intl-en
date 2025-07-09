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
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Logset ID of the Cloud Log Service (CLS).<li>When adding or updating a log topic, call the [DescribeLogsets](https://intl.cloud.tencent.com/document/product/614/58624?from_cn_redirect=1) API to obtain the logset ID.</li><li>When deleting a log topic, set this parameter to null.</li>
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID of the CLS.<li>When adding or updating a log topic, call the [DescribeTopics](https://intl.cloud.tencent.com/document/product/614/56454?from_cn_redirect=1) API to obtain the log topic ID.</li><li>When deleting a log topic, set this parameter to null.</li>
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
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Logset ID of the Cloud Log Service (CLS).<li>When adding or updating a log topic, call the [DescribeLogsets](https://intl.cloud.tencent.com/document/product/614/58624?from_cn_redirect=1) API to obtain the logset ID.</li><li>When deleting a log topic, set this parameter to null.</li> 
     * @return LogSetId Logset ID of the Cloud Log Service (CLS).<li>When adding or updating a log topic, call the [DescribeLogsets](https://intl.cloud.tencent.com/document/product/614/58624?from_cn_redirect=1) API to obtain the logset ID.</li><li>When deleting a log topic, set this parameter to null.</li>
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Logset ID of the Cloud Log Service (CLS).<li>When adding or updating a log topic, call the [DescribeLogsets](https://intl.cloud.tencent.com/document/product/614/58624?from_cn_redirect=1) API to obtain the logset ID.</li><li>When deleting a log topic, set this parameter to null.</li>
     * @param LogSetId Logset ID of the Cloud Log Service (CLS).<li>When adding or updating a log topic, call the [DescribeLogsets](https://intl.cloud.tencent.com/document/product/614/58624?from_cn_redirect=1) API to obtain the logset ID.</li><li>When deleting a log topic, set this parameter to null.</li>
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID of the CLS.<li>When adding or updating a log topic, call the [DescribeTopics](https://intl.cloud.tencent.com/document/product/614/56454?from_cn_redirect=1) API to obtain the log topic ID.</li><li>When deleting a log topic, set this parameter to null.</li> 
     * @return LogTopicId Log topic ID of the CLS.<li>When adding or updating a log topic, call the [DescribeTopics](https://intl.cloud.tencent.com/document/product/614/56454?from_cn_redirect=1) API to obtain the log topic ID.</li><li>When deleting a log topic, set this parameter to null.</li>
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID of the CLS.<li>When adding or updating a log topic, call the [DescribeTopics](https://intl.cloud.tencent.com/document/product/614/56454?from_cn_redirect=1) API to obtain the log topic ID.</li><li>When deleting a log topic, set this parameter to null.</li>
     * @param LogTopicId Log topic ID of the CLS.<li>When adding or updating a log topic, call the [DescribeTopics](https://intl.cloud.tencent.com/document/product/614/56454?from_cn_redirect=1) API to obtain the log topic ID.</li><li>When deleting a log topic, set this parameter to null.</li>
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

