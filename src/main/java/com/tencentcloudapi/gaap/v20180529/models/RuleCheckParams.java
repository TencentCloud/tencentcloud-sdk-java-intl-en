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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCheckParams extends AbstractModel{

    /**
    * Time interval of health check
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * Response timeout of health check
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * Check path of health check
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Health check method: GET/HEAD
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Return code indicting normal origin servers. Value range: [100, 200, 300, 400, 500]
    */
    @SerializedName("StatusCode")
    @Expose
    private Long [] StatusCode;

    /**
    * Domain name to be performed health check
You cannot modify this parameter when calling ModifyRuleAttribute API.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Origin server failure check frequency
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedCountInter")
    @Expose
    private Long FailedCountInter;

    /**
    * Origin server health check threshold. All requests to the origin server will be blocked once the threshold is exceeded.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedThreshold")
    @Expose
    private Long FailedThreshold;

    /**
    * Duration to block requests targeting the origin server after a failed health check
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BlockInter")
    @Expose
    private Long BlockInter;

    /**
     * Get Time interval of health check 
     * @return DelayLoop Time interval of health check
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set Time interval of health check
     * @param DelayLoop Time interval of health check
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get Response timeout of health check 
     * @return ConnectTimeout Response timeout of health check
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Response timeout of health check
     * @param ConnectTimeout Response timeout of health check
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get Check path of health check 
     * @return Path Check path of health check
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Check path of health check
     * @param Path Check path of health check
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Health check method: GET/HEAD 
     * @return Method Health check method: GET/HEAD
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Health check method: GET/HEAD
     * @param Method Health check method: GET/HEAD
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Return code indicting normal origin servers. Value range: [100, 200, 300, 400, 500] 
     * @return StatusCode Return code indicting normal origin servers. Value range: [100, 200, 300, 400, 500]
     */
    public Long [] getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Return code indicting normal origin servers. Value range: [100, 200, 300, 400, 500]
     * @param StatusCode Return code indicting normal origin servers. Value range: [100, 200, 300, 400, 500]
     */
    public void setStatusCode(Long [] StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Domain name to be performed health check
You cannot modify this parameter when calling ModifyRuleAttribute API. 
     * @return Domain Domain name to be performed health check
You cannot modify this parameter when calling ModifyRuleAttribute API.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name to be performed health check
You cannot modify this parameter when calling ModifyRuleAttribute API.
     * @param Domain Domain name to be performed health check
You cannot modify this parameter when calling ModifyRuleAttribute API.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Origin server failure check frequency
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FailedCountInter Origin server failure check frequency
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFailedCountInter() {
        return this.FailedCountInter;
    }

    /**
     * Set Origin server failure check frequency
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FailedCountInter Origin server failure check frequency
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFailedCountInter(Long FailedCountInter) {
        this.FailedCountInter = FailedCountInter;
    }

    /**
     * Get Origin server health check threshold. All requests to the origin server will be blocked once the threshold is exceeded.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FailedThreshold Origin server health check threshold. All requests to the origin server will be blocked once the threshold is exceeded.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFailedThreshold() {
        return this.FailedThreshold;
    }

    /**
     * Set Origin server health check threshold. All requests to the origin server will be blocked once the threshold is exceeded.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FailedThreshold Origin server health check threshold. All requests to the origin server will be blocked once the threshold is exceeded.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFailedThreshold(Long FailedThreshold) {
        this.FailedThreshold = FailedThreshold;
    }

    /**
     * Get Duration to block requests targeting the origin server after a failed health check
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BlockInter Duration to block requests targeting the origin server after a failed health check
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getBlockInter() {
        return this.BlockInter;
    }

    /**
     * Set Duration to block requests targeting the origin server after a failed health check
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BlockInter Duration to block requests targeting the origin server after a failed health check
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBlockInter(Long BlockInter) {
        this.BlockInter = BlockInter;
    }

    public RuleCheckParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCheckParams(RuleCheckParams source) {
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long[source.StatusCode.length];
            for (int i = 0; i < source.StatusCode.length; i++) {
                this.StatusCode[i] = new Long(source.StatusCode[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.FailedCountInter != null) {
            this.FailedCountInter = new Long(source.FailedCountInter);
        }
        if (source.FailedThreshold != null) {
            this.FailedThreshold = new Long(source.FailedThreshold);
        }
        if (source.BlockInter != null) {
            this.BlockInter = new Long(source.BlockInter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "StatusCode.", this.StatusCode);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "FailedCountInter", this.FailedCountInter);
        this.setParamSimple(map, prefix + "FailedThreshold", this.FailedThreshold);
        this.setParamSimple(map, prefix + "BlockInter", this.BlockInter);

    }
}

