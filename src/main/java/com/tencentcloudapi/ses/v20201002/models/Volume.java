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
    * <p>Date</p>
    */
    @SerializedName("SendDate")
    @Expose
    private String SendDate;

    /**
    * <p>Request quantity by email</p>
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * <p>Tencent Cloud pass count</p>
    */
    @SerializedName("AcceptedCount")
    @Expose
    private Long AcceptedCount;

    /**
    * <p>Delivery quantity</p>
    */
    @SerializedName("DeliveredCount")
    @Expose
    private Long DeliveredCount;

    /**
    * <p>Total number of times emails were opened</p>
    */
    @SerializedName("OpenedCount")
    @Expose
    private Long OpenedCount;

    /**
    * <p>Number of users who clicked the link in the mail</p>
    */
    @SerializedName("ClickedCount")
    @Expose
    private Long ClickedCount;

    /**
    * <p>Bounced count</p>
    */
    @SerializedName("BounceCount")
    @Expose
    private Long BounceCount;

    /**
    * <p>Number of users for unsubscription</p>
    */
    @SerializedName("UnsubscribeCount")
    @Expose
    private Long UnsubscribeCount;

    /**
     * Get <p>Date</p> 
     * @return SendDate <p>Date</p>
     */
    public String getSendDate() {
        return this.SendDate;
    }

    /**
     * Set <p>Date</p>
     * @param SendDate <p>Date</p>
     */
    public void setSendDate(String SendDate) {
        this.SendDate = SendDate;
    }

    /**
     * Get <p>Request quantity by email</p> 
     * @return RequestCount <p>Request quantity by email</p>
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set <p>Request quantity by email</p>
     * @param RequestCount <p>Request quantity by email</p>
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get <p>Tencent Cloud pass count</p> 
     * @return AcceptedCount <p>Tencent Cloud pass count</p>
     */
    public Long getAcceptedCount() {
        return this.AcceptedCount;
    }

    /**
     * Set <p>Tencent Cloud pass count</p>
     * @param AcceptedCount <p>Tencent Cloud pass count</p>
     */
    public void setAcceptedCount(Long AcceptedCount) {
        this.AcceptedCount = AcceptedCount;
    }

    /**
     * Get <p>Delivery quantity</p> 
     * @return DeliveredCount <p>Delivery quantity</p>
     */
    public Long getDeliveredCount() {
        return this.DeliveredCount;
    }

    /**
     * Set <p>Delivery quantity</p>
     * @param DeliveredCount <p>Delivery quantity</p>
     */
    public void setDeliveredCount(Long DeliveredCount) {
        this.DeliveredCount = DeliveredCount;
    }

    /**
     * Get <p>Total number of times emails were opened</p> 
     * @return OpenedCount <p>Total number of times emails were opened</p>
     */
    public Long getOpenedCount() {
        return this.OpenedCount;
    }

    /**
     * Set <p>Total number of times emails were opened</p>
     * @param OpenedCount <p>Total number of times emails were opened</p>
     */
    public void setOpenedCount(Long OpenedCount) {
        this.OpenedCount = OpenedCount;
    }

    /**
     * Get <p>Number of users who clicked the link in the mail</p> 
     * @return ClickedCount <p>Number of users who clicked the link in the mail</p>
     */
    public Long getClickedCount() {
        return this.ClickedCount;
    }

    /**
     * Set <p>Number of users who clicked the link in the mail</p>
     * @param ClickedCount <p>Number of users who clicked the link in the mail</p>
     */
    public void setClickedCount(Long ClickedCount) {
        this.ClickedCount = ClickedCount;
    }

    /**
     * Get <p>Bounced count</p> 
     * @return BounceCount <p>Bounced count</p>
     */
    public Long getBounceCount() {
        return this.BounceCount;
    }

    /**
     * Set <p>Bounced count</p>
     * @param BounceCount <p>Bounced count</p>
     */
    public void setBounceCount(Long BounceCount) {
        this.BounceCount = BounceCount;
    }

    /**
     * Get <p>Number of users for unsubscription</p> 
     * @return UnsubscribeCount <p>Number of users for unsubscription</p>
     */
    public Long getUnsubscribeCount() {
        return this.UnsubscribeCount;
    }

    /**
     * Set <p>Number of users for unsubscription</p>
     * @param UnsubscribeCount <p>Number of users for unsubscription</p>
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

