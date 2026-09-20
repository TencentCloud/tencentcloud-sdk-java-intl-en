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

public class GetNFCResultResponse extends AbstractModel {

    /**
    * Billing result code. Each successful NFC read is billed once. Permissible range: 

0: Read successful, billed. 
-1: Read failed, not billed.
    */
    @SerializedName("ChargeCode")
    @Expose
    private String ChargeCode;

    /**
    * Document type. Value range: 

01: ID card. 
02: Passport. 
03: Hong Kong and Macao travel permit. 
99: Other document. 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * Document verification result. The items for NFC verification are as follows:
{"result_issuer ":"Issuer certificate legitimacy verification result ","result_paper":"Document security object legitimacy verification result ","result_data" :"Data tampering prevention verification result ","result_chip" :"Document chip replication prevention verification result"} 
Value range: 0: verification passed 1: verification failed 2: unverified 3: partially passed 
When all four verification results are 0, the document is genuine.
    */
    @SerializedName("CheckMRTD")
    @Expose
    private String CheckMRTD;

    /**
    * Comparison result of the passed-in identity card number, passport number, or Hong Kong, China and Macao, China travel permit with the identity card number recognized by NFC. 

0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("IdNumCompareResult")
    @Expose
    private String IdNumCompareResult;

    /**
    * Comparison result of the passed-in name and the name recognized by NFC.
0: Consistent
-1: Not the same
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("NameCompareResult")
    @Expose
    private String NameCompareResult;

    /**
    * Similarity score between the passed-in face image and the portrait photo recognized by NFC.
- Value range: [0.00, 100.00].
- It is recommended to determine the same person when the similarity is equal to or greater than 70. Customers can also self-adjust the threshold based on specific scenarios (with a threshold of 70, the false pass rate is one in a thousand; with a threshold of 80, the false pass rate is one in ten thousand).
    */
    @SerializedName("PictureCompareSim")
    @Expose
    private Float PictureCompareSim;

    /**
    * Comparison result of the passed-in face image and the portrait photo recognized by NFC. 

0: Same person (similarity equal to or greater than 70 points) 
1: Not the same person (similarity less than 70 points) 
2: Comparison failed (the input image quality is too low) 
3: Comparison failed (the input image contains no human face, an incomplete face, or multiple faces) 
4: Comparison failed (input image too large or too small) 
5: Comparison failed (NFC cannot read the portrait photo) 
6: Comparison failed (no input image data) 
7: Comparison failed (other reason)
    */
    @SerializedName("PictureCompareResult")
    @Expose
    private String PictureCompareResult;

    /**
    * Comparison result of the passed-in date of birth and the date of birth recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("BirthDateCompareResult")
    @Expose
    private String BirthDateCompareResult;

    /**
    * Comparison result of the passed-in validity start time and the validity start time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("BeginTimeCompareResult")
    @Expose
    private String BeginTimeCompareResult;

    /**
    * Comparison result of the passed-in validity end time and the validity end time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("EndTimeCompareResult")
    @Expose
    private String EndTimeCompareResult;

    /**
    * Comparison result of the passed-in address and the address recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("AddressCompareResult")
    @Expose
    private String AddressCompareResult;

    /**
    * Comparison result of the passed-in ethnicity and the ethnicity recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("NationCompareResult")
    @Expose
    private String NationCompareResult;

    /**
    * Comparison result of the passed-in sex and the sex recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("SexCompareResult")
    @Expose
    private String SexCompareResult;

    /**
    * Comparison result of the passed-in English name and the English name recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("EnNameCompareResult")
    @Expose
    private String EnNameCompareResult;

    /**
    * Comparison result of the passed-in issuing authority and the issuing authority recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("SigningOrganizationCompareResult")
    @Expose
    private String SigningOrganizationCompareResult;

    /**
    * Comparison result of the passed-in nationality and the nationality recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("NationalityCompareResult")
    @Expose
    private String NationalityCompareResult;

    /**
    * Comparison result of the passed-in country code and the country code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("CountryCodeCompareResult")
    @Expose
    private String CountryCodeCompareResult;

    /**
    * Comparison result of the passed-in machine-readable code and the machine-readable code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
    */
    @SerializedName("MachineReadCodeCompareResult")
    @Expose
    private String MachineReadCodeCompareResult;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Billing result code. Each successful NFC read is billed once. Permissible range: 

0: Read successful, billed. 
-1: Read failed, not billed. 
     * @return ChargeCode Billing result code. Each successful NFC read is billed once. Permissible range: 

0: Read successful, billed. 
-1: Read failed, not billed.
     */
    public String getChargeCode() {
        return this.ChargeCode;
    }

