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

public class BrazilRNEInfo extends AbstractModel {

    /**
    * RNE
    */
    @SerializedName("RNE")
    @Expose
    private String RNE;

    /**
    * CLASSIFICAÇÃO(CLASSIFICATION)
    */
    @SerializedName("CLASSIFICATION")
    @Expose
    private String CLASSIFICATION;

    /**
    * VALIDADE
    */
    @SerializedName("VALIDADE")
    @Expose
    private String VALIDADE;

    /**
    * NOME
    */
    @SerializedName("NOME")
    @Expose
    private String NOME;

    /**
    * FILIAÇÃO(MEMBERSHIP)
    */
    @SerializedName("Membership")
    @Expose
    private String Membership;

    /**
    * NACIONALIDADE
    */
    @SerializedName("NACIONALIDADE")
    @Expose
    private String NACIONALIDADE;

    /**
    * NATURALIDADE(PAÍS)
    */
    @SerializedName("NATURALIDADE")
    @Expose
    private String NATURALIDADE;

    /**
    * ORGÃO EXPEDIDOR(IssuingAgency)
    */
    @SerializedName("IssuingAgency")
    @Expose
    private String IssuingAgency;

    /**
    * DATA DE NASCIMENTO(DateOfBirth)
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * SEXO
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * DATA DE ENTRADA(EntryDate)
    */
    @SerializedName("EntryDate")
    @Expose
    private String EntryDate;

    /**
    * VIA
    */
    @SerializedName("VIA")
    @Expose
    private String VIA;

    /**
    * DATA DE EXPEDIÇÃO(DispatchDate)
    */
    @SerializedName("DispatchDate")
    @Expose
    private String DispatchDate;

    /**
    * MRZ
    */
    @SerializedName("MRZ")
    @Expose
    private String MRZ;

    /**
    * PortraitImage
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
     * Get RNE 
     * @return RNE RNE
     */
    public String getRNE() {
        return this.RNE;
    }

    /**
     * Set RNE
     * @param RNE RNE
     */
    public void setRNE(String RNE) {
        this.RNE = RNE;
    }

    /**
     * Get CLASSIFICAÇÃO(CLASSIFICATION) 
     * @return CLASSIFICATION CLASSIFICAÇÃO(CLASSIFICATION)
     */
    public String getCLASSIFICATION() {
        return this.CLASSIFICATION;
    }

    /**
     * Set CLASSIFICAÇÃO(CLASSIFICATION)
     * @param CLASSIFICATION CLASSIFICAÇÃO(CLASSIFICATION)
     */
    public void setCLASSIFICATION(String CLASSIFICATION) {
        this.CLASSIFICATION = CLASSIFICATION;
    }

    /**
     * Get VALIDADE 
     * @return VALIDADE VALIDADE
     */
    public String getVALIDADE() {
        return this.VALIDADE;
    }

    /**
     * Set VALIDADE
     * @param VALIDADE VALIDADE
     */
    public void setVALIDADE(String VALIDADE) {
        this.VALIDADE = VALIDADE;
    }

    /**
     * Get NOME 
     * @return NOME NOME
     */
    public String getNOME() {
        return this.NOME;
    }

    /**
     * Set NOME
     * @param NOME NOME
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    /**
     * Get FILIAÇÃO(MEMBERSHIP) 
     * @return Membership FILIAÇÃO(MEMBERSHIP)
     */
    public String getMembership() {
        return this.Membership;
    }

    /**
     * Set FILIAÇÃO(MEMBERSHIP)
     * @param Membership FILIAÇÃO(MEMBERSHIP)
     */
    public void setMembership(String Membership) {
        this.Membership = Membership;
    }

    /**
     * Get NACIONALIDADE 
     * @return NACIONALIDADE NACIONALIDADE
     */
    public String getNACIONALIDADE() {
        return this.NACIONALIDADE;
    }

    /**
     * Set NACIONALIDADE
     * @param NACIONALIDADE NACIONALIDADE
     */
    public void setNACIONALIDADE(String NACIONALIDADE) {
        this.NACIONALIDADE = NACIONALIDADE;
    }

    /**
     * Get NATURALIDADE(PAÍS) 
     * @return NATURALIDADE NATURALIDADE(PAÍS)
     */
    public String getNATURALIDADE() {
        return this.NATURALIDADE;
    }

    /**
     * Set NATURALIDADE(PAÍS)
     * @param NATURALIDADE NATURALIDADE(PAÍS)
     */
    public void setNATURALIDADE(String NATURALIDADE) {
        this.NATURALIDADE = NATURALIDADE;
    }

    /**
     * Get ORGÃO EXPEDIDOR(IssuingAgency) 
     * @return IssuingAgency ORGÃO EXPEDIDOR(IssuingAgency)
     */
    public String getIssuingAgency() {
        return this.IssuingAgency;
    }

