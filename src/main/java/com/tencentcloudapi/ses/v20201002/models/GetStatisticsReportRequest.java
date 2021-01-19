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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetStatisticsReportRequest extends AbstractModel{

    /**
    * Start date.
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End date.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Sender domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Recipient address type, for example, gmail.com.
    */
    @SerializedName("ReceivingMailboxType")
    @Expose
    private String ReceivingMailboxType;

    /**
     * Get Start date. 
     * @return StartDate Start date.
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start date.
     * @param StartDate Start date.
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End date. 
     * @return EndDate End date.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End date.
     * @param EndDate End date.
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Sender domain. 
     * @return Domain Sender domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Sender domain.
     * @param Domain Sender domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Recipient address type, for example, gmail.com. 
     * @return ReceivingMailboxType Recipient address type, for example, gmail.com.
     */
    public String getReceivingMailboxType() {
        return this.ReceivingMailboxType;
    }

    /**
     * Set Recipient address type, for example, gmail.com.
     * @param ReceivingMailboxType Recipient address type, for example, gmail.com.
     */
    public void setReceivingMailboxType(String ReceivingMailboxType) {
        this.ReceivingMailboxType = ReceivingMailboxType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ReceivingMailboxType", this.ReceivingMailboxType);

    }
}

