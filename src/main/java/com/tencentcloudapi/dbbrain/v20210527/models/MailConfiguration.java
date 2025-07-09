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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MailConfiguration extends AbstractModel {

    /**
    * Whether to enable email sending. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("SendMail")
    @Expose
    private Long SendMail;

    /**
    * Region configuration, such as "ap-guangzhou" and "ap-shanghai". For the inspection email sending template, configure the region where you need to send the inspection email. For the subscription email sending template, configure the region where the current subscribed instance resides.
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * Sends a report with the specified health level, such as `HEALTH`, `SUB_HEALTH`, `RISK`, and `HIGH_RISK`.
    */
    @SerializedName("HealthStatus")
    @Expose
    private String [] HealthStatus;

    /**
    * Recipient ID. Either `ContactPerson` or `ContactGroup` should be passed in.
    */
    @SerializedName("ContactPerson")
    @Expose
    private Long [] ContactPerson;

    /**
    * Recipient group ID. Either `ContactPerson` or `ContactGroup` should be passed in.
    */
    @SerializedName("ContactGroup")
    @Expose
    private Long [] ContactGroup;

    /**
     * Get Whether to enable email sending. Valid values: `0` (no), `1` (yes). 
     * @return SendMail Whether to enable email sending. Valid values: `0` (no), `1` (yes).
     */
    public Long getSendMail() {
        return this.SendMail;
    }

    /**
     * Set Whether to enable email sending. Valid values: `0` (no), `1` (yes).
     * @param SendMail Whether to enable email sending. Valid values: `0` (no), `1` (yes).
     */
    public void setSendMail(Long SendMail) {
        this.SendMail = SendMail;
    }

    /**
     * Get Region configuration, such as "ap-guangzhou" and "ap-shanghai". For the inspection email sending template, configure the region where you need to send the inspection email. For the subscription email sending template, configure the region where the current subscribed instance resides. 
     * @return Region Region configuration, such as "ap-guangzhou" and "ap-shanghai". For the inspection email sending template, configure the region where you need to send the inspection email. For the subscription email sending template, configure the region where the current subscribed instance resides.
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region configuration, such as "ap-guangzhou" and "ap-shanghai". For the inspection email sending template, configure the region where you need to send the inspection email. For the subscription email sending template, configure the region where the current subscribed instance resides.
     * @param Region Region configuration, such as "ap-guangzhou" and "ap-shanghai". For the inspection email sending template, configure the region where you need to send the inspection email. For the subscription email sending template, configure the region where the current subscribed instance resides.
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get Sends a report with the specified health level, such as `HEALTH`, `SUB_HEALTH`, `RISK`, and `HIGH_RISK`. 
     * @return HealthStatus Sends a report with the specified health level, such as `HEALTH`, `SUB_HEALTH`, `RISK`, and `HIGH_RISK`.
     */
    public String [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Sends a report with the specified health level, such as `HEALTH`, `SUB_HEALTH`, `RISK`, and `HIGH_RISK`.
     * @param HealthStatus Sends a report with the specified health level, such as `HEALTH`, `SUB_HEALTH`, `RISK`, and `HIGH_RISK`.
     */
    public void setHealthStatus(String [] HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Recipient ID. Either `ContactPerson` or `ContactGroup` should be passed in. 
     * @return ContactPerson Recipient ID. Either `ContactPerson` or `ContactGroup` should be passed in.
     */
    public Long [] getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set Recipient ID. Either `ContactPerson` or `ContactGroup` should be passed in.
     * @param ContactPerson Recipient ID. Either `ContactPerson` or `ContactGroup` should be passed in.
     */
    public void setContactPerson(Long [] ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get Recipient group ID. Either `ContactPerson` or `ContactGroup` should be passed in. 
     * @return ContactGroup Recipient group ID. Either `ContactPerson` or `ContactGroup` should be passed in.
     */
    public Long [] getContactGroup() {
        return this.ContactGroup;
    }

    /**
     * Set Recipient group ID. Either `ContactPerson` or `ContactGroup` should be passed in.
     * @param ContactGroup Recipient group ID. Either `ContactPerson` or `ContactGroup` should be passed in.
     */
    public void setContactGroup(Long [] ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

    public MailConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MailConfiguration(MailConfiguration source) {
        if (source.SendMail != null) {
            this.SendMail = new Long(source.SendMail);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String[source.HealthStatus.length];
            for (int i = 0; i < source.HealthStatus.length; i++) {
                this.HealthStatus[i] = new String(source.HealthStatus[i]);
            }
        }
        if (source.ContactPerson != null) {
            this.ContactPerson = new Long[source.ContactPerson.length];
            for (int i = 0; i < source.ContactPerson.length; i++) {
                this.ContactPerson[i] = new Long(source.ContactPerson[i]);
            }
        }
        if (source.ContactGroup != null) {
            this.ContactGroup = new Long[source.ContactGroup.length];
            for (int i = 0; i < source.ContactGroup.length; i++) {
                this.ContactGroup[i] = new Long(source.ContactGroup[i]);
            }
        }
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

