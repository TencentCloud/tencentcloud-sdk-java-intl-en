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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndonesiaIDCard extends AbstractModel {

    /**
    * ID number
    */
    @SerializedName("NIK")
    @Expose
    private String NIK;

    /**
    * Name
    */
    @SerializedName("Nama")
    @Expose
    private String Nama;

    /**
    * Birthplace/Date of birth
    */
    @SerializedName("TempatTglLahir")
    @Expose
    private String TempatTglLahir;

    /**
    * Sex
    */
    @SerializedName("JenisKelamin")
    @Expose
    private String JenisKelamin;

    /**
    * Blood type
    */
    @SerializedName("GolDarah")
    @Expose
    private String GolDarah;

    /**
    * Address.
    */
    @SerializedName("Alamat")
    @Expose
    private String Alamat;

    /**
    * Street
    */
    @SerializedName("RTRW")
    @Expose
    private String RTRW;

    /**
    * Village
    */
    @SerializedName("KelDesa")
    @Expose
    private String KelDesa;

    /**
    * Region.
    */
    @SerializedName("Kecamatan")
    @Expose
    private String Kecamatan;

    /**
    * Religious belief
    */
    @SerializedName("Agama")
    @Expose
    private String Agama;

    /**
    * Marital status
    */
    @SerializedName("StatusPerkawinan")
    @Expose
    private String StatusPerkawinan;

    /**
    * Occupation
    */
    @SerializedName("Perkerjaan")
    @Expose
    private String Perkerjaan;

    /**
    * Nationality
    */
    @SerializedName("KewargaNegaraan")
    @Expose
    private String KewargaNegaraan;

    /**
    * Validity period of the ID card
    */
    @SerializedName("BerlakuHingga")
    @Expose
    private String BerlakuHingga;

    /**
    * Issue date
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Province
    */
    @SerializedName("Provinsi")
    @Expose
    private String Provinsi;

    /**
    * city
    */
    @SerializedName("Kota")
    @Expose
    private String Kota;

    /**
     * Get ID number 
     * @return NIK ID number
     */
    public String getNIK() {
        return this.NIK;
    }

    /**
     * Set ID number
     * @param NIK ID number
     */
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * Get Name 
     * @return Nama Name
     */
    public String getNama() {
        return this.Nama;
    }

    /**
     * Set Name
     * @param Nama Name
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * Get Birthplace/Date of birth 
     * @return TempatTglLahir Birthplace/Date of birth
     */
    public String getTempatTglLahir() {
        return this.TempatTglLahir;
    }

    /**
     * Set Birthplace/Date of birth
     * @param TempatTglLahir Birthplace/Date of birth
     */
    public void setTempatTglLahir(String TempatTglLahir) {
        this.TempatTglLahir = TempatTglLahir;
    }

    /**
     * Get Sex 
     * @return JenisKelamin Sex
     */
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    /**
     * Set Sex
     * @param JenisKelamin Sex
     */
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    /**
     * Get Blood type 
     * @return GolDarah Blood type
     */
    public String getGolDarah() {
        return this.GolDarah;
    }

    /**
     * Set Blood type
     * @param GolDarah Blood type
     */
    public void setGolDarah(String GolDarah) {
        this.GolDarah = GolDarah;
    }

    /**
     * Get Address. 
     * @return Alamat Address.
     */
    public String getAlamat() {
        return this.Alamat;
    }

    /**
     * Set Address.
     * @param Alamat Address.
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * Get Street 
     * @return RTRW Street
     */
    public String getRTRW() {
        return this.RTRW;
    }

    /**
     * Set Street
     * @param RTRW Street
     */
    public void setRTRW(String RTRW) {
        this.RTRW = RTRW;
    }

    /**
     * Get Village 
     * @return KelDesa Village
     */
    public String getKelDesa() {
        return this.KelDesa;
    }

    /**
     * Set Village
     * @param KelDesa Village
     */
    public void setKelDesa(String KelDesa) {
        this.KelDesa = KelDesa;
    }

    /**
     * Get Region. 
     * @return Kecamatan Region.
     */
    public String getKecamatan() {
        return this.Kecamatan;
    }

    /**
     * Set Region.
     * @param Kecamatan Region.
     */
    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    /**
     * Get Religious belief 
     * @return Agama Religious belief
     */
    public String getAgama() {
        return this.Agama;
    }

    /**
     * Set Religious belief
     * @param Agama Religious belief
     */
    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    /**
     * Get Marital status 
     * @return StatusPerkawinan Marital status
     */
    public String getStatusPerkawinan() {
        return this.StatusPerkawinan;
    }

    /**
     * Set Marital status
     * @param StatusPerkawinan Marital status
     */
    public void setStatusPerkawinan(String StatusPerkawinan) {
        this.StatusPerkawinan = StatusPerkawinan;
    }

    /**
     * Get Occupation 
     * @return Perkerjaan Occupation
     */
    public String getPerkerjaan() {
        return this.Perkerjaan;
    }

    /**
     * Set Occupation
     * @param Perkerjaan Occupation
     */
    public void setPerkerjaan(String Perkerjaan) {
        this.Perkerjaan = Perkerjaan;
    }

    /**
     * Get Nationality 
     * @return KewargaNegaraan Nationality
     */
    public String getKewargaNegaraan() {
        return this.KewargaNegaraan;
    }

    /**
     * Set Nationality
     * @param KewargaNegaraan Nationality
     */
    public void setKewargaNegaraan(String KewargaNegaraan) {
        this.KewargaNegaraan = KewargaNegaraan;
    }

    /**
     * Get Validity period of the ID card 
     * @return BerlakuHingga Validity period of the ID card
     */
    public String getBerlakuHingga() {
        return this.BerlakuHingga;
    }

    /**
     * Set Validity period of the ID card
     * @param BerlakuHingga Validity period of the ID card
     */
    public void setBerlakuHingga(String BerlakuHingga) {
        this.BerlakuHingga = BerlakuHingga;
    }

    /**
     * Get Issue date 
     * @return IssuedDate Issue date
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issue date
     * @param IssuedDate Issue date
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Province 
     * @return Provinsi Province
     */
    public String getProvinsi() {
        return this.Provinsi;
    }

    /**
     * Set Province
     * @param Provinsi Province
     */
    public void setProvinsi(String Provinsi) {
        this.Provinsi = Provinsi;
    }

    /**
     * Get city 
     * @return Kota city
     */
    public String getKota() {
        return this.Kota;
    }

    /**
     * Set city
     * @param Kota city
     */
    public void setKota(String Kota) {
        this.Kota = Kota;
    }

    public IndonesiaIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndonesiaIDCard(IndonesiaIDCard source) {
        if (source.NIK != null) {
            this.NIK = new String(source.NIK);
        }
        if (source.Nama != null) {
            this.Nama = new String(source.Nama);
        }
        if (source.TempatTglLahir != null) {
            this.TempatTglLahir = new String(source.TempatTglLahir);
        }
        if (source.JenisKelamin != null) {
            this.JenisKelamin = new String(source.JenisKelamin);
        }
        if (source.GolDarah != null) {
            this.GolDarah = new String(source.GolDarah);
        }
        if (source.Alamat != null) {
            this.Alamat = new String(source.Alamat);
        }
        if (source.RTRW != null) {
            this.RTRW = new String(source.RTRW);
        }
        if (source.KelDesa != null) {
            this.KelDesa = new String(source.KelDesa);
        }
        if (source.Kecamatan != null) {
            this.Kecamatan = new String(source.Kecamatan);
        }
        if (source.Agama != null) {
            this.Agama = new String(source.Agama);
        }
        if (source.StatusPerkawinan != null) {
            this.StatusPerkawinan = new String(source.StatusPerkawinan);
        }
        if (source.Perkerjaan != null) {
            this.Perkerjaan = new String(source.Perkerjaan);
        }
        if (source.KewargaNegaraan != null) {
            this.KewargaNegaraan = new String(source.KewargaNegaraan);
        }
        if (source.BerlakuHingga != null) {
            this.BerlakuHingga = new String(source.BerlakuHingga);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.Provinsi != null) {
            this.Provinsi = new String(source.Provinsi);
        }
        if (source.Kota != null) {
            this.Kota = new String(source.Kota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NIK", this.NIK);
        this.setParamSimple(map, prefix + "Nama", this.Nama);
        this.setParamSimple(map, prefix + "TempatTglLahir", this.TempatTglLahir);
        this.setParamSimple(map, prefix + "JenisKelamin", this.JenisKelamin);
        this.setParamSimple(map, prefix + "GolDarah", this.GolDarah);
        this.setParamSimple(map, prefix + "Alamat", this.Alamat);
        this.setParamSimple(map, prefix + "RTRW", this.RTRW);
        this.setParamSimple(map, prefix + "KelDesa", this.KelDesa);
        this.setParamSimple(map, prefix + "Kecamatan", this.Kecamatan);
        this.setParamSimple(map, prefix + "Agama", this.Agama);
        this.setParamSimple(map, prefix + "StatusPerkawinan", this.StatusPerkawinan);
        this.setParamSimple(map, prefix + "Perkerjaan", this.Perkerjaan);
        this.setParamSimple(map, prefix + "KewargaNegaraan", this.KewargaNegaraan);
        this.setParamSimple(map, prefix + "BerlakuHingga", this.BerlakuHingga);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "Provinsi", this.Provinsi);
        this.setParamSimple(map, prefix + "Kota", this.Kota);

    }
}

