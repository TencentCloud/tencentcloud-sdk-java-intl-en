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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillAdjustInfoRequest extends AbstractModel {

    /**
    * <p>Format: yyyy-MM<br>Bill month. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid.</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>Format: yyyy-MM-dd<br>Start time. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid. timeFrom and timeTo must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month.</p>
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * <p>Format: yyyy-MM-dd<br>End time. Either month or timeFrom&amp;timeTo must be specified. If this field is specified, the month field is invalid. timeFrom and timeTo must be passed together and be in the same month. Cross-month queries are not supported. The query result is data of the entire month.</p>
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
    * <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get <p>Format: yyyy-MM<br>Bill month. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid.</p> 
     * @return Month <p>Format: yyyy-MM<br>Bill month. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid.</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>Format: yyyy-MM<br>Bill month. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid.</p>
     * @param Month <p>Format: yyyy-MM<br>Bill month. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid.</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>Format: yyyy-MM-dd<br>Start time. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid. timeFrom and timeTo must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month.</p> 
     * @return TimeFrom <p>Format: yyyy-MM-dd<br>Start time. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid. timeFrom and timeTo must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month.</p>
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set <p>Format: yyyy-MM-dd<br>Start time. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid. timeFrom and timeTo must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month.</p>
     * @param TimeFrom <p>Format: yyyy-MM-dd<br>Start time. Either month or timeFrom&amp;timeTo must be specified. If timeFrom&amp;timeTo is specified, the month field is invalid. timeFrom and timeTo must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month.</p>
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get <p>Format: yyyy-MM-dd<br>End time. Either month or timeFrom&amp;timeTo must be specified. If this field is specified, the month field is invalid. timeFrom and timeTo must be passed together and be in the same month. Cross-month queries are not supported. The query result is data of the entire month.</p> 
     * @return TimeTo <p>Format: yyyy-MM-dd<br>End time. Either month or timeFrom&amp;timeTo must be specified. If this field is specified, the month field is invalid. timeFrom and timeTo must be passed together and be in the same month. Cross-month queries are not supported. The query result is data of the entire month.</p>
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set <p>Format: yyyy-MM-dd<br>End time. Either month or timeFrom&amp;timeTo must be specified. If this field is specified, the month field is invalid. timeFrom and timeTo must be passed together and be in the same month. Cross-month queries are not supported. The query result is data of the entire month.</p>
     * @param TimeTo <p>Format: yyyy-MM-dd<br>End time. Either month or timeFrom&amp;timeTo must be specified. If this field is specified, the month field is invalid. timeFrom and timeTo must be passed together and be in the same month. Cross-month queries are not supported. The query result is data of the entire month.</p>
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    /**
     * Get <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p> 
     * @return PayerUin <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
     * @param PayerUin <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeBillAdjustInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillAdjustInfoRequest(DescribeBillAdjustInfoRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TimeFrom != null) {
            this.TimeFrom = new String(source.TimeFrom);
        }
        if (source.TimeTo != null) {
            this.TimeTo = new String(source.TimeTo);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "TimeFrom", this.TimeFrom);
        this.setParamSimple(map, prefix + "TimeTo", this.TimeTo);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