    /**
     * Set ORGÃO EXPEDIDOR(IssuingAgency)
     * @param IssuingAgency ORGÃO EXPEDIDOR(IssuingAgency)
     */
    public void setIssuingAgency(String IssuingAgency) {
        this.IssuingAgency = IssuingAgency;
    }

    /**
     * Get DATA DE NASCIMENTO(DateOfBirth) 
     * @return DateOfBirth DATA DE NASCIMENTO(DateOfBirth)
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set DATA DE NASCIMENTO(DateOfBirth)
     * @param DateOfBirth DATA DE NASCIMENTO(DateOfBirth)
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get SEXO 
     * @return Sex SEXO
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set SEXO
     * @param Sex SEXO
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get DATA DE ENTRADA(EntryDate) 
     * @return EntryDate DATA DE ENTRADA(EntryDate)
     */
    public String getEntryDate() {
        return this.EntryDate;
    }

    /**
     * Set DATA DE ENTRADA(EntryDate)
     * @param EntryDate DATA DE ENTRADA(EntryDate)
     */
    public void setEntryDate(String EntryDate) {
        this.EntryDate = EntryDate;
    }

    /**
     * Get VIA 
     * @return VIA VIA
     */
    public String getVIA() {
        return this.VIA;
    }

    /**
     * Set VIA
     * @param VIA VIA
     */
    public void setVIA(String VIA) {
        this.VIA = VIA;
    }

    /**
     * Get DATA DE EXPEDIÇÃO(DispatchDate) 
     * @return DispatchDate DATA DE EXPEDIÇÃO(DispatchDate)
     */
    public String getDispatchDate() {
        return this.DispatchDate;
    }

    /**
     * Set DATA DE EXPEDIÇÃO(DispatchDate)
     * @param DispatchDate DATA DE EXPEDIÇÃO(DispatchDate)
     */
    public void setDispatchDate(String DispatchDate) {
        this.DispatchDate = DispatchDate;
    }

    /**
     * Get MRZ 
     * @return MRZ MRZ
     */
    public String getMRZ() {
        return this.MRZ;
    }

    /**
     * Set MRZ
     * @param MRZ MRZ
     */
    public void setMRZ(String MRZ) {
        this.MRZ = MRZ;
    }

    /**
     * Get PortraitImage 
     * @return PortraitImage PortraitImage
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set PortraitImage
     * @param PortraitImage PortraitImage
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    public BrazilRNEInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrazilRNEInfo(BrazilRNEInfo source) {
        if (source.RNE != null) {
            this.RNE = new String(source.RNE);
        }
        if (source.CLASSIFICATION != null) {
            this.CLASSIFICATION = new String(source.CLASSIFICATION);
        }
        if (source.VALIDADE != null) {
            this.VALIDADE = new String(source.VALIDADE);
        }
        if (source.NOME != null) {
            this.NOME = new String(source.NOME);
        }
        if (source.Membership != null) {
            this.Membership = new String(source.Membership);
        }
        if (source.NACIONALIDADE != null) {
            this.NACIONALIDADE = new String(source.NACIONALIDADE);
        }
        if (source.NATURALIDADE != null) {
            this.NATURALIDADE = new String(source.NATURALIDADE);
        }
        if (source.IssuingAgency != null) {
            this.IssuingAgency = new String(source.IssuingAgency);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.EntryDate != null) {
            this.EntryDate = new String(source.EntryDate);
        }
        if (source.VIA != null) {
            this.VIA = new String(source.VIA);
        }
        if (source.DispatchDate != null) {
            this.DispatchDate = new String(source.DispatchDate);
        }
        if (source.MRZ != null) {
            this.MRZ = new String(source.MRZ);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RNE", this.RNE);
        this.setParamSimple(map, prefix + "CLASSIFICATION", this.CLASSIFICATION);
        this.setParamSimple(map, prefix + "VALIDADE", this.VALIDADE);
        this.setParamSimple(map, prefix + "NOME", this.NOME);
        this.setParamSimple(map, prefix + "Membership", this.Membership);
        this.setParamSimple(map, prefix + "NACIONALIDADE", this.NACIONALIDADE);
        this.setParamSimple(map, prefix + "NATURALIDADE", this.NATURALIDADE);
        this.setParamSimple(map, prefix + "IssuingAgency", this.IssuingAgency);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "EntryDate", this.EntryDate);
        this.setParamSimple(map, prefix + "VIA", this.VIA);
        this.setParamSimple(map, prefix + "DispatchDate", this.DispatchDate);
        this.setParamSimple(map, prefix + "MRZ", this.MRZ);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);

    }
}

