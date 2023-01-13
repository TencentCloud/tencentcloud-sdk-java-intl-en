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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBDiagReportTaskRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time, such as "2020-11-08T14:00:00+08:00".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, such as "2020-11-09T14:00:00+08:00".
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Whether to send an email. Valid values: `0` (yes), `1` (no).
    */
    @SerializedName("SendMailFlag")
    @Expose
    private Long SendMailFlag;

    /**
    * Array of the IDs of recipients to receive email.
    */
    @SerializedName("ContactPerson")
    @Expose
    private Long [] ContactPerson;

    /**
    * Array of IDs of recipient groups to receive email.
    */
    @SerializedName("ContactGroup")
    @Expose
    private Long [] ContactGroup;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time, such as "2020-11-08T14:00:00+08:00". 
     * @return StartTime Start time, such as "2020-11-08T14:00:00+08:00".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, such as "2020-11-08T14:00:00+08:00".
     * @param StartTime Start time, such as "2020-11-08T14:00:00+08:00".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, such as "2020-11-09T14:00:00+08:00". 
     * @return EndTime End time, such as "2020-11-09T14:00:00+08:00".
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, such as "2020-11-09T14:00:00+08:00".
     * @param EndTime End time, such as "2020-11-09T14:00:00+08:00".
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether to send an email. Valid values: `0` (yes), `1` (no). 
     * @return SendMailFlag Whether to send an email. Valid values: `0` (yes), `1` (no).
     */
    public Long getSendMailFlag() {
        return this.SendMailFlag;
    }

    /**
     * Set Whether to send an email. Valid values: `0` (yes), `1` (no).
     * @param SendMailFlag Whether to send an email. Valid values: `0` (yes), `1` (no).
     */
    public void setSendMailFlag(Long SendMailFlag) {
        this.SendMailFlag = SendMailFlag;
    }

    /**
     * Get Array of the IDs of recipients to receive email. 
     * @return ContactPerson Array of the IDs of recipients to receive email.
     */
    public Long [] getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set Array of the IDs of recipients to receive email.
     * @param ContactPerson Array of the IDs of recipients to receive email.
     */
    public void setContactPerson(Long [] ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get Array of IDs of recipient groups to receive email. 
     * @return ContactGroup Array of IDs of recipient groups to receive email.
     */
    public Long [] getContactGroup() {
        return this.ContactGroup;
    }

    /**
     * Set Array of IDs of recipient groups to receive email.
     * @param ContactGroup Array of IDs of recipient groups to receive email.
     */
    public void setContactGroup(Long [] ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateDBDiagReportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBDiagReportTaskRequest(CreateDBDiagReportTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SendMailFlag != null) {
            this.SendMailFlag = new Long(source.SendMailFlag);
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
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SendMailFlag", this.SendMailFlag);
        this.setParamArraySimple(map, prefix + "ContactPerson.", this.ContactPerson);
        this.setParamArraySimple(map, prefix + "ContactGroup.", this.ContactGroup);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

