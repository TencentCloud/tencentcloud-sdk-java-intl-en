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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CSRItem extends AbstractModel{

    /**
    * The CSR ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The account.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * The domain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The organization name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * The department.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * The email address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * The province.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * The city.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * The country or region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * The remarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * The status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The creation time.
Note: u200dThis field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The encryption algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
    * The algorithm parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyParameter")
    @Expose
    private String KeyParameter;

    /**
     * Get The CSR ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id The CSR ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The CSR ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id The CSR ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The account.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin The account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set The account.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin The account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get The domain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The organization name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Organization The organization name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set The organization name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Organization The organization name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get The department.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Department The department.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set The department.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Department The department.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get The email address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Email The email address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set The email address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Email The email address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get The province.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Province The province.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set The province.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Province The province.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get The city.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return City The city.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set The city.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param City The city.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get The country or region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Country The country or region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set The country or region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Country The country or region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get The remarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remarks The remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set The remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remarks The remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get The status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The creation time.
Note: u200dThis field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime The creation time.
Note: u200dThis field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
Note: u200dThis field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime The creation time.
Note: u200dThis field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The encryption algorithm.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptAlgo The encryption algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set The encryption algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptAlgo The encryption algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    /**
     * Get The algorithm parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyParameter The algorithm parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyParameter() {
        return this.KeyParameter;
    }

    /**
     * Set The algorithm parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyParameter The algorithm parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyParameter(String KeyParameter) {
        this.KeyParameter = KeyParameter;
    }

    public CSRItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CSRItem(CSRItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
        }
        if (source.KeyParameter != null) {
            this.KeyParameter = new String(source.KeyParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);
        this.setParamSimple(map, prefix + "KeyParameter", this.KeyParameter);

    }
}

