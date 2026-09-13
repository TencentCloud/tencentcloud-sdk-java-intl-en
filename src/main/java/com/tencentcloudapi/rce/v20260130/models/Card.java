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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Card extends AbstractModel {

    /**
    * <p>Bank identification number.The first six or eight digits of the card number</p><p>Parameter format: Compliant with the ISO 13616-1 standard</p>
    */
    @SerializedName("CardBin")
    @Expose
    private String CardBin;

    /**
    * <p>The last four digits of the card number</p><p>Parameter format: Compliant with ISO 13616-1 standard</p>
    */
    @SerializedName("LastFourDigits")
    @Expose
    private String LastFourDigits;

    /**
    * <p>The country where the card issued</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>The bank that issued card</p>
    */
    @SerializedName("Bank")
    @Expose
    private String Bank;

    /**
    * <p>the type of the card</p><p>Enumeration value:</p><ul><li>credit: Credit card</li><li>debit: Debit card</li><li>charge: Charge card</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>The brand of the card</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>The level of the card that the bank defined</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>The full name of the person who hold the card</p>
    */
    @SerializedName("HolderName")
    @Expose
    private String HolderName;

    /**
    * <p>The expiration date of the card</p><p>Parameter format: YYYY-MM-DD.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>Bank identification number.The first six or eight digits of the card number</p><p>Parameter format: Compliant with the ISO 13616-1 standard</p> 
     * @return CardBin <p>Bank identification number.The first six or eight digits of the card number</p><p>Parameter format: Compliant with the ISO 13616-1 standard</p>
     */
    public String getCardBin() {
        return this.CardBin;
    }

    /**
     * Set <p>Bank identification number.The first six or eight digits of the card number</p><p>Parameter format: Compliant with the ISO 13616-1 standard</p>
     * @param CardBin <p>Bank identification number.The first six or eight digits of the card number</p><p>Parameter format: Compliant with the ISO 13616-1 standard</p>
     */
    public void setCardBin(String CardBin) {
        this.CardBin = CardBin;
    }

    /**
     * Get <p>The last four digits of the card number</p><p>Parameter format: Compliant with ISO 13616-1 standard</p> 
     * @return LastFourDigits <p>The last four digits of the card number</p><p>Parameter format: Compliant with ISO 13616-1 standard</p>
     */
    public String getLastFourDigits() {
        return this.LastFourDigits;
    }

    /**
     * Set <p>The last four digits of the card number</p><p>Parameter format: Compliant with ISO 13616-1 standard</p>
     * @param LastFourDigits <p>The last four digits of the card number</p><p>Parameter format: Compliant with ISO 13616-1 standard</p>
     */
    public void setLastFourDigits(String LastFourDigits) {
        this.LastFourDigits = LastFourDigits;
    }

    /**
     * Get <p>The country where the card issued</p> 
     * @return Country <p>The country where the card issued</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>The country where the card issued</p>
     * @param Country <p>The country where the card issued</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>The bank that issued card</p> 
     * @return Bank <p>The bank that issued card</p>
     */
    public String getBank() {
        return this.Bank;
    }

    /**
     * Set <p>The bank that issued card</p>
     * @param Bank <p>The bank that issued card</p>
     */
    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    /**
     * Get <p>the type of the card</p><p>Enumeration value:</p><ul><li>credit: Credit card</li><li>debit: Debit card</li><li>charge: Charge card</li></ul> 
     * @return Type <p>the type of the card</p><p>Enumeration value:</p><ul><li>credit: Credit card</li><li>debit: Debit card</li><li>charge: Charge card</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>the type of the card</p><p>Enumeration value:</p><ul><li>credit: Credit card</li><li>debit: Debit card</li><li>charge: Charge card</li></ul>
     * @param Type <p>the type of the card</p><p>Enumeration value:</p><ul><li>credit: Credit card</li><li>debit: Debit card</li><li>charge: Charge card</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>The brand of the card</p> 
     * @return Brand <p>The brand of the card</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>The brand of the card</p>
     * @param Brand <p>The brand of the card</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>The level of the card that the bank defined</p> 
     * @return Level <p>The level of the card that the bank defined</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>The level of the card that the bank defined</p>
     * @param Level <p>The level of the card that the bank defined</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>The full name of the person who hold the card</p> 
     * @return HolderName <p>The full name of the person who hold the card</p>
     */
    public String getHolderName() {
        return this.HolderName;
    }

    /**
     * Set <p>The full name of the person who hold the card</p>
     * @param HolderName <p>The full name of the person who hold the card</p>
     */
    public void setHolderName(String HolderName) {
        this.HolderName = HolderName;
    }

    /**
     * Get <p>The expiration date of the card</p><p>Parameter format: YYYY-MM-DD.</p> 
     * @return ExpireTime <p>The expiration date of the card</p><p>Parameter format: YYYY-MM-DD.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>The expiration date of the card</p><p>Parameter format: YYYY-MM-DD.</p>
     * @param ExpireTime <p>The expiration date of the card</p><p>Parameter format: YYYY-MM-DD.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public Card() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Card(Card source) {
        if (source.CardBin != null) {
            this.CardBin = new String(source.CardBin);
        }
        if (source.LastFourDigits != null) {
            this.LastFourDigits = new String(source.LastFourDigits);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Bank != null) {
            this.Bank = new String(source.Bank);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.HolderName != null) {
            this.HolderName = new String(source.HolderName);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardBin", this.CardBin);
        this.setParamSimple(map, prefix + "LastFourDigits", this.LastFourDigits);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Bank", this.Bank);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "HolderName", this.HolderName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

