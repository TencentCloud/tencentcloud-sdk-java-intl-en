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

public class Wallet extends AbstractModel {

    /**
    * <p>Wallet type</p><p>Enumeration value:</p><ul><li>crypto: Crypto currency</li><li>digital: Digital currency</li><li>fiat: Fiat currency</li></ul>
    */
    @SerializedName("WalletType")
    @Expose
    private String WalletType;

    /**
    * <p>The address of the wallet.Usually it is the ID of the wallet.</p>
    */
    @SerializedName("WalletAddress")
    @Expose
    private String WalletAddress;

    /**
    * <p>The full name of the person who holds  the wallet</p>
    */
    @SerializedName("WalletHolderName")
    @Expose
    private String WalletHolderName;

    /**
    * <p>The provider of the wallet, such as wechat, alipay, paypal</p>
    */
    @SerializedName("WalletProvider")
    @Expose
    private String WalletProvider;

    /**
     * Get <p>Wallet type</p><p>Enumeration value:</p><ul><li>crypto: Crypto currency</li><li>digital: Digital currency</li><li>fiat: Fiat currency</li></ul> 
     * @return WalletType <p>Wallet type</p><p>Enumeration value:</p><ul><li>crypto: Crypto currency</li><li>digital: Digital currency</li><li>fiat: Fiat currency</li></ul>
     */
    public String getWalletType() {
        return this.WalletType;
    }

    /**
     * Set <p>Wallet type</p><p>Enumeration value:</p><ul><li>crypto: Crypto currency</li><li>digital: Digital currency</li><li>fiat: Fiat currency</li></ul>
     * @param WalletType <p>Wallet type</p><p>Enumeration value:</p><ul><li>crypto: Crypto currency</li><li>digital: Digital currency</li><li>fiat: Fiat currency</li></ul>
     */
    public void setWalletType(String WalletType) {
        this.WalletType = WalletType;
    }

    /**
     * Get <p>The address of the wallet.Usually it is the ID of the wallet.</p> 
     * @return WalletAddress <p>The address of the wallet.Usually it is the ID of the wallet.</p>
     */
    public String getWalletAddress() {
        return this.WalletAddress;
    }

    /**
     * Set <p>The address of the wallet.Usually it is the ID of the wallet.</p>
     * @param WalletAddress <p>The address of the wallet.Usually it is the ID of the wallet.</p>
     */
    public void setWalletAddress(String WalletAddress) {
        this.WalletAddress = WalletAddress;
    }

    /**
     * Get <p>The full name of the person who holds  the wallet</p> 
     * @return WalletHolderName <p>The full name of the person who holds  the wallet</p>
     */
    public String getWalletHolderName() {
        return this.WalletHolderName;
    }

    /**
     * Set <p>The full name of the person who holds  the wallet</p>
     * @param WalletHolderName <p>The full name of the person who holds  the wallet</p>
     */
    public void setWalletHolderName(String WalletHolderName) {
        this.WalletHolderName = WalletHolderName;
    }

    /**
     * Get <p>The provider of the wallet, such as wechat, alipay, paypal</p> 
     * @return WalletProvider <p>The provider of the wallet, such as wechat, alipay, paypal</p>
     */
    public String getWalletProvider() {
        return this.WalletProvider;
    }

    /**
     * Set <p>The provider of the wallet, such as wechat, alipay, paypal</p>
     * @param WalletProvider <p>The provider of the wallet, such as wechat, alipay, paypal</p>
     */
    public void setWalletProvider(String WalletProvider) {
        this.WalletProvider = WalletProvider;
    }

    public Wallet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Wallet(Wallet source) {
        if (source.WalletType != null) {
            this.WalletType = new String(source.WalletType);
        }
        if (source.WalletAddress != null) {
            this.WalletAddress = new String(source.WalletAddress);
        }
        if (source.WalletHolderName != null) {
            this.WalletHolderName = new String(source.WalletHolderName);
        }
        if (source.WalletProvider != null) {
            this.WalletProvider = new String(source.WalletProvider);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WalletType", this.WalletType);
        this.setParamSimple(map, prefix + "WalletAddress", this.WalletAddress);
        this.setParamSimple(map, prefix + "WalletHolderName", this.WalletHolderName);
        this.setParamSimple(map, prefix + "WalletProvider", this.WalletProvider);

    }
}

