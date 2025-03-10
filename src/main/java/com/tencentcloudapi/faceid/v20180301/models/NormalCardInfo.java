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

public class NormalCardInfo extends AbstractModel {

    /**
    * Hong Kong (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HKIDCard")
    @Expose
    private NormalHKIDCard HKIDCard;

    /**
    * Malaysia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MLIDCard")
    @Expose
    private NormalMLIDCard MLIDCard;

    /**
    * Philippines VoteID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhilippinesVoteID")
    @Expose
    private PhilippinesVoteID PhilippinesVoteID;

    /**
    * Indonesia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndonesiaIDCard")
    @Expose
    private NormalIndonesiaIDCard IndonesiaIDCard;

    /**
    * Philippines Driving License
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhilippinesDrivingLicense")
    @Expose
    private PhilippinesDrivingLicense PhilippinesDrivingLicense;

    /**
    * Philippines TinID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhilippinesTinID")
    @Expose
    private PhilippinesTinID PhilippinesTinID;

    /**
    * Philippines SSSID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhilippinesSSSID")
    @Expose
    private PhilippinesSSSID PhilippinesSSSID;

    /**
    * Philippines UMID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhilippinesUMID")
    @Expose
    private PhilippinesUMID PhilippinesUMID;

    /**
    * ID Cards of Hong Kong (China), Macao (China) and Taiwan (China), and International Passport
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternationalIDPassport")
    @Expose
    private InternationalIDPassport InternationalIDPassport;

    /**
    * General license information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GeneralCard")
    @Expose
    private GeneralCard GeneralCard;

    /**
    * Indonesia Driving License
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndonesiaDrivingLicense")
    @Expose
    private IndonesiaDrivingLicense IndonesiaDrivingLicense;

    /**
    * Thailand ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThailandIDCard")
    @Expose
    private NormalThailandIDCard ThailandIDCard;

    /**
    * Singapore ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SingaporeIDCard")
    @Expose
    private SingaporeIDCard SingaporeIDCard;

    /**
    * Macao (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MacaoIDCard")
    @Expose
    private MacaoIDCard MacaoIDCard;

    /**
    * Mainland (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MainlandIDCard")
    @Expose
    private MainlandIDCard MainlandIDCard;

    /**
    * Japan ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JapanIDCard")
    @Expose
    private JapanIDCard JapanIDCard;

    /**
    * Taiwan (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaiWanIDCard")
    @Expose
    private TaiWanIDCard TaiWanIDCard;

    /**
    * exit/entry permit (card) for traveling to and from Hong Kong (China), Macao (China), or Taiwan (China).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HMTPermitCard")
    @Expose
    private HMTPermit HMTPermitCard;

    /**
     * Get Hong Kong (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HKIDCard Hong Kong (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NormalHKIDCard getHKIDCard() {
        return this.HKIDCard;
    }

    /**
     * Set Hong Kong (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HKIDCard Hong Kong (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHKIDCard(NormalHKIDCard HKIDCard) {
        this.HKIDCard = HKIDCard;
    }

    /**
     * Get Malaysia ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MLIDCard Malaysia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NormalMLIDCard getMLIDCard() {
        return this.MLIDCard;
    }

    /**
     * Set Malaysia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MLIDCard Malaysia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMLIDCard(NormalMLIDCard MLIDCard) {
        this.MLIDCard = MLIDCard;
    }

    /**
     * Get Philippines VoteID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhilippinesVoteID Philippines VoteID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PhilippinesVoteID getPhilippinesVoteID() {
        return this.PhilippinesVoteID;
    }

    /**
     * Set Philippines VoteID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhilippinesVoteID Philippines VoteID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhilippinesVoteID(PhilippinesVoteID PhilippinesVoteID) {
        this.PhilippinesVoteID = PhilippinesVoteID;
    }

    /**
     * Get Indonesia ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndonesiaIDCard Indonesia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NormalIndonesiaIDCard getIndonesiaIDCard() {
        return this.IndonesiaIDCard;
    }

    /**
     * Set Indonesia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndonesiaIDCard Indonesia ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndonesiaIDCard(NormalIndonesiaIDCard IndonesiaIDCard) {
        this.IndonesiaIDCard = IndonesiaIDCard;
    }

    /**
     * Get Philippines Driving License
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhilippinesDrivingLicense Philippines Driving License
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PhilippinesDrivingLicense getPhilippinesDrivingLicense() {
        return this.PhilippinesDrivingLicense;
    }

    /**
     * Set Philippines Driving License
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhilippinesDrivingLicense Philippines Driving License
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhilippinesDrivingLicense(PhilippinesDrivingLicense PhilippinesDrivingLicense) {
        this.PhilippinesDrivingLicense = PhilippinesDrivingLicense;
    }

    /**
     * Get Philippines TinID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhilippinesTinID Philippines TinID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PhilippinesTinID getPhilippinesTinID() {
        return this.PhilippinesTinID;
    }

    /**
     * Set Philippines TinID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhilippinesTinID Philippines TinID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhilippinesTinID(PhilippinesTinID PhilippinesTinID) {
        this.PhilippinesTinID = PhilippinesTinID;
    }

    /**
     * Get Philippines SSSID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhilippinesSSSID Philippines SSSID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PhilippinesSSSID getPhilippinesSSSID() {
        return this.PhilippinesSSSID;
    }

    /**
     * Set Philippines SSSID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhilippinesSSSID Philippines SSSID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhilippinesSSSID(PhilippinesSSSID PhilippinesSSSID) {
        this.PhilippinesSSSID = PhilippinesSSSID;
    }

    /**
     * Get Philippines UMID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhilippinesUMID Philippines UMID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PhilippinesUMID getPhilippinesUMID() {
        return this.PhilippinesUMID;
    }

    /**
     * Set Philippines UMID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhilippinesUMID Philippines UMID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhilippinesUMID(PhilippinesUMID PhilippinesUMID) {
        this.PhilippinesUMID = PhilippinesUMID;
    }

    /**
     * Get ID Cards of Hong Kong (China), Macao (China) and Taiwan (China), and International Passport
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternationalIDPassport ID Cards of Hong Kong (China), Macao (China) and Taiwan (China), and International Passport
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InternationalIDPassport getInternationalIDPassport() {
        return this.InternationalIDPassport;
    }

    /**
     * Set ID Cards of Hong Kong (China), Macao (China) and Taiwan (China), and International Passport
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternationalIDPassport ID Cards of Hong Kong (China), Macao (China) and Taiwan (China), and International Passport
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternationalIDPassport(InternationalIDPassport InternationalIDPassport) {
        this.InternationalIDPassport = InternationalIDPassport;
    }

    /**
     * Get General license information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GeneralCard General license information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GeneralCard getGeneralCard() {
        return this.GeneralCard;
    }

    /**
     * Set General license information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GeneralCard General license information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGeneralCard(GeneralCard GeneralCard) {
        this.GeneralCard = GeneralCard;
    }

    /**
     * Get Indonesia Driving License
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndonesiaDrivingLicense Indonesia Driving License
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IndonesiaDrivingLicense getIndonesiaDrivingLicense() {
        return this.IndonesiaDrivingLicense;
    }

    /**
     * Set Indonesia Driving License
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndonesiaDrivingLicense Indonesia Driving License
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndonesiaDrivingLicense(IndonesiaDrivingLicense IndonesiaDrivingLicense) {
        this.IndonesiaDrivingLicense = IndonesiaDrivingLicense;
    }

    /**
     * Get Thailand ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThailandIDCard Thailand ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NormalThailandIDCard getThailandIDCard() {
        return this.ThailandIDCard;
    }

    /**
     * Set Thailand ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThailandIDCard Thailand ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThailandIDCard(NormalThailandIDCard ThailandIDCard) {
        this.ThailandIDCard = ThailandIDCard;
    }

    /**
     * Get Singapore ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SingaporeIDCard Singapore ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SingaporeIDCard getSingaporeIDCard() {
        return this.SingaporeIDCard;
    }

    /**
     * Set Singapore ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SingaporeIDCard Singapore ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSingaporeIDCard(SingaporeIDCard SingaporeIDCard) {
        this.SingaporeIDCard = SingaporeIDCard;
    }

    /**
     * Get Macao (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MacaoIDCard Macao (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MacaoIDCard getMacaoIDCard() {
        return this.MacaoIDCard;
    }

    /**
     * Set Macao (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MacaoIDCard Macao (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMacaoIDCard(MacaoIDCard MacaoIDCard) {
        this.MacaoIDCard = MacaoIDCard;
    }

    /**
     * Get Mainland (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MainlandIDCard Mainland (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MainlandIDCard getMainlandIDCard() {
        return this.MainlandIDCard;
    }

    /**
     * Set Mainland (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MainlandIDCard Mainland (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMainlandIDCard(MainlandIDCard MainlandIDCard) {
        this.MainlandIDCard = MainlandIDCard;
    }

    /**
     * Get Japan ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JapanIDCard Japan ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public JapanIDCard getJapanIDCard() {
        return this.JapanIDCard;
    }

    /**
     * Set Japan ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JapanIDCard Japan ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJapanIDCard(JapanIDCard JapanIDCard) {
        this.JapanIDCard = JapanIDCard;
    }

    /**
     * Get Taiwan (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaiWanIDCard Taiwan (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaiWanIDCard getTaiWanIDCard() {
        return this.TaiWanIDCard;
    }

    /**
     * Set Taiwan (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaiWanIDCard Taiwan (China) ID Card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaiWanIDCard(TaiWanIDCard TaiWanIDCard) {
        this.TaiWanIDCard = TaiWanIDCard;
    }

    /**
     * Get exit/entry permit (card) for traveling to and from Hong Kong (China), Macao (China), or Taiwan (China).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HMTPermitCard exit/entry permit (card) for traveling to and from Hong Kong (China), Macao (China), or Taiwan (China).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HMTPermit getHMTPermitCard() {
        return this.HMTPermitCard;
    }

    /**
     * Set exit/entry permit (card) for traveling to and from Hong Kong (China), Macao (China), or Taiwan (China).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HMTPermitCard exit/entry permit (card) for traveling to and from Hong Kong (China), Macao (China), or Taiwan (China).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHMTPermitCard(HMTPermit HMTPermitCard) {
        this.HMTPermitCard = HMTPermitCard;
    }

    public NormalCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalCardInfo(NormalCardInfo source) {
        if (source.HKIDCard != null) {
            this.HKIDCard = new NormalHKIDCard(source.HKIDCard);
        }
        if (source.MLIDCard != null) {
            this.MLIDCard = new NormalMLIDCard(source.MLIDCard);
        }
        if (source.PhilippinesVoteID != null) {
            this.PhilippinesVoteID = new PhilippinesVoteID(source.PhilippinesVoteID);
        }
        if (source.IndonesiaIDCard != null) {
            this.IndonesiaIDCard = new NormalIndonesiaIDCard(source.IndonesiaIDCard);
        }
        if (source.PhilippinesDrivingLicense != null) {
            this.PhilippinesDrivingLicense = new PhilippinesDrivingLicense(source.PhilippinesDrivingLicense);
        }
        if (source.PhilippinesTinID != null) {
            this.PhilippinesTinID = new PhilippinesTinID(source.PhilippinesTinID);
        }
        if (source.PhilippinesSSSID != null) {
            this.PhilippinesSSSID = new PhilippinesSSSID(source.PhilippinesSSSID);
        }
        if (source.PhilippinesUMID != null) {
            this.PhilippinesUMID = new PhilippinesUMID(source.PhilippinesUMID);
        }
        if (source.InternationalIDPassport != null) {
            this.InternationalIDPassport = new InternationalIDPassport(source.InternationalIDPassport);
        }
        if (source.GeneralCard != null) {
            this.GeneralCard = new GeneralCard(source.GeneralCard);
        }
        if (source.IndonesiaDrivingLicense != null) {
            this.IndonesiaDrivingLicense = new IndonesiaDrivingLicense(source.IndonesiaDrivingLicense);
        }
        if (source.ThailandIDCard != null) {
            this.ThailandIDCard = new NormalThailandIDCard(source.ThailandIDCard);
        }
        if (source.SingaporeIDCard != null) {
            this.SingaporeIDCard = new SingaporeIDCard(source.SingaporeIDCard);
        }
        if (source.MacaoIDCard != null) {
            this.MacaoIDCard = new MacaoIDCard(source.MacaoIDCard);
        }
        if (source.MainlandIDCard != null) {
            this.MainlandIDCard = new MainlandIDCard(source.MainlandIDCard);
        }
        if (source.JapanIDCard != null) {
            this.JapanIDCard = new JapanIDCard(source.JapanIDCard);
        }
        if (source.TaiWanIDCard != null) {
            this.TaiWanIDCard = new TaiWanIDCard(source.TaiWanIDCard);
        }
        if (source.HMTPermitCard != null) {
            this.HMTPermitCard = new HMTPermit(source.HMTPermitCard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HKIDCard.", this.HKIDCard);
        this.setParamObj(map, prefix + "MLIDCard.", this.MLIDCard);
        this.setParamObj(map, prefix + "PhilippinesVoteID.", this.PhilippinesVoteID);
        this.setParamObj(map, prefix + "IndonesiaIDCard.", this.IndonesiaIDCard);
        this.setParamObj(map, prefix + "PhilippinesDrivingLicense.", this.PhilippinesDrivingLicense);
        this.setParamObj(map, prefix + "PhilippinesTinID.", this.PhilippinesTinID);
        this.setParamObj(map, prefix + "PhilippinesSSSID.", this.PhilippinesSSSID);
        this.setParamObj(map, prefix + "PhilippinesUMID.", this.PhilippinesUMID);
        this.setParamObj(map, prefix + "InternationalIDPassport.", this.InternationalIDPassport);
        this.setParamObj(map, prefix + "GeneralCard.", this.GeneralCard);
        this.setParamObj(map, prefix + "IndonesiaDrivingLicense.", this.IndonesiaDrivingLicense);
        this.setParamObj(map, prefix + "ThailandIDCard.", this.ThailandIDCard);
        this.setParamObj(map, prefix + "SingaporeIDCard.", this.SingaporeIDCard);
        this.setParamObj(map, prefix + "MacaoIDCard.", this.MacaoIDCard);
        this.setParamObj(map, prefix + "MainlandIDCard.", this.MainlandIDCard);
        this.setParamObj(map, prefix + "JapanIDCard.", this.JapanIDCard);
        this.setParamObj(map, prefix + "TaiWanIDCard.", this.TaiWanIDCard);
        this.setParamObj(map, prefix + "HMTPermitCard.", this.HMTPermitCard);

    }
}

