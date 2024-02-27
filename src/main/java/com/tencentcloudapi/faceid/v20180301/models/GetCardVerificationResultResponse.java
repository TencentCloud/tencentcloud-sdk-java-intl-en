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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCardVerificationResultResponse extends AbstractModel {

    /**
    * Pass status. When Warning and Rejected are returned, please check the specific reasons in the WarnInfo structure return. Example values are as follows:
Passed
Warning
Rejected
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Warning information returned by document verification.
    */
    @SerializedName("WarnInfo")
    @Expose
    private String [] WarnInfo;

    /**
    * Nationality code. Complies with standard ISO 3166-1 alpha-3. 

Example value: IDN
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Card Type. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO

Example value: ID_CARD
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * Subtype of the ID document.

    */
    @SerializedName("CardSubType")
    @Expose
    private String CardSubType;

    /**
    * Recognition results of the ID document.
    */
    @SerializedName("CardInfo")
    @Expose
    private CardInfo CardInfo;

    /**
    * The token used to identify an verification process. It can be used to get the verification result after the process is completed.
    */
    @SerializedName("IDVerificationToken")
    @Expose
    private String IDVerificationToken;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Pass status. When Warning and Rejected are returned, please check the specific reasons in the WarnInfo structure return. Example values are as follows:
Passed
Warning
Rejected 
     * @return Status Pass status. When Warning and Rejected are returned, please check the specific reasons in the WarnInfo structure return. Example values are as follows:
Passed
Warning
Rejected
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Pass status. When Warning and Rejected are returned, please check the specific reasons in the WarnInfo structure return. Example values are as follows:
Passed
Warning
Rejected
     * @param Status Pass status. When Warning and Rejected are returned, please check the specific reasons in the WarnInfo structure return. Example values are as follows:
Passed
Warning
Rejected
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Warning information returned by document verification. 
     * @return WarnInfo Warning information returned by document verification.
     */
    public String [] getWarnInfo() {
        return this.WarnInfo;
    }

    /**
     * Set Warning information returned by document verification.
     * @param WarnInfo Warning information returned by document verification.
     */
    public void setWarnInfo(String [] WarnInfo) {
        this.WarnInfo = WarnInfo;
    }

    /**
     * Get Nationality code. Complies with standard ISO 3166-1 alpha-3. 

Example value: IDN 
     * @return Nationality Nationality code. Complies with standard ISO 3166-1 alpha-3. 

Example value: IDN
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality code. Complies with standard ISO 3166-1 alpha-3. 

Example value: IDN
     * @param Nationality Nationality code. Complies with standard ISO 3166-1 alpha-3. 

Example value: IDN
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Card Type. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO

Example value: ID_CARD 
     * @return CardType Card Type. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO

Example value: ID_CARD
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set Card Type. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO

Example value: ID_CARD
     * @param CardType Card Type. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO

Example value: ID_CARD
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get Subtype of the ID document.
 
     * @return CardSubType Subtype of the ID document.

     */
    public String getCardSubType() {
        return this.CardSubType;
    }

    /**
     * Set Subtype of the ID document.

     * @param CardSubType Subtype of the ID document.

     */
    public void setCardSubType(String CardSubType) {
        this.CardSubType = CardSubType;
    }

    /**
     * Get Recognition results of the ID document. 
     * @return CardInfo Recognition results of the ID document.
     */
    public CardInfo getCardInfo() {
        return this.CardInfo;
    }

    /**
     * Set Recognition results of the ID document.
     * @param CardInfo Recognition results of the ID document.
     */
    public void setCardInfo(CardInfo CardInfo) {
        this.CardInfo = CardInfo;
    }

    /**
     * Get The token used to identify an verification process. It can be used to get the verification result after the process is completed. 
     * @return IDVerificationToken The token used to identify an verification process. It can be used to get the verification result after the process is completed.
     */
    public String getIDVerificationToken() {
        return this.IDVerificationToken;
    }

    /**
     * Set The token used to identify an verification process. It can be used to get the verification result after the process is completed.
     * @param IDVerificationToken The token used to identify an verification process. It can be used to get the verification result after the process is completed.
     */
    public void setIDVerificationToken(String IDVerificationToken) {
        this.IDVerificationToken = IDVerificationToken;
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

    public GetCardVerificationResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCardVerificationResultResponse(GetCardVerificationResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.WarnInfo != null) {
            this.WarnInfo = new String[source.WarnInfo.length];
            for (int i = 0; i < source.WarnInfo.length; i++) {
                this.WarnInfo[i] = new String(source.WarnInfo[i]);
            }
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.CardSubType != null) {
            this.CardSubType = new String(source.CardSubType);
        }
        if (source.CardInfo != null) {
            this.CardInfo = new CardInfo(source.CardInfo);
        }
        if (source.IDVerificationToken != null) {
            this.IDVerificationToken = new String(source.IDVerificationToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "WarnInfo.", this.WarnInfo);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "CardSubType", this.CardSubType);
        this.setParamObj(map, prefix + "CardInfo.", this.CardInfo);
        this.setParamSimple(map, prefix + "IDVerificationToken", this.IDVerificationToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

