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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Transaction extends AbstractModel {

    /**
    * Transaction ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * Contract name.
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * Transaction sender.
    */
    @SerializedName("Sender")
    @Expose
    private String Sender;

    /**
    * Transaction creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The block height where the trading platform is located.
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * The serial number of a transaction in a block.
    */
    @SerializedName("TxIndex")
    @Expose
    private Long TxIndex;

    /**
     * Get Transaction ID 
     * @return TxId Transaction ID
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * Set Transaction ID
     * @param TxId Transaction ID
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * Get Contract name. 
     * @return ChaincodeName Contract name.
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * Set Contract name.
     * @param ChaincodeName Contract name.
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
    }

    /**
     * Get Transaction sender. 
     * @return Sender Transaction sender.
     */
    public String getSender() {
        return this.Sender;
    }

    /**
     * Set Transaction sender.
     * @param Sender Transaction sender.
     */
    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    /**
     * Get Transaction creation time. 
     * @return CreateTime Transaction creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Transaction creation time.
     * @param CreateTime Transaction creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The block height where the trading platform is located. 
     * @return BlockHeight The block height where the trading platform is located.
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set The block height where the trading platform is located.
     * @param BlockHeight The block height where the trading platform is located.
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get The serial number of a transaction in a block. 
     * @return TxIndex The serial number of a transaction in a block.
     */
    public Long getTxIndex() {
        return this.TxIndex;
    }

    /**
     * Set The serial number of a transaction in a block.
     * @param TxIndex The serial number of a transaction in a block.
     */
    public void setTxIndex(Long TxIndex) {
        this.TxIndex = TxIndex;
    }

    public Transaction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transaction(Transaction source) {
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.ChaincodeName != null) {
            this.ChaincodeName = new String(source.ChaincodeName);
        }
        if (source.Sender != null) {
            this.Sender = new String(source.Sender);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.TxIndex != null) {
            this.TxIndex = new Long(source.TxIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "Sender", this.Sender);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "TxIndex", this.TxIndex);

    }
}