    /**
     * Set Billing result code. Each successful NFC read is billed once. Permissible range: 

0: Read successful, billed. 
-1: Read failed, not billed.
     * @param ChargeCode Billing result code. Each successful NFC read is billed once. Permissible range: 

0: Read successful, billed. 
-1: Read failed, not billed.
     */
    public void setChargeCode(String ChargeCode) {
        this.ChargeCode = ChargeCode;
    }

    /**
     * Get Document type. Value range: 

01: ID card. 
02: Passport. 
03: Hong Kong and Macao travel permit. 
99: Other document. 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IdType Document type. Value range: 

01: ID card. 
02: Passport. 
03: Hong Kong and Macao travel permit. 
99: Other document. 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set Document type. Value range: 

01: ID card. 
02: Passport. 
03: Hong Kong and Macao travel permit. 
99: Other document. 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IdType Document type. Value range: 

01: ID card. 
02: Passport. 
03: Hong Kong and Macao travel permit. 
99: Other document. 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get Document verification result. The items for NFC verification are as follows:
{"result_issuer ":"Issuer certificate legitimacy verification result ","result_paper":"Document security object legitimacy verification result ","result_data" :"Data tampering prevention verification result ","result_chip" :"Document chip replication prevention verification result"} 
Value range: 0: verification passed 1: verification failed 2: unverified 3: partially passed 
When all four verification results are 0, the document is genuine. 
     * @return CheckMRTD Document verification result. The items for NFC verification are as follows:
{"result_issuer ":"Issuer certificate legitimacy verification result ","result_paper":"Document security object legitimacy verification result ","result_data" :"Data tampering prevention verification result ","result_chip" :"Document chip replication prevention verification result"} 
Value range: 0: verification passed 1: verification failed 2: unverified 3: partially passed 
When all four verification results are 0, the document is genuine.
     */
    public String getCheckMRTD() {
        return this.CheckMRTD;
    }

    /**
     * Set Document verification result. The items for NFC verification are as follows:
{"result_issuer ":"Issuer certificate legitimacy verification result ","result_paper":"Document security object legitimacy verification result ","result_data" :"Data tampering prevention verification result ","result_chip" :"Document chip replication prevention verification result"} 
Value range: 0: verification passed 1: verification failed 2: unverified 3: partially passed 
When all four verification results are 0, the document is genuine.
     * @param CheckMRTD Document verification result. The items for NFC verification are as follows:
{"result_issuer ":"Issuer certificate legitimacy verification result ","result_paper":"Document security object legitimacy verification result ","result_data" :"Data tampering prevention verification result ","result_chip" :"Document chip replication prevention verification result"} 
Value range: 0: verification passed 1: verification failed 2: unverified 3: partially passed 
When all four verification results are 0, the document is genuine.
     */
    public void setCheckMRTD(String CheckMRTD) {
        this.CheckMRTD = CheckMRTD;
    }

