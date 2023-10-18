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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4RulesErrHealthResponse extends AbstractModel {

    /**
    * Total number of exceptional rules
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Exceptional rule list. Returned value description: `Key` is the rule ID, while `Value` is the exceptional IP. Multiple IPs are separated by ","
    */
    @SerializedName("ErrHealths")
    @Expose
    private KeyValue [] ErrHealths;

    /**
    * Exceptional rule list (which provides more error-related information). Returned value description:
If `key` is `RuleId`, `Value` indicates the rule ID;
If `key` is `Protocol`, `Value` indicates the forwarding protocol of a rule;
If `key` is `VirtualPort`, `Value` indicates the forwarding port of a rule;
If `Key` is `ErrMessage`, `Value` indicates the exception message for health check;
Exception message for health check in the format of `"SourceIp:1.1.1.1|SourcePort:1234|AbnormalStatTime:1570689065|AbnormalReason:connection time out|Interval:20|CheckNum:6|FailNum:6"`. Multiple error messages for the source IP should be separated by `,`,
SourceIp: real server IP, SourcePort: real server port, AbnormalStatTime: exception time, AbnormalReason: cause of exception, Interval: check frequency, CheckNum: number of checks, FailNum: number of failures;
    */
    @SerializedName("ExtErrHealths")
    @Expose
    private KeyValueRecord [] ExtErrHealths;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of exceptional rules 
     * @return Total Total number of exceptional rules
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of exceptional rules
     * @param Total Total number of exceptional rules
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Exceptional rule list. Returned value description: `Key` is the rule ID, while `Value` is the exceptional IP. Multiple IPs are separated by "," 
     * @return ErrHealths Exceptional rule list. Returned value description: `Key` is the rule ID, while `Value` is the exceptional IP. Multiple IPs are separated by ","
     */
    public KeyValue [] getErrHealths() {
        return this.ErrHealths;
    }

    /**
     * Set Exceptional rule list. Returned value description: `Key` is the rule ID, while `Value` is the exceptional IP. Multiple IPs are separated by ","
     * @param ErrHealths Exceptional rule list. Returned value description: `Key` is the rule ID, while `Value` is the exceptional IP. Multiple IPs are separated by ","
     */
    public void setErrHealths(KeyValue [] ErrHealths) {
        this.ErrHealths = ErrHealths;
    }

    /**
     * Get Exceptional rule list (which provides more error-related information). Returned value description:
If `key` is `RuleId`, `Value` indicates the rule ID;
If `key` is `Protocol`, `Value` indicates the forwarding protocol of a rule;
If `key` is `VirtualPort`, `Value` indicates the forwarding port of a rule;
If `Key` is `ErrMessage`, `Value` indicates the exception message for health check;
Exception message for health check in the format of `"SourceIp:1.1.1.1|SourcePort:1234|AbnormalStatTime:1570689065|AbnormalReason:connection time out|Interval:20|CheckNum:6|FailNum:6"`. Multiple error messages for the source IP should be separated by `,`,
SourceIp: real server IP, SourcePort: real server port, AbnormalStatTime: exception time, AbnormalReason: cause of exception, Interval: check frequency, CheckNum: number of checks, FailNum: number of failures; 
     * @return ExtErrHealths Exceptional rule list (which provides more error-related information). Returned value description:
If `key` is `RuleId`, `Value` indicates the rule ID;
If `key` is `Protocol`, `Value` indicates the forwarding protocol of a rule;
If `key` is `VirtualPort`, `Value` indicates the forwarding port of a rule;
If `Key` is `ErrMessage`, `Value` indicates the exception message for health check;
Exception message for health check in the format of `"SourceIp:1.1.1.1|SourcePort:1234|AbnormalStatTime:1570689065|AbnormalReason:connection time out|Interval:20|CheckNum:6|FailNum:6"`. Multiple error messages for the source IP should be separated by `,`,
SourceIp: real server IP, SourcePort: real server port, AbnormalStatTime: exception time, AbnormalReason: cause of exception, Interval: check frequency, CheckNum: number of checks, FailNum: number of failures;
     */
    public KeyValueRecord [] getExtErrHealths() {
        return this.ExtErrHealths;
    }

    /**
     * Set Exceptional rule list (which provides more error-related information). Returned value description:
If `key` is `RuleId`, `Value` indicates the rule ID;
If `key` is `Protocol`, `Value` indicates the forwarding protocol of a rule;
If `key` is `VirtualPort`, `Value` indicates the forwarding port of a rule;
If `Key` is `ErrMessage`, `Value` indicates the exception message for health check;
Exception message for health check in the format of `"SourceIp:1.1.1.1|SourcePort:1234|AbnormalStatTime:1570689065|AbnormalReason:connection time out|Interval:20|CheckNum:6|FailNum:6"`. Multiple error messages for the source IP should be separated by `,`,
SourceIp: real server IP, SourcePort: real server port, AbnormalStatTime: exception time, AbnormalReason: cause of exception, Interval: check frequency, CheckNum: number of checks, FailNum: number of failures;
     * @param ExtErrHealths Exceptional rule list (which provides more error-related information). Returned value description:
If `key` is `RuleId`, `Value` indicates the rule ID;
If `key` is `Protocol`, `Value` indicates the forwarding protocol of a rule;
If `key` is `VirtualPort`, `Value` indicates the forwarding port of a rule;
If `Key` is `ErrMessage`, `Value` indicates the exception message for health check;
Exception message for health check in the format of `"SourceIp:1.1.1.1|SourcePort:1234|AbnormalStatTime:1570689065|AbnormalReason:connection time out|Interval:20|CheckNum:6|FailNum:6"`. Multiple error messages for the source IP should be separated by `,`,
SourceIp: real server IP, SourcePort: real server port, AbnormalStatTime: exception time, AbnormalReason: cause of exception, Interval: check frequency, CheckNum: number of checks, FailNum: number of failures;
     */
    public void setExtErrHealths(KeyValueRecord [] ExtErrHealths) {
        this.ExtErrHealths = ExtErrHealths;
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

    public DescribeL4RulesErrHealthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4RulesErrHealthResponse(DescribeL4RulesErrHealthResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ErrHealths != null) {
            this.ErrHealths = new KeyValue[source.ErrHealths.length];
            for (int i = 0; i < source.ErrHealths.length; i++) {
                this.ErrHealths[i] = new KeyValue(source.ErrHealths[i]);
            }
        }
        if (source.ExtErrHealths != null) {
            this.ExtErrHealths = new KeyValueRecord[source.ExtErrHealths.length];
            for (int i = 0; i < source.ExtErrHealths.length; i++) {
                this.ExtErrHealths[i] = new KeyValueRecord(source.ExtErrHealths[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ErrHealths.", this.ErrHealths);
        this.setParamArrayObj(map, prefix + "ExtErrHealths.", this.ExtErrHealths);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

