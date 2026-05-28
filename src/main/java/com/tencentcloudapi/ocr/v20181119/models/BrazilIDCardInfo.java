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

public class BrazilIDCardInfo extends AbstractModel {

    /**
    * Name.
    */
    @SerializedName("Nome")
    @Expose
    private String Nome;

    /**
    * Parent information.
    */
    @SerializedName("MemberShip")
    @Expose
    private String MemberShip;

    /**
    * Date of birth.
    */
    @SerializedName("DataNascimento")
    @Expose
    private String DataNascimento;

    /**
    * Issuing organization.
    */
    @SerializedName("IssuingAgency")
    @Expose
    private String IssuingAgency;

    /**
    * Specifies the blood type.
    */
    @SerializedName("Fatorrh")
    @Expose
    private String Fatorrh;

    /**
    * Birthplace.
    */
    @SerializedName("NaturalIDade")
    @Expose
    private String NaturalIDade;

    /**
    * Remarks.
    */
    @SerializedName("Observations")
    @Expose
    private String Observations;

    /**
    * CPF Type
    */
    @SerializedName("CPF")
    @Expose
    private String CPF;

    /**
    * DNI Type
    */
    @SerializedName("DNI")
    @Expose
    private String DNI;

    /**
    * Common registration.
    */
    @SerializedName("RegistroGeral")
    @Expose
    private String RegistroGeral;

    /**
    * Issue date. valid values: dd/mm/yyyy.
    */
    @SerializedName("DispatchDate")
    @Expose
    private String DispatchDate;

    /**
    * Address.
    */
    @SerializedName("Registro")
    @Expose
    private String Registro;

    /**
    * Specifies the avatar in Base64 format of the id card.
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * Original identity information.
    */
    @SerializedName("DocOrigem")
    @Expose
    private String DocOrigem;

    /**
     * Get Name. 
     * @return Nome Name.
     */
    public String getNome() {
        return this.Nome;
    }

    /**
     * Set Name.
     * @param Nome Name.
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * Get Parent information. 
     * @return MemberShip Parent information.
     */
    public String getMemberShip() {
        return this.MemberShip;
    }

    /**
     * Set Parent information.
     * @param MemberShip Parent information.
     */
    public void setMemberShip(String MemberShip) {
        this.MemberShip = MemberShip;
    }

    /**
     * Get Date of birth. 
     * @return DataNascimento Date of birth.
     */
    public String getDataNascimento() {
        return this.DataNascimento;
    }

    /**
     * Set Date of birth.
     * @param DataNascimento Date of birth.
     */
    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    /**
     * Get Issuing organization. 
     * @return IssuingAgency Issuing organization.
     */
    public String getIssuingAgency() {
        return this.IssuingAgency;
    }

    /**
     * Set Issuing organization.
     * @param IssuingAgency Issuing organization.
     */
    public void setIssuingAgency(String IssuingAgency) {
        this.IssuingAgency = IssuingAgency;
    }

    /**
     * Get Specifies the blood type. 
     * @return Fatorrh Specifies the blood type.
     */
    public String getFatorrh() {
        return this.Fatorrh;
    }

    /**
     * Set Specifies the blood type.
     * @param Fatorrh Specifies the blood type.
     */
    public void setFatorrh(String Fatorrh) {
        this.Fatorrh = Fatorrh;
    }

    /**
     * Get Birthplace. 
     * @return NaturalIDade Birthplace.
     */
    public String getNaturalIDade() {
        return this.NaturalIDade;
    }

    /**
     * Set Birthplace.
     * @param NaturalIDade Birthplace.
     */
    public void setNaturalIDade(String NaturalIDade) {
        this.NaturalIDade = NaturalIDade;
    }

    /**
     * Get Remarks. 
     * @return Observations Remarks.
     */
    public String getObservations() {
        return this.Observations;
    }