    /**
     * Get Comparison result of the passed-in identity card number, passport number, or Hong Kong, China and Macao, China travel permit with the identity card number recognized by NFC. 

0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return IdNumCompareResult Comparison result of the passed-in identity card number, passport number, or Hong Kong, China and Macao, China travel permit with the identity card number recognized by NFC. 

0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getIdNumCompareResult() {
        return this.IdNumCompareResult;
    }

    /**
     * Set Comparison result of the passed-in identity card number, passport number, or Hong Kong, China and Macao, China travel permit with the identity card number recognized by NFC. 

0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param IdNumCompareResult Comparison result of the passed-in identity card number, passport number, or Hong Kong, China and Macao, China travel permit with the identity card number recognized by NFC. 

0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setIdNumCompareResult(String IdNumCompareResult) {
        this.IdNumCompareResult = IdNumCompareResult;
    }

    /**
     * Get Comparison result of the passed-in name and the name recognized by NFC.
0: Consistent
-1: Not the same
-2: NFC recognition failed, unable to compare 
     * @return NameCompareResult Comparison result of the passed-in name and the name recognized by NFC.
0: Consistent
-1: Not the same
-2: NFC recognition failed, unable to compare
     */
    public String getNameCompareResult() {
        return this.NameCompareResult;
    }

    /**
     * Set Comparison result of the passed-in name and the name recognized by NFC.
0: Consistent
-1: Not the same
-2: NFC recognition failed, unable to compare
     * @param NameCompareResult Comparison result of the passed-in name and the name recognized by NFC.
0: Consistent
-1: Not the same
-2: NFC recognition failed, unable to compare
     */
    public void setNameCompareResult(String NameCompareResult) {
        this.NameCompareResult = NameCompareResult;
    }

    /**
     * Get Similarity score between the passed-in face image and the portrait photo recognized by NFC.
- Value range: [0.00, 100.00].
- It is recommended to determine the same person when the similarity is equal to or greater than 70. Customers can also self-adjust the threshold based on specific scenarios (with a threshold of 70, the false pass rate is one in a thousand; with a threshold of 80, the false pass rate is one in ten thousand). 
     * @return PictureCompareSim Similarity score between the passed-in face image and the portrait photo recognized by NFC.
- Value range: [0.00, 100.00].
- It is recommended to determine the same person when the similarity is equal to or greater than 70. Customers can also self-adjust the threshold based on specific scenarios (with a threshold of 70, the false pass rate is one in a thousand; with a threshold of 80, the false pass rate is one in ten thousand).
     */
    public Float getPictureCompareSim() {
        return this.PictureCompareSim;
    }

    /**
     * Set Similarity score between the passed-in face image and the portrait photo recognized by NFC.
- Value range: [0.00, 100.00].
- It is recommended to determine the same person when the similarity is equal to or greater than 70. Customers can also self-adjust the threshold based on specific scenarios (with a threshold of 70, the false pass rate is one in a thousand; with a threshold of 80, the false pass rate is one in ten thousand).
     * @param PictureCompareSim Similarity score between the passed-in face image and the portrait photo recognized by NFC.
- Value range: [0.00, 100.00].
- It is recommended to determine the same person when the similarity is equal to or greater than 70. Customers can also self-adjust the threshold based on specific scenarios (with a threshold of 70, the false pass rate is one in a thousand; with a threshold of 80, the false pass rate is one in ten thousand).
     */
    public void setPictureCompareSim(Float PictureCompareSim) {
        this.PictureCompareSim = PictureCompareSim;
    }

    /**
     * Get Comparison result of the passed-in face image and the portrait photo recognized by NFC. 

0: Same person (similarity equal to or greater than 70 points) 
1: Not the same person (similarity less than 70 points) 
2: Comparison failed (the input image quality is too low) 
3: Comparison failed (the input image contains no human face, an incomplete face, or multiple faces) 
4: Comparison failed (input image too large or too small) 
5: Comparison failed (NFC cannot read the portrait photo) 
6: Comparison failed (no input image data) 
7: Comparison failed (other reason) 
     * @return PictureCompareResult Comparison result of the passed-in face image and the portrait photo recognized by NFC. 

0: Same person (similarity equal to or greater than 70 points) 
1: Not the same person (similarity less than 70 points) 
2: Comparison failed (the input image quality is too low) 
3: Comparison failed (the input image contains no human face, an incomplete face, or multiple faces) 
4: Comparison failed (input image too large or too small) 
5: Comparison failed (NFC cannot read the portrait photo) 
6: Comparison failed (no input image data) 
7: Comparison failed (other reason)
     */
    public String getPictureCompareResult() {
        return this.PictureCompareResult;
    }

