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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CardVerifyResult extends AbstractModel{

    /**
    * Whether the authentication or OCR process is successful.
    */
    @SerializedName("IsPass")
    @Expose
    private Boolean IsPass;

    /**
    * The video for ID card authentication. This field is returned only if the video-based ID card authentication is enabled. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardVideo")
    @Expose
    private FileInfo CardVideo;

    /**
    * The identity document image. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardImage")
    @Expose
    private FileInfo CardImage;

    /**
    * The OCR result (in JSON) of the identity document image. If authentication or OCR fails, this parameter is left empty. The URL is valid for 10 minutes.
When the value of `IdCardType` is `HK`:
- CnName (string): Chinese name.
- EnName (string): English name.
- TelexCode (string): The code corresponding to the Chinese name.
- Sex (string): Gender. Valid values: `M` (male) and `F` (female).
- Birthday (string): Date of birth.
- Permanent (int): Whether it is a permanent residence identity card. Valid values: `0` (non-permanent), `1` (permanent), and `-1` (unknown).
- IdNum (string): ID number.
- Symbol (string): The ID symbol below the date of birth, such as "***AZ".
- FirstIssueDate (string): The date of first issuance.
- CurrentIssueDate (string): The date of latest issuance.

When the value of `IdCardType` is `ML`:
- Sex (string): `LELAKI` (male) and `PEREMPUAN` (female).
- Birthday (string): Date of birth.
- ID (string): ID number.
- Name (string): Name.
- Address (string): Address.
- Type (string): Identity document type.

When the value of `IdCardType` is `PhilippinesVoteID`:
- Birthday (string): Date of birth.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- VIN (string): VIN number.
- CivilStatus (string): Marital status.
- Citizenship (string): Citizenship.
- PrecinctNo (string): Region.

When the value of `IdCardType` is `PhilippinesDrivingLicense`:
- Sex (string): Gender.
- Birthday (string): Date of birth.
- Name (string): Name.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- MiddleName (string): Middle name.
- Nationality (string): Nationality.
- LicenseNo (string): License number.
- ExpiresDate (string): Validity period.
- AgencyCode (string): Agency code.

When the value of `IdCardType` is `IndonesiaIDCard`:
- NIK (string): Identity document No.
- Nama (string): Name.
- TempatTglLahir (string): Place/Date of birth.
- JenisKelamin (string): Gender.
- GolDarah (string): Blood type.
- Alamat (string): Address.
- RTRW (string): Street.
- KelDesa (string): Village.
- Kecamatan (string): Region.
- Agama (string): Religion.
- StatusPerkawinan (string): Marital status.
- Perkerjaan (string): Profession.
- KewargaNegaraan (string): Nationality.
- BerlakuHingga (string): Expiry date of the identity document.
- IssuedDate (string): Date of issuance.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardInfoOcrJson")
    @Expose
    private FileInfo CardInfoOcrJson;

    /**
    * The request ID of a single process.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the authentication or OCR process is successful. 
     * @return IsPass Whether the authentication or OCR process is successful.
     */
    public Boolean getIsPass() {
        return this.IsPass;
    }

    /**
     * Set Whether the authentication or OCR process is successful.
     * @param IsPass Whether the authentication or OCR process is successful.
     */
    public void setIsPass(Boolean IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get The video for ID card authentication. This field is returned only if the video-based ID card authentication is enabled. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardVideo The video for ID card authentication. This field is returned only if the video-based ID card authentication is enabled. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileInfo getCardVideo() {
        return this.CardVideo;
    }

    /**
     * Set The video for ID card authentication. This field is returned only if the video-based ID card authentication is enabled. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardVideo The video for ID card authentication. This field is returned only if the video-based ID card authentication is enabled. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardVideo(FileInfo CardVideo) {
        this.CardVideo = CardVideo;
    }

    /**
     * Get The identity document image. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardImage The identity document image. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileInfo getCardImage() {
        return this.CardImage;
    }

    /**
     * Set The identity document image. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardImage The identity document image. The URL is valid for 10 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardImage(FileInfo CardImage) {
        this.CardImage = CardImage;
    }

    /**
     * Get The OCR result (in JSON) of the identity document image. If authentication or OCR fails, this parameter is left empty. The URL is valid for 10 minutes.
When the value of `IdCardType` is `HK`:
- CnName (string): Chinese name.
- EnName (string): English name.
- TelexCode (string): The code corresponding to the Chinese name.
- Sex (string): Gender. Valid values: `M` (male) and `F` (female).
- Birthday (string): Date of birth.
- Permanent (int): Whether it is a permanent residence identity card. Valid values: `0` (non-permanent), `1` (permanent), and `-1` (unknown).
- IdNum (string): ID number.
- Symbol (string): The ID symbol below the date of birth, such as "***AZ".
- FirstIssueDate (string): The date of first issuance.
- CurrentIssueDate (string): The date of latest issuance.

When the value of `IdCardType` is `ML`:
- Sex (string): `LELAKI` (male) and `PEREMPUAN` (female).
- Birthday (string): Date of birth.
- ID (string): ID number.
- Name (string): Name.
- Address (string): Address.
- Type (string): Identity document type.

When the value of `IdCardType` is `PhilippinesVoteID`:
- Birthday (string): Date of birth.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- VIN (string): VIN number.
- CivilStatus (string): Marital status.
- Citizenship (string): Citizenship.
- PrecinctNo (string): Region.

When the value of `IdCardType` is `PhilippinesDrivingLicense`:
- Sex (string): Gender.
- Birthday (string): Date of birth.
- Name (string): Name.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- MiddleName (string): Middle name.
- Nationality (string): Nationality.
- LicenseNo (string): License number.
- ExpiresDate (string): Validity period.
- AgencyCode (string): Agency code.

When the value of `IdCardType` is `IndonesiaIDCard`:
- NIK (string): Identity document No.
- Nama (string): Name.
- TempatTglLahir (string): Place/Date of birth.
- JenisKelamin (string): Gender.
- GolDarah (string): Blood type.
- Alamat (string): Address.
- RTRW (string): Street.
- KelDesa (string): Village.
- Kecamatan (string): Region.
- Agama (string): Religion.
- StatusPerkawinan (string): Marital status.
- Perkerjaan (string): Profession.
- KewargaNegaraan (string): Nationality.
- BerlakuHingga (string): Expiry date of the identity document.
- IssuedDate (string): Date of issuance.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardInfoOcrJson The OCR result (in JSON) of the identity document image. If authentication or OCR fails, this parameter is left empty. The URL is valid for 10 minutes.
When the value of `IdCardType` is `HK`:
- CnName (string): Chinese name.
- EnName (string): English name.
- TelexCode (string): The code corresponding to the Chinese name.
- Sex (string): Gender. Valid values: `M` (male) and `F` (female).
- Birthday (string): Date of birth.
- Permanent (int): Whether it is a permanent residence identity card. Valid values: `0` (non-permanent), `1` (permanent), and `-1` (unknown).
- IdNum (string): ID number.
- Symbol (string): The ID symbol below the date of birth, such as "***AZ".
- FirstIssueDate (string): The date of first issuance.
- CurrentIssueDate (string): The date of latest issuance.

When the value of `IdCardType` is `ML`:
- Sex (string): `LELAKI` (male) and `PEREMPUAN` (female).
- Birthday (string): Date of birth.
- ID (string): ID number.
- Name (string): Name.
- Address (string): Address.
- Type (string): Identity document type.

When the value of `IdCardType` is `PhilippinesVoteID`:
- Birthday (string): Date of birth.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- VIN (string): VIN number.
- CivilStatus (string): Marital status.
- Citizenship (string): Citizenship.
- PrecinctNo (string): Region.

When the value of `IdCardType` is `PhilippinesDrivingLicense`:
- Sex (string): Gender.
- Birthday (string): Date of birth.
- Name (string): Name.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- MiddleName (string): Middle name.
- Nationality (string): Nationality.
- LicenseNo (string): License number.
- ExpiresDate (string): Validity period.
- AgencyCode (string): Agency code.

When the value of `IdCardType` is `IndonesiaIDCard`:
- NIK (string): Identity document No.
- Nama (string): Name.
- TempatTglLahir (string): Place/Date of birth.
- JenisKelamin (string): Gender.
- GolDarah (string): Blood type.
- Alamat (string): Address.
- RTRW (string): Street.
- KelDesa (string): Village.
- Kecamatan (string): Region.
- Agama (string): Religion.
- StatusPerkawinan (string): Marital status.
- Perkerjaan (string): Profession.
- KewargaNegaraan (string): Nationality.
- BerlakuHingga (string): Expiry date of the identity document.
- IssuedDate (string): Date of issuance.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileInfo getCardInfoOcrJson() {
        return this.CardInfoOcrJson;
    }

    /**
     * Set The OCR result (in JSON) of the identity document image. If authentication or OCR fails, this parameter is left empty. The URL is valid for 10 minutes.
When the value of `IdCardType` is `HK`:
- CnName (string): Chinese name.
- EnName (string): English name.
- TelexCode (string): The code corresponding to the Chinese name.
- Sex (string): Gender. Valid values: `M` (male) and `F` (female).
- Birthday (string): Date of birth.
- Permanent (int): Whether it is a permanent residence identity card. Valid values: `0` (non-permanent), `1` (permanent), and `-1` (unknown).
- IdNum (string): ID number.
- Symbol (string): The ID symbol below the date of birth, such as "***AZ".
- FirstIssueDate (string): The date of first issuance.
- CurrentIssueDate (string): The date of latest issuance.

When the value of `IdCardType` is `ML`:
- Sex (string): `LELAKI` (male) and `PEREMPUAN` (female).
- Birthday (string): Date of birth.
- ID (string): ID number.
- Name (string): Name.
- Address (string): Address.
- Type (string): Identity document type.

When the value of `IdCardType` is `PhilippinesVoteID`:
- Birthday (string): Date of birth.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- VIN (string): VIN number.
- CivilStatus (string): Marital status.
- Citizenship (string): Citizenship.
- PrecinctNo (string): Region.

When the value of `IdCardType` is `PhilippinesDrivingLicense`:
- Sex (string): Gender.
- Birthday (string): Date of birth.
- Name (string): Name.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- MiddleName (string): Middle name.
- Nationality (string): Nationality.
- LicenseNo (string): License number.
- ExpiresDate (string): Validity period.
- AgencyCode (string): Agency code.

When the value of `IdCardType` is `IndonesiaIDCard`:
- NIK (string): Identity document No.
- Nama (string): Name.
- TempatTglLahir (string): Place/Date of birth.
- JenisKelamin (string): Gender.
- GolDarah (string): Blood type.
- Alamat (string): Address.
- RTRW (string): Street.
- KelDesa (string): Village.
- Kecamatan (string): Region.
- Agama (string): Religion.
- StatusPerkawinan (string): Marital status.
- Perkerjaan (string): Profession.
- KewargaNegaraan (string): Nationality.
- BerlakuHingga (string): Expiry date of the identity document.
- IssuedDate (string): Date of issuance.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardInfoOcrJson The OCR result (in JSON) of the identity document image. If authentication or OCR fails, this parameter is left empty. The URL is valid for 10 minutes.
When the value of `IdCardType` is `HK`:
- CnName (string): Chinese name.
- EnName (string): English name.
- TelexCode (string): The code corresponding to the Chinese name.
- Sex (string): Gender. Valid values: `M` (male) and `F` (female).
- Birthday (string): Date of birth.
- Permanent (int): Whether it is a permanent residence identity card. Valid values: `0` (non-permanent), `1` (permanent), and `-1` (unknown).
- IdNum (string): ID number.
- Symbol (string): The ID symbol below the date of birth, such as "***AZ".
- FirstIssueDate (string): The date of first issuance.
- CurrentIssueDate (string): The date of latest issuance.

When the value of `IdCardType` is `ML`:
- Sex (string): `LELAKI` (male) and `PEREMPUAN` (female).
- Birthday (string): Date of birth.
- ID (string): ID number.
- Name (string): Name.
- Address (string): Address.
- Type (string): Identity document type.

When the value of `IdCardType` is `PhilippinesVoteID`:
- Birthday (string): Date of birth.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- VIN (string): VIN number.
- CivilStatus (string): Marital status.
- Citizenship (string): Citizenship.
- PrecinctNo (string): Region.

When the value of `IdCardType` is `PhilippinesDrivingLicense`:
- Sex (string): Gender.
- Birthday (string): Date of birth.
- Name (string): Name.
- Address (string): Address.
- LastName (string): Family name.
- FirstName (string): First name.
- MiddleName (string): Middle name.
- Nationality (string): Nationality.
- LicenseNo (string): License number.
- ExpiresDate (string): Validity period.
- AgencyCode (string): Agency code.

When the value of `IdCardType` is `IndonesiaIDCard`:
- NIK (string): Identity document No.
- Nama (string): Name.
- TempatTglLahir (string): Place/Date of birth.
- JenisKelamin (string): Gender.
- GolDarah (string): Blood type.
- Alamat (string): Address.
- RTRW (string): Street.
- KelDesa (string): Village.
- Kecamatan (string): Region.
- Agama (string): Religion.
- StatusPerkawinan (string): Marital status.
- Perkerjaan (string): Profession.
- KewargaNegaraan (string): Nationality.
- BerlakuHingga (string): Expiry date of the identity document.
- IssuedDate (string): Date of issuance.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardInfoOcrJson(FileInfo CardInfoOcrJson) {
        this.CardInfoOcrJson = CardInfoOcrJson;
    }

    /**
     * Get The request ID of a single process. 
     * @return RequestId The request ID of a single process.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The request ID of a single process.
     * @param RequestId The request ID of a single process.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CardVerifyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CardVerifyResult(CardVerifyResult source) {
        if (source.IsPass != null) {
            this.IsPass = new Boolean(source.IsPass);
        }
        if (source.CardVideo != null) {
            this.CardVideo = new FileInfo(source.CardVideo);
        }
        if (source.CardImage != null) {
            this.CardImage = new FileInfo(source.CardImage);
        }
        if (source.CardInfoOcrJson != null) {
            this.CardInfoOcrJson = new FileInfo(source.CardInfoOcrJson);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamObj(map, prefix + "CardVideo.", this.CardVideo);
        this.setParamObj(map, prefix + "CardImage.", this.CardImage);
        this.setParamObj(map, prefix + "CardInfoOcrJson.", this.CardInfoOcrJson);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

