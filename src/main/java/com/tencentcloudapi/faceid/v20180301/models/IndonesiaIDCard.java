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
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NIK")
    @Expose
    private String NIK;

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nama")
    @Expose
    private String Nama;

    /**
    * Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TempatTglLahir")
    @Expose
    private String TempatTglLahir;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JenisKelamin")
    @Expose
    private String JenisKelamin;

    /**
    * Blood type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GolDarah")
    @Expose
    private String GolDarah;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alamat")
    @Expose
    private String Alamat;

    /**
    * Street
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RTRW")
    @Expose
    private String RTRW;

    /**
    * Village
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KelDesa")
    @Expose
    private String KelDesa;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Kecamatan")
    @Expose
    private String Kecamatan;

    /**
    * Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Agama")
    @Expose
    private String Agama;

    /**
    * Marital status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusPerkawinan")
    @Expose
    private String StatusPerkawinan;

    /**
    * Job
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Perkerjaan")
    @Expose
    private String Perkerjaan;

    /**
    * Nationality
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KewargaNegaraan")
    @Expose
    private String KewargaNegaraan;

    /**
    * ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BerlakuHingga")
    @Expose
    private String BerlakuHingga;

    /**
    * Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Province
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Provinsi")
    @Expose
    private String Provinsi;

    /**
    * City
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Kota")
    @Expose
    private String Kota;

    /**
     * Get License number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NIK License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNIK() {
        return this.NIK;
    }

    /**
     * Set License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NIK License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nama Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNama() {
        return this.Nama;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nama Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * Get Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TempatTglLahir Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTempatTglLahir() {
        return this.TempatTglLahir;
    }

    /**
     * Set Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TempatTglLahir Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTempatTglLahir(String TempatTglLahir) {
        this.TempatTglLahir = TempatTglLahir;
    }

    /**
     * Get Gender
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JenisKelamin Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    /**
     * Set Gender
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JenisKelamin Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    /**
     * Get Blood type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GolDarah Blood type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGolDarah() {
        return this.GolDarah;
    }

    /**
     * Set Blood type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GolDarah Blood type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGolDarah(String GolDarah) {
        this.GolDarah = GolDarah;
    }

    /**
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Alamat Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlamat() {
        return this.Alamat;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Alamat Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * Get Street
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RTRW Street
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRTRW() {
        return this.RTRW;
    }

    /**
     * Set Street
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RTRW Street
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRTRW(String RTRW) {
        this.RTRW = RTRW;
    }

    /**
     * Get Village
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KelDesa Village
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKelDesa() {
        return this.KelDesa;
    }

    /**
     * Set Village
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KelDesa Village
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKelDesa(String KelDesa) {
        this.KelDesa = KelDesa;
    }

    /**
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Kecamatan Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKecamatan() {
        return this.Kecamatan;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Kecamatan Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    /**
     * Get Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Agama Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAgama() {
        return this.Agama;
    }

    /**
     * Set Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Agama Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    /**
     * Get Marital status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusPerkawinan Marital status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusPerkawinan() {
        return this.StatusPerkawinan;
    }

    /**
     * Set Marital status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusPerkawinan Marital status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusPerkawinan(String StatusPerkawinan) {
        this.StatusPerkawinan = StatusPerkawinan;
    }

    /**
     * Get Job
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Perkerjaan Job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPerkerjaan() {
        return this.Perkerjaan;
    }

    /**
     * Set Job
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Perkerjaan Job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPerkerjaan(String Perkerjaan) {
        this.Perkerjaan = Perkerjaan;
    }

    /**
     * Get Nationality
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KewargaNegaraan Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKewargaNegaraan() {
        return this.KewargaNegaraan;
    }

    /**
     * Set Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KewargaNegaraan Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKewargaNegaraan(String KewargaNegaraan) {
        this.KewargaNegaraan = KewargaNegaraan;
    }

    /**
     * Get ID card validity period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BerlakuHingga ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBerlakuHingga() {
        return this.BerlakuHingga;
    }

    /**
     * Set ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BerlakuHingga ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBerlakuHingga(String BerlakuHingga) {
        this.BerlakuHingga = BerlakuHingga;
    }

    /**
     * Get Date of issue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Province
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Provinsi Province
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProvinsi() {
        return this.Provinsi;
    }

    /**
     * Set Province
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Provinsi Province
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProvinsi(String Provinsi) {
        this.Provinsi = Provinsi;
    }

    /**
     * Get City
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Kota City
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKota() {
        return this.Kota;
    }

    /**
     * Set City
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Kota City
Note: This field may return null, indicating that no valid values can be obtained.
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

