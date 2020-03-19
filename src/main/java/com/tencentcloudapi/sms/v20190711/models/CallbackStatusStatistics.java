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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackStatusStatistics extends AbstractModel{

    /**
    * SMS receipts.
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
    * Failed SMS receipts.
    */
    @SerializedName("CallbackFailCount")
    @Expose
    private Long CallbackFailCount;

    /**
    * Successful SMS receipts.
    */
    @SerializedName("CallbackSuccessCount")
    @Expose
    private Long CallbackSuccessCount;

    /**
    * Internal carrier errors.
    */
    @SerializedName("InternalErrorCount")
    @Expose
    private Long InternalErrorCount;

    /**
    * Invalid or empty mobile numbers.
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
    * Blacklisted mobile numbers.
    */
    @SerializedName("BlackListCount")
    @Expose
    private Long BlackListCount;

    /**
    * Carrier frequency limit hits.
    */
    @SerializedName("FrequencyLimitCount")
    @Expose
    private Long FrequencyLimitCount;

    /**
     * Get SMS receipts. 
     * @return CallbackCount SMS receipts.
     */
    public Long getCallbackCount() {
        return this.CallbackCount;
    }

    /**
     * Set SMS receipts.
     * @param CallbackCount SMS receipts.
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
     * Get Failed SMS receipts. 
     * @return CallbackFailCount Failed SMS receipts.
     */
    public Long getCallbackFailCount() {
        return this.CallbackFailCount;
    }

    /**
     * Set Failed SMS receipts.
     * @param CallbackFailCount Failed SMS receipts.
     */
    public void setCallbackFailCount(Long CallbackFailCount) {
        this.CallbackFailCount = CallbackFailCount;
    }

    /**
     * Get Successful SMS receipts. 
     * @return CallbackSuccessCount Successful SMS receipts.
     */
    public Long getCallbackSuccessCount() {
        return this.CallbackSuccessCount;
    }

    /**
     * Set Successful SMS receipts.
     * @param CallbackSuccessCount Successful SMS receipts.
     */
    public void setCallbackSuccessCount(Long CallbackSuccessCount) {
        this.CallbackSuccessCount = CallbackSuccessCount;
    }

    /**
     * Get Internal carrier errors. 
     * @return InternalErrorCount Internal carrier errors.
     */
    public Long getInternalErrorCount() {
        return this.InternalErrorCount;
    }

    /**
     * Set Internal carrier errors.
     * @param InternalErrorCount Internal carrier errors.
     */
    public void setInternalErrorCount(Long InternalErrorCount) {
        this.InternalErrorCount = InternalErrorCount;
    }

    /**
     * Get Invalid or empty mobile numbers. 
     * @return InvalidNumberCount Invalid or empty mobile numbers.
     */
    public Long getInvalidNumberCount() {
        return this.InvalidNumberCount;
    }

    /**
     * Set Invalid or empty mobile numbers.
     * @param InvalidNumberCount Invalid or empty mobile numbers.
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
     * Get Blacklisted mobile numbers. 
     * @return BlackListCount Blacklisted mobile numbers.
     */
    public Long getBlackListCount() {
        return this.BlackListCount;
    }

    /**
     * Set Blacklisted mobile numbers.
     * @param BlackListCount Blacklisted mobile numbers.
     */
    public void setBlackListCount(Long BlackListCount) {
        this.BlackListCount = BlackListCount;
    }

    /**
     * Get Carrier frequency limit hits. 
     * @return FrequencyLimitCount Carrier frequency limit hits.
     */
    public Long getFrequencyLimitCount() {
        return this.FrequencyLimitCount;
    }

    /**
     * Set Carrier frequency limit hits.
     * @param FrequencyLimitCount Carrier frequency limit hits.
     */
    public void setFrequencyLimitCount(Long FrequencyLimitCount) {
        this.FrequencyLimitCount = FrequencyLimitCount;
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

