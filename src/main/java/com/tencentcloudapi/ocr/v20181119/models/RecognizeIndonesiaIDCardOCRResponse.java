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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeIndonesiaIDCardOCRResponse extends AbstractModel{

    /**
    * The Single Identity Number.
    */
    @SerializedName("NIK")
    @Expose
    private String NIK;

    /**
    * The full name.
    */
    @SerializedName("Nama")
    @Expose
    private String Nama;

    /**
    * The place and date of birth.
    */
    @SerializedName("TempatTglLahir")
    @Expose
    private String TempatTglLahir;

    /**
    * The gender.
    */
    @SerializedName("JenisKelamin")
    @Expose
    private String JenisKelamin;

    /**
    * The blood type.
    */
    @SerializedName("GolDarah")
    @Expose
    private String GolDarah;

    /**
    * The address.
    */
    @SerializedName("Alamat")
    @Expose
    private String Alamat;

    /**
    * The street.
    */
    @SerializedName("RTRW")
    @Expose
    private String RTRW;

    /**
    * The village.
    */
    @SerializedName("KelDesa")
    @Expose
    private String KelDesa;

    /**
    * The region.
    */
    @SerializedName("Kecamatan")
    @Expose
    private String Kecamatan;

    /**
    * The religion.
    */
    @SerializedName("Agama")
    @Expose
    private String Agama;

    /**
    * The marital status.
    */
    @SerializedName("StatusPerkawinan")
    @Expose
    private String StatusPerkawinan;

    /**
    * The occupation.
    */
    @SerializedName("Perkerjaan")
    @Expose
    private String Perkerjaan;

    /**
    * The nationality.
    */
    @SerializedName("KewargaNegaraan")
    @Expose
    private String KewargaNegaraan;

    /**
    * The expiry date.
    */
    @SerializedName("BerlakuHingga")
    @Expose
    private String BerlakuHingga;

    /**
    * The issue date.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * The photo.
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * The province, which is supported when the value of `Scene` is `V2`.
    */
    @SerializedName("Provinsi")
    @Expose
    private String Provinsi;

    /**
    * The city, which is supported when the value of `Scene` is `V2`.
    */
    @SerializedName("Kota")
    @Expose
    private String Kota;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The Single Identity Number. 
     * @return NIK The Single Identity Number.
     */
    public String getNIK() {
        return this.NIK;
    }

    /**
     * Set The Single Identity Number.
     * @param NIK The Single Identity Number.
     */
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * Get The full name. 
     * @return Nama The full name.
     */
    public String getNama() {
        return this.Nama;
    }

    /**
     * Set The full name.
     * @param Nama The full name.
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * Get The place and date of birth. 
     * @return TempatTglLahir The place and date of birth.
     */
    public String getTempatTglLahir() {
        return this.TempatTglLahir;
    }

    /**
     * Set The place and date of birth.
     * @param TempatTglLahir The place and date of birth.
     */
    public void setTempatTglLahir(String TempatTglLahir) {
        this.TempatTglLahir = TempatTglLahir;
    }

    /**
     * Get The gender. 
     * @return JenisKelamin The gender.
     */
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    /**
     * Set The gender.
     * @param JenisKelamin The gender.
     */
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    /**
     * Get The blood type. 
     * @return GolDarah The blood type.
     */
    public String getGolDarah() {
        return this.GolDarah;
    }

    /**
     * Set The blood type.
     * @param GolDarah The blood type.
     */
    public void setGolDarah(String GolDarah) {
        this.GolDarah = GolDarah;
    }

    /**
     * Get The address. 
     * @return Alamat The address.
     */
    public String getAlamat() {
        return this.Alamat;
    }

    /**
     * Set The address.
     * @param Alamat The address.
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * Get The street. 
     * @return RTRW The street.
     */
    public String getRTRW() {
        return this.RTRW;
    }

    /**
     * Set The street.
     * @param RTRW The street.
     */
    public void setRTRW(String RTRW) {
        this.RTRW = RTRW;
    }

    /**
     * Get The village. 
     * @return KelDesa The village.
     */
    public String getKelDesa() {
        return this.KelDesa;
    }

    /**
     * Set The village.
     * @param KelDesa The village.
     */
    public void setKelDesa(String KelDesa) {
        this.KelDesa = KelDesa;
    }

    /**
     * Get The region. 
     * @return Kecamatan The region.
     */
    public String getKecamatan() {
        return this.Kecamatan;
    }

    /**
     * Set The region.
     * @param Kecamatan The region.
     */
    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    /**
     * Get The religion. 
     * @return Agama The religion.
     */
    public String getAgama() {
        return this.Agama;
    }

    /**
     * Set The religion.
     * @param Agama The religion.
     */
    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    /**
     * Get The marital status. 
     * @return StatusPerkawinan The marital status.
     */
    public String getStatusPerkawinan() {
        return this.StatusPerkawinan;
    }

    /**
     * Set The marital status.
     * @param StatusPerkawinan The marital status.
     */
    public void setStatusPerkawinan(String StatusPerkawinan) {
        this.StatusPerkawinan = StatusPerkawinan;
    }

    /**
     * Get The occupation. 
     * @return Perkerjaan The occupation.
     */
    public String getPerkerjaan() {
        return this.Perkerjaan;
    }

    /**
     * Set The occupation.
     * @param Perkerjaan The occupation.
     */
    public void setPerkerjaan(String Perkerjaan) {
        this.Perkerjaan = Perkerjaan;
    }

    /**
     * Get The nationality. 
     * @return KewargaNegaraan The nationality.
     */
    public String getKewargaNegaraan() {
        return this.KewargaNegaraan;
    }

    /**
     * Set The nationality.
     * @param KewargaNegaraan The nationality.
     */
    public void setKewargaNegaraan(String KewargaNegaraan) {
        this.KewargaNegaraan = KewargaNegaraan;
    }

    /**
     * Get The expiry date. 
     * @return BerlakuHingga The expiry date.
     */
    public String getBerlakuHingga() {
        return this.BerlakuHingga;
    }

    /**
     * Set The expiry date.
     * @param BerlakuHingga The expiry date.
     */
    public void setBerlakuHingga(String BerlakuHingga) {
        this.BerlakuHingga = BerlakuHingga;
    }

    /**
     * Get The issue date. 
     * @return IssuedDate The issue date.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set The issue date.
     * @param IssuedDate The issue date.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get The photo. 
     * @return Photo The photo.
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set The photo.
     * @param Photo The photo.
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     * Get The province, which is supported when the value of `Scene` is `V2`. 
     * @return Provinsi The province, which is supported when the value of `Scene` is `V2`.
     */
    public String getProvinsi() {
        return this.Provinsi;
    }

    /**
     * Set The province, which is supported when the value of `Scene` is `V2`.
     * @param Provinsi The province, which is supported when the value of `Scene` is `V2`.
     */
    public void setProvinsi(String Provinsi) {
        this.Provinsi = Provinsi;
    }

    /**
     * Get The city, which is supported when the value of `Scene` is `V2`. 
     * @return Kota The city, which is supported when the value of `Scene` is `V2`.
     */
    public String getKota() {
        return this.Kota;
    }

    /**
     * Set The city, which is supported when the value of `Scene` is `V2`.
     * @param Kota The city, which is supported when the value of `Scene` is `V2`.
     */
    public void setKota(String Kota) {
        this.Kota = Kota;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeIndonesiaIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeIndonesiaIDCardOCRResponse(RecognizeIndonesiaIDCardOCRResponse source) {
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
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.Provinsi != null) {
            this.Provinsi = new String(source.Provinsi);
        }
        if (source.Kota != null) {
            this.Kota = new String(source.Kota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamSimple(map, prefix + "Provinsi", this.Provinsi);
        this.setParamSimple(map, prefix + "Kota", this.Kota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

