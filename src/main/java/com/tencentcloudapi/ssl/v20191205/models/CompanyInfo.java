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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompanyInfo extends AbstractModel {

    /**
    * Company Name
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * company ID
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * Country of residence
    */
    @SerializedName("CompanyCountry")
    @Expose
    private String CompanyCountry;

    /**
    * Company province
    */
    @SerializedName("CompanyProvince")
    @Expose
    private String CompanyProvince;

    /**
    * Company located city
    */
    @SerializedName("CompanyCity")
    @Expose
    private String CompanyCity;

    /**
    * Company's detailed address
    */
    @SerializedName("CompanyAddress")
    @Expose
    private String CompanyAddress;

    /**
    * company phone number
    */
    @SerializedName("CompanyPhone")
    @Expose
    private String CompanyPhone;

    /**
    * Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certs and not required for other types.
OTHERS
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820
    */
    @SerializedName("IdNumber")
    @Expose
    private String IdNumber;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get Company Name 
     * @return CompanyName Company Name
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set Company Name
     * @param CompanyName Company Name
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get company ID 
     * @return CompanyId company ID
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set company ID
     * @param CompanyId company ID
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get Country of residence 
     * @return CompanyCountry Country of residence
     */
    public String getCompanyCountry() {
        return this.CompanyCountry;
    }

    /**
     * Set Country of residence
     * @param CompanyCountry Country of residence
     */
    public void setCompanyCountry(String CompanyCountry) {
        this.CompanyCountry = CompanyCountry;
    }

    /**
     * Get Company province 
     * @return CompanyProvince Company province
     */
    public String getCompanyProvince() {
        return this.CompanyProvince;
    }

    /**
     * Set Company province
     * @param CompanyProvince Company province
     */
    public void setCompanyProvince(String CompanyProvince) {
        this.CompanyProvince = CompanyProvince;
    }

    /**
     * Get Company located city 
     * @return CompanyCity Company located city
     */
    public String getCompanyCity() {
        return this.CompanyCity;
    }

    /**
     * Set Company located city
     * @param CompanyCity Company located city
     */
    public void setCompanyCity(String CompanyCity) {
        this.CompanyCity = CompanyCity;
    }

    /**
     * Get Company's detailed address 
     * @return CompanyAddress Company's detailed address
     */
    public String getCompanyAddress() {
        return this.CompanyAddress;
    }

    /**
     * Set Company's detailed address
     * @param CompanyAddress Company's detailed address
     */
    public void setCompanyAddress(String CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    /**
     * Get company phone number 
     * @return CompanyPhone company phone number
     */
    public String getCompanyPhone() {
        return this.CompanyPhone;
    }

    /**
     * Set company phone number
     * @param CompanyPhone company phone number
     */
    public void setCompanyPhone(String CompanyPhone) {
        this.CompanyPhone = CompanyPhone;
    }

    /**
     * Get Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certs and not required for other types.
OTHERS 
     * @return IdType Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certs and not required for other types.
OTHERS
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certs and not required for other types.
OTHERS
     * @param IdType Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certs and not required for other types.
OTHERS
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820 
     * @return IdNumber Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820
     */
    public String getIdNumber() {
        return this.IdNumber;
    }

    /**
     * Set Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820
     * @param IdNumber Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public CompanyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompanyInfo(CompanyInfo source) {
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.CompanyCountry != null) {
            this.CompanyCountry = new String(source.CompanyCountry);
        }
        if (source.CompanyProvince != null) {
            this.CompanyProvince = new String(source.CompanyProvince);
        }
        if (source.CompanyCity != null) {
            this.CompanyCity = new String(source.CompanyCity);
        }
        if (source.CompanyAddress != null) {
            this.CompanyAddress = new String(source.CompanyAddress);
        }
        if (source.CompanyPhone != null) {
            this.CompanyPhone = new String(source.CompanyPhone);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.IdNumber != null) {
            this.IdNumber = new String(source.IdNumber);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "CompanyCountry", this.CompanyCountry);
        this.setParamSimple(map, prefix + "CompanyProvince", this.CompanyProvince);
        this.setParamSimple(map, prefix + "CompanyCity", this.CompanyCity);
        this.setParamSimple(map, prefix + "CompanyAddress", this.CompanyAddress);
        this.setParamSimple(map, prefix + "CompanyPhone", this.CompanyPhone);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdNumber", this.IdNumber);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

