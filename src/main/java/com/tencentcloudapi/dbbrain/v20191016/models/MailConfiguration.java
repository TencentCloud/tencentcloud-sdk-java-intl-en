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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MailConfiguration extends AbstractModel{

    /**
    * Whether to enable email sending. Valid values: 0 (No), 1 (Yes).
    */
    @SerializedName("SendMail")
    @Expose
    private Long SendMail;

    /**
    * Region configuration, such as "ap-guangzhou", "ap-shanghai".
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * Sending a report with the specified health level, such as "HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK".
    */
    @SerializedName("HealthStatus")
    @Expose
    private String [] HealthStatus;

    /**
    * Contact ID. The contact/contact group cannot be empty.
    */
    @SerializedName("ContactPerson")
    @Expose
    private Long [] ContactPerson;

    /**
    * Contact group ID. The contact/contact group cannot be empty.
    */
    @SerializedName("ContactGroup")
    @Expose
    private Long [] ContactGroup;

    /**
     * Get Whether to enable email sending. Valid values: 0 (No), 1 (Yes). 
     * @return SendMail Whether to enable email sending. Valid values: 0 (No), 1 (Yes).
     */
    public Long getSendMail() {
        return this.SendMail;
    }

    /**
     * Set Whether to enable email sending. Valid values: 0 (No), 1 (Yes).
     * @param SendMail Whether to enable email sending. Valid values: 0 (No), 1 (Yes).
     */
    public void setSendMail(Long SendMail) {
        this.SendMail = SendMail;
    }

    /**
     * Get Region configuration, such as "ap-guangzhou", "ap-shanghai". 
     * @return Region Region configuration, such as "ap-guangzhou", "ap-shanghai".
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region configuration, such as "ap-guangzhou", "ap-shanghai".
     * @param Region Region configuration, such as "ap-guangzhou", "ap-shanghai".
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get Sending a report with the specified health level, such as "HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK". 
     * @return HealthStatus Sending a report with the specified health level, such as "HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK".
     */
    public String [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Sending a report with the specified health level, such as "HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK".
     * @param HealthStatus Sending a report with the specified health level, such as "HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK".
     */
    public void setHealthStatus(String [] HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Contact ID. The contact/contact group cannot be empty. 
     * @return ContactPerson Contact ID. The contact/contact group cannot be empty.
     */
    public Long [] getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set Contact ID. The contact/contact group cannot be empty.
     * @param ContactPerson Contact ID. The contact/contact group cannot be empty.
     */
    public void setContactPerson(Long [] ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get Contact group ID. The contact/contact group cannot be empty. 
     * @return ContactGroup Contact group ID. The contact/contact group cannot be empty.
     */
    public Long [] getContactGroup() {
        return this.ContactGroup;
    }

    /**
     * Set Contact group ID. The contact/contact group cannot be empty.
     * @param ContactGroup Contact group ID. The contact/contact group cannot be empty.
     */
    public void setContactGroup(Long [] ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SendMail", this.SendMail);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamArraySimple(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamArraySimple(map, prefix + "ContactPerson.", this.ContactPerson);
        this.setParamArraySimple(map, prefix + "ContactGroup.", this.ContactGroup);

    }
}

