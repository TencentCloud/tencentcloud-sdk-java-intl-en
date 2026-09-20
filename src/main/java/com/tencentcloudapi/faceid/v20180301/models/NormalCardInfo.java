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

public class NormalCardInfo extends AbstractModel {

    /**
    * Hong Kong identity card
    */
    @SerializedName("HKIDCard")
    @Expose
    private NormalHKIDCard HKIDCard;

    /**
    * Malaysian identity card
    */
    @SerializedName("MLIDCard")
    @Expose
    private NormalMLIDCard MLIDCard;

    /**
    * Philippines voter card
    */
    @SerializedName("PhilippinesVoteID")
    @Expose
    private PhilippinesVoteID PhilippinesVoteID;

    /**
    * Indonesian Identity Card
    */
    @SerializedName("IndonesiaIDCard")
    @Expose
    private NormalIndonesiaIDCard IndonesiaIDCard;

    /**
    * Philippines driving license
    */
    @SerializedName("PhilippinesDrivingLicense")
    @Expose
    private PhilippinesDrivingLicense PhilippinesDrivingLicense;

    /**
    * Philippines TinID
    */
    @SerializedName("PhilippinesTinID")
    @Expose
    private PhilippinesTinID PhilippinesTinID;

    /**
    * Philippines SSSID
    */
    @SerializedName("PhilippinesSSSID")
    @Expose
    private PhilippinesSSSID PhilippinesSSSID;

    /**
    * Philippines UMID
    */
    @SerializedName("PhilippinesUMID")
    @Expose
    private PhilippinesUMID PhilippinesUMID;

    /**
    * Hong Kong, Macao, and Taiwan region as well as overseas passport
    */
    @SerializedName("InternationalIDPassport")
    @Expose
    private InternationalIDPassport InternationalIDPassport;

    /**
    * General card certificate information
    */
    @SerializedName("GeneralCard")
    @Expose
    private GeneralCard GeneralCard;

    /**
    * Indonesian driving license
    */
    @SerializedName("IndonesiaDrivingLicense")
    @Expose
    private IndonesiaDrivingLicense IndonesiaDrivingLicense;

    /**
    * Thai Identity Card
    */
    @SerializedName("ThailandIDCard")
    @Expose
    private NormalThailandIDCard ThailandIDCard;

    /**
    * Singapore ID card
    */
    @SerializedName("SingaporeIDCard")
    @Expose
    private SingaporeIDCard SingaporeIDCard;

    /**
    * Macao identity card
    */
    @SerializedName("MacaoIDCard")
    @Expose
    private MacaoIDCard MacaoIDCard;

    /**
    * Mainland ID card
    */
    @SerializedName("MainlandIDCard")
    @Expose
    private MainlandIDCard MainlandIDCard;

    /**
    * Japan identity card
    */
    @SerializedName("JapanIDCard")
    @Expose
    private JapanIDCard JapanIDCard;

    /**
    * Taiwan (China) identity card
    */
    @SerializedName("TaiWanIDCard")
    @Expose
    private TaiWanIDCard TaiWanIDCard;

    /**
    * Hong Kong, Macau and Taiwan Travel Permit
    */
    @SerializedName("HMTPermitCard")
    @Expose
    private HMTPermit HMTPermitCard;

    /**
     * Get Hong Kong identity card 
     * @return HKIDCard Hong Kong identity card
     */
    public NormalHKIDCard getHKIDCard() {
        return this.HKIDCard;
    }

    /**
     * Set Hong Kong identity card
     * @param HKIDCard Hong Kong identity card
     */
    public void setHKIDCard(NormalHKIDCard HKIDCard) {
        this.HKIDCard = HKIDCard;
    }

    /**
     * Get Malaysian identity card 
     * @return MLIDCard Malaysian identity card
     */
    public NormalMLIDCard getMLIDCard() {
        return this.MLIDCard;
    }

