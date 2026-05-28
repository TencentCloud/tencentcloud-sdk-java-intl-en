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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrazilDriverLicenseInfo extends AbstractModel {

    /**
    * Name.
    */
    @SerializedName("NOME")
    @Expose
    private String NOME;

    /**
    * Specifies the driver's license type.
    */
    @SerializedName("CatHab")
    @Expose
    private String CatHab;

    /**
    * Driver’s license id.
    */
    @SerializedName("CNHNumber")
    @Expose
    private String CNHNumber;

    /**
    * Expiration date.
    */
    @SerializedName("VALIDADE")
    @Expose
    private String VALIDADE;

    /**
    * Indicates the qualification.
    */
    @SerializedName("QUALIFICATION")
    @Expose
    private String QUALIFICATION;

    /**
    * Identity card number.
    */
    @SerializedName("IDENTIDADE")
    @Expose
    private String IDENTIDADE;

    /**
    * Tax number of the person.
    */
    @SerializedName("CPF")
    @Expose
    private String CPF;

    /**
    * Date of birth.
    */
    @SerializedName("NASCIMENTO")
    @Expose
    private String NASCIMENTO;

    /**
    * Membership status.
    */
    @SerializedName("MEMBERSHIP")
    @Expose
    private String MEMBERSHIP;

    /**
    * Registration number.
    */
    @SerializedName("REGISTRO")
    @Expose
    private String REGISTRO;

    /**
    * Remarks.
    */
    @SerializedName("OBSERVATIONS")
    @Expose
    private String OBSERVATIONS;

    /**
    * Issue date.
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * Issuing location.
    */
    @SerializedName("LOCAL")
    @Expose
    private String LOCAL;

    /**
    * Record number.
    */
    @SerializedName("BackNumber")
    @Expose
    private String BackNumber;

    /**
    * Specifies the avatar in base64 format.
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
     * Get Name. 
     * @return NOME Name.
     */
    public String getNOME() {
        return this.NOME;
    }

    /**
     * Set Name.
     * @param NOME Name.
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    /**
     * Get Specifies the driver's license type. 
     * @return CatHab Specifies the driver's license type.
     */
    public String getCatHab() {
        return this.CatHab;
    }

    /**
     * Set Specifies the driver's license type.
     * @param CatHab Specifies the driver's license type.
     */
    public void setCatHab(String CatHab) {
        this.CatHab = CatHab;
    }

    /**
     * Get Driver’s license id. 
     * @return CNHNumber Driver’s license id.
     */
    public String getCNHNumber() {
        return this.CNHNumber;
    }

    /**
     * Set Driver’s license id.
     * @param CNHNumber Driver’s license id.
     */
    public void setCNHNumber(String CNHNumber) {
        this.CNHNumber = CNHNumber;
    }

    /**
     * Get Expiration date. 
     * @return VALIDADE Expiration date.
     */
    public String getVALIDADE() {
        return this.VALIDADE;
    }

    /**
     * Set Expiration date.
     * @param VALIDADE Expiration date.
     */
    public void setVALIDADE(String VALIDADE) {
        this.VALIDADE = VALIDADE;
    }

    /**
     * Get Indicates the qualification. 
     * @return QUALIFICATION Indicates the qualification.
     */
    public String getQUALIFICATION() {
        return this.QUALIFICATION;
    }

    /**
     * Set Indicates the qualification.
     * @param QUALIFICATION Indicates the qualification.
     */
    public void setQUALIFICATION(String QUALIFICATION) {
        this.QUALIFICATION = QUALIFICATION;
    }

    /**
     * Get Identity card number. 
     * @return IDENTIDADE Identity card number.
     */
    public String getIDENTIDADE() {
        return this.IDENTIDADE;
    }

    /**
     * Set Identity card number.
     * @param IDENTIDADE Identity card number.
     */
    public void setIDENTIDADE(String IDENTIDADE) {
        this.IDENTIDADE = IDENTIDADE;
    }

    /**
     * Get Tax number of the person. 
     * @return CPF Tax number of the person.
     */
    public String getCPF() {
        return this.CPF;
    }

    /**
     * Set Tax number of the person.
     * @param CPF Tax number of the person.
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Get Date of birth. 
     * @return NASCIMENTO Date of birth.
     */
    public String getNASCIMENTO() {
        return this.NASCIMENTO;
    }

    /**
     * Set Date of birth.
     * @param NASCIMENTO Date of birth.
     */
    public void setNASCIMENTO(String NASCIMENTO) {
        this.NASCIMENTO = NASCIMENTO;
    }

    /**
     * Get Membership status. 
     * @return MEMBERSHIP Membership status.
     */
    public String getMEMBERSHIP() {
        return this.MEMBERSHIP;
    }

    /**
     * Set Membership status.
     * @param MEMBERSHIP Membership status.
     */
    public void setMEMBERSHIP(String MEMBERSHIP) {
        this.MEMBERSHIP = MEMBERSHIP;
    }

    /**
     * Get Registration number. 
     * @return REGISTRO Registration number.
     */
    public String getREGISTRO() {
        return this.REGISTRO;
    }

    /**
     * Set Registration number.
     * @param REGISTRO Registration number.
     */
    public void setREGISTRO(String REGISTRO) {
        this.REGISTRO = REGISTRO;
    }

    /**
     * Get Remarks. 
     * @return OBSERVATIONS Remarks.
     */
    public String getOBSERVATIONS() {
        return this.OBSERVATIONS;
    }

    /**
     * Set Remarks.
     * @param OBSERVATIONS Remarks.
     */
    public void setOBSERVATIONS(String OBSERVATIONS) {
        this.OBSERVATIONS = OBSERVATIONS;
    }

    /**
     * Get Issue date. 
     * @return IssueDate Issue date.
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set Issue date.
     * @param IssueDate Issue date.
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get Issuing location. 
     * @return LOCAL Issuing location.
     */
    public String getLOCAL() {
        return this.LOCAL;
    }

    /**
     * Set Issuing location.
     * @param LOCAL Issuing location.
     */
    public void setLOCAL(String LOCAL) {
        this.LOCAL = LOCAL;
    }

    /**
     * Get Record number. 
     * @return BackNumber Record number.
     */
    public String getBackNumber() {
        return this.BackNumber;
    }

    /**
     * Set Record number.
     * @param BackNumber Record number.
     */
    public void setBackNumber(String BackNumber) {
        this.BackNumber = BackNumber;
    }

    /**
     * Get Specifies the avatar in base64 format. 
     * @return PortraitImage Specifies the avatar in base64 format.
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Specifies the avatar in base64 format.
     * @param PortraitImage Specifies the avatar in base64 format.
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    public BrazilDriverLicenseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrazilDriverLicenseInfo(BrazilDriverLicenseInfo source) {
        if (source.NOME != null) {
            this.NOME = new String(source.NOME);
        }
        if (source.CatHab != null) {
            this.CatHab = new String(source.CatHab);
        }
        if (source.CNHNumber != null) {
            this.CNHNumber = new String(source.CNHNumber);
        }
        if (source.VALIDADE != null) {
            this.VALIDADE = new String(source.VALIDADE);
        }
        if (source.QUALIFICATION != null) {
            this.QUALIFICATION = new String(source.QUALIFICATION);
        }
        if (source.IDENTIDADE != null) {
            this.IDENTIDADE = new String(source.IDENTIDADE);
        }
        if (source.CPF != null) {
            this.CPF = new String(source.CPF);
        }
        if (source.NASCIMENTO != null) {
            this.NASCIMENTO = new String(source.NASCIMENTO);
        }
        if (source.MEMBERSHIP != null) {
            this.MEMBERSHIP = new String(source.MEMBERSHIP);
        }
        if (source.REGISTRO != null) {
            this.REGISTRO = new String(source.REGISTRO);
        }
        if (source.OBSERVATIONS != null) {
            this.OBSERVATIONS = new String(source.OBSERVATIONS);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.LOCAL != null) {
            this.LOCAL = new String(source.LOCAL);
        }
        if (source.BackNumber != null) {
            this.BackNumber = new String(source.BackNumber);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NOME", this.NOME);
        this.setParamSimple(map, prefix + "CatHab", this.CatHab);
        this.setParamSimple(map, prefix + "CNHNumber", this.CNHNumber);
        this.setParamSimple(map, prefix + "VALIDADE", this.VALIDADE);
        this.setParamSimple(map, prefix + "QUALIFICATION", this.QUALIFICATION);
        this.setParamSimple(map, prefix + "IDENTIDADE", this.IDENTIDADE);
        this.setParamSimple(map, prefix + "CPF", this.CPF);
        this.setParamSimple(map, prefix + "NASCIMENTO", this.NASCIMENTO);
        this.setParamSimple(map, prefix + "MEMBERSHIP", this.MEMBERSHIP);
        this.setParamSimple(map, prefix + "REGISTRO", this.REGISTRO);
        this.setParamSimple(map, prefix + "OBSERVATIONS", this.OBSERVATIONS);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "LOCAL", this.LOCAL);
        this.setParamSimple(map, prefix + "BackNumber", this.BackNumber);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);

    }
}

