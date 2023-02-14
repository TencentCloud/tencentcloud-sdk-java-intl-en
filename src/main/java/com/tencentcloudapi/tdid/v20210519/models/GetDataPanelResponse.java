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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDataPanelResponse extends AbstractModel{

    /**
    * The number of blockchain networks.
    */
    @SerializedName("BlockNetworkCount")
    @Expose
    private Long BlockNetworkCount;

    /**
    * The blockchain network name.
    */
    @SerializedName("BlockNetworkName")
    @Expose
    private String BlockNetworkName;

    /**
    * The current block height.
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * The blockchain network type.
    */
    @SerializedName("BlockNetworkType")
    @Expose
    private Long BlockNetworkType;

    /**
    * The number of DIDs.
    */
    @SerializedName("DidCount")
    @Expose
    private Long DidCount;

    /**
    * The number of claim protocol types (CPT).
    */
    @SerializedName("CptCount")
    @Expose
    private Long CptCount;

    /**
    * The number of certified authorities.
    */
    @SerializedName("CertificatedAuthCount")
    @Expose
    private Long CertificatedAuthCount;

    /**
    * The number of credentials issued.
    */
    @SerializedName("IssueCptCount")
    @Expose
    private Long IssueCptCount;

    /**
    * The number of new DIDs in the current week.
    */
    @SerializedName("NewDidCount")
    @Expose
    private Long NewDidCount;

    /**
    * The number of BCOS networks.
    */
    @SerializedName("BcosCount")
    @Expose
    private Long BcosCount;

    /**
    * The number of Fabric networks.
    */
    @SerializedName("FabricCount")
    @Expose
    private Long FabricCount;

    /**
    * The number of ChainMaker networks.
    */
    @SerializedName("ChainMakerCount")
    @Expose
    private Long ChainMakerCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of blockchain networks. 
     * @return BlockNetworkCount The number of blockchain networks.
     */
    public Long getBlockNetworkCount() {
        return this.BlockNetworkCount;
    }

    /**
     * Set The number of blockchain networks.
     * @param BlockNetworkCount The number of blockchain networks.
     */
    public void setBlockNetworkCount(Long BlockNetworkCount) {
        this.BlockNetworkCount = BlockNetworkCount;
    }

    /**
     * Get The blockchain network name. 
     * @return BlockNetworkName The blockchain network name.
     */
    public String getBlockNetworkName() {
        return this.BlockNetworkName;
    }

    /**
     * Set The blockchain network name.
     * @param BlockNetworkName The blockchain network name.
     */
    public void setBlockNetworkName(String BlockNetworkName) {
        this.BlockNetworkName = BlockNetworkName;
    }

    /**
     * Get The current block height. 
     * @return BlockHeight The current block height.
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set The current block height.
     * @param BlockHeight The current block height.
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get The blockchain network type. 
     * @return BlockNetworkType The blockchain network type.
     */
    public Long getBlockNetworkType() {
        return this.BlockNetworkType;
    }

    /**
     * Set The blockchain network type.
     * @param BlockNetworkType The blockchain network type.
     */
    public void setBlockNetworkType(Long BlockNetworkType) {
        this.BlockNetworkType = BlockNetworkType;
    }

    /**
     * Get The number of DIDs. 
     * @return DidCount The number of DIDs.
     */
    public Long getDidCount() {
        return this.DidCount;
    }

    /**
     * Set The number of DIDs.
     * @param DidCount The number of DIDs.
     */
    public void setDidCount(Long DidCount) {
        this.DidCount = DidCount;
    }

    /**
     * Get The number of claim protocol types (CPT). 
     * @return CptCount The number of claim protocol types (CPT).
     */
    public Long getCptCount() {
        return this.CptCount;
    }

    /**
     * Set The number of claim protocol types (CPT).
     * @param CptCount The number of claim protocol types (CPT).
     */
    public void setCptCount(Long CptCount) {
        this.CptCount = CptCount;
    }

    /**
     * Get The number of certified authorities. 
     * @return CertificatedAuthCount The number of certified authorities.
     */
    public Long getCertificatedAuthCount() {
        return this.CertificatedAuthCount;
    }

    /**
     * Set The number of certified authorities.
     * @param CertificatedAuthCount The number of certified authorities.
     */
    public void setCertificatedAuthCount(Long CertificatedAuthCount) {
        this.CertificatedAuthCount = CertificatedAuthCount;
    }

    /**
     * Get The number of credentials issued. 
     * @return IssueCptCount The number of credentials issued.
     */
    public Long getIssueCptCount() {
        return this.IssueCptCount;
    }

    /**
     * Set The number of credentials issued.
     * @param IssueCptCount The number of credentials issued.
     */
    public void setIssueCptCount(Long IssueCptCount) {
        this.IssueCptCount = IssueCptCount;
    }

    /**
     * Get The number of new DIDs in the current week. 
     * @return NewDidCount The number of new DIDs in the current week.
     */
    public Long getNewDidCount() {
        return this.NewDidCount;
    }

    /**
     * Set The number of new DIDs in the current week.
     * @param NewDidCount The number of new DIDs in the current week.
     */
    public void setNewDidCount(Long NewDidCount) {
        this.NewDidCount = NewDidCount;
    }

    /**
     * Get The number of BCOS networks. 
     * @return BcosCount The number of BCOS networks.
     */
    public Long getBcosCount() {
        return this.BcosCount;
    }

    /**
     * Set The number of BCOS networks.
     * @param BcosCount The number of BCOS networks.
     */
    public void setBcosCount(Long BcosCount) {
        this.BcosCount = BcosCount;
    }

    /**
     * Get The number of Fabric networks. 
     * @return FabricCount The number of Fabric networks.
     */
    public Long getFabricCount() {
        return this.FabricCount;
    }

    /**
     * Set The number of Fabric networks.
     * @param FabricCount The number of Fabric networks.
     */
    public void setFabricCount(Long FabricCount) {
        this.FabricCount = FabricCount;
    }

    /**
     * Get The number of ChainMaker networks. 
     * @return ChainMakerCount The number of ChainMaker networks.
     */
    public Long getChainMakerCount() {
        return this.ChainMakerCount;
    }

    /**
     * Set The number of ChainMaker networks.
     * @param ChainMakerCount The number of ChainMaker networks.
     */
    public void setChainMakerCount(Long ChainMakerCount) {
        this.ChainMakerCount = ChainMakerCount;
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

    public GetDataPanelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDataPanelResponse(GetDataPanelResponse source) {
        if (source.BlockNetworkCount != null) {
            this.BlockNetworkCount = new Long(source.BlockNetworkCount);
        }
        if (source.BlockNetworkName != null) {
            this.BlockNetworkName = new String(source.BlockNetworkName);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.BlockNetworkType != null) {
            this.BlockNetworkType = new Long(source.BlockNetworkType);
        }
        if (source.DidCount != null) {
            this.DidCount = new Long(source.DidCount);
        }
        if (source.CptCount != null) {
            this.CptCount = new Long(source.CptCount);
        }
        if (source.CertificatedAuthCount != null) {
            this.CertificatedAuthCount = new Long(source.CertificatedAuthCount);
        }
        if (source.IssueCptCount != null) {
            this.IssueCptCount = new Long(source.IssueCptCount);
        }
        if (source.NewDidCount != null) {
            this.NewDidCount = new Long(source.NewDidCount);
        }
        if (source.BcosCount != null) {
            this.BcosCount = new Long(source.BcosCount);
        }
        if (source.FabricCount != null) {
            this.FabricCount = new Long(source.FabricCount);
        }
        if (source.ChainMakerCount != null) {
            this.ChainMakerCount = new Long(source.ChainMakerCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockNetworkCount", this.BlockNetworkCount);
        this.setParamSimple(map, prefix + "BlockNetworkName", this.BlockNetworkName);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "BlockNetworkType", this.BlockNetworkType);
        this.setParamSimple(map, prefix + "DidCount", this.DidCount);
        this.setParamSimple(map, prefix + "CptCount", this.CptCount);
        this.setParamSimple(map, prefix + "CertificatedAuthCount", this.CertificatedAuthCount);
        this.setParamSimple(map, prefix + "IssueCptCount", this.IssueCptCount);
        this.setParamSimple(map, prefix + "NewDidCount", this.NewDidCount);
        this.setParamSimple(map, prefix + "BcosCount", this.BcosCount);
        this.setParamSimple(map, prefix + "FabricCount", this.FabricCount);
        this.setParamSimple(map, prefix + "ChainMakerCount", this.ChainMakerCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

