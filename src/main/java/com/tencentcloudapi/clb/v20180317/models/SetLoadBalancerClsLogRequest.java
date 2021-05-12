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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetLoadBalancerClsLogRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLS logset ID
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * CLS log topic ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
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
     * Get CLS logset ID 
     * @return LogSetId CLS logset ID
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set CLS logset ID
     * @param LogSetId CLS logset ID
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get CLS log topic ID 
     * @return LogTopicId CLS log topic ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set CLS log topic ID
     * @param LogTopicId CLS log topic ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs). 
     * @return LogType Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     * @param LogType Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
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

