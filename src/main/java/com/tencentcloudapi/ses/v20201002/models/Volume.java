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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Volume extends AbstractModel {

    /**
    * Date
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SendDate")
    @Expose
    private String SendDate;

    /**
    * Number of email requests.
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * Number of email requests accepted by Tencent Cloud.
    */
    @SerializedName("AcceptedCount")
    @Expose
    private Long AcceptedCount;

    /**
    * Number of delivered emails.
    */
    @SerializedName("DeliveredCount")
    @Expose
    private Long DeliveredCount;

    /**
    * Number of users (deduplicated) who opened emails.
    */
    @SerializedName("OpenedCount")
    @Expose
    private Long OpenedCount;

    /**
    * Number of recipients who clicked on links in emails.
    */
    @SerializedName("ClickedCount")
    @Expose
    private Long ClickedCount;

    /**
    * Number of bounced emails.
    */
    @SerializedName("BounceCount")
    @Expose
    private Long BounceCount;

    /**
    * Number of users who canceled subscriptions.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnsubscribeCount")
    @Expose
    private Long UnsubscribeCount;

    /**
     * Get Date
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SendDate Date
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSendDate() {
        return this.SendDate;
    }

    /**
     * Set Date
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SendDate Date
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSendDate(String SendDate) {
        this.SendDate = SendDate;
    }

    /**
     * Get Number of email requests. 
     * @return RequestCount Number of email requests.
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set Number of email requests.
     * @param RequestCount Number of email requests.
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get Number of email requests accepted by Tencent Cloud. 
     * @return AcceptedCount Number of email requests accepted by Tencent Cloud.
     */
    public Long getAcceptedCount() {
        return this.AcceptedCount;
    }

    /**
     * Set Number of email requests accepted by Tencent Cloud.
     * @param AcceptedCount Number of email requests accepted by Tencent Cloud.
     */
    public void setAcceptedCount(Long AcceptedCount) {
        this.AcceptedCount = AcceptedCount;
    }

    /**
     * Get Number of delivered emails. 
     * @return DeliveredCount Number of delivered emails.
     */
    public Long getDeliveredCount() {
        return this.DeliveredCount;
    }

    /**
     * Set Number of delivered emails.
     * @param DeliveredCount Number of delivered emails.
     */
    public void setDeliveredCount(Long DeliveredCount) {
        this.DeliveredCount = DeliveredCount;
    }

    /**
     * Get Number of users (deduplicated) who opened emails. 
     * @return OpenedCount Number of users (deduplicated) who opened emails.
     */
    public Long getOpenedCount() {
        return this.OpenedCount;
    }

    /**
     * Set Number of users (deduplicated) who opened emails.
     * @param OpenedCount Number of users (deduplicated) who opened emails.
     */
    public void setOpenedCount(Long OpenedCount) {
        this.OpenedCount = OpenedCount;
    }

    /**
     * Get Number of recipients who clicked on links in emails. 
     * @return ClickedCount Number of recipients who clicked on links in emails.
     */
    public Long getClickedCount() {
        return this.ClickedCount;
    }

    /**
     * Set Number of recipients who clicked on links in emails.
     * @param ClickedCount Number of recipients who clicked on links in emails.
     */
    public void setClickedCount(Long ClickedCount) {
        this.ClickedCount = ClickedCount;
    }

    /**
     * Get Number of bounced emails. 
     * @return BounceCount Number of bounced emails.
     */
    public Long getBounceCount() {
        return this.BounceCount;
    }

    /**
     * Set Number of bounced emails.
     * @param BounceCount Number of bounced emails.
     */
    public void setBounceCount(Long BounceCount) {
        this.BounceCount = BounceCount;
    }

    /**
     * Get Number of users who canceled subscriptions.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnsubscribeCount Number of users who canceled subscriptions.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getUnsubscribeCount() {
        return this.UnsubscribeCount;
    }

    /**
     * Set Number of users who canceled subscriptions.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnsubscribeCount Number of users who canceled subscriptions.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnsubscribeCount(Long UnsubscribeCount) {
        this.UnsubscribeCount = UnsubscribeCount;
    }

    public Volume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Volume(Volume source) {
        if (source.SendDate != null) {
            this.SendDate = new String(source.SendDate);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.AcceptedCount != null) {
            this.AcceptedCount = new Long(source.AcceptedCount);
        }
        if (source.DeliveredCount != null) {
            this.DeliveredCount = new Long(source.DeliveredCount);
        }
        if (source.OpenedCount != null) {
            this.OpenedCount = new Long(source.OpenedCount);
        }
        if (source.ClickedCount != null) {
            this.ClickedCount = new Long(source.ClickedCount);
        }
        if (source.BounceCount != null) {
            this.BounceCount = new Long(source.BounceCount);
        }
        if (source.UnsubscribeCount != null) {
            this.UnsubscribeCount = new Long(source.UnsubscribeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SendDate", this.SendDate);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "AcceptedCount", this.AcceptedCount);
        this.setParamSimple(map, prefix + "DeliveredCount", this.DeliveredCount);
        this.setParamSimple(map, prefix + "OpenedCount", this.OpenedCount);
        this.setParamSimple(map, prefix + "ClickedCount", this.ClickedCount);
        this.setParamSimple(map, prefix + "BounceCount", this.BounceCount);
        this.setParamSimple(map, prefix + "UnsubscribeCount", this.UnsubscribeCount);

    }
}