    /**
     * Set Remarks.
     * @param Observations Remarks.
     */
    public void setObservations(String Observations) {
        this.Observations = Observations;
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
     * Get DNI Type 
     * @return DNI DNI Type
     */
    public String getDNI() {
        return this.DNI;
    }

    /**
     * Set DNI Type
     * @param DNI DNI Type
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Get Common registration. 
     * @return RegistroGeral Common registration.
     */
    public String getRegistroGeral() {
        return this.RegistroGeral;
    }

    /**
     * Set Common registration.
     * @param RegistroGeral Common registration.
     */
    public void setRegistroGeral(String RegistroGeral) {
        this.RegistroGeral = RegistroGeral;
    }

    /**
     * Get Issue date. valid values: dd/mm/yyyy. 
     * @return DispatchDate Issue date. valid values: dd/mm/yyyy.
     */
    public String getDispatchDate() {
        return this.DispatchDate;
    }

    /**
     * Set Issue date. valid values: dd/mm/yyyy.
     * @param DispatchDate Issue date. valid values: dd/mm/yyyy.
     */
    public void setDispatchDate(String DispatchDate) {
        this.DispatchDate = DispatchDate;
    }

    /**
     * Get Address. 
     * @return Registro Address.
     */
    public String getRegistro() {
        return this.Registro;
    }

    /**
     * Set Address.
     * @param Registro Address.
     */
    public void setRegistro(String Registro) {
        this.Registro = Registro;
    }

    /**
     * Get Specifies the avatar in Base64 format of the id card. 
     * @return PortraitImage Specifies the avatar in Base64 format of the id card.
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Specifies the avatar in Base64 format of the id card.
     * @param PortraitImage Specifies the avatar in Base64 format of the id card.
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get Original identity information. 
     * @return DocOrigem Original identity information.
     */
    public String getDocOrigem() {
        return this.DocOrigem;
    }

    /**
     * Set Original identity information.
     * @param DocOrigem Original identity information.
     */
    public void setDocOrigem(String DocOrigem) {
        this.DocOrigem = DocOrigem;
    }

    public BrazilIDCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrazilIDCardInfo(BrazilIDCardInfo source) {
        if (source.Nome != null) {
            this.Nome = new String(source.Nome);
        }
        if (source.MemberShip != null) {
            this.MemberShip = new String(source.MemberShip);
        }
        if (source.DataNascimento != null) {
            this.DataNascimento = new String(source.DataNascimento);
        }
        if (source.IssuingAgency != null) {
            this.IssuingAgency = new String(source.IssuingAgency);
        }
        if (source.Fatorrh != null) {
            this.Fatorrh = new String(source.Fatorrh);
        }
        if (source.NaturalIDade != null) {
            this.NaturalIDade = new String(source.NaturalIDade);
        }
        if (source.Observations != null) {
            this.Observations = new String(source.Observations);
        }
        if (source.CPF != null) {
            this.CPF = new String(source.CPF);
        }
        if (source.DNI != null) {
            this.DNI = new String(source.DNI);
        }
        if (source.RegistroGeral != null) {
            this.RegistroGeral = new String(source.RegistroGeral);
        }
        if (source.DispatchDate != null) {
            this.DispatchDate = new String(source.DispatchDate);
        }
        if (source.Registro != null) {
            this.Registro = new String(source.Registro);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.DocOrigem != null) {
            this.DocOrigem = new String(source.DocOrigem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nome", this.Nome);
        this.setParamSimple(map, prefix + "MemberShip", this.MemberShip);
        this.setParamSimple(map, prefix + "DataNascimento", this.DataNascimento);
        this.setParamSimple(map, prefix + "IssuingAgency", this.IssuingAgency);
        this.setParamSimple(map, prefix + "Fatorrh", this.Fatorrh);
        this.setParamSimple(map, prefix + "NaturalIDade", this.NaturalIDade);
        this.setParamSimple(map, prefix + "Observations", this.Observations);
        this.setParamSimple(map, prefix + "CPF", this.CPF);
        this.setParamSimple(map, prefix + "DNI", this.DNI);
        this.setParamSimple(map, prefix + "RegistroGeral", this.RegistroGeral);
        this.setParamSimple(map, prefix + "DispatchDate", this.DispatchDate);
        this.setParamSimple(map, prefix + "Registro", this.Registro);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamSimple(map, prefix + "DocOrigem", this.DocOrigem);

    }
}

