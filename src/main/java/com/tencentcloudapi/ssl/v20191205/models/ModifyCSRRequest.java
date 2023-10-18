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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCSRRequest extends AbstractModel {

    /**
    * The CSR ID.	
    */
    @SerializedName("CSRId")
    @Expose
    private Long CSRId;

    /**
    * Whether to generate the CSR content. Once the CSR content is generated, the CSR record cannot be modified.
    */
    @SerializedName("Generate")
    @Expose
    private Boolean Generate;

    /**
    * The domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The organization name.
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * The department.
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * The email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * The province.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * The city.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * The country or region.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * The encryption algorithm. RSA and ECC are supported.	
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
    * The key pair parameter. For RSA, only the 2048-bit and 4096-bit key pairs are supported. For ECC, only prime256v1 is supported.
    */
    @SerializedName("KeyParameter")
    @Expose
    private String KeyParameter;

    /**
    * The remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The password of the private key.
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
     * Get The CSR ID.	 
     * @return CSRId The CSR ID.	
     */
    public Long getCSRId() {
        return this.CSRId;
    }

    /**
     * Set The CSR ID.	
     * @param CSRId The CSR ID.	
     */
    public void setCSRId(Long CSRId) {
        this.CSRId = CSRId;
    }

    /**
     * Get Whether to generate the CSR content. Once the CSR content is generated, the CSR record cannot be modified. 
     * @return Generate Whether to generate the CSR content. Once the CSR content is generated, the CSR record cannot be modified.
     */
    public Boolean getGenerate() {
        return this.Generate;
    }

    /**
     * Set Whether to generate the CSR content. Once the CSR content is generated, the CSR record cannot be modified.
     * @param Generate Whether to generate the CSR content. Once the CSR content is generated, the CSR record cannot be modified.
     */
    public void setGenerate(Boolean Generate) {
        this.Generate = Generate;
    }

    /**
     * Get The domain. 
     * @return Domain The domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
     * @param Domain The domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The organization name. 
     * @return Organization The organization name.
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set The organization name.
     * @param Organization The organization name.
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get The department. 
     * @return Department The department.
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set The department.
     * @param Department The department.
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get The email address. 
     * @return Email The email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set The email address.
     * @param Email The email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get The province. 
     * @return Province The province.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set The province.
     * @param Province The province.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get The city. 
     * @return City The city.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set The city.
     * @param City The city.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get The country or region. 
     * @return Country The country or region.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set The country or region.
     * @param Country The country or region.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get The encryption algorithm. RSA and ECC are supported.	 
     * @return EncryptAlgo The encryption algorithm. RSA and ECC are supported.	
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set The encryption algorithm. RSA and ECC are supported.	
     * @param EncryptAlgo The encryption algorithm. RSA and ECC are supported.	
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    /**
     * Get The key pair parameter. For RSA, only the 2048-bit and 4096-bit key pairs are supported. For ECC, only prime256v1 is supported. 
     * @return KeyParameter The key pair parameter. For RSA, only the 2048-bit and 4096-bit key pairs are supported. For ECC, only prime256v1 is supported.
     */
    public String getKeyParameter() {
        return this.KeyParameter;
    }

    /**
     * Set The key pair parameter. For RSA, only the 2048-bit and 4096-bit key pairs are supported. For ECC, only prime256v1 is supported.
     * @param KeyParameter The key pair parameter. For RSA, only the 2048-bit and 4096-bit key pairs are supported. For ECC, only prime256v1 is supported.
     */
    public void setKeyParameter(String KeyParameter) {
        this.KeyParameter = KeyParameter;
    }

    /**
     * Get The remarks. 
     * @return Remark The remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set The remarks.
     * @param Remark The remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The password of the private key. 
     * @return KeyPassword The password of the private key.
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set The password of the private key.
     * @param KeyPassword The password of the private key.
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    public ModifyCSRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCSRRequest(ModifyCSRRequest source) {
        if (source.CSRId != null) {
            this.CSRId = new Long(source.CSRId);
        }
        if (source.Generate != null) {
            this.Generate = new Boolean(source.Generate);
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
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
        }
        if (source.KeyParameter != null) {
            this.KeyParameter = new String(source.KeyParameter);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.KeyPassword != null) {
            this.KeyPassword = new String(source.KeyPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CSRId", this.CSRId);
        this.setParamSimple(map, prefix + "Generate", this.Generate);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);
        this.setParamSimple(map, prefix + "KeyParameter", this.KeyParameter);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "KeyPassword", this.KeyPassword);

    }
}

