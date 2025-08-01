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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntlTemplateInfo extends AbstractModel {

    /**
    * The registrant contact.
    */
    @SerializedName("RegistrantContact")
    @Expose
    private RegistrantContact RegistrantContact;

    /**
    * The admin contact.
    */
    @SerializedName("AdminContact")
    @Expose
    private AdminContact AdminContact;

    /**
    * The technical contact.
    */
    @SerializedName("TechnicalContact")
    @Expose
    private TechnicalContact TechnicalContact;

    /**
    * The contact person for bills.
    */
    @SerializedName("BillingContact")
    @Expose
    private BillingContact BillingContact;

    /**
    * The creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The profile ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * The registrant type. Valid values: `I` (individual), `E` (organization).
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * The last updated time.
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * The account ID.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Whether the profile is the default one.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get The registrant contact. 
     * @return RegistrantContact The registrant contact.
     */
    public RegistrantContact getRegistrantContact() {
        return this.RegistrantContact;
    }

    /**
     * Set The registrant contact.
     * @param RegistrantContact The registrant contact.
     */
    public void setRegistrantContact(RegistrantContact RegistrantContact) {
        this.RegistrantContact = RegistrantContact;
    }

    /**
     * Get The admin contact. 
     * @return AdminContact The admin contact.
     */
    public AdminContact getAdminContact() {
        return this.AdminContact;
    }

    /**
     * Set The admin contact.
     * @param AdminContact The admin contact.
     */
    public void setAdminContact(AdminContact AdminContact) {
        this.AdminContact = AdminContact;
    }

    /**
     * Get The technical contact. 
     * @return TechnicalContact The technical contact.
     */
    public TechnicalContact getTechnicalContact() {
        return this.TechnicalContact;
    }

    /**
     * Set The technical contact.
     * @param TechnicalContact The technical contact.
     */
    public void setTechnicalContact(TechnicalContact TechnicalContact) {
        this.TechnicalContact = TechnicalContact;
    }

    /**
     * Get The contact person for bills. 
     * @return BillingContact The contact person for bills.
     */
    public BillingContact getBillingContact() {
        return this.BillingContact;
    }

    /**
     * Set The contact person for bills.
     * @param BillingContact The contact person for bills.
     */
    public void setBillingContact(BillingContact BillingContact) {
        this.BillingContact = BillingContact;
    }

    /**
     * Get The creation time. 
     * @return CreatedOn The creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time.
     * @param CreatedOn The creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The profile ID. 
     * @return TemplateId The profile ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The profile ID.
     * @param TemplateId The profile ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The registrant type. Valid values: `I` (individual), `E` (organization). 
     * @return TemplateType The registrant type. Valid values: `I` (individual), `E` (organization).
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set The registrant type. Valid values: `I` (individual), `E` (organization).
     * @param TemplateType The registrant type. Valid values: `I` (individual), `E` (organization).
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get The last updated time. 
     * @return UpdatedOn The last updated time.
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set The last updated time.
     * @param UpdatedOn The last updated time.
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get The account ID. 
     * @return Uin The account ID.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set The account ID.
     * @param Uin The account ID.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Whether the profile is the default one. 
     * @return IsDefault Whether the profile is the default one.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether the profile is the default one.
     * @param IsDefault Whether the profile is the default one.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public IntlTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntlTemplateInfo(IntlTemplateInfo source) {
        if (source.RegistrantContact != null) {
            this.RegistrantContact = new RegistrantContact(source.RegistrantContact);
        }
        if (source.AdminContact != null) {
            this.AdminContact = new AdminContact(source.AdminContact);
        }
        if (source.TechnicalContact != null) {
            this.TechnicalContact = new TechnicalContact(source.TechnicalContact);
        }
        if (source.BillingContact != null) {
            this.BillingContact = new BillingContact(source.BillingContact);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RegistrantContact.", this.RegistrantContact);
        this.setParamObj(map, prefix + "AdminContact.", this.AdminContact);
        this.setParamObj(map, prefix + "TechnicalContact.", this.TechnicalContact);
        this.setParamObj(map, prefix + "BillingContact.", this.BillingContact);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

