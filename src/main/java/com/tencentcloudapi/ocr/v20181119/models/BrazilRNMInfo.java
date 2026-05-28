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

public class BrazilRNMInfo extends AbstractModel {

    /**
    * SOBRENOME Type
    */
    @SerializedName("SOBRENOME")
    @Expose
    private String SOBRENOME;

    /**
    * NOME Type
    */
    @SerializedName("NOME")
    @Expose
    private String NOME;

    /**
    * DATA DE NASCIMENTO
    */
    @SerializedName("DATADENASCIMENTO")
    @Expose
    private String DATADENASCIMENTO;

    /**
    * SEXO F
    */
    @SerializedName("SEXO")
    @Expose
    private String SEXO;

    /**
    * FILIAÇÃO(MEMBERSHIP)
    */
    @SerializedName("MEMBERSHIP")
    @Expose
    private String MEMBERSHIP;

    /**
    * NACIONALIDADE Type
    */
    @SerializedName("NACIONALIDADE")
    @Expose
    private String NACIONALIDADE;

    /**
    * VALIDADE Type
    */
    @SerializedName("VALIDADE")
    @Expose
    private String VALIDADE;

    /**
    * RNM Type
    */
    @SerializedName("RNM")
    @Expose
    private String RNM;

    /**
    * CPF Type
    */
    @SerializedName("CPF")
    @Expose
    private String CPF;

    /**
    * CLASSIFICAÇÃO(CLASSIFICATION)
    */
    @SerializedName("CLASSIFICATION")
    @Expose
    private String CLASSIFICATION;

    /**
    * PRAZO DE RESIDENCIA
    */
    @SerializedName("PRAZODERESIDENCIA")
    @Expose
    private String PRAZODERESIDENCIA;

    /**
    * EMISSÃO(ISSUANCE)
    */
    @SerializedName("ISSUANCE")
    @Expose
    private String ISSUANCE;

    /**
    * AMPARO LEGAL(LegalHelp)
    */
    @SerializedName("AMPAROLEGAL")
    @Expose
    private String AMPAROLEGAL;

    /**
    * MRZCode
    */
    @SerializedName("MRZ")
    @Expose
    private String MRZ;

    /**
    * Portrait Image
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * PortraitImage(Back)
    */
    @SerializedName("PortraitImageBack")
    @Expose
    private String PortraitImageBack;

    /**
     * Get SOBRENOME Type 
     * @return SOBRENOME SOBRENOME Type
     */
    public String getSOBRENOME() {
        return this.SOBRENOME;
    }

    /**
     * Set SOBRENOME Type
     * @param SOBRENOME SOBRENOME Type
     */
    public void setSOBRENOME(String SOBRENOME) {
        this.SOBRENOME = SOBRENOME;
    }

    /**
     * Get NOME Type 
     * @return NOME NOME Type
     */
    public String getNOME() {
        return this.NOME;
    }

    /**
     * Set NOME Type
     * @param NOME NOME Type
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    /**
     * Get DATA DE NASCIMENTO 
     * @return DATADENASCIMENTO DATA DE NASCIMENTO
     */
    public String getDATADENASCIMENTO() {
        return this.DATADENASCIMENTO;
    }

    /**
     * Set DATA DE NASCIMENTO
     * @param DATADENASCIMENTO DATA DE NASCIMENTO
     */
    public void setDATADENASCIMENTO(String DATADENASCIMENTO) {
        this.DATADENASCIMENTO = DATADENASCIMENTO;
    }

    /**
     * Get SEXO F 
     * @return SEXO SEXO F
     */
    public String getSEXO() {
        return this.SEXO;
    }

    /**
     * Set SEXO F
     * @param SEXO SEXO F
     */
    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    /**
     * Get FILIAÇÃO(MEMBERSHIP) 
     * @return MEMBERSHIP FILIAÇÃO(MEMBERSHIP)
     */
    public String getMEMBERSHIP() {
        return this.MEMBERSHIP;
    }

    /**
     * Set FILIAÇÃO(MEMBERSHIP)
     * @param MEMBERSHIP FILIAÇÃO(MEMBERSHIP)
     */
    public void setMEMBERSHIP(String MEMBERSHIP) {
        this.MEMBERSHIP = MEMBERSHIP;
    }

    /**
     * Get NACIONALIDADE Type 
     * @return NACIONALIDADE NACIONALIDADE Type
     */
    public String getNACIONALIDADE() {
        return this.NACIONALIDADE;
    }

    /**
     * Set NACIONALIDADE Type
     * @param NACIONALIDADE NACIONALIDADE Type
     */
    public void setNACIONALIDADE(String NACIONALIDADE) {
        this.NACIONALIDADE = NACIONALIDADE;
    }

    /**
     * Get VALIDADE Type 
     * @return VALIDADE VALIDADE Type
     */
    public String getVALIDADE() {
        return this.VALIDADE;
    }

    /**
     * Set VALIDADE Type
     * @param VALIDADE VALIDADE Type
     */
    public void setVALIDADE(String VALIDADE) {
        this.VALIDADE = VALIDADE;
    }

    /**
     * Get RNM Type 
     * @return RNM RNM Type
     */
    public String getRNM() {
        return this.RNM;
    }

    /**
     * Set RNM Type
     * @param RNM RNM Type
     */
    public void setRNM(String RNM) {
        this.RNM = RNM;
    }

    /**
     * Get CPF Type 
     * @return CPF CPF Type
     */
    public String getCPF() {
        return this.CPF;
    }