    /**
     * Set Malaysian identity card
     * @param MLIDCard Malaysian identity card
     */
    public void setMLIDCard(NormalMLIDCard MLIDCard) {
        this.MLIDCard = MLIDCard;
    }

    /**
     * Get Philippines voter card 
     * @return PhilippinesVoteID Philippines voter card
     */
    public PhilippinesVoteID getPhilippinesVoteID() {
        return this.PhilippinesVoteID;
    }

    /**
     * Set Philippines voter card
     * @param PhilippinesVoteID Philippines voter card
     */
    public void setPhilippinesVoteID(PhilippinesVoteID PhilippinesVoteID) {
        this.PhilippinesVoteID = PhilippinesVoteID;
    }

    /**
     * Get Indonesian Identity Card 
     * @return IndonesiaIDCard Indonesian Identity Card
     */
    public NormalIndonesiaIDCard getIndonesiaIDCard() {
        return this.IndonesiaIDCard;
    }

    /**
     * Set Indonesian Identity Card
     * @param IndonesiaIDCard Indonesian Identity Card
     */
    public void setIndonesiaIDCard(NormalIndonesiaIDCard IndonesiaIDCard) {
        this.IndonesiaIDCard = IndonesiaIDCard;
    }

    /**
     * Get Philippines driving license 
     * @return PhilippinesDrivingLicense Philippines driving license
     */
    public PhilippinesDrivingLicense getPhilippinesDrivingLicense() {
        return this.PhilippinesDrivingLicense;
    }

    /**
     * Set Philippines driving license
     * @param PhilippinesDrivingLicense Philippines driving license
     */
    public void setPhilippinesDrivingLicense(PhilippinesDrivingLicense PhilippinesDrivingLicense) {
        this.PhilippinesDrivingLicense = PhilippinesDrivingLicense;
    }

    /**
     * Get Philippines TinID 
     * @return PhilippinesTinID Philippines TinID
     */
    public PhilippinesTinID getPhilippinesTinID() {
        return this.PhilippinesTinID;
    }

    /**
     * Set Philippines TinID
     * @param PhilippinesTinID Philippines TinID
     */
    public void setPhilippinesTinID(PhilippinesTinID PhilippinesTinID) {
        this.PhilippinesTinID = PhilippinesTinID;
    }

    /**
     * Get Philippines SSSID 
     * @return PhilippinesSSSID Philippines SSSID
     */
    public PhilippinesSSSID getPhilippinesSSSID() {
        return this.PhilippinesSSSID;
    }

    /**
     * Set Philippines SSSID
     * @param PhilippinesSSSID Philippines SSSID
     */
    public void setPhilippinesSSSID(PhilippinesSSSID PhilippinesSSSID) {
        this.PhilippinesSSSID = PhilippinesSSSID;
    }

    /**
     * Get Philippines UMID 
     * @return PhilippinesUMID Philippines UMID
     */
    public PhilippinesUMID getPhilippinesUMID() {
        return this.PhilippinesUMID;
    }

    /**
     * Set Philippines UMID
     * @param PhilippinesUMID Philippines UMID
     */
    public void setPhilippinesUMID(PhilippinesUMID PhilippinesUMID) {
        this.PhilippinesUMID = PhilippinesUMID;
    }

    /**
     * Get Hong Kong, Macao, and Taiwan region as well as overseas passport 
     * @return InternationalIDPassport Hong Kong, Macao, and Taiwan region as well as overseas passport
     */
    public InternationalIDPassport getInternationalIDPassport() {
        return this.InternationalIDPassport;
    }

    /**
     * Set Hong Kong, Macao, and Taiwan region as well as overseas passport
     * @param InternationalIDPassport Hong Kong, Macao, and Taiwan region as well as overseas passport
     */
    public void setInternationalIDPassport(InternationalIDPassport InternationalIDPassport) {
        this.InternationalIDPassport = InternationalIDPassport;
    }

    /**
     * Get General card certificate information 
     * @return GeneralCard General card certificate information
     */
    public GeneralCard getGeneralCard() {
        return this.GeneralCard;
    }

