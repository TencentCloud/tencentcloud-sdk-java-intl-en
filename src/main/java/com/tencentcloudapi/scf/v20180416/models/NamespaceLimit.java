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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceLimit extends AbstractModel{

    /**
    * Total number of functions
    */
    @SerializedName("FunctionsCount")
    @Expose
    private Long FunctionsCount;

    /**
    * Trigger information
    */
    @SerializedName("Trigger")
    @Expose
    private TriggerCount Trigger;

    /**
    * Namespace name
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Concurrency
    */
    @SerializedName("ConcurrentExecutions")
    @Expose
    private Long ConcurrentExecutions;

    /**
    * Timeout limit
    */
    @SerializedName("TimeoutLimit")
    @Expose
    private Long TimeoutLimit;

    /**
    * Test event limit
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TestModelLimit")
    @Expose
    private Long TestModelLimit;

    /**
    * Initialization timeout limit
    */
    @SerializedName("InitTimeoutLimit")
    @Expose
    private Long InitTimeoutLimit;

    /**
    * Limit of async retry attempt quantity
    */
    @SerializedName("RetryNumLimit")
    @Expose
    private Long RetryNumLimit;

    /**
    * Lower limit of message retention time for async retry
    */
    @SerializedName("MinMsgTTL")
    @Expose
    private Long MinMsgTTL;

    /**
    * Upper limit of message retention time for async retry
    */
    @SerializedName("MaxMsgTTL")
    @Expose
    private Long MaxMsgTTL;

    /**
     * Get Total number of functions 
     * @return FunctionsCount Total number of functions
     */
    public Long getFunctionsCount() {
        return this.FunctionsCount;
    }

    /**
     * Set Total number of functions
     * @param FunctionsCount Total number of functions
     */
    public void setFunctionsCount(Long FunctionsCount) {
        this.FunctionsCount = FunctionsCount;
    }

    /**
     * Get Trigger information 
     * @return Trigger Trigger information
     */
    public TriggerCount getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Trigger information
     * @param Trigger Trigger information
     */
    public void setTrigger(TriggerCount Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Namespace name 
     * @return Namespace Namespace name
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name
     * @param Namespace Namespace name
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Concurrency 
     * @return ConcurrentExecutions Concurrency
     */
    public Long getConcurrentExecutions() {
        return this.ConcurrentExecutions;
    }

    /**
     * Set Concurrency
     * @param ConcurrentExecutions Concurrency
     */
    public void setConcurrentExecutions(Long ConcurrentExecutions) {
        this.ConcurrentExecutions = ConcurrentExecutions;
    }

    /**
     * Get Timeout limit 
     * @return TimeoutLimit Timeout limit
     */
    public Long getTimeoutLimit() {
        return this.TimeoutLimit;
    }

    /**
     * Set Timeout limit
     * @param TimeoutLimit Timeout limit
     */
    public void setTimeoutLimit(Long TimeoutLimit) {
        this.TimeoutLimit = TimeoutLimit;
    }

    /**
     * Get Test event limit
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TestModelLimit Test event limit
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTestModelLimit() {
        return this.TestModelLimit;
    }

    /**
     * Set Test event limit
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TestModelLimit Test event limit
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTestModelLimit(Long TestModelLimit) {
        this.TestModelLimit = TestModelLimit;
    }

    /**
     * Get Initialization timeout limit 
     * @return InitTimeoutLimit Initialization timeout limit
     */
    public Long getInitTimeoutLimit() {
        return this.InitTimeoutLimit;
    }

    /**
     * Set Initialization timeout limit
     * @param InitTimeoutLimit Initialization timeout limit
     */
    public void setInitTimeoutLimit(Long InitTimeoutLimit) {
        this.InitTimeoutLimit = InitTimeoutLimit;
    }

    /**
     * Get Limit of async retry attempt quantity 
     * @return RetryNumLimit Limit of async retry attempt quantity
     */
    public Long getRetryNumLimit() {
        return this.RetryNumLimit;
    }

    /**
     * Set Limit of async retry attempt quantity
     * @param RetryNumLimit Limit of async retry attempt quantity
     */
    public void setRetryNumLimit(Long RetryNumLimit) {
        this.RetryNumLimit = RetryNumLimit;
    }

    /**
     * Get Lower limit of message retention time for async retry 
     * @return MinMsgTTL Lower limit of message retention time for async retry
     */
    public Long getMinMsgTTL() {
        return this.MinMsgTTL;
    }

    /**
     * Set Lower limit of message retention time for async retry
     * @param MinMsgTTL Lower limit of message retention time for async retry
     */
    public void setMinMsgTTL(Long MinMsgTTL) {
        this.MinMsgTTL = MinMsgTTL;
    }

    /**
     * Get Upper limit of message retention time for async retry 
     * @return MaxMsgTTL Upper limit of message retention time for async retry
     */
    public Long getMaxMsgTTL() {
        return this.MaxMsgTTL;
    }

    /**
     * Set Upper limit of message retention time for async retry
     * @param MaxMsgTTL Upper limit of message retention time for async retry
     */
    public void setMaxMsgTTL(Long MaxMsgTTL) {
        this.MaxMsgTTL = MaxMsgTTL;
    }

    public NamespaceLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceLimit(NamespaceLimit source) {
        if (source.FunctionsCount != null) {
            this.FunctionsCount = new Long(source.FunctionsCount);
        }
        if (source.Trigger != null) {
            this.Trigger = new TriggerCount(source.Trigger);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ConcurrentExecutions != null) {
            this.ConcurrentExecutions = new Long(source.ConcurrentExecutions);
        }
        if (source.TimeoutLimit != null) {
            this.TimeoutLimit = new Long(source.TimeoutLimit);
        }
        if (source.TestModelLimit != null) {
            this.TestModelLimit = new Long(source.TestModelLimit);
        }
        if (source.InitTimeoutLimit != null) {
            this.InitTimeoutLimit = new Long(source.InitTimeoutLimit);
        }
        if (source.RetryNumLimit != null) {
            this.RetryNumLimit = new Long(source.RetryNumLimit);
        }
        if (source.MinMsgTTL != null) {
            this.MinMsgTTL = new Long(source.MinMsgTTL);
        }
        if (source.MaxMsgTTL != null) {
            this.MaxMsgTTL = new Long(source.MaxMsgTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionsCount", this.FunctionsCount);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ConcurrentExecutions", this.ConcurrentExecutions);
        this.setParamSimple(map, prefix + "TimeoutLimit", this.TimeoutLimit);
        this.setParamSimple(map, prefix + "TestModelLimit", this.TestModelLimit);
        this.setParamSimple(map, prefix + "InitTimeoutLimit", this.InitTimeoutLimit);
        this.setParamSimple(map, prefix + "RetryNumLimit", this.RetryNumLimit);
        this.setParamSimple(map, prefix + "MinMsgTTL", this.MinMsgTTL);
        this.setParamSimple(map, prefix + "MaxMsgTTL", this.MaxMsgTTL);

    }
}