    /**
     * Set CPF Type
     * @param CPF CPF Type
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
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
     * Get PRAZO DE RESIDENCIA 
     * @return PRAZODERESIDENCIA PRAZO DE RESIDENCIA
     */
    public String getPRAZODERESIDENCIA() {
        return this.PRAZODERESIDENCIA;
    }

    /**
     * Set PRAZO DE RESIDENCIA
     * @param PRAZODERESIDENCIA PRAZO DE RESIDENCIA
     */
    public void setPRAZODERESIDENCIA(String PRAZODERESIDENCIA) {
        this.PRAZODERESIDENCIA = PRAZODERESIDENCIA;
    }

    /**
     * Get EMISSÃO(ISSUANCE) 
     * @return ISSUANCE EMISSÃO(ISSUANCE)
     */
    public String getISSUANCE() {
        return this.ISSUANCE;
    }

    /**
     * Set EMISSÃO(ISSUANCE)
     * @param ISSUANCE EMISSÃO(ISSUANCE)
     */
    public void setISSUANCE(String ISSUANCE) {
        this.ISSUANCE = ISSUANCE;
    }

    /**
     * Get AMPARO LEGAL(LegalHelp) 
     * @return AMPAROLEGAL AMPARO LEGAL(LegalHelp)
     */
    public String getAMPAROLEGAL() {
        return this.AMPAROLEGAL;
    }

    /**
     * Set AMPARO LEGAL(LegalHelp)
     * @param AMPAROLEGAL AMPARO LEGAL(LegalHelp)
     */
    public void setAMPAROLEGAL(String AMPAROLEGAL) {
        this.AMPAROLEGAL = AMPAROLEGAL;
    }

    /**
     * Get MRZCode 
     * @return MRZ MRZCode
     */
    public String getMRZ() {
        return this.MRZ;
    }

    /**
     * Set MRZCode
     * @param MRZ MRZCode
     */
    public void setMRZ(String MRZ) {
        this.MRZ = MRZ;
    }

    /**
     * Get Portrait Image 
     * @return PortraitImage Portrait Image
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Portrait Image
     * @param PortraitImage Portrait Image
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get PortraitImage(Back) 
     * @return PortraitImageBack PortraitImage(Back)
     */
    public String getPortraitImageBack() {
        return this.PortraitImageBack;
    }

    /**
     * Set PortraitImage(Back)
     * @param PortraitImageBack PortraitImage(Back)
     */
    public void setPortraitImageBack(String PortraitImageBack) {
        this.PortraitImageBack = PortraitImageBack;
    }

    public BrazilRNMInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrazilRNMInfo(BrazilRNMInfo source) {
        if (source.SOBRENOME != null) {
            this.SOBRENOME = new String(source.SOBRENOME);
        }
        if (source.NOME != null) {
            this.NOME = new String(source.NOME);
        }
        if (source.DATADENASCIMENTO != null) {
            this.DATADENASCIMENTO = new String(source.DATADENASCIMENTO);
        }
        if (source.SEXO != null) {
            this.SEXO = new String(source.SEXO);
        }
        if (source.MEMBERSHIP != null) {
            this.MEMBERSHIP = new String(source.MEMBERSHIP);
        }
        if (source.NACIONALIDADE != null) {
            this.NACIONALIDADE = new String(source.NACIONALIDADE);
        }
        if (source.VALIDADE != null) {
            this.VALIDADE = new String(source.VALIDADE);
        }
        if (source.RNM != null) {
            this.RNM = new String(source.RNM);
        }
        if (source.CPF != null) {
            this.CPF = new String(source.CPF);
        }
        if (source.CLASSIFICATION != null) {
            this.CLASSIFICATION = new String(source.CLASSIFICATION);
        }
        if (source.PRAZODERESIDENCIA != null) {
            this.PRAZODERESIDENCIA = new String(source.PRAZODERESIDENCIA);
        }
        if (source.ISSUANCE != null) {
            this.ISSUANCE = new String(source.ISSUANCE);
        }
        if (source.AMPAROLEGAL != null) {
            this.AMPAROLEGAL = new String(source.AMPAROLEGAL);
        }
        if (source.MRZ != null) {
            this.MRZ = new String(source.MRZ);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.PortraitImageBack != null) {
            this.PortraitImageBack = new String(source.PortraitImageBack);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SOBRENOME", this.SOBRENOME);
        this.setParamSimple(map, prefix + "NOME", this.NOME);
        this.setParamSimple(map, prefix + "DATADENASCIMENTO", this.DATADENASCIMENTO);
        this.setParamSimple(map, prefix + "SEXO", this.SEXO);
        this.setParamSimple(map, prefix + "MEMBERSHIP", this.MEMBERSHIP);
        this.setParamSimple(map, prefix + "NACIONALIDADE", this.NACIONALIDADE);
        this.setParamSimple(map, prefix + "VALIDADE", this.VALIDADE);
        this.setParamSimple(map, prefix + "RNM", this.RNM);
        this.setParamSimple(map, prefix + "CPF", this.CPF);
        this.setParamSimple(map, prefix + "CLASSIFICATION", this.CLASSIFICATION);
        this.setParamSimple(map, prefix + "PRAZODERESIDENCIA", this.PRAZODERESIDENCIA);
        this.setParamSimple(map, prefix + "ISSUANCE", this.ISSUANCE);
        this.setParamSimple(map, prefix + "AMPAROLEGAL", this.AMPAROLEGAL);
        this.setParamSimple(map, prefix + "MRZ", this.MRZ);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamSimple(map, prefix + "PortraitImageBack", this.PortraitImageBack);

    }
}