    /**
     * Set Comparison result of the passed-in face image and the portrait photo recognized by NFC. 

0: Same person (similarity equal to or greater than 70 points) 
1: Not the same person (similarity less than 70 points) 
2: Comparison failed (the input image quality is too low) 
3: Comparison failed (the input image contains no human face, an incomplete face, or multiple faces) 
4: Comparison failed (input image too large or too small) 
5: Comparison failed (NFC cannot read the portrait photo) 
6: Comparison failed (no input image data) 
7: Comparison failed (other reason)
     * @param PictureCompareResult Comparison result of the passed-in face image and the portrait photo recognized by NFC. 

0: Same person (similarity equal to or greater than 70 points) 
1: Not the same person (similarity less than 70 points) 
2: Comparison failed (the input image quality is too low) 
3: Comparison failed (the input image contains no human face, an incomplete face, or multiple faces) 
4: Comparison failed (input image too large or too small) 
5: Comparison failed (NFC cannot read the portrait photo) 
6: Comparison failed (no input image data) 
7: Comparison failed (other reason)
     */
    public void setPictureCompareResult(String PictureCompareResult) {
        this.PictureCompareResult = PictureCompareResult;
    }

    /**
     * Get Comparison result of the passed-in date of birth and the date of birth recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return BirthDateCompareResult Comparison result of the passed-in date of birth and the date of birth recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getBirthDateCompareResult() {
        return this.BirthDateCompareResult;
    }

    /**
     * Set Comparison result of the passed-in date of birth and the date of birth recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param BirthDateCompareResult Comparison result of the passed-in date of birth and the date of birth recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setBirthDateCompareResult(String BirthDateCompareResult) {
        this.BirthDateCompareResult = BirthDateCompareResult;
    }

    /**
     * Get Comparison result of the passed-in validity start time and the validity start time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return BeginTimeCompareResult Comparison result of the passed-in validity start time and the validity start time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getBeginTimeCompareResult() {
        return this.BeginTimeCompareResult;
    }

    /**
     * Set Comparison result of the passed-in validity start time and the validity start time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param BeginTimeCompareResult Comparison result of the passed-in validity start time and the validity start time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setBeginTimeCompareResult(String BeginTimeCompareResult) {
        this.BeginTimeCompareResult = BeginTimeCompareResult;
    }

    /**
     * Get Comparison result of the passed-in validity end time and the validity end time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return EndTimeCompareResult Comparison result of the passed-in validity end time and the validity end time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getEndTimeCompareResult() {
        return this.EndTimeCompareResult;
    }

    /**
     * Set Comparison result of the passed-in validity end time and the validity end time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param EndTimeCompareResult Comparison result of the passed-in validity end time and the validity end time recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setEndTimeCompareResult(String EndTimeCompareResult) {
        this.EndTimeCompareResult = EndTimeCompareResult;
    }

    /**
     * Get Comparison result of the passed-in address and the address recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return AddressCompareResult Comparison result of the passed-in address and the address recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getAddressCompareResult() {
        return this.AddressCompareResult;
    }

    /**
     * Set Comparison result of the passed-in address and the address recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param AddressCompareResult Comparison result of the passed-in address and the address recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setAddressCompareResult(String AddressCompareResult) {
        this.AddressCompareResult = AddressCompareResult;
    }

    /**
     * Get Comparison result of the passed-in ethnicity and the ethnicity recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return NationCompareResult Comparison result of the passed-in ethnicity and the ethnicity recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getNationCompareResult() {
        return this.NationCompareResult;
    }

    /**
     * Set Comparison result of the passed-in ethnicity and the ethnicity recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param NationCompareResult Comparison result of the passed-in ethnicity and the ethnicity recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setNationCompareResult(String NationCompareResult) {
        this.NationCompareResult = NationCompareResult;
    }

    /**
     * Get Comparison result of the passed-in sex and the sex recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return SexCompareResult Comparison result of the passed-in sex and the sex recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getSexCompareResult() {
        return this.SexCompareResult;
    }

    /**
     * Set Comparison result of the passed-in sex and the sex recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param SexCompareResult Comparison result of the passed-in sex and the sex recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setSexCompareResult(String SexCompareResult) {
        this.SexCompareResult = SexCompareResult;
    }

    /**
     * Get Comparison result of the passed-in English name and the English name recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return EnNameCompareResult Comparison result of the passed-in English name and the English name recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getEnNameCompareResult() {
        return this.EnNameCompareResult;
    }

    /**
     * Set Comparison result of the passed-in English name and the English name recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param EnNameCompareResult Comparison result of the passed-in English name and the English name recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setEnNameCompareResult(String EnNameCompareResult) {
        this.EnNameCompareResult = EnNameCompareResult;
    }

    /**
     * Get Comparison result of the passed-in issuing authority and the issuing authority recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return SigningOrganizationCompareResult Comparison result of the passed-in issuing authority and the issuing authority recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getSigningOrganizationCompareResult() {
        return this.SigningOrganizationCompareResult;
    }

    /**
     * Set Comparison result of the passed-in issuing authority and the issuing authority recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param SigningOrganizationCompareResult Comparison result of the passed-in issuing authority and the issuing authority recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setSigningOrganizationCompareResult(String SigningOrganizationCompareResult) {
        this.SigningOrganizationCompareResult = SigningOrganizationCompareResult;
    }

    /**
     * Get Comparison result of the passed-in nationality and the nationality recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return NationalityCompareResult Comparison result of the passed-in nationality and the nationality recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getNationalityCompareResult() {
        return this.NationalityCompareResult;
    }

    /**
     * Set Comparison result of the passed-in nationality and the nationality recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param NationalityCompareResult Comparison result of the passed-in nationality and the nationality recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setNationalityCompareResult(String NationalityCompareResult) {
        this.NationalityCompareResult = NationalityCompareResult;
    }

    /**
     * Get Comparison result of the passed-in country code and the country code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return CountryCodeCompareResult Comparison result of the passed-in country code and the country code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getCountryCodeCompareResult() {
        return this.CountryCodeCompareResult;
    }

    /**
     * Set Comparison result of the passed-in country code and the country code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param CountryCodeCompareResult Comparison result of the passed-in country code and the country code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setCountryCodeCompareResult(String CountryCodeCompareResult) {
        this.CountryCodeCompareResult = CountryCodeCompareResult;
    }

    /**
     * Get Comparison result of the passed-in machine-readable code and the machine-readable code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare 
     * @return MachineReadCodeCompareResult Comparison result of the passed-in machine-readable code and the machine-readable code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public String getMachineReadCodeCompareResult() {
        return this.MachineReadCodeCompareResult;
    }

    /**
     * Set Comparison result of the passed-in machine-readable code and the machine-readable code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     * @param MachineReadCodeCompareResult Comparison result of the passed-in machine-readable code and the machine-readable code recognized by NFC. 
0: Consistent 
-1: Not the same 
-2: NFC recognition failed, unable to compare
     */
    public void setMachineReadCodeCompareResult(String MachineReadCodeCompareResult) {
        this.MachineReadCodeCompareResult = MachineReadCodeCompareResult;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetNFCResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetNFCResultResponse(GetNFCResultResponse source) {
        if (source.ChargeCode != null) {
            this.ChargeCode = new String(source.ChargeCode);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.CheckMRTD != null) {
            this.CheckMRTD = new String(source.CheckMRTD);
        }
        if (source.IdNumCompareResult != null) {
            this.IdNumCompareResult = new String(source.IdNumCompareResult);
        }
        if (source.NameCompareResult != null) {
            this.NameCompareResult = new String(source.NameCompareResult);
        }
        if (source.PictureCompareSim != null) {
            this.PictureCompareSim = new Float(source.PictureCompareSim);
        }
        if (source.PictureCompareResult != null) {
            this.PictureCompareResult = new String(source.PictureCompareResult);
        }
        if (source.BirthDateCompareResult != null) {
            this.BirthDateCompareResult = new String(source.BirthDateCompareResult);
        }
        if (source.BeginTimeCompareResult != null) {
            this.BeginTimeCompareResult = new String(source.BeginTimeCompareResult);
        }
        if (source.EndTimeCompareResult != null) {
            this.EndTimeCompareResult = new String(source.EndTimeCompareResult);
        }
        if (source.AddressCompareResult != null) {
            this.AddressCompareResult = new String(source.AddressCompareResult);
        }
        if (source.NationCompareResult != null) {
            this.NationCompareResult = new String(source.NationCompareResult);
        }
        if (source.SexCompareResult != null) {
            this.SexCompareResult = new String(source.SexCompareResult);
        }
        if (source.EnNameCompareResult != null) {
            this.EnNameCompareResult = new String(source.EnNameCompareResult);
        }
        if (source.SigningOrganizationCompareResult != null) {
            this.SigningOrganizationCompareResult = new String(source.SigningOrganizationCompareResult);
        }
        if (source.NationalityCompareResult != null) {
            this.NationalityCompareResult = new String(source.NationalityCompareResult);
        }
        if (source.CountryCodeCompareResult != null) {
            this.CountryCodeCompareResult = new String(source.CountryCodeCompareResult);
        }
        if (source.MachineReadCodeCompareResult != null) {
            this.MachineReadCodeCompareResult = new String(source.MachineReadCodeCompareResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeCode", this.ChargeCode);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "CheckMRTD", this.CheckMRTD);
        this.setParamSimple(map, prefix + "IdNumCompareResult", this.IdNumCompareResult);
        this.setParamSimple(map, prefix + "NameCompareResult", this.NameCompareResult);
        this.setParamSimple(map, prefix + "PictureCompareSim", this.PictureCompareSim);
        this.setParamSimple(map, prefix + "PictureCompareResult", this.PictureCompareResult);
        this.setParamSimple(map, prefix + "BirthDateCompareResult", this.BirthDateCompareResult);
        this.setParamSimple(map, prefix + "BeginTimeCompareResult", this.BeginTimeCompareResult);
        this.setParamSimple(map, prefix + "EndTimeCompareResult", this.EndTimeCompareResult);
        this.setParamSimple(map, prefix + "AddressCompareResult", this.AddressCompareResult);
        this.setParamSimple(map, prefix + "NationCompareResult", this.NationCompareResult);
        this.setParamSimple(map, prefix + "SexCompareResult", this.SexCompareResult);
        this.setParamSimple(map, prefix + "EnNameCompareResult", this.EnNameCompareResult);
        this.setParamSimple(map, prefix + "SigningOrganizationCompareResult", this.SigningOrganizationCompareResult);
        this.setParamSimple(map, prefix + "NationalityCompareResult", this.NationalityCompareResult);
        this.setParamSimple(map, prefix + "CountryCodeCompareResult", this.CountryCodeCompareResult);
        this.setParamSimple(map, prefix + "MachineReadCodeCompareResult", this.MachineReadCodeCompareResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