    /**
     * Set General card certificate information
     * @param GeneralCard General card certificate information
     */
    public void setGeneralCard(GeneralCard GeneralCard) {
        this.GeneralCard = GeneralCard;
    }

    /**
     * Get Indonesian driving license 
     * @return IndonesiaDrivingLicense Indonesian driving license
     */
    public IndonesiaDrivingLicense getIndonesiaDrivingLicense() {
        return this.IndonesiaDrivingLicense;
    }

    /**
     * Set Indonesian driving license
     * @param IndonesiaDrivingLicense Indonesian driving license
     */
    public void setIndonesiaDrivingLicense(IndonesiaDrivingLicense IndonesiaDrivingLicense) {
        this.IndonesiaDrivingLicense = IndonesiaDrivingLicense;
    }

    /**
     * Get Thai Identity Card 
     * @return ThailandIDCard Thai Identity Card
     */
    public NormalThailandIDCard getThailandIDCard() {
        return this.ThailandIDCard;
    }

    /**
     * Set Thai Identity Card
     * @param ThailandIDCard Thai Identity Card
     */
    public void setThailandIDCard(NormalThailandIDCard ThailandIDCard) {
        this.ThailandIDCard = ThailandIDCard;
    }

    /**
     * Get Singapore ID card 
     * @return SingaporeIDCard Singapore ID card
     */
    public SingaporeIDCard getSingaporeIDCard() {
        return this.SingaporeIDCard;
    }

    /**
     * Set Singapore ID card
     * @param SingaporeIDCard Singapore ID card
     */
    public void setSingaporeIDCard(SingaporeIDCard SingaporeIDCard) {
        this.SingaporeIDCard = SingaporeIDCard;
    }

    /**
     * Get Macao identity card 
     * @return MacaoIDCard Macao identity card
     */
    public MacaoIDCard getMacaoIDCard() {
        return this.MacaoIDCard;
    }

    /**
     * Set Macao identity card
     * @param MacaoIDCard Macao identity card
     */
    public void setMacaoIDCard(MacaoIDCard MacaoIDCard) {
        this.MacaoIDCard = MacaoIDCard;
    }

    /**
     * Get Mainland ID card 
     * @return MainlandIDCard Mainland ID card
     */
    public MainlandIDCard getMainlandIDCard() {
        return this.MainlandIDCard;
    }

    /**
     * Set Mainland ID card
     * @param MainlandIDCard Mainland ID card
     */
    public void setMainlandIDCard(MainlandIDCard MainlandIDCard) {
        this.MainlandIDCard = MainlandIDCard;
    }

    /**
     * Get Japan identity card 
     * @return JapanIDCard Japan identity card
     */
    public JapanIDCard getJapanIDCard() {
        return this.JapanIDCard;
    }

    /**
     * Set Japan identity card
     * @param JapanIDCard Japan identity card
     */
    public void setJapanIDCard(JapanIDCard JapanIDCard) {
        this.JapanIDCard = JapanIDCard;
    }

    /**
     * Get Taiwan (China) identity card 
     * @return TaiWanIDCard Taiwan (China) identity card
     */
    public TaiWanIDCard getTaiWanIDCard() {
        return this.TaiWanIDCard;
    }

    /**
     * Set Taiwan (China) identity card
     * @param TaiWanIDCard Taiwan (China) identity card
     */
    public void setTaiWanIDCard(TaiWanIDCard TaiWanIDCard) {
        this.TaiWanIDCard = TaiWanIDCard;
    }

    /**
     * Get Hong Kong, Macau and Taiwan Travel Permit 
     * @return HMTPermitCard Hong Kong, Macau and Taiwan Travel Permit
     */
    public HMTPermit getHMTPermitCard() {
        return this.HMTPermitCard;
    }

    /**
     * Set Hong Kong, Macau and Taiwan Travel Permit
     * @param HMTPermitCard Hong Kong, Macau and Taiwan Travel Permit
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

