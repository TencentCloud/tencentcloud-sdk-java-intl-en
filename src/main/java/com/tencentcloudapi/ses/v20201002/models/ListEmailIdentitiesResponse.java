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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEmailIdentitiesResponse extends AbstractModel {

    /**
    * List of sender domains.
    */
    @SerializedName("EmailIdentities")
    @Expose
    private EmailIdentity [] EmailIdentities;

    /**
    * Maximum reputation level
    */
    @SerializedName("MaxReputationLevel")
    @Expose
    private Long MaxReputationLevel;

    /**
    * Maximum number of emails sent per domain name
    */
    @SerializedName("MaxDailyQuota")
    @Expose
    private Long MaxDailyQuota;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of sender domains. 
     * @return EmailIdentities List of sender domains.
     */
    public EmailIdentity [] getEmailIdentities() {
        return this.EmailIdentities;
    }

    /**
     * Set List of sender domains.
     * @param EmailIdentities List of sender domains.
     */
    public void setEmailIdentities(EmailIdentity [] EmailIdentities) {
        this.EmailIdentities = EmailIdentities;
    }

    /**
     * Get Maximum reputation level 
     * @return MaxReputationLevel Maximum reputation level
     */
    public Long getMaxReputationLevel() {
        return this.MaxReputationLevel;
    }

    /**
     * Set Maximum reputation level
     * @param MaxReputationLevel Maximum reputation level
     */
    public void setMaxReputationLevel(Long MaxReputationLevel) {
        this.MaxReputationLevel = MaxReputationLevel;
    }

    /**
     * Get Maximum number of emails sent per domain name 
     * @return MaxDailyQuota Maximum number of emails sent per domain name
     */
    public Long getMaxDailyQuota() {
        return this.MaxDailyQuota;
    }

    /**
     * Set Maximum number of emails sent per domain name
     * @param MaxDailyQuota Maximum number of emails sent per domain name
     */
    public void setMaxDailyQuota(Long MaxDailyQuota) {
        this.MaxDailyQuota = MaxDailyQuota;
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

    public ListEmailIdentitiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEmailIdentitiesResponse(ListEmailIdentitiesResponse source) {
        if (source.EmailIdentities != null) {
            this.EmailIdentities = new EmailIdentity[source.EmailIdentities.length];
            for (int i = 0; i < source.EmailIdentities.length; i++) {
                this.EmailIdentities[i] = new EmailIdentity(source.EmailIdentities[i]);
            }
        }
        if (source.MaxReputationLevel != null) {
            this.MaxReputationLevel = new Long(source.MaxReputationLevel);
        }
        if (source.MaxDailyQuota != null) {
            this.MaxDailyQuota = new Long(source.MaxDailyQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EmailIdentities.", this.EmailIdentities);
        this.setParamSimple(map, prefix + "MaxReputationLevel", this.MaxReputationLevel);
        this.setParamSimple(map, prefix + "MaxDailyQuota", this.MaxDailyQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

