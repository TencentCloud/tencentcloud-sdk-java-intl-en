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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackStatusStatistics extends AbstractModel{

    /**
    * Messages with receipt.
    */
    @SerializedName("CallbackCount")
    @Expose
    private Long CallbackCount;

    /**
    * Successfully submitted SMS messages.
    */
    @SerializedName("RequestSuccessCount")
    @Expose
    private Long RequestSuccessCount;

    /**
    * Failed receipts.
    */
    @SerializedName("CallbackFailCount")
    @Expose
    private Long CallbackFailCount;

    /**
    * Successful receipts.
    */
    @SerializedName("CallbackSuccessCount")
    @Expose
    private Long CallbackSuccessCount;

    /**
    * Carrier's internal error.
    */
    @SerializedName("InternalErrorCount")
    @Expose
    private Long InternalErrorCount;

    /**
    * Invalid numbers.
    */
    @SerializedName("InvalidNumberCount")
    @Expose
    private Long InvalidNumberCount;

    /**
    * Errors such as out-of-service or power-off.
    */
    @SerializedName("ShutdownErrorCount")
    @Expose
    private Long ShutdownErrorCount;

    /**
    * Blocked mobile numbers.
    */
    @SerializedName("BlackListCount")
    @Expose
    private Long BlackListCount;

    /**
    * Carrier rate limit hits.
    */
    @SerializedName("FrequencyLimitCount")
    @Expose
    private Long FrequencyLimitCount;

    /**
     * Get Messages with receipt. 
     * @return CallbackCount Messages with receipt.
     */
    public Long getCallbackCount() {
        return this.CallbackCount;
    }

    /**
     * Set Messages with receipt.
     * @param CallbackCount Messages with receipt.
     */
    public void setCallbackCount(Long CallbackCount) {
        this.CallbackCount = CallbackCount;
    }

    /**
     * Get Successfully submitted SMS messages. 
     * @return RequestSuccessCount Successfully submitted SMS messages.
     */
    public Long getRequestSuccessCount() {
        return this.RequestSuccessCount;
    }

    /**
     * Set Successfully submitted SMS messages.
     * @param RequestSuccessCount Successfully submitted SMS messages.
     */
    public void setRequestSuccessCount(Long RequestSuccessCount) {
        this.RequestSuccessCount = RequestSuccessCount;
    }

    /**
     * Get Failed receipts. 
     * @return CallbackFailCount Failed receipts.
     */
    public Long getCallbackFailCount() {
        return this.CallbackFailCount;
    }

    /**
     * Set Failed receipts.
     * @param CallbackFailCount Failed receipts.
     */
    public void setCallbackFailCount(Long CallbackFailCount) {
        this.CallbackFailCount = CallbackFailCount;
    }

    /**
     * Get Successful receipts. 
     * @return CallbackSuccessCount Successful receipts.
     */
    public Long getCallbackSuccessCount() {
        return this.CallbackSuccessCount;
    }

    /**
     * Set Successful receipts.
     * @param CallbackSuccessCount Successful receipts.
     */
    public void setCallbackSuccessCount(Long CallbackSuccessCount) {
        this.CallbackSuccessCount = CallbackSuccessCount;
    }

    /**
     * Get Carrier's internal error. 
     * @return InternalErrorCount Carrier's internal error.
     */
    public Long getInternalErrorCount() {
        return this.InternalErrorCount;
    }

    /**
     * Set Carrier's internal error.
     * @param InternalErrorCount Carrier's internal error.
     */
    public void setInternalErrorCount(Long InternalErrorCount) {
        this.InternalErrorCount = InternalErrorCount;
    }

    /**
     * Get Invalid numbers. 
     * @return InvalidNumberCount Invalid numbers.
     */
    public Long getInvalidNumberCount() {
        return this.InvalidNumberCount;
    }

    /**
     * Set Invalid numbers.
     * @param InvalidNumberCount Invalid numbers.
     */
    public void setInvalidNumberCount(Long InvalidNumberCount) {
        this.InvalidNumberCount = InvalidNumberCount;
    }

    /**
     * Get Errors such as out-of-service or power-off. 
     * @return ShutdownErrorCount Errors such as out-of-service or power-off.
     */
    public Long getShutdownErrorCount() {
        return this.ShutdownErrorCount;
    }

    /**
     * Set Errors such as out-of-service or power-off.
     * @param ShutdownErrorCount Errors such as out-of-service or power-off.
     */
    public void setShutdownErrorCount(Long ShutdownErrorCount) {
        this.ShutdownErrorCount = ShutdownErrorCount;
    }

    /**
     * Get Blocked mobile numbers. 
     * @return BlackListCount Blocked mobile numbers.
     */
    public Long getBlackListCount() {
        return this.BlackListCount;
    }

    /**
     * Set Blocked mobile numbers.
     * @param BlackListCount Blocked mobile numbers.
     */
    public void setBlackListCount(Long BlackListCount) {
        this.BlackListCount = BlackListCount;
    }

    /**
     * Get Carrier rate limit hits. 
     * @return FrequencyLimitCount Carrier rate limit hits.
     */
    public Long getFrequencyLimitCount() {
        return this.FrequencyLimitCount;
    }

    /**
     * Set Carrier rate limit hits.
     * @param FrequencyLimitCount Carrier rate limit hits.
     */
    public void setFrequencyLimitCount(Long FrequencyLimitCount) {
        this.FrequencyLimitCount = FrequencyLimitCount;
    }

    public CallbackStatusStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackStatusStatistics(CallbackStatusStatistics source) {
        if (source.CallbackCount != null) {
            this.CallbackCount = new Long(source.CallbackCount);
        }
        if (source.RequestSuccessCount != null) {
            this.RequestSuccessCount = new Long(source.RequestSuccessCount);
        }
        if (source.CallbackFailCount != null) {
            this.CallbackFailCount = new Long(source.CallbackFailCount);
        }
        if (source.CallbackSuccessCount != null) {
            this.CallbackSuccessCount = new Long(source.CallbackSuccessCount);
        }
        if (source.InternalErrorCount != null) {
            this.InternalErrorCount = new Long(source.InternalErrorCount);
        }
        if (source.InvalidNumberCount != null) {
            this.InvalidNumberCount = new Long(source.InvalidNumberCount);
        }
        if (source.ShutdownErrorCount != null) {
            this.ShutdownErrorCount = new Long(source.ShutdownErrorCount);
        }
        if (source.BlackListCount != null) {
            this.BlackListCount = new Long(source.BlackListCount);
        }
        if (source.FrequencyLimitCount != null) {
            this.FrequencyLimitCount = new Long(source.FrequencyLimitCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackCount", this.CallbackCount);
        this.setParamSimple(map, prefix + "RequestSuccessCount", this.RequestSuccessCount);
        this.setParamSimple(map, prefix + "CallbackFailCount", this.CallbackFailCount);
        this.setParamSimple(map, prefix + "CallbackSuccessCount", this.CallbackSuccessCount);
        this.setParamSimple(map, prefix + "InternalErrorCount", this.InternalErrorCount);
        this.setParamSimple(map, prefix + "InvalidNumberCount", this.InvalidNumberCount);
        this.setParamSimple(map, prefix + "ShutdownErrorCount", this.ShutdownErrorCount);
        this.setParamSimple(map, prefix + "BlackListCount", this.BlackListCount);
        this.setParamSimple(map, prefix + "FrequencyLimitCount", this.FrequencyLimitCount);

    }
}

